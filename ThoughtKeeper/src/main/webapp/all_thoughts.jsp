<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="com.entities.Thought"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Thoughts</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container-fluid m-0 p-0">
		<%@include file="navbar.jsp"%>
		<br>
		<h1 class="text-uppercase">Your Thoughts Over Time..</h1>

		<div class="row">

			<div class="col-12">

				<%
				Session session1 = FactoryProvider.getFactory().openSession();
				Query<Thought> query = session1.createQuery("from Thought");
				List<Thought> list = query.list();
				for (Thought thought : list) {
				%>
				<center>
					<div class="card mt-5" style="width: 40rem;">
						<img class="card-img-top pl-4 pt-4 mx-auto" style="max-width: 100px"
							src="images/person.png" alt="Card image cap">
						<div class="card-body px-5">
							<h5 class="card-title">
								<center><%=thought.getTitle()%></center>
							</h5>
							<p class="card-text">
								<%=thought.getContent()%>
							</p>
							<div clss="container">
								<a href="#" class="btn btn-primary">Update</a> 
								<a href="#" class="btn btn-danger">Delete</a>

							</div>
						</div>
					</div>
				</center>
				<%
				}
				session1.close();
				%>

			</div>

		</div>

	</div>
</body>
</html>
