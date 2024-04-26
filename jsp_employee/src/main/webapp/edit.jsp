<%@page import="jsp_employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Details</title>
</head>
<body>
    <form action="update" method="post">
        <% Employee employee = (Employee)request.getAttribute("employee");
        if (employee != null) { %>
        Id: <input type="hidden" name="id" value="<%= employee.getId() %>"><br>
        Name: <input type="text" name="name" value="<%= employee.getName() %>"><br>
        Phone: <input type="tel" name="phone" value="<%= employee.getPhone() %>"><br>
        Email: <input type="email" name="email" value="<%= employee.getEmail() %>"><br>
        Password: <input type="text" name="password" value="<%= employee.getPassword() %>"><br>
        Designation: <input type="text" name="designation" value="<%= employee.getDesignation() %>"><br>
        Salary: <input type="text" name="salary" value="<%= employee.getSalary() %>"><br>
        <button>Update</button>
        <% } else { %>
        Employee not found.
        <% } %>
    </form>
</body>
</html>
