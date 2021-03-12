<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.ltts.Servlet.model.*" %>
    <%@ page import = "com.ltts.Servlet.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name=request.getParameter("id");
Playerdao pd=new Playerdao();
Player p1=pd.getPlayerByName(name);
%>
<form action="./DeletePlayer" method="post">
Player Name Confirm: <input type="text" value = "<%=p1.getName() %>" name = "pname"> <br><br>

<input type="submit" value="Delete Player">

</form>
</body>
</html>