package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 String a="";
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-titillium-600.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\" type='text/javascript'>\r\n");
      out.write("        function loadFileAsText()\r\n");
      out.write("    {\r\n");
      out.write("\t\r\n");
      out.write("\t    var fileToLoad = document.getElementById(\"file\").files[0];\r\n");
      out.write("\t\tvar l=document.getElementById(\"file\").value;\r\n");
      out.write("\t\tdocument.getElementById(\"t42\").value=document.getElementById(\"file\").value.substring(l.lastIndexOf(\"\\\\\")+1,l.lastIndexOf(\"\"));\r\n");
      out.write("\t    var fileReader = new FileReader();\r\n");
      out.write("\t    fileReader.onload = function(fileLoadedEvent) \r\n");
      out.write("    {\r\n");
      out.write("\t\tvar textFromFileLoaded = fileLoadedEvent.target.result;\r\n");
      out.write("\t\tdocument.getElementById(\"textarea\").value = textFromFileLoaded;\r\n");
      out.write("\t\t\r\n");
      out.write("\t};\r\n");
      out.write("\t    fileReader.readAsText(fileToLoad, \"UTF-8\");\r\n");
      out.write("\t\t\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <p align=\"center\">\r\n");
      out.write("        \r\n");
      out.write("        <form id=\"form1\" name=\"form1\" method=\"post\" action=\"upload1.jsp\">\r\n");
      out.write("          <table width=\"755\"  border=\"1\" align=\"center\"  cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("             <tr>\r\n");
      out.write("              <td width=\"155\" height=\"37\"><div align=\"center\" class=\"style3\"><span class=\"style4 style1\">Select File </span></div></td>\r\n");
      out.write("              <td width=\"437\"><div align=\"center\">\r\n");
      out.write("                <input required=\"required\" type=\"file\" name=\"t42\" id=\"file\"  onchange=\"loadFileAsText()\" />\r\n");
      out.write("              </div></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("              <td height=\"34\" class=\"style4 style2 style3\"><div align=\"center\" class=\"style3\">File Name </div></td>\r\n");
      out.write("              <td><div align=\"center\">\r\n");
      out.write("                <input required=\"required\" name=\"tt\" type=\"text\" id=\"t42\" readonly=\"readonly\" size=\"50\"/>\r\n");
      out.write("              </div></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("              <td height=\"258\">&nbsp;</td>\r\n");
      out.write("              <td><div align=\"center\">\r\n");
      out.write("                <textarea name=\"text\" id=\"textarea\" cols=\"50\" rows=\"15\"></textarea>\r\n");
      out.write("              </div></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("            \r\n");
      out.write("             <tr>\r\n");
      out.write("              <td><div align=\"right\"></div></td>\r\n");
      out.write("              <td><input type=\"submit\" name=\"Submit\" value=\"Upload\" /></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("</form></p>\r\n");
      out.write("\t\t\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
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
