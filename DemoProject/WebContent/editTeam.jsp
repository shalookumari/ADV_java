<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "java.util.*" %>
    <%@ page import = "com.ltts.Servlet.model.Team" %>
    <%@ page import = "com.ltts.Servlet.dao.Teamdao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Team</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
Teamdao pd=new Teamdao();
Team p1=pd.getTeamById(id);
%>
<form action="./UpdateTeamServlet" method="post">
Team Id: <input type="hidden" value = "<%=p1.getTeamId() %>" name = "tno"> <br><br>
Owner Name: <input type="text" value="<%=p1.getOwnerName() %>" name="toname"> <br><br>
Coach Name: <input type="text" value="<%=p1.getCoach() %>" name="tcname"> <br><br>
Captain Id: <input type="number" value="<%=p1.getCaptainId() %>" name="tcid"> <br><br>

<input type="submit" value="Update Team">

</form>
</body>
</html>