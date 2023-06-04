<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userDAO" class="dao.UserDAO"/>

<%
//아이디중복검사
	String userId = request.getParameter("userId");
	response.sendRedirect(userDAO.checkId(userId) ? "index.jsp" : "login.jsp?check=false");
%>


