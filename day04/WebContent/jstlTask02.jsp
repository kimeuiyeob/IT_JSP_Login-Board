<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 두번째 실습</title>
</head>
<body>

	<!-- 
   1단부터 100단까지 중 사용자에게 입력받은 단수로 구구단 출력하기
   입력받은 값이 정수인지 아닌지 판단, 값을 입력했는지 안했는지 판단.
   다른 페이지 이동 없이 현재 페이지에서만 기능 구현
   자바스크립트 사용가능
   구구단 출력은 JSTL로 구현
   입력은 form태그로 입력받는다.
 -->


	<c:set var="inputName" value="${param.name}" />

	<form action="">
		<input type="text" name="name" placeholder="입력해주세요~"> <input
			type="submit" value="확인">
	</form>

	<c:if test="${empty inputName}">
   </c:if>
   
   <c:if test="${inputName == asd}">
   </c:if>
   
	<c:forEach var="i" begin="1" end="10" step="1">
		<c:out value="${inputName" + "*" + "i" + "=" + (inputName*i) }" />
	</c:forEach>

</body>
</html>