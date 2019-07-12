package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class csa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              \r\n");

              
              	String s1 = "", fname = "", cont = "", s4 = "", s5 = "", s2 = "", s7 = "", s8, s9 = "", s10, s11 = "", s12, s13;
              	int i = 0, j = 0, k = 0, count = 0, count1 = 0;
              	double l1, l2, l3 = 0;
				String b="";
	
	String x="000000000";
              	String decryptedValue = "", decryptedValue1 = "", decryptedValue2 = "";
              	try {

    
              		String query = "select * from mdcci_cloudserver order by ownername";
              		Statement st = connection.createStatement();
              		ResultSet rs = st.executeQuery(query);

      out.write("\r\n");
      out.write("                \r\n");

              		while (rs.next()) {
              			
              			fname = rs.getString(1);
              			s7 = rs.getString(3);

              			s4 = rs.getString(2);
              			count1++;
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
							|| b.indexOf(x)>0) {
								count++;
              
      out.write("\r\n");
      out.write("              \r\n");
      out.write("   <table align=\"center\" width=\"755\"  border=\"1\"  cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("             <tr>\r\n");
      out.write("              <td width=\"255\" height=\"37\"><div align=\"center\" class=\"style3\"><span class=\"style4 style1\"> Malicious File Name </span></div></td>\r\n");
      out.write("              <td width=\"437\"><div align=\"center\">");
      out.print(fname);
      out.write("        \r\n");
      out.write("                \r\n");
      out.write("              </div></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("              <td height=\"34\" class=\"style4 style2 style3\"><div align=\"center\" class=\"style3\">Owner Name </div></td>\r\n");
      out.write("              <td><div align=\"center\"><pre>");
      out.print(s4);
      out.write("          <a href=\"sendalert.jsp?fname=");
      out.print(fname);
      out.write("&name=");
      out.print(s4);
      out.write("\" ><span style=\"color:#000000; font-size:16px; background-color:#00FFFF\">Send Alert </a> </span>  </pre>\r\n");
      out.write("                \r\n");
      out.write("              </div></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("              <td height=\"258\">Malicious Data</td>\r\n");
      out.write("              <td><div align=\"center\">\r\n");
      out.write("                <textarea name=\"text\" id=\"textarea\" cols=\"50\" rows=\"15\">");
      out.print(s7);
      out.write("</textarea>\r\n");
      out.write("              </div></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("            \r\n");
      out.write("             <tr>\r\n");
      out.write("              <td colspan=\"2\" height=\"30\"><div align=\"right\"></div></td>\r\n");
      out.write("             \r\n");
      out.write("             </tr>\r\n");
      out.write("          </table>  \r\n");
      out.write("\t\t\t\t\t  ");

							} 
								}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>");
      out.print((int)((float)count/(float)count1*100));
      out.write("% Files In cloud are malicious </h1>");

							} catch (Exception e) {
								e.printStackTrace();
							}
						
      out.write("\r\n");
      out.write("       </table>\r\n");
      out.write("       \r\n");
      out.write("      \r\n");
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
