<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
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
	<form action="signup" method="post">


		Id:<input type="number" name="id"> <br>
		<br> Name:<input type="text" name="name"> <br>
		<br> Phone:<input type="tel" name="phone"> <br>
		<br> email:<input type="email" name="email"> <br>
		<br> Password:<input type="text" name="password"> <br>
		<br> Designation:<input type="text" name="designation"> <br>
		<br> Salary:<input type="text" name="salary"> <br>
		<br>
		<button>Register User</button>


	</form>
</body>
</html>