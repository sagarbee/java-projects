<%@page import="servlet_jsp_library_management.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-image: url('https://imgs.search.brave.com/cVpP9LOc1GhykOE-MltrrydcBydjGGA7jPH0sN6e2ZI/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5pc3RvY2twaG90/by5jb20vaWQvMTE5/MzI4NzA0OS9waG90/by9ib29rc2hlbHZl/cy1pbi1tb2Rlcm4t/cHVibGljLWxpYnJh/cnkuanBnP3M9NjEy/eDYxMiZ3PTAmaz0y/MCZjPVJpM1lJLWlL/X3VvOVNNenZKX1oy/TGFfRDBrSEpQUzha/SzF6aVhXVER5YTA9');
    background-size: cover;
    background-repeat: no-repeat;
    margin: 0;
    padding: 0;
}

.container {
    max-width: 800px;
    margin: 20px auto;
    background-color: rgba(255, 255, 255, 0.8); /* Semi-transparent white background */
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1, h2 {
    text-align: center;
    color: #333;
}

table {
    width: 100%;
    border-collapse: collapse;
}

th, td {
    padding: 10px;
    border-bottom: 1px solid #ddd;
    text-align: left;
}

th {
    background-color: #f2f2f2;
}

td a {
    text-decoration: none;
}

button {
    padding: 8px 16px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    transition: background-color 0.3s;
}

button:hover {
    background-color: #45a049;
}
</style>
</head>
<body>

<div class="container">
    <div align="center">
        <a href="addbook.jsp"><button>Add Book</button></a> 
        <a href="login.jsp"><button>Logout</button></a>
    </div>
    <h2>LogIn Successful</h2>
    <%
    String message = (String) request.getAttribute("message");
    if (message != null) {
    %>
    <h2><%=message%></h2>
    <%
    }
    %>

    <table border="5px solid" align="center">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Genre</th>
            <th>Author</th>
            <th>Price</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        <%
        List<Book> list = (List) request.getAttribute("list");
        for (Book book : list) {
        %>
        <tr>
            <td><%=book.getId()%></td>
            <td><%=book.getName()%></td>
            <td><%=book.getGenere()%></td>
            <td><%=book.getAuthor()%></td>
            <td><%=book.getPrice()%></td>

            <td><a href="delete?id=<%=book.getId()%>"><button>Delete</button></a></td>
            <td><a href="update?id=<%=book.getId()%>"><button>Update</button></a></td>
        </tr>
        <%
        }
        %>
    </table>
</div>

</body>
</html>
