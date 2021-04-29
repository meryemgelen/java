<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Yeni Kay�t</title>
</head>
<body>
	<c:if test="${not empty mesaj}">
		<font color="blue"><b>${mesaj}</b></font>
	</c:if>
	<form action="<c:url value="/kullaniciYarat" />" method="post">
		<table>
			<tr>
				<td>Ad� :</td>
				<td><input type="text" name="adi" /></td>
			</tr>
			<tr>
				<td>Soyad�:</td>
				<td><input type="text" name="soyadi" /></td>
			</tr>

			<tr>
				<td>T.C. No:</td>
				<td><input type="text" name="tcno" /></td>
			</tr>
			<tr>
				<td>�ifre :</td>
				<td><input type="password" name="sifre" /></td>
			</tr>

		</table>
		<input type="submit" value="Kaydet" />
	</form>
	<a href="<c:url value="/" />">Geri</a>
</body>
</html>