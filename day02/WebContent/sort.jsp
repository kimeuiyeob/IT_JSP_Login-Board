<%@page import="vo.GuestVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.GuestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	GuestDAO guestDAO = new GuestDAO();
	ArrayList<GuestVO> guests = guestDAO.sortAll();
	%>
	<table border="1">
		<%
		for (int i = 0; i < guests.size(); i++) {
		%>
		<tr>
			<td><%=guests.get(i).getGuestNumber()%></td>
			<td><%=guests.get(i).getGuestName()%></td>
			<td><%=guests.get(i).getGuestBirth()%></td>
		</tr>
		<%
		}
		%>
	</table>

</body>

<script type="text/javascript"></script>

</html>