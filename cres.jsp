<%@ page import="java.util.*"%>
<%@ include file="connect.jsp"%>
<%

              
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
%>
                
<%
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
              %>
              <%
							} 
								}

int z=(int)((float)count/(float)count1*100);
int y=100-z;
connection.createStatement().executeUpdate("update pichart set value='"+z+"' where section='Malicious Affected Documents' ");
connection.createStatement().executeUpdate("update pichart set value='"+y+"' where section='Malicious Free Documents' ");






















ResultSet rs=connection.createStatement().executeQuery("select * from pichart");
ResultSet rs1=connection.createStatement().executeQuery("select * from pichart");

%>
<html>
<head>

<title>Results</title>

<script type="text/javascript" src="sources/jscharts.js"></script>

</head>
<body>

<div id="graph">Loading...</div>


<script type="text/javascript">
	var myData=new Array();
var j=0;
var colors =[];
<%
	int i=0;
	
		Random random=new Random();
	String base="0123456789ABCDEF";
	while(rs.next())
	{
	String s1=rs.getString(1);
	double s3=(int)rs.getDouble(2);
	
	
	%>
	
	myData["<%=i%>"]=["<%= s1%>",<%= s3%>];
colors["<%=i%>"]="#<%= base.charAt(random.nextInt(base.length()))%><%= base.charAt(random.nextInt(base.length()))%><%= base.charAt(random.nextInt(base.length()))%><%= base.charAt(random.nextInt(base.length()))%><%= base.charAt(random.nextInt(base.length()))%><%= base.charAt(random.nextInt(base.length()))%>";

	<%
	i++;}
	%>
	
	var myChart = new JSChart('graph', 'pie');
	myChart.setDataArray(myData);
	myChart.colorize(colors);
	myChart.setSize(600, 300);
	myChart.setTitle('Malware Results Chart');
	myChart.setTitleFontFamily('Times New Roman');
	myChart.setTitleFontSize(14);
	myChart.setTitleColor('#0F0F0F');
	myChart.setPieRadius(95);
	myChart.setPieValuesColor('#FFFFFF');

	myChart.setPieValuesFontSize(9);
	myChart.setPiePosition(180, 165);
	myChart.setShowXValues(false);
	
	<%
	

	
	while(rs1.next())
	{
	String s11=rs1.getString(1);
	double s31=(int)rs1.getDouble(2);
	
	
	%>
	myChart.setLegend( colors[j],"<%= s11 %>" );

j++;
	<%
	}
	%>

	//myChart.setLegend(myData1);
	//myChart.setLegend('#99CDFB', 'Papers where authors found');
	//myChart.setLegend('#3366FB', 'Papers which cite from other articles');
	//myChart.setLegend('#0000FA', 'Papers which cite from news');
	//myChart.setLegend('#F8CC00', 'Papers which lack crucial');
	//myChart.setLegend('#F89900', 'Papers with different conclusion');
	//myChart.setLegend('#F76600', 'Papers with useful information');
	myChart.setLegendShow(true);
	myChart.setLegendFontFamily('Times New Roman');
	myChart.setLegendFontSize(12);
	myChart.setLegendPosition(350, 120);
	myChart.setPieAngle(30);
	myChart.set3D(true);
	myChart.draw();
	
</script>

</body>
</html><%
}
catch(Exception e)
{
e.printStackTrace();
}
%>