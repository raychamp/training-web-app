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

	<h1>Login page</h1>
	<div>
			<ul>
				<c:forEach items="${users}" var="user">
					<li>${user}</li>
				</c:forEach>
			</ul>

		</div>
</body>
</html>