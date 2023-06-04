/**
 * 정렬
 */

function send(asc){
	var url;
	url = asc ? "guest_jdbc.jsp" :  "guest_jdbc_desc.jsp";
	location.href = url;
}