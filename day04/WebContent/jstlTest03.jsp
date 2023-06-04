<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL TEST(제어문-조건식)</title>
</head>
<body>

   <c:set var="id" value="admin"/>
   
   <%-- <c:if test="${id == 'admin'}">
      <h3>현재 로그인된 계정은 <c:out value="${id}"/></h3>
   </c:if>
   <c:if test="${id eq 'member'}">
      <h3>현재 로그인된 계정은 일반 계정입니다.</h3>
   </c:if> --%>
   
   <c:choose>
      <c:when test="${id == 'admin'}">
         <h3>현재 로그인된 계정은 <c:out value="${id}"/></h3>
      </c:when>
      <c:otherwise>
         <h3>현재 로그인된 계정은 일반 계정입니다.</h3>
      </c:otherwise>
   </c:choose>
   
</body>
</html>
