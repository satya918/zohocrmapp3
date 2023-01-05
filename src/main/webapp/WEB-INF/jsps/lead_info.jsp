<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
	<h2 align="center">All Lead Information Here</h2>
	<hr/>
	<h3 align="center">
		firstName:${lead.firstname }<br/>
		 lastName:${lead.lastName }<br/>
			email:${lead.email }<br/>
			mobile:${lead.mobile }<br/>
			source:${lead.source }<br/>
	</h3>
	<form  align="center" action="composeEmail" method="post">
	<input type="hidden" name="email" value="${lead.email }"/>
				<input type="submit" value="Email"/>
	
	
	</form>
	<form align="center" action="convertlead" method="post">
	<input type="hidden" name="id" value="${lead.id }"/>
	<input type="submit" value="convert"/>
	
	
	</form>

</body>
</html>