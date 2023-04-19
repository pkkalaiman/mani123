<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

			</a>
		</div>
	</nav>

	<a href="index.jsp">Home</a>

	<c:forEach items="${error }" var="e">
		<span style='color: red;' ${e }>${e.getMessage()}</span>
	</c:forEach>

	<form action="BigBass" method="get"
		class="container col-20 col-sm-6 col-md-4 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">
		<table>
			<tr>
				<td><h5>Wlcome to BigBasket Data Saving...</h5></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${dto.getName}" /><br></td>
			</tr>

			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="customerName"
					value="${dto.getCustomerName}" /></td>

			</tr>

			<tr>
				<td>Phone No</td>
				<td><input type="text" name="phoneNumber"
					value="${dto.getPhoneNo}" /></td>

			</tr>

			<tr>
				<td>E-Mail</td>
				<td><input type="text" name="email" value="${dto.getEmail}" /></td>

			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password"
					value="${dto.getPassword}" /></td>

			</tr>

			<tr>
				<td>Prodect Name</td>
				<td><select name="prodectName">
						<option value="">-- Select Prodect----</option>
						<c:forEach items="${prodect}" var="n">
							<option value="${n}">${n}</option>
						</c:forEach>
				</select></td>
			</tr>


			<tr>
				<td>Price</td>
				<td><input type="text" name="price" value="${dto.getPlace}" /></td>

			</tr>

			<tr>
				<td>Color</td>
				<td><input type="text" name="color" value="${dto.getColor}" /></td>

			</tr>

			<tr>
				<td>Qunatity</td>
				<td><input type="range" name="quantity"
					value="${dto.getQuantity}" /></td>

			</tr>

			<tr>
				<td>Date</td>
				<td><input type="datetime-local" name="date"
					value="${dto.getDate}" /></td>

			</tr>


			<tr>
				<td>Place</td>
				<td><select name="place">
						<option value="">-- Select Place----</option>
						<c:forEach items="${places}" var="p">
							<option value="${p}">${p}</option>
						</c:forEach>
				</select></td>
			</tr>


		</table>
		<br>

		<tr>
			<td><input type="submit" value="save"
				class="btn btn-outline-success btn-block"></td>
		</tr>
	</form>




</body>
</html>