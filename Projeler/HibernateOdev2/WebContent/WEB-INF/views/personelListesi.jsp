<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
	pageEncoding="ISO-8859-9"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-9">
<title>Personel Listesi</title>
<link rel="stylesheet" href="<c:url value="/css/personelListesi.css" />">
<script>
var oncekiSecili;
	function personelSec(i) {
		if(oncekiSecili){
			document.querySelector('#p'+oncekiSecili).className='';
		}
		document.querySelector('#p'+i).className='secili';
		oncekiSecili = i;
		fetch('<c:url value="/personelAdres" />',{
			method: 'POST',
			body: JSON.stringify({id:i})
		}).then(data => data.json()).then(data => {
			let str = '';
			for( var i=0;i<data.adres.length;i++){
				str+=data.adres[i].adres+"<br/>";
			}
			document.querySelector('#adresler').innerHTML = str;
		});
}
</script>
</head>
<body>
	<table border="1">
		<tr>
			<th>adi</th>
			<th>soyadi</th>
			<th>tcno</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${liste}" var="personelListe">
			<tr>
				<td><div id="p${personelListe.id}"
						onclick="personelSec('${personelListe.id}')">
						${personelListe.adi}</div></td>
				<td>${personelListe.soyadi}</td>
				<td>${personelListe.tcno}</td>
				<td><input type="button" onclick="adresGetir()"
					value="Adresleri" /></td>
			</tr>
		</c:forEach>
	</table>
	<div class="adresBaslik">Adresler:</div>
	<div id="adresler"></div>
</body>
</html>