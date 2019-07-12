
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
	
%>
					    
						
						<% try 
	{
      		String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8, s9 = "", s10, s11, s12, s13;
		int i = 0, j = 0, k;
		
		%><h2 align="center">Service Providers Shown Below...!!!</h2>
		
		
								
		<%
			
      		
		Statement st21 = connection.createStatement();
						ResultSet rs=st21.executeQuery("select * from  mdcci_provider p where p.name not in(select name from  mdcci_pauth)");
										
										
								while(rs.next())
								{
								i=rs.getInt(1);
								s1=rs.getString(2);
								s2=rs.getString(3);
								s3=rs.getString(4);
									s4=rs.getString(5);
								s5=rs.getString(6);
								s6=rs.getString(7);
								s7=rs.getString(8);
								s8=rs.getString(9);
								s9=rs.getString(10);
									s10=rs.getString(11);
										s11=rs.getString(12);
								
							
							
								
								
								
					%><table align="center" width="755" border="1">
					<tr><td width="238" rowspan="9" >
						<div style="margin:10px 13px 10px 13px;" >
                		 <a class="#" id="img1" href="#" >
							<input  name="image" type="image"  src="images.jsp?id=<%=i%>" style="width:200px; height:230px;"  />
				   		</a>                	</div>
					</td>
					</tr>
					<tr>
					  <td  width="160" valign="middle" height="40" style="color: #000000;"><div align="left" class="style11 style13 style2 style1" style="margin-left:20px;">Username</div></td>
					  <td  width="191" valign="middle" height="40" style="color:#000000;"><div align="left" class="style4" style="margin-left:20px;"><%out.println(s1);%></div></td>
					</tr>
					<tr>
					  <td  width="160" valign="middle" height="40" style="color: #000000;"><div align="left" class="style14 style2 style1" style="margin-left:20px;">E-Mail</div></td>
					  <td  width="191" valign="middle" height="40" style="color:#000000;"><div align="left" class="style4" style="margin-left:20px;"><%out.println(s3);%></div></td>
					</tr>
					<tr>
					  <td  width="160" valign="middle" height="40" style="color: #000000;"><div align="left" class="style14 style2 style1" style="margin-left:20px;">Mobile</div></td>
					  <td  width="191" valign="middle" height="40" style="color:#000000;" ><div align="left" class="style4" style="margin-left:20px;"><%out.println(s4);%></div></td>
					</tr>
				
					<tr>
					  <td  width="160" align="left" valign="middle" height="40" style="color: #000000;"><div align="left " class="style14 style2 style1" style="margin-left:20px;">Date Of Birth</div></td>
					  <td  width="191" align="left" valign="middle" height="40" style="color:#000000;"> <div align="left" class="style4" style="margin-left:20px;"><%out.println(s6);%></div></td>
					</tr>
					<%
					if(s11.equalsIgnoreCase("un-authorized"))
					{
					
					%>
					<tr>
					  <td   width="160" align="left" valign="middle" height="40" style="color: #000000;"><div align="left" class="style14 style2 style1" style="margin-left:20px;">Status</div                        ></td>
						<td  width="191" align="left" valign="middle" height="40" style="color: #000000;"><div align="left">
					  <div align="left" class="style4" style="margin-left:20px;"><a href="aut.jsp?user=<%=s1%>"><span style="color:#FF0000"><%out.println(s11);%></span></a></div></td>
					</tr>
					<%
					}
					else
					{
					%>
					<tr>
					  <td   width="160" align="left" valign="middle" height="40" style="color: #000000;"><div align="left" class="style14 style2 style1" style="margin-left:20px;">Status</div                        ></td>
						<td  width="191" align="left" valign="middle" height="40" style="color: #000000;"><div align="left">
					  <div align="left" class="style4" style="margin-left:20px;"><%out.println(s11);%></div></td>
					</tr>
					<%
					}%>
					<tr>
					  <td   width="160" align="left" valign="middle" height="40" style="color: #000000;"><div align="left" class="style14 style2 style1" style="margin-left:20px;">Gender</div                        ></td>
						<td  width="191" align="left" valign="middle" height="40" style="color: #000000;"><div align="left">
					  <div align="left" class="style4" style="margin-left:20px;"><%out.                       println(s7);%></div></td>
					</tr>
						<tr>
<td  width="160" align="left" valign="middle" height="40" style="color: #000000;"><div align="left" class="style14 style2 style1" style="margin-left:20px;">Address</div> </td>                    	
<td  width="191" align="left" valign="middle" height="40" style="color:#000000;"><div align="left" class="style4" style="margin-left:20px;"><%out.println(s5);%></div></td>
					</tr>
					 <td   width="160" align="left" valign="middle" height="40" style="color: #000000;"><div align="left" class="style14 style2 style1" style="margin-left:20px;">PIN </div                        ></td>
						<td  width="191" align="left" valign="middle" height="40" style="color: #000000;"><div align="left">
					  <div align="left" class="style4 style5" style="margin-left:20px;"><%out.                       println(s8);%></div></td>
					</tr>
					<tr ><td colspan="3" height="20" style="background-color:#00FF00"></td></tr>
					
				
					</table></br></br>
		
					<%
						}
						connection.close();
					}
					catch(Exception e)
					{
						out.println(e.getMessage());
					}
					%>

					
			</p>
				</html>