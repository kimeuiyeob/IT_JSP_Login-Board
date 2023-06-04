<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL TEST(제어문-반복문)</title>
</head>
<body>

	<c:forEach var="i" begin="1" end="10" step="1">
		<c:out value="${i }" />
	</c:forEach>
	
</body>
</html>