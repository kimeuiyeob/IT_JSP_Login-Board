<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax 테스트 - GET</title>
</head>

<body>
	<h1 id="result"></h1>
	<button onclick="send()">데이터 가져오기</button> <!-- onclick 클릭시 이벤트발생! send()아래 function으로 메소드 선언!  -->
</body>

<script>
	function send(){ /* html파일에서 script태그로 연산이가능하기 때문에 함수실행이 가능하다 */
		var xhr = new XMLHttpRequest(); /* 이객체를 사용하면 페이지 새로고침없이도 URL에서 데이터를 가져올수있다. */
		//xhr.open("GET", "data.jsp"); /* 갯 방식 전달 */
		xhr.open("POST", "data.jsp"); /* 포스트 방식 전달 */
		xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded"); 
		/* 어떤 타입으로 보낼지 형식을 알려준다고 생각 , 이걸안하면 아래 msg를 읽을수없어서 NULL이나옴 */
		xhr.send("msg1=반갑습니다&msg2=어서오세요"); /* data.jsp에다가 msg1,msg2의 변수값을 보내준다. */
		
		
		xhr.onreadystatechange = function(){ /* 이벤트 준비 상태 변경 할때마다 함수를 실행 */
			if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200){ /* 현재상태가 DONE(끝났니) && 200이라는숫자가 성공! 이면 아래 */
				document.getElementById("result").innerHTML = xhr.responseText; /* data.jsp 데이터를 완성시켜서 가지고온다 */
				
				/* 이렇게 함으로써 POST방식으로 msg1과msg2를 data.jsp에 보내서 값을 완성시키고 responseText로 값을 가져와 result에다 값을 넣어준다.*/
			}
		}
	}
</script>

</html>
















