<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름 입력</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/input.sp" method="get">
		이름 : <input type="text" name="name">
		<button>완료</button>
	</form>
</body>
</html>


