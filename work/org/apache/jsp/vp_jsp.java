package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.util.*;
import java.util.*;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.util.encoders.Base64;
import java.sql.*;
import java.util.Random;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.io.BufferedInputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.Cipher;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.*;

public final class vp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/connect.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Providing User Security Guarantees in Public\r\n");
      out.write("Infrastructure Clouds</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Connection connection = null;
 	try {
     

	  	Class.forName("com.mysql.jdbc.Driver");	
		connection = DriverManager.getConnection("jdbc:mysql://localhost:2308/mdcci","root","admin");
      	String sql="";

	}
	catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t   ");

	

      out.write("\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
 try 
	{
      		String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8, s9 = "", s10, s11, s12, s13;
		int i = 0, j = 0, k;
		
		
      out.write("<h2 align=\"center\">Service Providers Shown Below...!!!</h2>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t");

			
      		
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
								
							
							
								
								
								
					
      out.write("<table align=\"center\" width=\"755\" border=\"1\">\r\n");
      out.write("\t\t\t\t\t<tr><td width=\"238\" rowspan=\"9\" >\r\n");
      out.write("\t\t\t\t\t\t<div style=\"margin:10px 13px 10px 13px;\" >\r\n");
      out.write("                \t\t <a class=\"#\" id=\"img1\" href=\"#\" >\r\n");
      out.write("\t\t\t\t\t\t\t<input  name=\"image\" type=\"image\"  src=\"images.jsp?id=");
      out.print(i);
      out.write("\" style=\"width:200px; height:230px;\"  />\r\n");
      out.write("\t\t\t\t   \t\t</a>                \t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t  <td  width=\"160\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\" class=\"style11 style13 style2 style1\" style=\"margin-left:20px;\">Username</div></td>\r\n");
      out.write("\t\t\t\t\t  <td  width=\"191\" valign=\"middle\" height=\"40\" style=\"color:#000000;\"><div align=\"left\" class=\"style4\" style=\"margin-left:20px;\">");
out.println(s1);
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t  <td  width=\"160\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\" class=\"style14 style2 style1\" style=\"margin-left:20px;\">E-Mail</div></td>\r\n");
      out.write("\t\t\t\t\t  <td  width=\"191\" valign=\"middle\" height=\"40\" style=\"color:#000000;\"><div align=\"left\" class=\"style4\" style=\"margin-left:20px;\">");
out.println(s3);
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t  <td  width=\"160\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\" class=\"style14 style2 style1\" style=\"margin-left:20px;\">Mobile</div></td>\r\n");
      out.write("\t\t\t\t\t  <td  width=\"191\" valign=\"middle\" height=\"40\" style=\"color:#000000;\" ><div align=\"left\" class=\"style4\" style=\"margin-left:20px;\">");
out.println(s4);
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t  <td  width=\"160\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left \" class=\"style14 style2 style1\" style=\"margin-left:20px;\">Date Of Birth</div></td>\r\n");
      out.write("\t\t\t\t\t  <td  width=\"191\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color:#000000;\"> <div align=\"left\" class=\"style4\" style=\"margin-left:20px;\">");
out.println(s6);
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

					if(s11.equalsIgnoreCase("un-authorized"))
					{
					
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t  <td   width=\"160\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\" class=\"style14 style2 style1\" style=\"margin-left:20px;\">Status</div                        ></td>\r\n");
      out.write("\t\t\t\t\t\t<td  width=\"191\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t  <div align=\"left\" class=\"style4\" style=\"margin-left:20px;\"><a href=\"aut.jsp?user=");
      out.print(s1);
      out.write("\"><span style=\"color:#FF0000\">");
out.println(s11);
      out.write("</span></a></div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

					}
					else
					{
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t  <td   width=\"160\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\" class=\"style14 style2 style1\" style=\"margin-left:20px;\">Status</div                        ></td>\r\n");
      out.write("\t\t\t\t\t\t<td  width=\"191\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t  <div align=\"left\" class=\"style4\" style=\"margin-left:20px;\">");
out.println(s11);
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

					}
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t  <td   width=\"160\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\" class=\"style14 style2 style1\" style=\"margin-left:20px;\">Gender</div                        ></td>\r\n");
      out.write("\t\t\t\t\t\t<td  width=\"191\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t  <div align=\"left\" class=\"style4\" style=\"margin-left:20px;\">");
out.                       println(s7);
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("<td  width=\"160\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\" class=\"style14 style2 style1\" style=\"margin-left:20px;\">Address</div> </td>                    \t\r\n");
      out.write("<td  width=\"191\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color:#000000;\"><div align=\"left\" class=\"style4\" style=\"margin-left:20px;\">");
out.println(s5);
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t <td   width=\"160\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\" class=\"style14 style2 style1\" style=\"margin-left:20px;\">PIN </div                        ></td>\r\n");
      out.write("\t\t\t\t\t\t<td  width=\"191\" align=\"left\" valign=\"middle\" height=\"40\" style=\"color: #000000;\"><div align=\"left\">\r\n");
      out.write("\t\t\t\t\t  <div align=\"left\" class=\"style4 style5\" style=\"margin-left:20px;\">");
out.                       println(s8);
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr ><td colspan=\"3\" height=\"20\" style=\"background-color:#00FF00\"></td></tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</table></br></br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t");

						}
						connection.close();
					}
					catch(Exception e)
					{
						out.println(e.getMessage());
					}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t\t</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
