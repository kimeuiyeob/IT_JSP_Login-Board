<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL TEST</title>
</head>
<body>

	<%-- ${"<script>alert('안녕');</script>"}  이렇게 쓰면 안된다.--%>
	<c:out value="${\"<script>alert('안녕');</script>\"}"/>
	
	

</body>
</html>