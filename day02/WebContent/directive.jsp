<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.page"%><!--이 페이지에서 오류가 났을때 넘어가는 페이지를 errorPage라고한다.  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 태그</title>
</head>
<body>
	<h1>
	1 + 1 은 <%=1 + 1%>이다. <!-- =이붙으면 값이 들어간다. -->
	10/0 은 <%=10/0%>이다. <!-- 이거하면 오류나온다 0으로 나눌수없기때문 -->
	</h1>
</body>
</html>