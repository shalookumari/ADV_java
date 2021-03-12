<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "java.util.*" %>
    <%@ page import = "com.ltts.Servlet.model.Auction" %>
    <%@ page import = "com.ltts.Servlet.dao.Auctiondao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Aution</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
Auctiondao pd=new Auctiondao();
Auction p1=pd.getAuctionById(id);
%>
<form action="./UpdateAuction" method="post">
Auction Id: <input type="hidden" value = "<%=p1.getAuctionId() %>" name = "aid"> <br><br>
Bidding Price : <input type="number" value="<%=p1.getPrice() %>" name="aprice"> <br><br>
<input type="submit" value="Update Auction">

</form>
</body>
</html>