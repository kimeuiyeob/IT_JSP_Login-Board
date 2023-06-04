<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 페이지</title>
</head>
<body>
	<h1>JSP로 만든 페이지</h1>
	<form action="Hello">  
	<!-- action은 url태그랑 같다고 생각하면된다, 그러면  -->
		이름 <input type="text" name="userName">
		<p>서블릿으로 이동</p>
		<button>이동</button>
	</form>
</body>
</html>