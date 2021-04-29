<%@ page language="java" contentType="text/html; charset=ISO-8859-9" pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Personel Listesi</title>
</head>
<body>
		<table border="1">
			<tr>
				<th>adi</th>
				<th>soyadi</th>
				<th>tcno</th>
			</tr>
			<c:forEach items="${liste}" var="personelListe">
				<tr>
					<td>${personelListe.adi}</td>
					<td>${personelListe.soyadi}</td>
					<td>${personelListe.tcno}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>