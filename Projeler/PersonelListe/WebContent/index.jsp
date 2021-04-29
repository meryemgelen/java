<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Insert title here</title>
<script>
	function listeGetir() {
		form1.submit();
	}
	function birliklisteGetir() {
		form2.submit();
	}
</script>
</head>
<body>
	<form id="form1" action="<c:url value="/personelListesi"/>"
		method="post">
		<button onclick="listeGetir()">Personel List Rapor</button>
	</form><br>
	<form id="form2" action="<c:url value="/birlikListesi"/>" method="post">
		<button onclick="birliklisteGetir()">Birlik List Rapor</button>
	</form>
</body>
</html>