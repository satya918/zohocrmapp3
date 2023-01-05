<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create lead</title>
</head>
<body>
	<h2>New | Lead</h2>
	<form action="save" method="post">
	<pre>
	firstname<input type="text" name="firstname"/>
	lastName<input type="text" name="lastName"/>
	email<input type="email" name="email"/>
	mobile<input type="number" name="mobile"/>
	
	SOURCE:<select name="source" >
	  <option value="online">online</option>
	  <option value="webinar">webinar</option>
	  <option value="radio">radio</option>
	  <option value="newspaper">newspaper</option>
	</select>
	<input type="submit" value="save"/>
	
	
	</pre>
	
	</form>
</body>
</html>