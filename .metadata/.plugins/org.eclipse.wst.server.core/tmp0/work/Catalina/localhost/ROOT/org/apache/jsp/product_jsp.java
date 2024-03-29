/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-15 17:26:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>상품</title>\r\n");
      out.write("<style>\r\n");
      out.write("main {\r\n");
      out.write("	width: 50%;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<main>\r\n");
      out.write("		<h1>상품 관리</h1>\r\n");
      out.write("		<!-- 추가 -->\r\n");
      out.write("		<div style=\"width: 100%; text-align: right\">\r\n");
      out.write("			<a href=\"javascript:view()\">추가</a>\r\n");
      out.write("			<div class=\"input-wrap\" style=\"width: 100%; text-align: center;\">\r\n");
      out.write("				<input type=\"text\" name=\"productName\" placeholder=\"상품 이름\"> <input\r\n");
      out.write("					type=\"text\" name=\"productPrice\" placeholder=\"상품 가격\"> <input\r\n");
      out.write("					type=\"text\" name=\"productStock\" placeholder=\"상품 재고\"> <input\r\n");
      out.write("					type=\"button\" value=\"상품 등록\" style=\"width: 70%\" onclick=\"insert()\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- 목록 -->\r\n");
      out.write("			<div id=\"products\"></div>\r\n");
      out.write("\r\n");
      out.write("			<!-- 상품별 수정, 삭제 -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</main>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<!-- 제이쿼리문 이용시 필요한거!!! -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("	let count = 1;\r\n");
      out.write("	\r\n");
      out.write("	/*=================================================================*/\r\n");
      out.write("	\r\n");
      out.write("	show(); /* 아래show()함수를 실행 */\r\n");
      out.write("	\r\n");
      out.write("	function show() { \r\n");
      out.write("		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/show.prod\",\r\n");
      out.write("			dataType : \"json\", /*json 타입으로 받겠다.  */\r\n");
      out.write("			 /* show.prod 경로를 통해서 controller에서 VO객체를 select해와서 그걸*/\r\n");
      out.write("			 /* JSONArray에다가 map,foreach를 사용해 값을 다 넣어주고 json형식으로 받아왔다. */\r\n");
      out.write("			success : function (products) {  \r\n");
      out.write("				/* products안에는 디비에 담은 name,price,stock들의 전부가 배열에 담겨있다. */\r\n");
      out.write("\r\n");
      out.write("				console.log(products);\r\n");
      out.write("				let text = \"\"; //아래에 만든 테이블을 다 text에 담는다.\r\n");
      out.write("			\r\n");
      out.write("				text += `<table border=\"1\" style=\"text-align : center;\"]>`;\r\n");
      out.write("				text += `<tr>`\r\n");
      out.write("				text += `<th>상품 번호</th>`;\r\n");
      out.write("				text += `<th>상품 이름</th>`;\r\n");
      out.write("				text += `<th>상품 가격</th>`;\r\n");
      out.write("				text += `<th>상품 재고</th>`;\r\n");
      out.write("				text += `<th colspan=\"2\">서비스</th>`; /*colspan은 2행을 하나로 합치는거 */\r\n");
      out.write("				text += `</tr>`\r\n");
      out.write("				\r\n");
      out.write("				products.forEach(p => {\r\n");
      out.write("					\r\n");
      out.write("					text += `<tr>`\r\n");
      out.write("					text += `<td>` + p.productNumber + `</td>`;\r\n");
      out.write("					text += `<td>` + p.productName + `</td>`;\r\n");
      out.write("					text += `<td>` + p.productPrice + `</td>`;\r\n");
      out.write("					text += `<td>` + p.productStock + `</td>`;\r\n");
      out.write("					text += `<td><a class=\"update\" href=\"\">수정</a></td>`;\r\n");
      out.write("					text += `<td><a class=\"delete\" href=\"` + p.productNumber +`\">삭제</a></td>`;\r\n");
      out.write("					text += `</tr>`\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				text += `</table>`;\r\n");
      out.write("				\r\n");
      out.write("				 $(\"#products\").html(text); //#products div안에 html.() 써서 text를 담아준다.\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/*=================================================================*/\r\n");
      out.write("	\r\n");
      out.write("	function view(){ /*위에 html바디태그안에 a태그에 javascript:view()가있는데*/\r\n");
      out.write("		/* a태그는 원래 경로로 보내줄때 사용되지만 javascript:를 href안에 사용하면 함수를 사용할수있다. */\r\n");
      out.write("		/* 그래서 추가를 누르게 되면 view()라는 함수를 실행시킬수가 있다. */\r\n");
      out.write("		$(\".input-wrap\").slideToggle(function(){ \r\n");
      out.write("		/* 제이쿼리문으로 input-wrap 클래스를 가져와 slide이벤트를 걸어주고 이벤트가 실행되면 ()안에 또 함수를 넣어 실행시킬수있다.*/\r\n");
      out.write("			count *= -1; //전역 변수 count에 1을 설정해 주었기때문에 이걸로 음수 양수를 만들어서 추가,닫기를 만들어준다.\r\n");
      out.write("			$(this).prev().text(count > 0 ? \"추가\" : \"닫기\"); \r\n");
      out.write("			//this는 input-wrap클래스이고 .prev()는 이전요소이다, .text는 그안에 텍스트값이다. (이게 추가이다 지금)\r\n");
      out.write("		});\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/*=================================================================*/\r\n");
      out.write("	\r\n");
      out.write("	/* 디비에 값넣는 함수 */\r\n");
      out.write("	function insert(){\r\n");
      out.write("		/* 제이쿼리문으로 위에 input태그들을 가져와 각각의 변수들에 넣어준다. */\r\n");
      out.write("		/* 여기 인풋태그들은 사용자가 입력한 값이 들어간다. */\r\n");
      out.write("		const $productNameInput = $(\"input[name='productName']\");\r\n");
      out.write("		const $productPriceInput = $(\"input[name='productPrice']\");\r\n");
      out.write("		const $productStockInput = $(\"input[name='productStock']\");\r\n");
      out.write("		\r\n");
      out.write("		/* js에서 유효성 검사를 하면 편하고 좋다.*/\r\n");
      out.write("		if(!$productNameInput.val()) {\r\n");
      out.write("			$productNameInput.focus();\r\n");
      out.write("			return; \r\n");
      out.write("	/* 만약 name인풋태그에 아무값이 들어가지 않았다면 다시 name인풋태그에 포커스를 주고 return으로 막는다.*/\r\n");
      out.write("		}\r\n");
      out.write("		if(!$productPriceInput.val()) {\r\n");
      out.write("			$productPriceInput.focus();\r\n");
      out.write("			return; \r\n");
      out.write("		}\r\n");
      out.write("		if(!$productStockInput.val()) {\r\n");
      out.write("			$productStockInput.focus();\r\n");
      out.write("			return; \r\n");
      out.write("		}	\r\n");
      out.write("		\r\n");
      out.write("		$.ajax({ /* ajax는 페이지 이동없이 디비를 갖다올수 있다. */\r\n");
      out.write("			url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/create.prod\",\r\n");
      out.write("			type: \"post\", \r\n");
      out.write("			/* 보내는타입은 post방식으로 보낸다(post는 보낼값이 길거나 주소창에 값을 비밀로 하고싶을때 post를사용한다, 애매하면 post방식 사용하기!!) */\r\n");
      out.write("			data: {productName: $productNameInput.val(), productPrice: $productPriceInput.val(), productStock: $productStockInput.val()},\r\n");
      out.write("			/* 보내는 data는 map구조로 키값과 밸류값으로 보낸다. 여기서는 사용자가 입력한 값들을 보내는것이다.*/\r\n");
      out.write("			success: function(){ /* success : function은 데이타를 보내서 디비에insert를 성공했을때 실행되는 함수이다. */\r\n");
      out.write("				$productNameInput.val(\"\"); /*성공하면 화면에서 내가 적은 값들이 빈문자열로 초기화된다.  */\r\n");
      out.write("				$productPriceInput.val(\"\");\r\n");
      out.write("				$productStockInput.val(\"\");\r\n");
      out.write("				show();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	/*============================삭제하기===============================*/\r\n");
      out.write("	\r\n");
      out.write("	$(\"#products\").on(\"click\",\"delete\",function(e){\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		console.log(\"안녕\")\r\n");
      out.write("		\r\n");
      out.write("		let productNumber = $(this).attr(\"href\");\r\n");
      out.write("		\r\n");
      out.write("/* 		$a.jax({\r\n");
      out.write("			url : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/deleteOk.prod\",\r\n");
      out.write("			data : {productNumber : productNumber},\r\n");
      out.write("			success : function () {\r\n");
      out.write("				show();\r\n");
      out.write("			}\r\n");
      out.write("		}) */\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
