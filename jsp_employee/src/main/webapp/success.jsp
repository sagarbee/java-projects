<%@page import="java.util.List"%>
<%@page import="jsp_employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetching Data</title>
</head>
<body>
	<a href="logout"><button align="center">Logout</button></a>
	<h2 align="center">
		<%
		String message = (String) request.getAttribute("message");
		if (message != null) {
		%>
		<%=message%>
		<%
		}
		%>
	</h2>

	<%
	String cookie = (String) request.getAttribute("cookie");
	if (cookie != null) {
	%>
	<h2 align="center">
		Changed by
		<%=cookie%></h2>
	<%
	}
	%>

	<h1 align="center">LogIn Successful</h1>
	<%
	List<Employee> list = (List) request.getAttribute("list");
	%>
	<table border="5px solid" align="center">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Designation</th>
			<th>Email</th>
			<th>Password</th>
			<th>Salary</th>
		</tr>
		<%
		for (Employee employee : list) {
		%>
		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getPhone()%></td>
			<td><%=employee.getDesignation()%></td>
			<td><%=employee.getEmail()%></td>
			<td><%=employee.getPassword()%></td>
			<td><%=employee.getSalary()%></td>
			<td><a href="delete?id=<%=employee.getId()%>"><button>Delete</button></a></td>
			<td><a href="update?id=<%=employee.getId()%>"><button>Update</button></a></td>
		</tr>
		<%
		}
		%>
	</table>



</body>
</html>