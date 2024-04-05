<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div class="container">

		<br>

		<h1>Please write your thought</h1>
		<br>

		<!-- this is add form  -->

		<form action="SaveThoughtServlet" method="post">

			<div class="form-group">
				<label for="title">What's in your mind?</label> <input name="title"
					required type="text" class="form-control" id="title"
					placeholder="Enter here" />

			</div>


			<div class="form-group">
				<label for="content">Details: </label>
				<textarea name="content" required id="content"
					placeholder="Enter More Details" class="form-control"
					style="height: 300px;"></textarea>


			</div>

			<div class="container text-center">

				<button type="submit" class="btn btn-primary">Add</button>
			</div>

		</form>

	</div>


</body>
</html>