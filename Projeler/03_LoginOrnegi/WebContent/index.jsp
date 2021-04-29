<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="<c:url value="/css/index.css" />" rel="stylesheet" />

</head>
<body>


	<div class="wrapper fadeInDown">
		<div id="formContent">
			<!-- Tabs Titles -->

			<!-- Icon -->
			<div class="fadeIn first">

				<img src="<c:url value="/images/hgm_logo_18.png" />" id="icon"
					alt="User Icon" />
			</div>

			<!-- Login Form -->
			<form action="<c:url value="/giris" />" method="post">
				<c:if test="${not empty hata}">
					<font color="red"><b>${hata}</b></font>
				</c:if>
				<input type="text" id="login" class="fadeIn second" name="username"	placeholder="login"> 
					<input type="password" id="password" class="fadeIn third" name="password" placeholder="password"> 
					<input type="submit" class="fadeIn fourth" value="Log In">
			</form>
				<c:if test="${not empty mesaj}">
					<font color="green"><b>${mesaj}</b></font>
				</c:if>
			<!-- Remind Passowrd -->
			<div id="formFooter">
				<a class="underlineHover" href="#">Forgot Password?</a>
			</div>

		</div>
	</div>



</body>
</html>