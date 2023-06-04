<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%=request.getParameter("msg1")%> 안녕하세요 <%=request.getParameter("msg2")%> <!-- ajax_text에 연동되어있다. -->
</body>
</html>