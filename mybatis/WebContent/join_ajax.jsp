<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<form action="joinOk.jsp" name="joinForm" method="post"> <!-- joinOk.jsp경로 연결  -->
		<label>
			아이디<input type="text" name="userId" placeholder="5자 이상으로 작성해주세요.">
			<input type="button" value="중복검사" onclick="send()"> <!-- 버튼에다가 onclick() 이벤트 걸어줌 -->
		</label>
		<p id="result">
		</p>
		<input type="submit" value="완료">
	</form>
</body>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script> <!-- 제이쿼리문을 쓰기위해 필요한 url -->
<script>

	let check = true;

	$("input[name='userId']").on("focus", function(){
		/* input태그를 마우스로 클릭하여 입력상태로 만든것을 포커스를 얻었다고 한다.
		그리고 입력상태를 떠난것을 포커스가 벗어났다고 한다. */
		check = true;
	});
	
	$("input[type='submit']").on("click", function(e){
		e.preventDefault();
		/* preventDefault() 메소드는 취소가능한 이벤트를 취소한다. 이는 그 이벤트의 디폴트 액션이 발생하지 않음을 의미한다. */
		/* 이걸 안해주면 아이디가 중복이더라도 완료버튼을 누르면 넘어가진다. 그래서 preventDefault()메소드로 이벤트를 취소해서 완료버튼이 안먹게 만든다. */
		if(check){
			alert("아이디 중복검사를 진행해주세요.");
			return;
		}
		joinForm.submit(); /* 완료 버튼 눌러지면 => 회원가입 */
	});

	function send(){ /* onclick이벤트 함수  */
		var $value = $("input[name='userId']").val(); /* 제이쿼리니까 .val()값을 받아와서 $value에다 담아준다. */
		
		if(!$value || $value.length < 5){ /* value가 값이없거나 값이 5글자보다 작다면 */
			alert("아이디를 확인해주세요."); /* alert 실행 */
			return;
		}
		
		$.ajax({ /* 비동기식 Ajax를 이용하여 HTTP 요청을 전송함 */
			url: "checkId_ajax.jsp", /* checkId_ajax경로 연결 */
			type: "get", /* 갯 방식 */	
			data: "userId=" + $value, /* 입력한 값을 userId에 넣어줌 */
			contentType: "application/x-www-form-urlencoded", /* 디폴트값 */
			dataType: "text", /* 디폴트값 */
			success: function(result){ /* 성공시 함수 실행 */
				result = result.trim(); /* 관리자창에 보면 빈공백이 있는데 그걸 제거  */
				if(JSON.parse(result)){ /* result를 자바스크립트형식 바까준다. 이거 안하면 안됨!  */
					console.log(result);
					$("p#result").text("중복된 아이디입니다.");
					check = true;
				}else{
					$("p#result").text("사용가능한 아이디입니다.");
					check = false;
				}
			},
			error: function(xhr, status, error){ /* 제이쿼리에서 나올법한 에로들을 콘솔창에 띄어준다.  */
				console.log(error);
			}
		});
		
	}
</script>
</html>













