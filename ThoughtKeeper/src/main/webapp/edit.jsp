<!doctype html>
<%@page import="com.entities.Thought"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Thought's Keeper</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>
	<%@include file="navbar.jsp"%>
	<br>
	<div class="container">

		<h1>This is edit page</h1>
		<%
		int thoughtId = Integer.parseInt(request.getParameter("thought_id").trim());
		Session session2 = FactoryProvider.getFactory().openSession();
		Thought thought = (Thought) session2.get(Thought.class, thoughtId);
		session2.close();
		%>

		<form action="UpdateServlet" method="post">

			<input value="<%=thought.getId()%>" name="thoughtId" type="hidden" />

			<div class="form-group">
				<label for="title">What's in your mind?</label> <input name="title"
					required type="text" class="form-control" id="title"
					placeholder="Enter here" value="<%=thought.getTitle()%>" />

			</div>


			<div class="form-group">
				<label for="content">Details: </label>
				<textarea name="content" required id="content"
					placeholder="Enter More Details" class="form-control"
					style="height: 300px;"><%=thought.getContent()%>
				</textarea>
			</div>

			<div class="container text-center">

				<button type="submit" class="btn btn-primary">Changed your
					thoughts ('_')</button>
			</div>

		</form>

	</div>




</body>
</html>