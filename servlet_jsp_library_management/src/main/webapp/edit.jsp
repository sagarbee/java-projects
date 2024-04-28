<%@page import="servlet_jsp_library_management.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    background-image: url('https://wallpapers.com/images/high/piles-of-book-aesthetic-rl8udlacvx2np1t8.webp');
    
}

.container {
    max-width: 500px;
    margin: 50px auto;
    padding: 20px;
    background-color: rgba(255, 255, 255, 0.7);
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h2 {
    text-align: center;
    color: #333;
}

form {
    margin-top: 20px;
}

input[type="text"] {
    width: calc(100% - 22px); /* Adjusted width to consider padding and border */
    padding: 10px;
    margin-bottom: 20px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box; /* Ensures padding and border are included in the width */
}

button {
    width: 100%;
    padding: 10px;
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
    <h2>Update Book</h2>
    <form action="update" method="post">
        <% Book book = (Book)request.getAttribute("book");
        if (book != null) { %>
        Name: <input type="text" name="name" value="<%= book.getName() %>"><br>
        Author: <input type="text" name="author" value="<%= book.getAuthor() %>"><br>
        Genre: <input type="text" name="genre" value="<%= book.getGenere() %>"><br>
        Price: <input type="text" name="price" value="<%= book.getPrice() %>"><br>
        <button>Update</button>
        <% } else { %>
        Book not found.
        <% } %>
    </form>
</div>

</body>
</html>
