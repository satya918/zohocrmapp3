<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>New | Lead</h2>
	<form action="savebill" method="post">
	<pre>
	FirstName<input type="text" name="firstname" value="${contact.firstname }"/>
	LastName<input type="text" name="lastName" value="${contact.lastName }"/>
	Email<input type="email" name="email" value="${contact.email }"/>
	Mobile<input type="number" name="mobile" value="${contact.mobile }"/>
	Product<input type="text" name="product"/>
	Quantity<input type="text" name="quantity"/>
	Amount<input type="text" name="amount"/>
	
	
	<input type="submit" value="Generate"/>
	
	
	</pre>
	
	</form>

</body>
</html>