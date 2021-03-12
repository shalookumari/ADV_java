<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import = "java.util.*" %>
    <%@ page import = "com.ltts.Servlet.model.Team" %>
    <%@ page import = "com.ltts.Servlet.dao.Teamdao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Team</title>
</head>
<body>
<% String name=request.getParameter("id");
Teamdao pd=new Teamdao();
Team t1=pd.getTeamByname(name);
%>
<form action="./DeleteTeam" method="post">
Team Name Confirm: <input type="text" value = "<%=t1.getTeamName() %>" name = "tname"> <br><br>
<input type="submit" value="Delete Team">

</form>
</body>
</html>