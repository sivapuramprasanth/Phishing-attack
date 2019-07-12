<%@ include file="connect.jsp"%>
<%
String user = request.getParameter("user");

try{
int x=connection.createStatement().executeUpdate("update mdcci_provider set authorize='Authorized' where name='"+user+"' ");
if(x > 0)
{
response.sendRedirect("vp.jsp");
}
}
catch(Exception e)
{
e.printStackTrace();

}
%>