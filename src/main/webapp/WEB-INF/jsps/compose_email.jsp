<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send email</title>
</head>
<body>
	<h2 align="center">Compose Email</h2>
	${msg }
	<form align="center" action="compose_email" method="post">
	<pre>
	
	
	TO<input type="email" name="to" value="${mail}"/>
	SUBJECT<input type="text" name="sub"/>
	<textarea id="MESSAGE" name="msg" rows="4" cols="50">

  </textarea>
  <input type="submit" value="SEND"/>

	
	
	</pre>
	</form>
	</body>
</html>