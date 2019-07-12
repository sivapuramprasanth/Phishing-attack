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
	import="java.util.*,java.text.SimpleDateFormat,java.util.Date,java.io.FileInputStream,java.io.FileOutputStream,java.io.PrintStream,java.math.*"%>
<%

try{

String fname=request.getParameter("fname");
String name=request.getParameter("name");
      		SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

		Date now = new Date();
		String strDate = sdfDate.format(now);
		String strTime = sdfTime.format(now);
		String dt = strDate + "   " + strTime;

ResultSet rs=connection.createStatement().executeQuery("select * from mdcci_alert where fname='"+fname+"' and name='"+name+"'");

if(!rs.next())
{

connection.createStatement().executeUpdate("insert into mdcci_alert values('"+fname+"','"+name+"','"+dt+"')");
//response.sendRedirect("csa.jsp");
%><h1>Alert sent to service Provider regarding the malicious Document</h1><%
}
else
{
%><h1>Alert already sent to service Provider regarding the malicious Document</h1><%
}
}
catch(Exception e)
{
e.printStackTrace();

}



%>
