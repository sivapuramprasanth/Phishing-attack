package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<body><form method=\"post\" action=\"reg2.jsp\" enctype=\"multipart/form-data\">\r\n");
      out.write("              <table width=\"780\" border=\"1\" cellspacing=\"3\" cellpadding=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Service Provider Name (required)</span></td>\r\n");
      out.write("                  <td><Input type=\"text\" name=\"userid\" placeholder=\"Service Provider Name\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Password (required)</span></td>\r\n");
      out.write("                  <td><Input type=\"password\" name=\"pass\" placeholder=\"Password\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Email Address (required)</span></td>\r\n");
      out.write("                  <td><Input type=\"text\" name=\"email\" placeholder=\"test@gmail.com\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Mobile Number (required)</span></td>\r\n");
      out.write("                  <td><Input type=\"text\" name=\"mobile\" placeholder=\"Mobile Number\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Your Address</span></td>\r\n");
      out.write("                  <td ><Input type=\"text\" \r\n");
      out.write("\t\t name=\"address\" placeholder=\"Address\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Date of Birth (required)</span></td>\r\n");
      out.write("                  <td><Input type=\"text\" name=\"dob\" placeholder=\"DD/MM/YYYY\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Select Gender (required)</span></td>\r\n");
      out.write("                  \r\n");
      out.write("                  <td> <select id=\"s1\" name=\"gender\" class=\"text\">\r\n");
      out.write("                  <option>--Select--</option>\r\n");
      out.write("                  <option>MALE</option>\r\n");
      out.write("                  <option>FEMALE</option>\r\n");
      out.write("                </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Enter Pincode (required)</span></td>\r\n");
      out.write("                  <td><Input type=\"text\" name=\"pincode\" placeholder=\"Enter PIN\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Enter Location (required)</span></td>\r\n");
      out.write("                  <td><Input type=\"text\" name=\"location\" placeholder=\"Location\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                  <td><span style=\"color:#000000\" >Select Profile Picture (required)</span></td>\r\n");
      out.write("                  <td><Input type=\"file\" name=\"pic\" placeholder=\"Browse Profile Picture\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                  <td><input type=\"submit\" value=\"Register\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table></form>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t</body>\r\n");
      out.write("\t\t\t</html>  \r\n");
      out.write("\t\r\n");
      out.write("          \r\n");
      out.write("             ");
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
