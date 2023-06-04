<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userDAO" class="dao.UserDAO"/>
<%
	String userId = request.getParameter("userId"); /* join_ajax 경로 연결 */
	out.println(userDAO.checkId(userId));
%>