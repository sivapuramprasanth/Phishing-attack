package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Send_Mail_Attachment;
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

public final class Authentication_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Authentication Page</title>\r\n");
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
	

      out.write("\r\n");
      out.write("\r\n");
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
