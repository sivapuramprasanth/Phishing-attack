package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class blkuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<table align=\"center\" width=\"755\" border=\"1\" cellpadding=\"3\">\r\n");
      out.write("<tr><td width=\"200\">Image</td><td>User Name</td><td>Email-ID</td><td>Mobile Number</td><td>Block/Un-Block</td></tr>\r\n");


try{
ResultSet rs=connection.createStatement().executeQuery("select * from mdcci_provider p where p.name not in(select name from  mdcci_pauth)");
ResultSet rs1=connection.createStatement().executeQuery("select * from mdcci_provider p where p.name  in(select name from  mdcci_pauth)");
while(rs.next())
{

      out.write("\r\n");
      out.write("<tr><td><img src=\"images.jsp?id=");
      out.print(rs.getInt(1));
      out.write("\" width=\"200\"\r\n");
      out.write("height=\"100\"/></td><td>");
      out.print(rs.getString(2));
      out.write("</td><td>");
      out.print(rs.getString(4));
      out.write("</td><td>");
      out.print(rs.getString(5));
      out.write("</td><td><a href=\"block.jsp?name=");
      out.print(rs.getString(2));
      out.write("\">Block</a></td></tr>\r\n");

}
while(rs1.next())
{

      out.write("\r\n");
      out.write("<tr><td><img src=\"images.jsp?id=");
      out.print(rs1.getInt(1));
      out.write("\" width=\"200\"\r\n");
      out.write("height=\"100\"/></td><td>");
      out.print(rs1.getString(2));
      out.write("</td><td>");
      out.print(rs1.getString(4));
      out.write("</td><td>");
      out.print(rs1.getString(5));
      out.write("</td><td><a href=\"unblock.jsp?name=");
      out.print(rs1.getString(2));
      out.write("\">Un-Block</a></td></tr>\r\n");

}
}
catch(Exception e)
{
e.printStackTrace();
}

      out.write("\r\n");
      out.write("</table>\r\n");
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
