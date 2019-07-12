
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
	String s1="",s2="",s3="",s4="",s5="",s6="",s7="";
      		String keyword=request.getParameter("keyword");
      		SimpleDateFormat sdfDate = new SimpleDateFormat(
			"dd/MM/yyyy");
	SimpleDateFormat sdfTime = new SimpleDateFormat(
			"HH:mm:ss");

	Date now = new Date();

	String strDate = sdfDate.format(now);
	String strTime = sdfTime.format(now);
	String dt = strDate + "   " + strTime;
	
	
	String uname=(String)application.getAttribute("ename");
	
	String query="select * from mdcci_cloudserver "; 
    Statement st5=connection.createStatement();
    ResultSet rs=st5.executeQuery(query);
		connection.createStatement().executeUpdate("insert into mdcci_searchhistory values('"+uname+"','"+keyword+"','"+dt+"')");
	%><h1>Search Results for keyword<span style="color:#FF00FF"> <%=keyword%></span>
	<table width="855" align="center" border="1" cellpadding="3">
	<tr><td>File Name</td><td>Provider Name</td><td>File Contents</td><td>Secret Key</td><td>Upload Date</td></tr>
	<%	
	
	
	while ( rs.next() )
{
s1=rs.getString(1);
s2=rs.getString(2);
s3=rs.getString(3);
s4=rs.getString(4);
s5=rs.getString(5);
	
	if(s3.indexOf(keyword)>0)
	{		
			
			
			%>
		<tr><td><%=s1%></td><td><%=s2%></td><td><textarea cols="50" rows="15"><%=s3%></textarea></td><td><%=s4%></td><td><%=s5%></td></tr>	

 <%
 }
}
	   
%>
</table>
<%
         connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
            e.printStackTrace();
          }
%>
</html>