
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@ include file="connect.jsp"%>
<%@page
	import="java.util.*,java.security.Key,java.util.Random,javax.crypto.Cipher,javax.crypto.spec.SecretKeySpec,org.bouncycastle.util.encoders.Base64"%>
<%@ page
	import="java.sql.*,java.util.Random,java.io.PrintStream,java.io.FileOutputStream,java.io.FileInputStream,java.security.DigestInputStream,java.math.BigInteger,java.security.MessageDigest,java.io.BufferedInputStream"%>
<%@ page
	import="java.security.Key,java.security.KeyPair,java.security.KeyPairGenerator,javax.crypto.Cipher"%>
<%@page
	import="java.util.*,java.text.SimpleDateFormat,java.util.Date,java.io.FileInputStream,java.io.FileOutputStream,java.io.PrintStream"%>
<html><%
		  
		    	try 
				{
		  		String file = request.getParameter("t1");

		  		
		        
		  
		  		String fn=(String)application.getAttribute("file");
		  		String un=(String)application.getAttribute("ename");
		  		String oname = request.getParameter("oname");
		  		
		  			String prcs = "Responsed";
		
		  			String query1 = "select * from mdcci_userrequest  where username='"+un+"' and fnamereq='" + file+ "' and resstatus='Responsed' ";
		  			Statement st1 = connection.createStatement();
		  			ResultSet rs1 = st1.executeQuery(query1);

		  			if (rs1.next()) {
		  		%>
		  		<%		  		
				String mac1="";
				String mac2="";
				String mac3="";
				String mac4="";
				String sk="";
				String strQuery = "select * from mdcci_cloudserver where fname='"+file+"' and ownername='"+oname+"'";
				ResultSet rs = connection.createStatement().executeQuery(strQuery);
				{
					if(rs.next()==true)
					{
						 
						sk=rs.getString(4);
						
					SimpleDateFormat sdfDate = new SimpleDateFormat(
					"dd/MM/yyyy");
					SimpleDateFormat sdfTime = new SimpleDateFormat(
					"HH:mm:ss");

					Date now = new Date();

					String strDate = sdfDate.format(now);
					String strTime = sdfTime.format(now);
					String dt = strDate + "   " + strTime;	
					String task="Download";
					String user=(String) application.getAttribute("ename");
					String strQuery2 = "insert into mdcci_transaction(user,fname,sk,task,dt) values('"+user+"','"+file+"','"+sk+"','"+task+"','"+dt+"')";
					connection.createStatement().executeUpdate(strQuery2);
					
			%>
			
<form action="dfile1.jsp" method="post" name="form1" id="form1" >
<table width="755" border="1" align="center">
	<tr>
		<td width="223"><span class="style1">Enter File Name :-</span></td>
		<td width="245"><label> <input required name="t1"
			type="text"  size="40" value="<%=file%>"  /> </label></td>
	</tr>
	<tr>
		<td ><span class="style1">Enter Service Provider Name:-</span></td>
		<td><input name="oname" type="text" size="40" value="<%=oname%>"  /></td>
	</tr>
	

	<tr>
		<td><span class="style1">Secret Key :-</span></td>
		<td><input name="t13" type="text" size="40" value="<%=sk%>" /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>
		<div align="right"><input type="submit" name="Submit"
			value="Download" /></div>
		</td>
	
	</tr>
</table>
</form>
	

<%	
					}
					else
					{
		
						out.println("File Doesn't Exist !!!");
			%>
						<p></p>
	<%
					}
				}
				
		  			} else {
		  		%>
		  		<p>
		  		<h2>You Don't Have Permission To Download !!!</h2>
		  		</p>
		  		<br />
		  		<p></p>


		  		<%
		  			}
		
		  		     
		  				
	 
           connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
          }
%> 		
</html>