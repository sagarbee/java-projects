<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    background-image: url('https://c1.wallpaperflare.com/preview/281/150/428/various-book-books.jpg');
    background-size: cover;
    background-repeat: no-repeat;
    background-position: center;
}

.container {
    max-width: 500px;
    margin: 50px auto;
    padding: 20px;
    background-color: rgba(255, 255, 255, 0.8); /* Transparent white background */
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
    margin: 0 auto;
    display: block; /* Ensures each input is on its own line */
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
    <h2>Adding a Book</h2>
    <form action="/servlet_jsp_library_management/addbook" method="post">
        ID: <input type="text" name="id"><br><br>
        Name: <input type="text" name="name"><br><br>
        Author: <input type="text" name="author"><br><br>
        Genre: <input type="text" name="genre"><br><br>
        Price: <input type="text" name="price"><br><br>
        <button>Add Book</button>
    </form>
</div>

</body>
</html>
