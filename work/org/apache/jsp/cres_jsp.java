package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.util.*;

public final class cres_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
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

      out.write('\r');
      out.write('\n');


              
              	String  fname = "", cont = "", s4 = "", s5 = "", s2 = "", s7 = "", s8, s9 = "", s10, s12, s13;
              	int  j = 0, k = 0, count = 0, count1 = 0;
              	double l1, l2, l3 = 0;
				String b="";
	
	String x="000000000";
              	String decryptedValue = "", decryptedValue1 = "", decryptedValue2 = "";
              	try {

    
              		String query = "select * from mdcci_cloudserver order by ownername";
              		Statement st = connection.createStatement();
              		ResultSet rs2 = st.executeQuery(query);

      out.write("\r\n");
      out.write("                \r\n");

              		while (rs2.next()) {
              			
              			fname = rs2.getString(1);
              			s7 = rs2.getString(3);

              			s4 = rs2.getString(2);
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
      out.write("              ");

							} 
								}

int z=(int)((float)count/(float)count1*100);
int y=100-z;
connection.createStatement().executeUpdate("update pichart set value='"+z+"' where section='Malicious Affected Documents' ");
connection.createStatement().executeUpdate("update pichart set value='"+y+"' where section='Malicious Free Documents' ");






















ResultSet rs=connection.createStatement().executeQuery("select * from pichart");
ResultSet rs1=connection.createStatement().executeQuery("select * from pichart");


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>Results</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"sources/jscharts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"graph\">Loading...</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar myData=new Array();\r\n");
      out.write("var j=0;\r\n");
      out.write("var colors =[];\r\n");

	int i=0;
	
		Random random=new Random();
	String base="0123456789ABCDEF";
	while(rs.next())
	{
	String s1=rs.getString(1);
	double s3=(int)rs.getDouble(2);
	
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tmyData[\"");
      out.print(i);
      out.write("\"]=[\"");
      out.print( s1);
      out.write('"');
      out.write(',');
      out.print( s3);
      out.write("];\r\n");
      out.write("colors[\"");
      out.print(i);
      out.write("\"]=\"#");
      out.print( base.charAt(random.nextInt(base.length())));
      out.print( base.charAt(random.nextInt(base.length())));
      out.print( base.charAt(random.nextInt(base.length())));
      out.print( base.charAt(random.nextInt(base.length())));
      out.print( base.charAt(random.nextInt(base.length())));
      out.print( base.charAt(random.nextInt(base.length())));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t");

	i++;}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tvar myChart = new JSChart('graph', 'pie');\r\n");
      out.write("\tmyChart.setDataArray(myData);\r\n");
      out.write("\tmyChart.colorize(colors);\r\n");
      out.write("\tmyChart.setSize(600, 300);\r\n");
      out.write("\tmyChart.setTitle('Malware Results Chart');\r\n");
      out.write("\tmyChart.setTitleFontFamily('Times New Roman');\r\n");
      out.write("\tmyChart.setTitleFontSize(14);\r\n");
      out.write("\tmyChart.setTitleColor('#0F0F0F');\r\n");
      out.write("\tmyChart.setPieRadius(95);\r\n");
      out.write("\tmyChart.setPieValuesColor('#FFFFFF');\r\n");
      out.write("\r\n");
      out.write("\tmyChart.setPieValuesFontSize(9);\r\n");
      out.write("\tmyChart.setPiePosition(180, 165);\r\n");
      out.write("\tmyChart.setShowXValues(false);\r\n");
      out.write("\t\r\n");
      out.write("\t");

	

	
	while(rs1.next())
	{
	String s11=rs1.getString(1);
	double s31=(int)rs1.getDouble(2);
	
	
	
      out.write("\r\n");
      out.write("\tmyChart.setLegend( colors[j],\"");
      out.print( s11 );
      out.write("\" );\r\n");
      out.write("\r\n");
      out.write("j++;\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t//myChart.setLegend(myData1);\r\n");
      out.write("\t//myChart.setLegend('#99CDFB', 'Papers where authors found');\r\n");
      out.write("\t//myChart.setLegend('#3366FB', 'Papers which cite from other articles');\r\n");
      out.write("\t//myChart.setLegend('#0000FA', 'Papers which cite from news');\r\n");
      out.write("\t//myChart.setLegend('#F8CC00', 'Papers which lack crucial');\r\n");
      out.write("\t//myChart.setLegend('#F89900', 'Papers with different conclusion');\r\n");
      out.write("\t//myChart.setLegend('#F76600', 'Papers with useful information');\r\n");
      out.write("\tmyChart.setLegendShow(true);\r\n");
      out.write("\tmyChart.setLegendFontFamily('Times New Roman');\r\n");
      out.write("\tmyChart.setLegendFontSize(12);\r\n");
      out.write("\tmyChart.setLegendPosition(350, 120);\r\n");
      out.write("\tmyChart.setPieAngle(30);\r\n");
      out.write("\tmyChart.set3D(true);\r\n");
      out.write("\tmyChart.draw();\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");

}
catch(Exception e)
{
e.printStackTrace();
}

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
