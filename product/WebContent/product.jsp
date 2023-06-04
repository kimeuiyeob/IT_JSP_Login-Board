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

table {
	width: 100%;
	margin: 0 auto;
}
</style>
</head>
<body>
	<main>
		<div
			style="width: 100%; display: flex; justify-content: space-between;">
			<h1>상품 관리</h1>
			<div>
				<a id="insert" href="javascript:view()">추가</a>
			</div>
		</div>
		<!-- 추가 -->
		<div style="width: 100%; text-align: center">
			<div class="input-wrap"
				style="width: 100%; text-align: center; /* display: none */; margin-bottom: 30px;">
				<input type="text" name="productName" placeholder="상품 이름"> <input
					type="text" name="productPrice" placeholder="상품 가격"> <input
					type="text" name="productStock" placeholder="상품 재고"> <input
					type="button" value="상품 등록" style="width: 70%" onclick="insert()">
			</div>
			<div style="width: 100%; text-align: right">
				<a id="order" href="javascript:showToggle()">최신순</a></span>
			</div>
			<div id="products"></div>
			<!-- 목록 -->
			<!-- 상품별 수정, 삭제 -->
		</div>
	</main>
</body>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script>

	let count = 1;
	let check = 1;
	
	show();
	
	function show(){ /* 화면에 목록나오는 함수 */
		$.ajax({
			url: "${pageContext.request.contextPath}/list.prod",
			dataType: "json",
			success: function(products){ /* products에는 productVO객체들이 들어가있다. */
				
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
	
	function showByRecent(){ /* 최신순 정렬 함수 */
		$.ajax({
			url: "${pageContext.request.contextPath}/showByRecent.prod",
			dataType: "json",
			success: function(products){
				
				let text = "";
				
				text += `<table border="1">`;
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
	
	
	/* 테이블옆 최신순 번호순 번갈아나오게하는 함수 */
	
	function showToggle(){
		check *= -1;
		if(check < 0){
			showByRecent();
			$("#order").text("최신순");
		}else{
			show();
			$("#order").text("번호순");
		}
	}
	
	/* 테이블옆 추가 닫기 번갈아나오는 함수 */
	function view(){ 
		$(".input-wrap").slideToggle(function(){
			count *= -1;
			$("#input").text(count > 0 ? "추가" : "닫기");
		});
	}
	
	/* 디비에 입력한값 추가하기 */
	function insert(){ /* 화면에서 사용자가 입력한 값 디비에 추가 */
		const $productNameInput = $("input[name='productName']");
		const $productPriceInput = $("input[name='productPrice']");
		const $productStockInput = $("input[name='productStock']");
		
		/* 값을 넣지 않았을때에 유효성 검사  */
		if(!$productNameInput.val()){ /* 값이 없다면 해당 인풋태그에 포커스 이벤트 */
			$productNameInput.focus();
			return;
		}
		if(!$productPriceInput.val()){ /* 값이 없다면 해당 인풋태그에 포커스 이벤트 */
			$productPriceInput.focus();
			return;
		}
		if(!$productStockInput.val()){ /* 값이 없다면 해당 인풋태그에 포커스 이벤트 */
			$productStockInput.focus();
			return;
		}
		
		$.ajax({
			url: "${pageContext.request.contextPath}/create.prod",
			type: "post",
			data: {productName: $productNameInput.val(), productPrice: $productPriceInput.val(), productStock: $productStockInput.val()},
			success: function(){
				$productNameInput.val("");
				$productPriceInput.val("");
				$productStockInput.val("");
				show();
			}
		});
	}
	
	/* 삭제하기 버튼 */
	$("#products").on("click", ".delete", function(e){
		/* #product는 바디태그안에 있는 product를 가져와 onclick이벤트를 만들어준다.
		아래 show함수를 보면 #product안에다 텍스트를 만들어주었다.
		거기안에 .delete라는 클래스가 포함되어있고 그 .delete클래스에도 click이벤트를 만들어준것이다.*/
		e.preventDefault(); 
		
		let productNumber = $(this).attr("href");
		/* 여기서 this는 .delete를 의미하고 href= product.productNumber 이 속성을 가져온다. */
		/* 이 product.productNumber값을 productNumber에 담고 그값을 아래 ajax를 통해 보내준다.*/
		
		$.ajax({
			url: "${pageContext.request.contextPath}/delete.prod", 
			/* dete.prod라는 경로를 설정해준다 => web.xml => froncontroller => 이경로에 맞는 controller로 이동*/
			data: {productNumber: productNumber}, /* 값으로 productNumber을 가져간다. */
			success: function(){show();} /* 이함수는 delete가 성공적으로 이루어지면 실행되는 함수이다. */
			/* 여기서 show()는 맨위에 있는 전체 목록을 뽑아주는 함수이다. */
		});
	})
	
	
	/* 수정하기 버튼 */
	$("#products").on("click", ".update", function(e){
		/* #product는 바디태그안에 있는 product를 가져와 onclick이벤트를 만들어준다.
		아래 show함수를 보면 #product안에다 텍스트를 만들어주었다.
		거기안에 .update라는 클래스가 포함되어있고 그 .update클래스에도 click이벤트를 만들어준것이다.*/
		
		e.preventDefault(); 
		
		let productNumber = $(this).closest(tr).children()  
		
		$.ajax({
			url: "${pageContext.request.contextPath}/update.prod",
			data: {productNumber: productNumber},
			success: function(){show();}
		});
		
	})
	
</script>
</html>




