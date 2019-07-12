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

public final class dfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>");

		  
		    	try 
				{
		  		String file = request.getParameter("t1");

		  		
		        
		  
		  		String fn=(String)application.getAttribute("file");
		  		String un=(String)application.getAttribute("ename");
		  		String oname = request.getParameter("oname");
		  		
		  			String prcs = "Responsed";
		
		  			String query1 = "select * from mdcci_userrequest  where username='"+un+"' and fnamereq='" + file+ "' and resstatus='Responsed' ";
		  			Statement st1 = connection.createStatement();
		  			ResultSet rs1 = st1.executeQuery(query1);

		  			if (rs1.next()) {
		  		
      out.write("\r\n");
      out.write("\t\t  \t\t");
		  		
				String mac1="";
				String mac2="";
				String mac3="";
				String mac4="";
				String sk="";
				String strQuery = "select * from mdcci_cloudserver where fname='"+file+"' and ownername='"+oname+"'";
				ResultSet rs = connection.createStatement().executeQuery(strQuery);
				{
					if(rs.next()==true)
					{
						 
						sk=rs.getString(4);
						
					SimpleDateFormat sdfDate = new SimpleDateFormat(
					"dd/MM/yyyy");
					SimpleDateFormat sdfTime = new SimpleDateFormat(
					"HH:mm:ss");

					Date now = new Date();

					String strDate = sdfDate.format(now);
					String strTime = sdfTime.format(now);
					String dt = strDate + "   " + strTime;	
					String task="Download";
					String user=(String) application.getAttribute("ename");
					String strQuery2 = "insert into mdcci_transaction(user,fname,sk,task,dt) values('"+user+"','"+file+"','"+sk+"','"+task+"','"+dt+"')";
					connection.createStatement().executeUpdate(strQuery2);
					
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("<form action=\"dfile1.jsp\" method=\"post\" name=\"form1\" id=\"form1\" >\r\n");
      out.write("<table width=\"755\" border=\"1\" align=\"center\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"223\"><span class=\"style1\">Enter File Name :-</span></td>\r\n");
      out.write("\t\t<td width=\"245\"><label> <input required name=\"t1\"\r\n");
      out.write("\t\t\ttype=\"text\"  size=\"40\" value=\"");
      out.print(file);
      out.write("\"  /> </label></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td ><span class=\"style1\">Enter Service Provider Name:-</span></td>\r\n");
      out.write("\t\t<td><input name=\"oname\" type=\"text\" size=\"40\" value=\"");
      out.print(oname);
      out.write("\"  /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><span class=\"style1\">Secret Key :-</span></td>\r\n");
      out.write("\t\t<td><input name=\"t13\" type=\"text\" size=\"40\" value=\"");
      out.print(sk);
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<div align=\"right\"><input type=\"submit\" name=\"Submit\"\r\n");
      out.write("\t\t\tvalue=\"Download\" /></div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
	
					}
					else
					{
		
						out.println("File Doesn't Exist !!!");
			
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t");

					}
				}
				
		  			} else {
		  		
      out.write("\r\n");
      out.write("\t\t  \t\t<p>\r\n");
      out.write("\t\t  \t\t<h2>You Don't Have Permission To Download !!!</h2>\r\n");
      out.write("\t\t  \t\t</p>\r\n");
      out.write("\t\t  \t\t<br />\r\n");
      out.write("\t\t  \t\t<p></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t  \t\t");

		  			}
		
		  		     
		  				
	 
           connection.close();
          }
         
          catch(Exception e)
          {
            out.println(e.getMessage());
          }

      out.write(" \t\t\r\n");
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
