<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@include file = "style.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-light">
<%@include file = "navbar.jsp" %>
	
	<div class = "container p-4">
		<div class = "row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
					<p class = "fs-3 text-center">Update Record</p>
					<form>
					  <div class="mb-3">
					    <label class="form-label" >First Name</label>
					    <input type="text" class="form-control" name = "fName" autofocus>
					  </div>
					  <div class="mb-3">
					    <label class="form-label" >Middle Name</label>
					    <input type="text" class="form-control" name ="mName">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Last Name</label>
					    <input type="text" class="form-control" name = "lName">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">D.O.B</label>
					    <input type="text" class="form-control" name ="dob">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Phone Number</label>
					    <input type="text" class="form-control" name ="phno">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Email</label>
					    <input type="email" class="form-control" name ="email">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Nationality</label>
					    <input type="text" class="form-control" name ="nationality">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">State</label>
					    <input type="text" class="form-control" name ="state">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">District</label>
					    <input type="text" class="form-control" name ="dist">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">City</label>
					    <input type="text" class="form-control" name ="city">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">permanent Address</label>
					    <input type="text" class="form-control" name = "pAddress">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Admission Class Year</label>
					    <input type="text" class="form-control" name ="admClass">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Previous Class Marks?</label>
					    <input type="text" class="form-control" name = "prevClass">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Previous Class Year of passing</label>
					    <input type="text" class="form-control" name = "prevYOP">
					  </div>
					  
					  
					  <button type="submit" class="btn btn-primary col-md-12">Update Record</button>
					</form>
					</div>
				</div>
			</div>
		</div>
	
	</div>
	


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>