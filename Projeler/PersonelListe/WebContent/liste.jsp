<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>T.C.</th>
				<th>Adi</th>
				<th>Soyadi</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${liste}" var="personel">
				<tr>
					<td>${personel.tcNo}</td>
					<td>${personel.adi }</td>
					<td>${personel.soyadi }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>