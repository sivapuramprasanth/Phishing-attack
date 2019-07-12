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
import com.oreilly.servlet.*;
import java.sql.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public final class dfile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"description\" content=\"website description\" />\r\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-titillium-250.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" <script type='text/javascript'>\r\n");
      out.write("\r\n");
      out.write("function saveTextAsFile()\r\n");
      out.write("{\r\n");
      out.write("\tvar textToWrite = document.getElementById(\"textarea\").value;\r\n");
      out.write("\tvar textFileAsBlob = new Blob([textToWrite], {type:'text/plain'});\r\n");
      out.write("\tvar fileNameToSaveAs = \"File.txt\";\r\n");
      out.write("\r\n");
      out.write("\tvar downloadLink = document.createElement(\"a\");\r\n");
      out.write("\tdownloadLink.download = fileNameToSaveAs;\r\n");
      out.write("\tdownloadLink.innerHTML = \"Download File\";\r\n");
      out.write("\tif (window.webkitURL != null)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t// Chrome allows the link to be clicked\r\n");
      out.write("\t\t// without actually adding it to the DOM.\r\n");
      out.write("\t\tdownloadLink.href = window.webkitURL.createObjectURL(textFileAsBlob);\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\t// Firefox requires the link to be added to the DOM\r\n");
      out.write("\t\t// before it can be clicked.\r\n");
      out.write("\t\tdownloadLink.href = window.URL.createObjectURL(textFileAsBlob);\r\n");
      out.write("\t\tdownloadLink.onclick = destroyClickedElement;\r\n");
      out.write("\t\tdownloadLink.style.display = \"none\";\r\n");
      out.write("\t\tdocument.body.appendChild(downloadLink);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tdownloadLink.click();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function destroyClickedElement(event)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.body.removeChild(event.target);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("           ");

		   	try {
		   		String file = request.getParameter("t1");
		   		String owner = request.getParameter("oname");
		   		String mac1 = request.getParameter("t12");
					String mac2 = request.getParameter("t122");
						String mac3 = request.getParameter("t123");
							String mac4 = request.getParameter("t124");
		   		String sk = request.getParameter("t13");
String s7="",s4="",b="",fname="";
String x="000000000";
		   		application.setAttribute("file2", file);
		   		application.setAttribute("sk2", sk);

		   		String strQuery = "select * from mdcci_cloudserver where fname='"
		   				+ file
		   				+ "' and ownername='"
		   				+ owner
		   				+ "' and  sk='" + sk + "' ";
		   	
	String strQuery1 = "select * from mdcci_cloudserver where fname='"
		   				+ file
		   				+ "' ";
							ResultSet rs1 = connection.createStatement().executeQuery(
		   				strQuery1);
		   		ResultSet rs = connection.createStatement().executeQuery(
		   				strQuery);
		   		
			if(rs1.next())
			{
					if(rs.next())
					{
							//String ct = rs.getString(3);
								fname = rs.getString(1);
              			s7 = rs.getString(3);

              			s4 = rs.getString(2);
              			b=s7.trim();
							if (fname.toLowerCase().endsWith(".ade")
              					|| fname.toLowerCase().endsWith(".adp")
							
              					|| fname.toLowerCase().endsWith(".bas")
              					|| fname.toLowerCase().endsWith(".bat")
              					|| fname.toLowerCase().endsWith(".chm")
              					|| fname.toLowerCase().endsWith(".cmd")
              					|| fname.toLowerCase().endsWith(".com")
              					|| fname.toLowerCase().endsWith(".crt")
              					|| fname.toLowerCase().endsWith(".dll")
              					|| fname.toLowerCase().endsWith(".do*")
              					|| fname.toLowerCase().endsWith(".hlp")
              					|| fname.toLowerCase().endsWith(".hta")
              					|| fname.toLowerCase().endsWith(".inf")
              					|| fname.toLowerCase().endsWith(".ins")

              					|| fname.toLowerCase().endsWith(".js")
              					|| fname.toLowerCase().endsWith(".jse")
              					|| fname.toLowerCase().endsWith(".lnk")
              					|| fname.toLowerCase().endsWith(".md*")
              					|| fname.toLowerCase().endsWith(".msc")
              					|| fname.toLowerCase().endsWith(".msi")
              					|| fname.toLowerCase().endsWith(".mst")
              					|| fname.toLowerCase().endsWith(".ocx")
              					|| fname.toLowerCase().endsWith(".pcd")
              					|| fname.toLowerCase().endsWith(".pif")
              					|| fname.toLowerCase().endsWith(".pot")
              					|| fname.toLowerCase().endsWith(".reg")
              					|| fname.toLowerCase().endsWith(".scr")
              					|| fname.toLowerCase().endsWith(".sct")
              					|| fname.toLowerCase().endsWith(".shb")
              					|| fname.toLowerCase().endsWith(".shs")
              					|| fname.toLowerCase().endsWith(".sys")
              					|| fname.toLowerCase().endsWith(".url")||s7.toLowerCase().endsWith(".ade")
              					|| s7.toLowerCase().endsWith(".adp")
              					|| s7.toLowerCase().endsWith(".bas")
              					|| s7.toLowerCase().endsWith(".bat")
              					|| s7.toLowerCase().endsWith(".chm")
              					|| s7.toLowerCase().endsWith(".cmd")
              					|| s7.toLowerCase().endsWith(".com")
              					|| s7.toLowerCase().endsWith(".crt")
              					|| s7.toLowerCase().endsWith(".dll")
              					|| s7.toLowerCase().endsWith(".do*")
              					|| s7.toLowerCase().endsWith(".hlp")
              					|| s7.toLowerCase().endsWith(".hta")
              					|| s7.toLowerCase().endsWith(".inf")
              					|| s7.toLowerCase().endsWith(".ins")

              					|| s7.toLowerCase().endsWith(".js")
              					|| s7.toLowerCase().endsWith(".jse")
              					|| s7.toLowerCase().endsWith(".lnk")
              					|| s7.toLowerCase().endsWith(".md*")
              					|| s7.toLowerCase().endsWith(".msc")
              					|| s7.toLowerCase().endsWith(".msi")
              					|| s7.toLowerCase().endsWith(".mst")
              					|| s7.toLowerCase().endsWith(".ocx")
              					|| s7.toLowerCase().endsWith(".pcd")
              					|| s7.toLowerCase().endsWith(".pif")
              					|| s7.toLowerCase().endsWith(".pot")
              					|| s7.toLowerCase().endsWith(".reg")
              					|| s7.toLowerCase().endsWith(".scr")
              					|| s7.toLowerCase().endsWith(".sct")
              					|| s7.toLowerCase().endsWith(".shb")
              					|| s7.toLowerCase().endsWith(".shs")
              					|| s7.toLowerCase().endsWith(".sys")
              					|| s7.toLowerCase().endsWith(".url")
								||  b.endsWith("00001111111")
							||  b.endsWith("01111100000")
							||  b.startsWith("111110000")
							||  b.startsWith("01111100000")
							|| b.indexOf(x)>0
			)
			{
			
			
      out.write("\r\n");
      out.write("\t\t\t<h1>Document Contains Mallware</h1>\r\n");
      out.write("\t\t   <img src=\"images/Malware.jpg\" width=\"225\" height=\"225\" />\r\n");
      out.write("\t\t   ");

			
			}
			else
			{			

												
						
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t  </p>\r\n");
      out.write("\t\t  <p align=\"center\" class=\"style1\">File Contents</p>\r\n");
      out.write("\r\n");
      out.write("\t\t    <label>\r\n");
      out.write("\t            <div align=\"center\">\r\n");
      out.write("\t              <textarea name=\"text\" id=\"textarea\" cols=\"45\" rows=\"13\">");
      out.print(s7);
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t              <br/>\r\n");
      out.write("\t              <br/>\r\n");
      out.write("\t              <td><button onClick=\"saveTextAsFile()\">Download</button></td>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t    </label>\r\n");
      out.write("\t\t  <p align=\"center\">&nbsp; </p>\r\n");
      out.write("\t\t  <p>\r\n");
      out.write("\t\t    ");
}
		    	} 
				else {
					SimpleDateFormat sdfDate = new SimpleDateFormat(
							"dd/MM/yyyy");
					SimpleDateFormat sdfTime = new SimpleDateFormat(
							"HH:mm:ss");

					Date now = new Date();

					String strDate = sdfDate.format(now);
					String strTime = sdfTime.format(now);
					String dt = strDate + "   " + strTime;

					String user = (String) application
							.getAttribute("ename");
String type="Internal";
					String strQuery2 = "insert into mdcci_attacker(user,fname,ownername,sk,type,dt) values('"
							+ user
							+ "','"
							+ file
							+ "','"+owner+"','"
							+ sk
							+ "','"+type+"','"
							+ dt
							+ "')";
					connection.createStatement().executeUpdate(strQuery2);
	
      out.write("\r\n");
      out.write("\t      </p>\r\n");
      out.write("\t\t  <p>\r\n");
      out.write("\t\t  <h1 class=\"style1\">Trapdoor / Secret Key Mismatch !!!</h1>\r\n");
      out.write("\t\t  </p><br />\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"dfile0.jsp\">Back</a></p>\r\n");
      out.write("\t");

		}
		}
		else {
		    
      out.write("\r\n");
      out.write("\t      </p>\r\n");
      out.write("\t\t  <p>\r\n");
      out.write("\t\t  <h1 class=\"style1\">File Doesn't Exist !!!</h1>\r\n");
      out.write("\t\t  </p><br />\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"dfile0.jsp\">Back</a></p>\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
}
					
				
			
			connection.close();
		} catch (Exception e) {
			out.println(e.getMessage());
		}
	
      out.write("\r\n");
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
