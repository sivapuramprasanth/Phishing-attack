
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
		
		%><h2 align="center">Malware Files Shown Below !!!</h2>
		
		
								
		<%
			
      		
		Statement st21 = connection.createStatement();
						ResultSet rs=st21.executeQuery("select * from  mdcci_cloudserver d where ownername='"+owner+"' and fname in (select fname from mdcci_alert)");
										
										
								while(rs.next())
								{
								%>
								<table align="center" width="755" border="1" cellspacing="0" cellpadding="3">
								<tr><td style="width:300;">Malware File Name</td><td><%=rs.getString(1)%></td></tr>
								<tr><td>Provider Name</td><td><%=rs.getString(2)%></td></tr>
								<tr><td>Malware Content</td><td><textarea cols="70" rows="10"><%=(String)rs.getString(3)%></textarea></td></tr>
									<tr><td>Sk</td><td><%=rs.getString(4)%></td></tr>
										<tr><td>Date</td><td><%=rs.getString(5)%></td></tr>
										<tr><td colspan="2" style="height:30; background-color:#FF8080"></td></tr></table>
								<%
								}
							
										
										%>
										<p>
										

</p>
<br />

      		
			
      		
			

 <div class="clr"></div>
		
  <%

	   

         connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
          }
%>
       
</html>
