<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="userDAO" class="dao.UserDAO"/>
<jsp:useBean id="userVO" class="vo.UserVO"/>
    <!-- 전달받은 데이터를 DB에 INSERT하기 -->
<%
	String userId = request.getParameter("userId"); /* 입력받은 값을 가져와 메소드에 연동 */
	userVO.setUserId(userId);
	userDAO.insert(userVO);
	response.sendRedirect("login.jsp");
%>
