<%@page import="vo.GuestVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.GuestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 전체 목록</title>
</head>

<body>
	<%
	GuestDAO guestDAO = new GuestDAO();
	ArrayList<GuestVO> guests = guestDAO.selectAll();
	%>
	<form action="db.jsp" method="get">
		<input type="text" name="keyword">
		<button></button>
	</form>
	
	<form action="sort.jsp" method="get">
		<input type="button" name="" value="오름차순정렬" onclick='sort()'>;
	</form>

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

<script>
	function sort() {
		
	}
</script>

</html>
