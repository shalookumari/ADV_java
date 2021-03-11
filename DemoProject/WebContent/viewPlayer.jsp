<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*,com.ltts.Servlet.model.*,com.ltts.Servlet.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<%
Playerdao pd =new Playerdao();
List<Player> li = pd.getAllPlayers();
%>
<table>
<tr>
<th>Name</th>
<th>DOB</th>
<th>Matches</th>
<th>Runs</th>
<th>Wickets</th>
</tr>
<%
for(Player p:li){
%>  
<tr>
<td><% p.getName(); %></td>
<td><% p.getDateOfBirth(); %></td>
<td><% p.getMatch(); %></td>
<td><%p.getRuns(); %></td>
<td><%p.getMatch(); %></td>
<td><a href="editplayer.jsp?id=<%=p.getName()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>