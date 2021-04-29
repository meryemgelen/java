<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>İşlem sonucu</title>
</head>
<body>
	<c:forEach begin="2" end="9" var="y">
		<table>
			<c:forEach begin="2" end="9" var="i">
				<tr>
					<td>${y}</td>
					<td>*</td>
					<td>${i}</td>
					<td>= ${y*i}</td>
				</tr>
			</c:forEach>
		</table>
		<br>
	</c:forEach>
</body>
</html>