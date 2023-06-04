/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-24 04:19:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.faq;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faqService_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"ko\" data-direction=\"ltr\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"robots\" content=\"noindex, nofollow\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>MILESTONE+Help Center</title>\r\n");
      out.write("    <meta name=\"description\" content=\"서비스 소개 및 이용문의\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"intercom:trackingEvent\"\r\n");
      out.write("        content=\"{&quot;name&quot;:&quot;Viewed Help Center&quot;,&quot;metadata&quot;:{&quot;action&quot;:&quot;viewed&quot;,&quot;object&quot;:&quot;educate_home&quot;,&quot;place&quot;:&quot;help_center&quot;,&quot;owner&quot;:&quot;educate&quot;,&quot;default_locale&quot;:&quot;en&quot;,&quot;current_locale&quot;:&quot;ko&quot;,&quot;is_default_locale&quot;:false}}\">\r\n");
      out.write("    <meta property=\"og:title\" content=\"CLASS101+Help Center\">\r\n");
      out.write("    <meta name=\"twitter:title\" content=\"CLASS101+Help Center\">\r\n");
      out.write("\r\n");
      out.write("    <meta property=\"og:description\" content=\"서비스 소개 및 이용문의\">\r\n");
      out.write("    <meta name=\"twitter:description\" content=\"서비스 소개 및 이용문의\">\r\n");
      out.write("\r\n");
      out.write("    <meta property=\"og:type\" content=\"website\">\r\n");
      out.write("    <meta property=\"og:image\"\r\n");
      out.write("        content=\"https://downloads.intercomcdn.com/i/o/334438/617f499e0dc747ca28c9c9d6/37f11ccece2351ec558f9bd873223a6f.png\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"twitter:image\"\r\n");
      out.write("        content=\"https://downloads.intercomcdn.com/i/o/334438/617f499e0dc747ca28c9c9d6/37f11ccece2351ec558f9bd873223a6f.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/faq/faqSecond.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"header__lite\" style=\"\">\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <div class=\"container header__container o__ltr\" dir=\"ltr\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <div class=\"mo o__centered o__reversed header__meta_wrapper\">\r\n");
      out.write("                    <div class=\"mo__body header__site_name\">\r\n");
      out.write("                        <div class=\"header__logo\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/index.me\">\r\n");
      out.write("                                <img alt=\"CLASS101+Help Center\" height=\"347\"\r\n");
      out.write("                                    src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/whiteLogo.png\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mo__aside\">\r\n");
      out.write("                        <div class=\"header__links\">\r\n");
      out.write("                                    <g stroke=\"#FFF\" fill=\"none\" fill-rule=\"evenodd\" stroke-linecap=\"round\"\r\n");
      out.write("                                        stroke-linejoin=\"round\">\r\n");
      out.write("                                        <path d=\"M11.5 6.73v6.77H.5v-11h7.615M4.5 9.5l7-7M13.5 5.5v-5h-5\"></path>\r\n");
      out.write("                                    </g>\r\n");
      out.write("                                </svg><span></span></a>\r\n");
      out.write("                            <select name=\"locale-picker\" id=\"locale-picker\" class=\"locale-picker\" data-locale=\"ko\"\r\n");
      out.write("                                style=\"width: 82px;\">\r\n");
      out.write("                                <option data-locale=\"ko\" selected=\"selected\"\r\n");
      out.write("                                    value=\"/class101faq/ko/collections/3422162-자주-묻는-질문\">한국어</option>\r\n");
      out.write("                            </select><select name=\"hidden_locales\" id=\"locale-picker-for-width-calculation\"\r\n");
      out.write("                                class=\"locale-picker\" style=\"\">\r\n");
      out.write("                                <option value=\"\">한국어</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"content educate_content\">\r\n");
      out.write("            <section class=\"content section\">\r\n");
      out.write("                <div class=\"breadcrumb\" dir=\"ltr\">\r\n");
      out.write("                    <div class=\"link__arrow o__ltr\">\r\n");
      out.write("                        <a href=\"/class101faq/ko/\">모든 컬렉션</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"link__arrow o__ltr\">서비스 소개 및 이용문의</div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"section__bg\">\r\n");
      out.write("                    <div class=\"paper g__space collection__headline\">\r\n");
      out.write("                        <div class=\"collection o__ltr\">\r\n");
      out.write("                            <div class=\"collection__photo\">\r\n");
      out.write("                                <svg role=\"img\" viewBox=\"0 0 48 48\">\r\n");
      out.write("                                    <g id=\"book-opened2\">\r\n");
      out.write("                                        <path\r\n");
      out.write("                                            d=\"M24 11c0-3.866 10.297-7 23-7v33c-12.703 0-23 3.134-23 7 0-3.866-10.3-7-23-7V4c12.7 0 23 3.134 23 7zm0 0v32m-5-27.52c-3.22-1.232-7.773-2.128-13-2.48m13 8.48c-3.22-1.232-7.773-2.128-13-2.48m13 8.48c-3.22-1.232-7.773-2.128-13-2.48m13 8.48c-3.22-1.23-7.773-2.127-13-2.48m23-15.52c3.223-1.232 7.773-2.128 13-2.48m-13 8.48c3.223-1.232 7.773-2.128 13-2.48m-13 8.48c3.223-1.232 7.773-2.128 13-2.48m-13 8.48c3.223-1.23 7.773-2.127 13-2.48\"\r\n");
      out.write("                                            stroke-width=\"2\" fill=\"none\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                                        </path>\r\n");
      out.write("                                    </g>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"collection__meta intercom-force-break\" dir=\"ltr\">\r\n");
      out.write("                                <h1 class=\"t__h1\">서비스 소개 및 이용문의</h1>\r\n");
      out.write("                                <p class=\"paper__preview\"></p>\r\n");
      out.write("                                <div class=\"avatar\">\r\n");
      out.write("                                    <div class=\"avatar__photo avatars__images o__ltr\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/minilogo.jpg\"\r\n");
      out.write("                                            alt=\"class101 avatar\" class=\"avatar__image\">\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"avatar__info\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <span class=\"c__darker\">\r\n");
      out.write("                                                이 컬렉션의 6개 기사\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <br>\r\n");
      out.write("                                            작성자: <span class=\"c__darker\"> milestone</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"g__space\">\r\n");
      out.write("                        <a href=\"javascript:void(0)\"\r\n");
      out.write("                            class=\"t__no-und paper paper__article-preview\">\r\n");
      out.write("                            <div class=\"article__preview intercom-force-break\" dir=\"ltr\">\r\n");
      out.write("                                <nav class=\"nav\">\r\n");
      out.write("                                    <h2 class=\"t__h3\"><span class=\"c__primary\">MILESTONE 서비스란 무엇인가요.</span></h2>\r\n");
      out.write("                                    <div id=\"sliding_menu_main\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/logo.png\" style=\"width: 12%\"> \r\n");
      out.write("                                        <p></p>\r\n");
      out.write("                                        안녕하세요. MILESTONE 팀입니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        MILESTONE 서비스란?\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        돈이나 물품 등을 저희에게 전달하시는 게 아니라 기부하시는 보육원을 선택해주시면\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        직접 방문하여 기부하시거나, 아니면 보육원과 직접 연락을 통해 기부하는 방식입니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        직접 기부를 진행하시기 떄문에, 안심하시고 안전하게 기부하실 수 있습니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        또한, 기부 횟수에 따른 랭킹이 기부랭킹에 표기됩니다. 감사합니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        by MILESTONE PROJECT FAQ\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </nav>\r\n");
      out.write("                                </h2>\r\n");
      out.write("                                <span class=\"paper__preview c__body\"></span>\r\n");
      out.write("                                <div class=\"avatar\">\r\n");
      out.write("                                    <div class=\"avatar__photo o__ltr\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/minilogo.jpg\"\r\n");
      out.write("                                            alt=\"class101 avatar\" class=\"avatar__image\">\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"avatar__info\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <span class=\"c__darker\">작성자:</span>milestone\r\n");
      out.write("                                            <br> 1주일 전에 업데이트됨\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"javascript:void(0)\"\r\n");
      out.write("                            class=\"t__no-und paper paper__article-preview\">\r\n");
      out.write("                            <div class=\"article__preview intercom-force-break\" dir=\"ltr\">\r\n");
      out.write("                                <nav class=\"nav\">\r\n");
      out.write("                                    <h2 class=\"t__h3\"><span class=\"c__primary\">기부는 어떻게 하나요.</span></h2>\r\n");
      out.write("                                    <div id=\"sliding_menu\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/logo.png\" style=\"width: 12%\"> \r\n");
      out.write("                                        <p></p>\r\n");
      out.write("                                        안녕하세요. MILESTONE 팀입니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        상단의 기부하기 탭에서 가능합니다. 감사합니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        by MILESTONE PROJECT FAQ\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </nav>\r\n");
      out.write("                                <span class=\"paper__preview c__body\"></span>\r\n");
      out.write("                                <div class=\"avatar\">\r\n");
      out.write("                                    <div class=\"avatar__photo o__ltr\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/minilogo.jpg\"\r\n");
      out.write("                                            alt=\"class101 avatar\" class=\"avatar__image\">\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"avatar__info\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <span class=\"c__darker\">작성자:</span>milestone\r\n");
      out.write("                                            <br> 1주일 전에 업데이트됨\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"javascript:void(0)\"\r\n");
      out.write("                            class=\"t__no-und paper paper__article-preview\">\r\n");
      out.write("                            <div class=\"article__preview intercom-force-break\" dir=\"ltr\">\r\n");
      out.write("                                <nav class=\"nav\">\r\n");
      out.write("                                    <h2 class=\"t__h3\"><span class=\"c__primary\">후원 일시정지 할 수 있나요.</span></h2>\r\n");
      out.write("                                    <div id=\"sliding_menu\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/logo.png\" style=\"width: 12%\"> \r\n");
      out.write("                                        <p></p>\r\n");
      out.write("                                        안녕하세요. MILESTONE 팀입니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        by MILESTONE PROJECT FAQ\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </nav>\r\n");
      out.write("                                <span class=\"paper__preview c__body\"></span>\r\n");
      out.write("                                <div class=\"avatar\">\r\n");
      out.write("                                    <div class=\"avatar__photo o__ltr\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/minilogo.jpg\"\r\n");
      out.write("                                            alt=\"class101 avatar\" class=\"avatar__image\">\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"avatar__info\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <span class=\"c__darker\">작성자:</span>milestone\r\n");
      out.write("                                            <br> 1주일 전에 업데이트됨\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"javascript:void(0)\"\r\n");
      out.write("                            class=\"t__no-und paper paper__article-preview\">\r\n");
      out.write("                            <div class=\"article__preview intercom-force-break\" dir=\"ltr\">\r\n");
      out.write("                                <nav class=\"nav\">\r\n");
      out.write("                                    <h2 class=\"t__h3\"><span class=\"c__primary\">기부 가능한 물품이 궁금해요.</span></h2>\r\n");
      out.write("                                    <div id=\"sliding_menu\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/logo.png\" style=\"width: 12%\"> \r\n");
      out.write("                                        <p></p>\r\n");
      out.write("                                        안녕하세요. MILESTONE 팀입니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        기부 가능한 물품에는 제한이 없으며, 원하시는 물품을 직접 입력해주시면 됩니다. 감사합니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        by MILESTONE PROJECT FAQ\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </nav>\r\n");
      out.write("                                <span class=\"paper__preview c__body\"></span>\r\n");
      out.write("                                <div class=\"avatar\">\r\n");
      out.write("                                    <div class=\"avatar__photo o__ltr\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/minilogo.jpg\"\r\n");
      out.write("                                            alt=\"class101 avatar\" class=\"avatar__image\">\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"avatar__info\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <span class=\"c__darker\">작성자:</span>milestone\r\n");
      out.write("                                            <br> 1주일 전에 업데이트됨\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"javascript:void(0)\"\r\n");
      out.write("                            class=\"t__no-und paper paper__article-preview\">\r\n");
      out.write("                            <div class=\"article__preview intercom-force-break\" dir=\"ltr\">\r\n");
      out.write("                                <nav class=\"nav\">\r\n");
      out.write("                                    <h2 class=\"t__h3\"><span class=\"c__primary\">MILESTONE 이용 시 기부할 보육원을 확인하고 싶어요</span></h2>\r\n");
      out.write("                                    <div id=\"sliding_menu\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/logo.png\" style=\"width: 12%\"> \r\n");
      out.write("                                        <p></p>\r\n");
      out.write("                                        안녕하세요. MILESTONE 팀입니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        상단에 있는 기부하기 > 보육원 검색 기능을 이용하실 수 있습니다. 감사합니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        by MILESTONE PROJECT FAQ\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </nav>\r\n");
      out.write("                                <span class=\"paper__preview c__body\"></span>\r\n");
      out.write("                                <div class=\"avatar\">\r\n");
      out.write("                                    <div class=\"avatar__photo o__ltr\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/minilogo.jpg\"\r\n");
      out.write("                                            alt=\"class101 avatar\" class=\"avatar__image\">\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"avatar__info\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <span class=\"c__darker\">작성자:</span>milestone\r\n");
      out.write("                                            <br> 1주일 전에 업데이트됨\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"javascript:void(0)\"\r\n");
      out.write("                            class=\"t__no-und paper paper__article-preview\">\r\n");
      out.write("                            <div class=\"article__preview intercom-force-break\" dir=\"ltr\">\r\n");
      out.write("                                <nav class=\"nav\">\r\n");
      out.write("                                    <h2 class=\"t__h3\"><span class=\"c__primary\">휴대폰과 기기 동시에 시청이 가능한가요.</span></h2>\r\n");
      out.write("                                    <div id=\"sliding_menu\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/logo.png\" style=\"width: 12%\"> \r\n");
      out.write("                                        <p></p>\r\n");
      out.write("                                        안녕하세요. MILESTONE 팀입니다.\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                        by MILESTONE PROJECT FAQ\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </nav>\r\n");
      out.write("                                <span class=\"paper__preview c__body\"></span>\r\n");
      out.write("                                <div class=\"avatar\">\r\n");
      out.write("                                    <div class=\"avatar__photo o__ltr\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/minilogo.jpg\"\r\n");
      out.write("                                            alt=\"class101 avatar\" class=\"avatar__image\">\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"avatar__info\">\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <span class=\"c__darker\">작성자:</span>milestone\r\n");
      out.write("                                            <br> 1주일 전에 업데이트됨\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <div class=\"u__cf\" dir=\"ltr\">\r\n");
      out.write("                    <div class=\"footer__logo\">\r\n");
      out.write("                        <a href=\"/class101faq/ko/\">\r\n");
      out.write("                            <img alt=\"CLASS101+Help Center\"\r\n");
      out.write("                                src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/faq/mainlogo.png\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/faq/faq2.js\" ></script>\r\n");
      out.write("</body>\r\n");
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
}