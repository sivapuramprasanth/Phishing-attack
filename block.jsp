<%@ include file="connect.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%
String name=request.getParameter("name");
try{
int x=connection.createStatement().executeUpdate("insert into mdcci_pauth values ('"+name+"','Un-Authorized')");
if(x>0)
{

response.sendRedirect("blkuser.jsp");
}


}
catch(Exception e)
{
e.printStackTrace();
}
%>
</table>
</html>
