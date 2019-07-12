<%@ include file="connect.jsp"%>
              
<%
              
              	String s1 = "", fname = "", cont = "", s4 = "", s5 = "", s2 = "", s7 = "", s8, s9 = "", s10, s11 = "", s12, s13;
              	int i = 0, j = 0, k = 0, count = 0, count1 = 0;
              	double l1, l2, l3 = 0;
              	String decryptedValue = "", decryptedValue1 = "", decryptedValue2 = "";
					String b="";
	
	String x="000000000";
              	try {

    
              		String query = "select * from mdcci_cloudserver ";
              		Statement st = connection.createStatement();
              		ResultSet rs = st.executeQuery(query);
%>
                
<%
              		while (rs.next()) {
              			
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
			) {
              %>
              
   <table align="center" width="755"  border="1"  cellpadding="0" cellspacing="0">
             <tr>
              <td width="155" height="37"><div align="center" class="style3"><span class="style4 style1"> File Name </span></div></td>
              <td width="437"><div align="center"><%=fname%>
                
              </div></td>
             </tr>
             <tr>
              <td height="34" class="style4 style2 style3"><div align="center" class="style3">Owner Name </div></td>
              <td><div align="center">
           <%=s4%>
              </div></td>
             </tr>
             <tr>
              <td height="258">Malicious Data</td>
              <td><div align="center">
                <textarea name="text" id="textarea" cols="50" rows="15"><%=s7%></textarea>
              </div></td>
             </tr>
            
             <tr>
              <td colspan="2" height="30"><div align="right"></div></td>
             
             </tr>
          </table>  
					  <%
							} 
								}

							} catch (Exception e) {
								e.printStackTrace();
							}
						%>
       </table>
       
      
