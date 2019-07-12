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

public final class vaf_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String owner = (String) application.getAttribute("pname");
	

      out.write("\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
 try 
	{
      		String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8, s9 = "", s10, s11, s12, s13;
		int i = 0, j = 0, k;
		
		
      out.write("<h2 align=\"center\">Files Shown Below !!!</h2>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t");

			
      		
		Statement st21 = connection.createStatement();
						ResultSet rs=st21.executeQuery("select * from  mdcci_cloudserver ");
										
										
								while(rs.next())
								{
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<table align=\"center\" width=\"755\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td style=\"width:300;\">File Name</td><td>");
      out.print(rs.getString(1));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>Provider Name</td><td>");
      out.print(rs.getString(2));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>Content</td><td><textarea cols=\"70\" rows=\"10\">");
      out.print((String)rs.getString(3));
      out.write("</textarea></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr><td>Sk</td><td>");
      out.print(rs.getString(4));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr><td>Date</td><td>");
      out.print(rs.getString(5));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr><td colspan=\"2\" style=\"height:30; background-color:#FF8080\"></td></tr></table>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								}
							
										
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("      \t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("      \t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write(" <div class=\"clr\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("  ");


	   

         connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
          }

      out.write("\r\n");
      out.write("       \r\n");
      out.write("</html>\r\n");
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
