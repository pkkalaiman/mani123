<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P.K.Mani</title>
</head>
<body>


	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
		rel="stylesheet">
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<body>

	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="80" height="48">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			
			
			 					<a href="SingIn.jsp" class="btn btn-primary"> SingIn</a>
			 					<a href="SingUp.jsp" class="btn btn-primary"> SingUp</a>
			 					<a href="index.jsp" class="btn btn-primary"> Home</a>
			
		</div>
	</nav>

	<div align="center">User Name:${userID}</div>
	<div align="center">
		<form action="passwordUpdate" method="post" class="container col-20 col-sm-8 col-md-5 shadow-lg p-5 mb-5 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-i  nfo">
		
			<table>
				<tr>
					<td>User ID</td>

					<td><input type="text" name="userId" value="${userID}"></td>
				</tr>
				<tr>
					<td>New Password</td>
					<td><input type="password" name="password" id="userPassword" placeholder="New Password">
						<span id="passwordError" style="color: red"></span> <input
						type="checkbox" onclick="myFunction1()">Show Password</td>
				</tr>
				<tr>
					<td>ConfirmPassword</td>
					<td><input type="password" name="confirmPassword"
						id="userConfirmPassword" onblur="ValidePassword()" placeholder="Confirm Password"> <span
						id="passwordCompare" style="color: red"></span> <input
						type="checkbox" onclick="myFunction2()">Show Confirm
						Password</td>
				</tr>
			</table>
			<button type="submit" class="btn btn-success">Update</button>
		</form>
	</div>
	<script>
		function myFunction1() {
			var x = document.getElementById("userPassword");
			if (x.type === "password") {
				x.type = "text";
			} else {
				x.type = "password";
			}
		}
		function myFunction2() {
			var x = document.getElementById("userConfirmPassword");
			if (x.type === "password") {
				x.type = "text";
			} else {
				x.type = "password";
			}
		}
		function ValidePassword() {
			var userPassword = document.getElementById('userPassword');
			var userConfirmPassword = document
					.getElementById('userConfirmPassword');
			var userPasswordvalue = userPassword.value;
			var userConfirmPasswordvalue = userConfirmPassword.value;
			console.log(userPasswordvalue);
			if (userPasswordvalue != null && userPasswordvalue != ""
					&& userPasswordvalue.length > 4
					&& userPasswordvalue.length < 12) {
				if (userPasswordvalue == userConfirmPasswordvalue) {
					console.log('valide both password are same');
					document.getElementById('passwordCompare').innerHTML = '';
				} else {
					console.log('valide both password are not same');
					document.getElementById('passwordCompare').innerHTML = 'Password and ConfirmPassword are not matching';
				}
				console.log('valide password');
				document.getElementById('passwordError').innerHTML = '';
			} else {
				console.log('invalide password');
				document.getElementById('passwordError').innerHTML = 'Plese enter valide password length must be greater then 4 and less then 12';
			}
		}
	</script>

</body>
</html>