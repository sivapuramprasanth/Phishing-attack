
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

<html>
         <% try 
	{
      		String file=request.getParameter("fr");
      		SimpleDateFormat sdfDate = new SimpleDateFormat(
			"dd/MM/yyyy");
	SimpleDateFormat sdfTime = new SimpleDateFormat(
			"HH:mm:ss");

	Date now = new Date();

	String strDate = sdfDate.format(now);
	String strTime = sdfTime.format(now);
	String reqdt = strDate + "   " + strTime;
	
	
	
	String query="select * from mdcci_cloudserver where fname='"+file+"' "; 
    Statement st5=connection.createStatement();
    ResultSet rs=st5.executeQuery(query);
		String respdate="Waiting for Response";
	String status="Waiting";
	
	
	String username=(String)application.getAttribute("ename");
	ResultSet rs1=connection.createStatement().executeQuery("select * from mdcci_userrequest where username='"+username+"' and  fnamereq='"+file+"' ");
	if(!rs1.next())
	{
	if ( rs.next() )
{

	Statement stss=connection.createStatement();
			stss.executeUpdate("insert into  mdcci_userrequest(username,fnamereq,reqdate,resdate,resstatus) values ('"+username+"','"+file+"','"+reqdt+"','"+respdate+"','"+status+"')"); 
			
			
			
			%>
<h2>Hi Mr.<%=username %> ur request sent to Cloud Server </h2>
<h3><a href="reqsk0.jsp">Back</a></h3>
 <%
}else{
	
	%>
	<h2>Hi Mr.<%=username %> ur requesting is not available in Cloud Server </h2>
	<h3>Please check the file name!!!</h3>
	<h3><a href="reqsk0.jsp">Back</a></h3>
	 <%
	
}
}
else
{
%>
	<h2>Hi Mr.<%=username %> ur Already Requested to Cloud Server </h2>
	<h3>Please Wait....!!!</h3>
	<h3><a href="reqsk0.jsp">Back</a></h3>
	 <%
}
	   

         connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
            e.printStackTrace();
          }
%>
</html>