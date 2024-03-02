<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
<%@include file = "style.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-light">
	<!redirect to navbar.jsp provide reusability>	
	<%@include file="navbar.jsp"%>
	<div class = "container p-2">
		<div class = "row">
		<p class="text-center fs-1">All Student Details</p>
			<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">First Name</th>
				      <th scope="col">Middel Name</th>
				      <th scope="col">Last Name</th>
				      <th scope="col">D.O.B.</th>
				      <th scope="col">Phone Number</th>
				      <th scope="col">Email</th>
				      <th scope="col">Nationality</th>
				      <th scope="col">State</th>
				      <th scope="col">District</th>
				      <th scope="col">City</th>
				      <th scope="col">Permanent Address</th>
				      <th scope="col">Admission Class Year</th>
				      <th scope="col">Previous Class Marks</th>
				      <th scope="col">Previous Class YOP</th>
				      <th scope="col">Action</th>
				     </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th>Sagar</th>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				      <td>Mark</td>
					  <td><a href="editStudent.jsp" class="btn btn-sm btn-primary">Edit</a></td>
				      <td><a href="" class="btn btn-sm btn-danger ms-1">Delete</a></td>
				    </tr>
				    <tr>
				      <th>Rakesh</th>
				      <td>Jacob</td>
				      <td>Thornton</td>
				      <td>@fat</td>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				      <td>Mark</td>
					  <td><a href="editStudent.jsp" class="btn btn-sm btn-primary">Edit</a></td>
				      <td><a href="" class="btn btn-sm btn-danger ms-1">Delete</a></td>

				    </tr>
				  </tbody>
			</table>
		</div>
	
	</div>


	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>