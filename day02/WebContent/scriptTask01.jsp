<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 태그 실습1</title>
</head>
<body>

	<!-- 3월 5일 표를 for문으로 제작하기 -->
	<!-- 열 안에 내영은 몇행 몇열인지를 작성 -->

	<%!int trCount = 3;
	int tdCount = 5;%>
	<%
	for (int i = 0; i < trCount; i++) {
	%>
	<table border="1">
		<tr>
			<%
			for (int j = 0; j < tdCount; j++) {
			%>
			<td><%=i + 1%>행<%=j + 1%>열</td>
			<%
			}
			%>
		</tr>
		<%
		}
		%>
	</table>


</body>
</html>