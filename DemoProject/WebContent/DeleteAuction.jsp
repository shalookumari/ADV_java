<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import = "java.util.*" %>
    <%@ page import = "com.ltts.Servlet.model.Auction" %>
    <%@ page import = "com.ltts.Servlet.dao.Auctiondao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Auction</title>
</head>
<body>
<% int name=Integer.parseInt(request.getParameter("id"));
Auctiondao pd=new Auctiondao();
Auction p1=pd.getAuctionById(name);
%>
<form action="./DeleteAuction" method="post">
Auction Id Confirm : <input type="text" value = "<%=p1.getAuctionId() %>" name = "aid"> <br><br>

<input type="submit" value="Delete Auction">

</form>
</body>
</html>