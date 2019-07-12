<%@ include file="connect.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<table align="center" width="755" border="1" cellpadding="3">
<tr><td width="200">Image</td><td>User Name</td><td>Email-ID</td><td>Mobile Number</td><td>Block/Un-Block</td></tr>
<%

try{
ResultSet rs=connection.createStatement().executeQuery("select * from mdcci_provider p where p.name not in(select name from  mdcci_pauth)");
ResultSet rs1=connection.createStatement().executeQuery("select * from mdcci_provider p where p.name  in(select name from  mdcci_pauth)");
while(rs.next())
{
%>
<tr><td><img src="images.jsp?id=<%=rs.getInt(1)%>" width="200"
height="100"/></td><td><%=rs.getString(2)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td><td><a href="block.jsp?name=<%=rs.getString(2)%>">Block</a></td></tr>
<%
}
while(rs1.next())
{
%>
<tr><td><img src="images.jsp?id=<%=rs1.getInt(1)%>" width="200"
height="100"/></td><td><%=rs1.getString(2)%></td><td><%=rs1.getString(4)%></td><td><%=rs1.getString(5)%></td><td><a href="unblock.jsp?name=<%=rs1.getString(2)%>">Un-Block</a></td></tr>
<%
}
}
catch(Exception e)
{
e.printStackTrace();
}
%>
</table>
</html>
