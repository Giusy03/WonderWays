<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="./css/idxstyle.css">
		<link rel="icon" type="image/x-icon" href="./img/logo.png">
		<script src="./script/currentdatetime.js" type="text/javascript"></script>
		<title>WonderWays</title>
	</head>
	<body onload="setCurrentDateTime()">
		<jsp:include page="header.jsp"/>
		<div class="search-container">
	        <h2>Prenota il tuo viaggio</h2>
	        <form action="search.jsp" method="get">
	            <input type="text" name="from" placeholder="Da" required>
	            <input type="text" name="to" placeholder="A" required>
	            <label>Andata</label>
	            <input type="datetime-local" name="go" id="go" required>
	            <label>Ritorno</label>
		        <input type="datetime-local" name="rh">
		        <input type="number" name="pepole" value="1" placeholder="Passeggeri" min="1" max="10" required>
		        <input type="text" name="discountCode" placeholder="Codice sconto">
		        <button type="submit">Cerca</button>
	        </form>
    	</div>
	</body>
</html>