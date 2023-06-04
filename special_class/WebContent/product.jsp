<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품</title>
<style>
main {
	width: 50%;
	margin: 0 auto;
}
</style>
</head>
<body>
	<main>
		<h1>상품 관리</h1>
		<!-- 추가 -->
		<div style="width: 100%; text-align: right">
			<a href="javascript:view()">추가</a>
			<div class="input-wrap" style="width: 100%; text-align: center;">
				<input type="text" name="productName" placeholder="상품 이름"> <input
					type="text" name="productPrice" placeholder="상품 가격"> <input
					type="text" name="productStock" placeholder="상품 재고"> <input
					type="button" value="상품 등록" style="width: 70%" onclick="insert()">
			</div>
			<!-- 목록 -->
			<div id="products"><!-- 여기 텍스트에 show()함수가 들어간다.--></div> 
			<!-- 최신순 정렬 -->
			
			<a id="orderRecent" href="javascript:showToggle()">최신순 정렬</a>
			
			<!-- 상품별 수정, 삭제 -->
		</div>
	</main>
</body>

<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<!-- 제이쿼리문 이용시 필요한거!!! -->

<script>

	let count = 1; //추가에 사용될 전역변수
	let check = 1; //최신순 토글에 사용될 전역변수
	
	/*=================================================================*/
	
	show(); /* 아래show()함수를 실행 */
	
	function show() { 
		
		$.ajax({
			url : "${pageContext.request.contextPath}/show.prod",
			dataType : "json", /*json 타입으로 받겠다.  */
			 /* show.prod 경로를 통해서 controller에서 VO객체를 select해와서 그걸*/
			 /* JSONArray에다가 map,foreach를 사용해 값을 다 넣어주고 json형식으로 받아왔다. */
			success : function (products) {  
				/* products안에는 디비에 담은 name,price,stock들의 전부가 배열에 담겨있다. */

				console.log(products);
				let text = ""; //아래에 만든 테이블을 다 text에 담는다.
			
				text += `<table border="1" style="text-align : center;"]>`;
				text += `<tr>`
				text += `<th>상품 번호</th>`;
				text += `<th>상품 이름</th>`;
				text += `<th>상품 가격</th>`;
				text += `<th>상품 재고</th>`;
				text += `<th colspan="2">서비스</th>`; /*colspan은 2행을 하나로 합치는거 */
				text += `</tr>`
				
				products.forEach(product => {
					
					text += `<tr>`
					text += `<td>` + product.productNumber + `</td>`;
					text += `<td>` + product.productName + `</td>`;
					text += `<td>` + product.productPrice + `</td>`;
					text += `<td>` + product.productStock + `</td>`;
					text += `<td><a class="update" href="` + product.productNumber +`">수정</a></td>`;
					text += `<td><a class="delete" href="` + product.productNumber +`">삭제</a></td>`;
					text += `</tr>`
				});
				
				text += `</table>`;
				
				 $("#products").html(text); //#products div안에 html.() 써서 text를 담아준다.
			}
		});
	}
	
	/*=================================================================*/
	
	function view(){ /*위에 html바디태그안에 a태그에 javascript:view()가있는데*/
		/* a태그는 원래 경로로 보내줄때 사용되지만 javascript:를 href안에 사용하면 함수를 사용할수있다. */
		/* 그래서 추가를 누르게 되면 view()라는 함수를 실행시킬수가 있다. */
		$(".input-wrap").slideToggle(function(){ 
		/* 제이쿼리문으로 input-wrap 클래스를 가져와 slide이벤트를 걸어주고 이벤트가 실행되면 ()안에 또 함수를 넣어 실행시킬수있다.*/
			count *= -1; //전역 변수 count에 1을 설정해 주었기때문에 이걸로 음수 양수를 만들어서 추가,닫기를 만들어준다.
			$(this).prev().text(count > 0 ? "추가" : "닫기"); 
			//this는 input-wrap클래스이고 .prev()는 이전요소이다, .text는 그안에 텍스트값이다. (이게 추가이다 지금)
		});
	}
	
	/*=================================================================*/
	
	/* 디비에 값넣는 함수 */
	function insert(){
		/* 제이쿼리문으로 위에 input태그들을 가져와 각각의 변수들에 넣어준다. */
		/* 여기 인풋태그들은 사용자가 입력한 값이 들어간다. */
		const $productNameInput = $("input[name='productName']");
		const $productPriceInput = $("input[name='productPrice']");
		const $productStockInput = $("input[name='productStock']");
		
		/* js에서 유효성 검사를 하면 편하고 좋다.*/
		if(!$productNameInput.val()) {
			$productNameInput.focus();
			return; 
	/* 만약 name인풋태그에 아무값이 들어가지 않았다면 다시 name인풋태그에 포커스를 주고 return으로 막는다.*/
		}
		if(!$productPriceInput.val()) {
			$productPriceInput.focus();
			return; 
		}
		if(!$productStockInput.val()) {
			$productStockInput.focus();
			return; 
		}	
		
		$.ajax({ /* ajax는 페이지 이동없이 디비를 갖다올수 있다. */
			url: "${pageContext.request.contextPath}/create.prod",
			type: "post", 
			/* 보내는타입은 post방식으로 보낸다(post는 보낼값이 길거나 주소창에 값을 비밀로 하고싶을때 post를사용한다, 애매하면 post방식 사용하기!!) */
			data: {productName: $productNameInput.val(), productPrice: $productPriceInput.val(), productStock: $productStockInput.val()},
			/* 보내는 data는 map구조로 키값과 밸류값으로 보낸다. 여기서는 사용자가 입력한 값들을 보내는것이다.*/
			success: function(){ /* success : function은 데이타를 보내서 디비에insert를 성공했을때 실행되는 함수이다. */
				$productNameInput.val(""); /*성공하면 화면에서 내가 적은 값들이 빈문자열로 초기화된다.  */
				$productPriceInput.val("");
				$productStockInput.val("");
				show();
			}
		});
	}
	
	
	
	/*============================삭제하기===============================*/
	
	/* product아이디를 찾아서 거기다가 click이벤트를 만들어주고 .delete클래스에 click이벤트를 위임해준다. */
	/* 이런것들이 이벤트 위임으로써 만약 클릭 이벤트가 먹히지 않으면 이런 방식을 사용하자!! */
	$("#products").on("click",".delete",function(e){
		
		e.preventDefault(); /* .delete클래스가 a태그임으로 그 이벤트효과를 막아준다. */
		
		/* 여기서(this)는 .delete다. 속성 href를 가져오는데 여기서 href = 사용자가 삭제버튼 누른 넘버의값이다. ) */
		let productNumber = $(this).attr("href"); 
		
 		$.ajax({
			url : "${pageContext.request.contextPath}/deleteOk.prod", 
			/* 이경로를 통해서 deleteOkController에서 mapper와 dao를 통해서 디비에 그 넘버를 지워준다. */
			data : {productNumber : productNumber}, 
			/* number로 지우기때문에 여기서 사용자가 클릭한 number를 data로 보내준다. 이data는 경로를 통해 controller로 간다.  */
			success : function () { /* 그리고 디비에서 그 넘버를 지움과 동시 성공이기때문에 다시 show() 전체목록을 실행시켜준다.  */
				show();
			}
		}) 
	})
	
	/*============================수정하기===============================*/
	
/*   	$("#products").on("click",".update",function(e){ㄴㄴ
		e.preventDefault(); 
		
 		console.log("들어옴1");
 		
		let productName = $(this).closest("tr").find("td:eq(1)").text();
		let productPrice = $(this).closest("tr").find("td:eq(2)").text();
		let productStock = $(this).closest("tr").find("td:eq(3)").text();
		
		console.log(productName);
 	}  */
 	
 	/*============================최신순 정렬 토글 이벤트===============================*/
 	
 	
	function showToggle(){ 
 		console.log("토글클릭!!")

 			check *= -1;
 			if(check < 0) {
 				showByRecent();
 				$("#orderRecent").text("최신순 정렬");
 			}else{
 				show();
 				$("#orderRecent").text("번호순 정렬");
 			}
		};
		
	/*============================최신순 정렬 화면===============================*/
	
		function showByRecent() { 
		
		console.log("showByRecent클릭!")	;
		
			$.ajax({
				url : "${pageContext.request.contextPath}/showByRecent.prod",
				dataType : "json", 
				success : function (products) {  

					let text = ""; 
				
					text += `<table border="1" style="text-align : center;"]>`;
					text += `<tr>`
					text += `<th>상품 번호</th>`;
					text += `<th>상품 이름</th>`;
					text += `<th>상품 가격</th>`;
					text += `<th>상품 재고</th>`;
					text += `<th colspan="2">서비스</th>`; 
					text += `</tr>`
					
					products.forEach(product => {
						
						text += `<tr>`
						text += `<td>` + product.productNumber + `</td>`;
						text += `<td>` + product.productName + `</td>`;
						text += `<td>` + product.productPrice + `</td>`;
						text += `<td>` + product.productStock + `</td>`;
						text += `<td><a class="update" href="` + product.productNumber +`">수정</a></td>`;
						text += `<td><a class="delete" href="` + product.productNumber +`">삭제</a></td>`;
						text += `</tr>`
					});
					
					text += `</table>`;
					
					 $("#products").html(text);
				}
			});
		}
	
 	
 	/*====================================================================*/
 	
 	
 	
	
</script>


</html>













