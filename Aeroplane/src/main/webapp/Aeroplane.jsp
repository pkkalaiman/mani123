<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>


</head>
<body>
	<nav class="navbar navbar-Light  bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="50" height="30">
				
				
				<form class="d-flex">
					<a href="Search.jsp" class="form-control me-0"
						style='color: OrangeRed'>Search</a>


				</form>
			
			<form class="d-flex">
				<a href="Aeroplane.jsp" class="form-control me-0"
					style='color: OrangeRed'>Air India</a>


			</form>

		</div>
	</nav>

	


	<c:forEach items="${error}" var="e">
		<span style='color: red;' ${e }>${e.getMessage()}</span>
	</c:forEach>

	<form action="Aeroplane" method="post"
		class="container col-20 col-sm-6 col-md-4 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">
		<table>
			<tr>
				<td><h5 style="color:blue">Wlcome to Air India Data Saving...</h5></td>
			</tr>
			
			<tr>
				<td style="color:green">Company Name</td>
				<td><input type="text" name="companyName"
					value="${dto.getCompanyName}" /></td>

			</tr>

			<tr>
				<td  style="color:green">Name</td>
				<td><input type="text" name="name" value="${dto.getName}" /><br></td>
			</tr>

		<tr>
				<td  style="color:green">Cost</td>
				<td><input type="text" name="cost" value="${dto.getCost}" /><br></td>
			</tr>
		

			<tr>
				<td  style="color:green">Types</td>
				<td><select name="type">
						<option value="">-- Select Types----</option>
						<c:forEach items="${types}" var="t">
							<option value="${t}">${t}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td style="color:green">Country</td>
				<td><select name="country">
						<option value="">--Select Country</option>
						<c:forEach items="${country}" var="c">
							<option value="${c}">${c}</option>
						</c:forEach>

				</select></td>
			</tr>

		</table>

		<tr>
			<td><input type="submit" value="save"
				class="btn btn-outline-success btn-block"></td>
		</tr>
	</form>


</body>
</html>