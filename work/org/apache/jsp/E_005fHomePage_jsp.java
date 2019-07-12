package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class E_005fHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<meta name=\"keywords\" content=\"corporate, free web template\" />\r\n");
      out.write("<meta name=\"description\" content=\"Corporate - free website template from templatemo.com\" />\r\n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("function clearText(field)\r\n");
      out.write("{\r\n");
      out.write("    if (field.defaultValue == field.value) field.value = '';\r\n");
      out.write("    else if (field.value == '') field.value = field.defaultValue;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"templatemo_site_title_bar_wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"templatemo_site_title_bar\">\r\n");
      out.write("    \r\n");
      out.write("        <div id=\"templatemo_menu\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"index.html\" ><span></span>Home</a></li>\r\n");
      out.write("\t\t\t\t <li><a href=\"P_HomePage.html\"> <span></span>  Service Provider</a></li>\r\n");
      out.write("                <li><a href=\"E_HomePage.html\" class=\"current\">  </span>End User</a></li>\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"C_HomePage.html\"><span></span>Cloud Server</a></li>\r\n");
      out.write("                <li><a href=\"about.html\"><span></span>About Us</a></li>\r\n");
      out.write("            </ul>    \t\r\n");
      out.write("        </div> <!-- end of templatemo_menu -->\r\n");
      out.write("    \r\n");
      out.write("    \t<div class=\"site_title_left\">\r\n");
      out.write("    \r\n");
      out.write("           <div id=\"site_title\" style=\"width:600px;\">\r\n");
      out.write("                <h1><a href=\"#\">\r\n");
      out.write("                    <!-- <img src=\"images/templatemo_logo.png\" alt=\"Free Templates\" /> -->\r\n");
      out.write("                   Phishing web sites Features classification\r\n");
      out.write("                    <span> based on extreme learning machine</span>\r\n");
      out.write("                </a></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"site_title_right\">\r\n");
      out.write("        \t\r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("    \t\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"cleaner\"></div>\r\n");
      out.write("        \r\n");
      out.write("     \r\n");
      out.write("    </div> <!-- end of templatemo_site_title_bar -->\r\n");
      out.write("\r\n");
      out.write("</div> <!-- end of templatemo_site_title_bar_wrapper -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"templatemo_content\" >\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"section_w900\"  >\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<p style=\"align:center;\">\r\n");
      out.write("     \r\n");
      out.write("\t   <p>&nbsp;</p>\r\n");
      out.write("      <p>    \r\n");
      out.write("\t<p>\r\n");
      out.write("\t<h2 style=\"text-align:center;\"> End User Login...!!!</h2>\r\n");
      out.write("\t<p style=\"align:center;\">&nbsp;</p>\r\n");
      out.write("\t<p style=\"align:center;\"><form method=\"post\" action=\"Authentication.jsp?type=user1\">\r\n");
      out.write("              <table style=\"align:center;\" align=\"center\"width=\"780\" border=\"1\" cellspacing=\"3\" cellpadding=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Enter End User Name:-</span></td>\r\n");
      out.write("                  <td><input type=\"text\" name=\"name\" placeholder=\"User Name\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Enter End User Mail:-</span></td>\r\n");
      out.write("                  <td><input type=\"text\" name=\"email\" placeholder=\"User email\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Enter Password:-</span></td>\r\n");
      out.write("                  <td><Input type=\"password\" name=\"pass\" placeholder=\"Password\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td style=\"text-align:center\"><a href=\"E_Register.html\">Register</a></td>\r\n");
      out.write("                  <td><input type=\"submit\" value=\"Login\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("              <p>&nbsp;</p>\r\n");
      out.write("\t</form>    \r\n");
      out.write("\t<p>    \r\n");
      out.write("\t<p>     \r\n");
      out.write("\t  <p>    \r\n");
      out.write("\t<p>    \r\n");
      out.write("\t<p>    \r\n");
      out.write("\t<p>\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("</div> <!-- end of content -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"templatemo_footer_wrapper\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"templatemo_footer\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"cleaner_h40\"></div>\r\n");
      out.write("\r\n");
      out.write("  </div> <!-- end of footer -->\r\n");
      out.write("</div>\r\n");
      out.write("<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>\r\n");
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
