<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 태그 예제1</title>
</head>
<body>

	<h2>Scripting Tag</h2>

	<%!int count = 3;

	String makeItBelower(String data) {
		return data.toLowerCase(); /* 메소드는 무조건 !안에서 선언해야된다. */
	}%>
	<!-- !는 선언 -->

	<% /* 자바문법 편할때 쓰는 거 */
	for(int i=0; i<count; i++){
	%>
		<h3>Java Serve Pages <%= i+1 %></h3>
	<%}%>
	
	<hr>

	<h3><%= makeItBelower("Hello World") %></h3>	
		
</body>
</html>