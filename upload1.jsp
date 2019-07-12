
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



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

					   <%
	String owner = (String) application.getAttribute("pname");
	
%>
					    
						
						<% try 
	{
      		String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8, s9 = "", s10, s11, s12, s13;
		int i = 0, j = 0, k;
		String file = request.getParameter("t42");
		String cont = request.getParameter("text");
		
		
		
								
		
			
      		SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

		Date now = new Date();
		String strDate = sdfDate.format(now);
		String strTime = sdfTime.format(now);
		String dt = strDate + "   " + strTime;

		KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
		Cipher encoder = Cipher.getInstance("RSA");
		KeyPair kp = kg.generateKeyPair();

		Key pubKey = kp.getPublic();

		byte[] pub = pubKey.getEncoded();
		//				System.out.println("PUBLIC KEY" + pub);

		String pk = String.valueOf(pub);
		String rank = "0";
		Statement st = connection.createStatement();

		String user = "Data Owner";
		String task = "Upload";
		ResultSet rs=connection.createStatement().executeQuery("select * from mdcci_cloudserver where fname='"+file+"'");
		if(!rs.next())
		{
		
		 PreparedStatement ps=connection.prepareStatement("insert into  mdcci_cloudserver(fname,ownername,ct,sk,dt) values(?,?,?,?,?)");
		 	ps.setString(1,file);
				ps.setString(2,owner);
					ps.setString(3,cont); 
					ps.setString(4,pk);
					ps.setString(5,dt); 
					
										
								int x=ps.executeUpdate();		
										
										String strQuery2 = "insert into  mdcci_transaction(user,fname,sk,task,dt) values('"
					+ owner
					+ "','"
					+ file
					+ "','"
					+ pk
					+ "','"
					+ task
					+ "','" + dt + "')";
			connection.createStatement().executeUpdate(strQuery2);
										
										%>
										<p>
										
<h2>Data Uploaded Successfully !!!</h2>
</p>
<br />

      		
			
      		
			

 <div class="clr"></div>
		
  <%}
  else
  {
  %>
										<p>
										
<h2>File Name Already Exist...!!!</h2>
</p>
<br />

      		
			
      		
			

 <div class="clr"></div>
		
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
