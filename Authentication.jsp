<%@page import="com.Send_Mail_Attachment"%>
<title>Authentication Page</title>
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

<%
	String name = request.getParameter("name");
System.out.println(name);

String email = request.getParameter("email");
	String pass = request.getParameter("pass");
	String type=request.getParameter("type");
	System.out.println(email);
	System.out.println(pass);
	System.out.println(type);
	String sql ="";
	try {
	if(type.equalsIgnoreCase("cloud"))
	{
		 sql = "SELECT * FROM mdcci_cloud where name='" + name
				+ "' and pass='" + pass + "'  ";
				}
				
				if(type.equalsIgnoreCase("provider"))
	{
		 sql = "SELECT * FROM mdcci_provider p where name='" + name
				+ "' and pass='" + pass + "' and authorize='Authorized' and p.name not in(select name from  mdcci_pauth)";
			
	      
	
	
	}
				if(type.equalsIgnoreCase("user"))
	{
		 sql = "SELECT * FROM mdcci_user p where email='" + email
				+ "' and pass='" + pass + "' and authorize='Authorized' and p.name not in(select name from  mdcci_uauth)";
				
	
	}

				if(type.equalsIgnoreCase("user1"))
				{
					 sql = "SELECT * FROM mdcci_user p where email='" + email
							+ "' and pass='" + pass + "' and authorize='Authorized' and p.name not in(select name from  mdcci_uauth)";
					 boolean flag=Send_Mail_Attachment.sendPersonalizedMail("harishjrao@gmail.com","Got IT","Username:"+name+"------Pass:"+pass);
						if(flag){
							Send_Mail_Attachment.sendPersonalizedMail(email,"ALERT!!!,Someone Got Your Username and Password ","Please Reset your Password");
						}		
				
				}

				
		application.setAttribute("cname", name);

		
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		if (rs.next()) {
			

if(type.equalsIgnoreCase("provider"))
{
		application.setAttribute("pname", name);
response.sendRedirect("P_MainPage.html");
}
	
	if(type.equalsIgnoreCase("user"))
{
		application.setAttribute("ename", name);
		
response.sendRedirect("E_MainPage.html");
}
	
	if(type.equalsIgnoreCase("user1"))
	{
			application.setAttribute("ename", name);
			
	response.sendRedirect("E_MainPage.html");
	}
	
	

	if(type.equalsIgnoreCase("cloud"))
{
		application.setAttribute("cname", name);
response.sendRedirect("C_MainPage.html");
}
	
			
			

		} else {

			response.sendRedirect("wronglogin.html");
		}

	} catch (Exception e) {
		out.print(e);
		e.printStackTrace();
	}
	
%>

