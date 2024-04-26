<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>
		<%
		String message = (String) request.getAttribute("message");
		if (message != null) {
		%>
		<%=message%>
		<%
		}
		%>
	</h2>
	<form action="login" method="post">
		email:<input type="email" name="email"> <br> <br>
		Password:<input type="text" name="password"> <br> <br>
		<button>Login</button>
	</form>
</body>
</html>