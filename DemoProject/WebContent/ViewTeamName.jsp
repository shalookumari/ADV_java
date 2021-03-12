<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Team Names</title>
</head>
<body>
  <%@ page import ="java.util.*,com.ltts.Servlet.model.*,com.ltts.Servlet.dao.*" %>
  <%
  Playerdao pd=new Playerdao();
  Set<String> teamname = new TreeSet<String>();
  List<Player> li=pd.getAllPlayers();
  for(Player p:li){
	  teamname.add(p.getName());
  }
  
  %>
  <%
for(String str:teamname){
	 %>
	 <a href="ViewPlayersInTeams.jsp?tname=<%=str%>"><%=str%></a> <br><br>
	 <%} %>

</body>
</html>