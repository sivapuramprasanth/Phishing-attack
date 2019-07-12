
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
	
	String query="select * from mdcci_searchhistory where username='"+uname+"' "; 
    Statement st5=connection.createStatement();
    ResultSet rs=st5.executeQuery(query);

	%><h1>View Seacrch History For User <span style="color:#FF00FF"> <%=uname%></span>
	<table width="855" align="center" border="1" cellpadding="3">
	<tr><td>User Name</td><td>KeyWord</td><td>Search Date</td></tr>
	<%	
	
	
	while ( rs.next() )
{
s1=rs.getString(1);
s2=rs.getString(2);
s3=rs.getString(3);

	
			
			
			
			%>
		<tr><td><%=s1%></td><td><%=s2%></td><td><%=s3%></td></tr>	

 <%

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