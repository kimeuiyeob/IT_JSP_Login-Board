<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   String check = request.getParameter("check");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<!-- 로그인 페이지 구현 -->
<!-- 아이디만 입력받아서 검사 -->

   <section>
      <input type="hidden" value=<%=check%> name="check"> <!--type=hidden은 사용자에게는 보이지 않는 입력 필드 -->
      <!-- 여기서 hidden타입에 값이 들어오는거는 loginOk에서 알수가 있다. -->
      <form action="loginOk.jsp" method="post"> <!-- post방식으로 loginOk.jsp 경로 연결 -->
         <label>
            아이디 <input type="text" name="userId"> <!-- 보통 name으로 값을 받는가보다....  -->
         </label>
         <button>로그인</button>
      </form>
   </section>
</body>

<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script> <!-- 제이쿼리문 사용하겠다는거!  -->

<script>
   var check = $("input[name='check']").val(); /* check에다가  */
   if(check != "null" && check != null){
      alert("아이디 또는 비밀번호를 다시 확인해주세요.");
   }
</script>

</html>
