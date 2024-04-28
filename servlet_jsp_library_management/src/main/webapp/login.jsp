<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
    }
    form {
        width: 300px;
        margin: 0 auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    input[type="email"],
    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    button {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    button:hover {
        background-color: #45a049;
    }
    h6 {
        margin-top: 20px;
        text-align: center;
    }
    a {
        display: block;
        text-align: center;
    }
</style>
</head>
<body>
    <form action="login" method="post">
        <label for="email">Email:</label><br>
        <input type="email" name="email" id="email"><br><br>
        <label for="password">Password:</label><br>
        <input type="password" name="password" id="password"><br><br>
        <button type="submit">Login</button>
        <button type="button" onclick="clearForm()">Cancel</button>
        <h6>Don't have an account</h6>
        <a href="signup.jsp">Create an account</a>
    </form>

</body>
</html>
