<%@ page language="java" contentType="text/html; charset=ISO-8859-9" pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
</head>
<body>
	<h1>Merhaba ${login}</h1>
	menü sayfaası<br>
	<a href="<c:url value="/cikis"></c:url>">Çıkış</a>
</body>
</html>