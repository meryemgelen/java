<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Hesap Makinesi(Dört İşlem)</title>
</head>
<body>

	<form action="<c:url value="/hesapla" />">
		Sayı 1: <input type="text" style="background: blue;" name="sayi1"><br/>
		Sayı 2: <input type="text" style="background: green;" name="sayi2"><br>
		<input type="submit" value="Topla" name="topla" />
		<input type="submit" value="Çıkar" name="cikar" />
		<input type="submit" value="Çarp" name="carp"/>
		<input type="submit" value="Böl" name="bol"/>
	</form>
</body>
</html>