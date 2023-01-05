<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ include file="menu.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list contacts</title>
</head>
<body>
	<h2 align="center">All contacts are here</h2>
	<table border='2' align="center">
	
		<tr>
			<th>firstname</th>
			<th>lastName</th>
			<th>email</th>
			<th>mobile</th>
			<th>source</th>
			<th>Billing</th>
			</tr>
			
			
			
			<c:forEach var="con" items="${con}">
			
				<tr>
					<td>${con.firstname }</td>
					<td>${con.lastName }</td>
					<td>${con.email }</td>
					<td>${con.mobile }</td>
					<td>${con.source }</td>
					<td><a href="createbill?id=${con.id }">Billing</a>
					</tr>
			
			</c:forEach>	
	
	</table>

</body>
</html>