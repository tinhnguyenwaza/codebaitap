<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSSLogin.css">


</head>
<body>

	<script>
		function validateForm() {
			let x = document.forms["myForm"]["userName"].value;
			let y = document.forms["myForm"]["passWord"].value;
			if (x == "" || x == null || y == "" || y == null) {
				alert("Bạn không được bỏ trống Username và Password");
				return false;
			}
		}
	</script>
	<div class="avarta">
		<img alt="hình ảnh đại điện" src="img/avarta.jpg">

		<form name="myForm" action="Login" onsubmit="return validateForm()"
			method="post">
			<h1>${ check }</h1>
			<p>Username:</p>
			<input type="text" name="userName" placeholder="Enter Username"
				class="sizeInput"><br>
			<p>Password:</p>
			<input type="text" name="passWord" placeholder="Enter Password"
				class="sizeInput"><br> <input type="submit"
				value="Submit" id="styleSummit" class="sizeInput">
		</form>
		<br> <input type="checkbox" name="checkbox" id="sizeCheck">
		Remenber me

		<div>

			<div class="cancelBox">Cancel</div>
			<div class="passBox">
				Forgot <a href="#">Password ?</a>
			</div>
		</div>
	</div>



</body>
</html>