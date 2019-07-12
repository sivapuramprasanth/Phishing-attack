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

public final class sdbc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("         ");
 try 
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
	
      out.write("<h1>Search Results for keyword<span style=\"color:#FF00FF\"> ");
      out.print(keyword);
      out.write("</span>\r\n");
      out.write("\t<table width=\"855\" align=\"center\" border=\"1\" cellpadding=\"3\">\r\n");
      out.write("\t<tr><td>File Name</td><td>Provider Name</td><td>File Contents</td><td>Secret Key</td><td>Upload Date</td></tr>\r\n");
      out.write("\t");
	
	
	
	while ( rs.next() )
{
s1=rs.getString(1);
s2=rs.getString(2);
s3=rs.getString(3);
s4=rs.getString(4);
s5=rs.getString(5);
	
	if(s3.indexOf(keyword)>0)
	{		
			
			
			
      out.write("\r\n");
      out.write("\t\t<tr><td>");
      out.print(s1);
      out.write("</td><td>");
      out.print(s2);
      out.write("</td><td><textarea cols=\"50\" rows=\"15\">");
      out.print(s3);
      out.write("</textarea></td><td>");
      out.print(s4);
      out.write("</td><td>");
      out.print(s5);
      out.write("</td></tr>\t\r\n");
      out.write("\r\n");
      out.write(" ");

 }
}
	   

      out.write("\r\n");
      out.write("</table>\r\n");

         connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
            e.printStackTrace();
          }

      out.write("\r\n");
      out.write("</html>");
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
