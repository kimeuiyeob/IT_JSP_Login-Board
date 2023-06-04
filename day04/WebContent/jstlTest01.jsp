<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL TEST(변수)</title>
</head>
<body>

	<h2>JSTL TEST(변수)</h2>
	<c:set var="name" value="김의엽" scope="page"/>
	<h3>${name}</h3>
	<h3><c:out value="${name}"/></h3>
	
	<h4>\${name}</h4> <!-- $쓰기위해서 이렇게 앞에 붙여줘야된다 안그러면 명령어로 인식! -->
	<h4>&dollar;{name}</h4>

	<c:set var="nation" value="미국" scope="session"/> <!-- session은 페이지보다 더 넓은 영역 , 다른페이지에서도 쓰려고 session으로 영역을 잡는다.  -->
	<c:remove var ="nation" scope="session"/> <!-- 이걸로 scope세션을 리무브해서 없애줄수있다. -->
	<h4><c:out value="${nation}" default="한국"/></h4> <!-- 값이 없을때는 디폴트값으로 출력된다. -->
	
	<h4>${10+20}</h4>
	

</body>
</html>