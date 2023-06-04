<%@page import="java.util.Date"%>
<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>500</title>
</head>

<style>
h1 {
	color: red;
}
</style>

<body>

	<h1>경고!잘못된 접근입니다.</h1>
	<h2><%=new Date()%></h2> <!-- 컨트롤 스페이스 엔터 임포트해서 오류 해결 --> 
	
</body>
</html>