<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
                <%@ include file="menu.jsp" %>
        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All leads</title>
</head>
<body>
	<h2 align="center">All leads are here</h2>
	<table align="center" border='2'>
		<tr>
			<th>firstName</th>
			<th>lastName</th>
			<th>email</th>
			<th>mobile</th>
			<th>source</th>
			</tr>
			
			<c:forEach var="lead" items="${lead}">
			<tr>
				<td><a href="leadinfo?id=${lead.id}">${lead.firstname }</a></td>
				<td>${lead.lastName }</td>
				<td>${lead.email }</td>
				<td>${lead.mobile }</td>
				<td>${lead.source }</td>
			</tr>	
			
			
			
			</c:forEach>	
	
	</table>

</body>
</html>