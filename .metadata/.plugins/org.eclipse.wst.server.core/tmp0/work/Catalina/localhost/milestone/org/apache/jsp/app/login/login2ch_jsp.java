/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-22 12:29:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2ch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/inyeo/Desktop/jsp/workspace/milestone/WebContent/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1664872564000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>카카오 로그인</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/login/login2.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"kakao_main1\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"kakao_main2\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"kaka-_title\"></div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"kakao_menu1\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/index.me\"> <img\r\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/login/logo.png\"\r\n");
      out.write("						style=\"height: 30px; padding-top: 1 0px;\">\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"kakao_menu2\">\r\n");
      out.write("					<form\r\n");
      out.write("						action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login/loginOk.school\"\r\n");
      out.write("						name=\"loginForm\">\r\n");
      out.write("						<div class=\"phone_number\">\r\n");
      out.write("							<input type=\"text\" name=\"nurserySchoolMemberId\" id=\"phone_number\"\r\n");
      out.write("								placeholder=\"아이디\"\r\n");
      out.write("								value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty cookie.nurserySchoolMemberId.value ? '': nurserySchoolMemberId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"password\">\r\n");
      out.write("							<input type=\"password\" name=\"nurserySchoolMemberPassword\"\r\n");
      out.write("								id=\"password\" placeholder=\"비밀번호\"\r\n");
      out.write("								value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty cookie.nurserySchoolMemberPassword.value ? '': nurserySchoolMemberPassword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"login_status\">\r\n");
      out.write("							<input type=\"checkbox\" name=\"autoLogin\" id=\"login_status\">\r\n");
      out.write("							<h5>로그인 상태 유지</h5>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div style=\"color: red; font-size: 10px;\" id=\"loginState\" value=\"\">\r\n");
      out.write("							");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"buttonWrap\">\r\n");
      out.write("							<button class=\"buttonWrap\" id=\"login\" type=\"button\">로그인</button>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"or\">\r\n");
      out.write("							<fieldset\r\n");
      out.write("								style=\"border-left: none; border-right: none; border-bottom: none; border-color: white;\">\r\n");
      out.write("								<legend\r\n");
      out.write("									style=\"text-align: center; font-size: 12px; color: grey;\">또는</legend>\r\n");
      out.write("							</fieldset>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"buttonWrap\" style=\"position: relative;\">\r\n");
      out.write("							<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login/join.school\">\r\n");
      out.write("								<button class=\"buttonWrap\" id=\"join\" type=\"button\">회원\r\n");
      out.write("									가입하기</button>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"signup_menu\" style=\"position: relative\">\r\n");
      out.write("\r\n");
      out.write("							<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/find/findId.school\">\r\n");
      out.write("								<div class=\"find_id\"\r\n");
      out.write("									style=\"position: absolute; font-size: 12px; top: 28px; right: 96px; color: #574e4e; letter-spacing: -1.5px;\">\r\n");
      out.write("									아이디 찾기</div>\r\n");
      out.write("							</a>\r\n");
      out.write("							<div class=\"sorry\"\r\n");
      out.write("								style=\"position: absolute; font-size: 12px; top: 27px; right: 79px; color: #928989; letter-spacing: -1.5px;\">\r\n");
      out.write("								|</div>\r\n");
      out.write("							<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/find/findPw.school\">\r\n");
      out.write("								<div class=\"find_password\"\r\n");
      out.write("									style=\"position: absolute; font-size: 12px; right: 0px; top: 28px; color: #574e4e; letter-spacing: -1.5px;\">\r\n");
      out.write("									비밀번호 찾기</div>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"kakaofoot\">\r\n");
      out.write("			<div class=\"service_info\">\r\n");
      out.write("\r\n");
      out.write("				<a href=\"\" class=\"link_info\">이용약관</a> <span class=\"txt_bar\"></span>\r\n");
      out.write("				<a href=\"\" class=\"link_info\" style=\"font-weight: bold;\">개인정보\r\n");
      out.write("					처리방침</a> <span class=\"txt_bar\"></span> <a href=\"\" class=\"link_info\">운영정책</a>\r\n");
      out.write("				<span class=\"txt_bar\"></span> <a href=\"\" class=\"link_info\">고객센터</a>\r\n");
      out.write("				<a href=\"\" class=\"link_info\">공지사항</a> <span class=\"txt_bar\"></span>\r\n");
      out.write("				<a href=\"\" class=\"link_info\">한국어</a>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"bottom\">\r\n");
      out.write("				<small class=\"txt_copyright\">Copyright © <a href=\"\"\r\n");
      out.write("					class=\"link_kakao\"\r\n");
      out.write("					style=\"text-decoration: none; font-weight: bold; color: grey;\";>Milestone\r\n");
      out.write("						Corp.</a> All rights reserved.\r\n");
      out.write("				</small>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	let id = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.nurserySchoolMemberId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("	var contextPath = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("	if (id) {\r\n");
      out.write("		$('#login_status').prop(\"checked\", true);\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/login/login2ch.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /app/login/login2ch.jsp(51,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param.login}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("								아이디 또는 비밀번호가 일치하지않습니다\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
