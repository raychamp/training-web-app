<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<h3>Welcome to the training app, the date and time is
		${dateAndTime}</h3>

	<c:forEach var="i" begin="1" end="5">
		<p>${i}</p>
	</c:forEach>



</body>
</html>