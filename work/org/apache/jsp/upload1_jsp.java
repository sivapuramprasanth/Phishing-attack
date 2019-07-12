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

public final class upload1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
										
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("<h2>Data Uploaded Successfully !!!</h2>\r\n");
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
}
  else
  {
  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("<h2>File Name Already Exist...!!!</h2>\r\n");
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

  }

	   

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
