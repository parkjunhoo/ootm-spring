/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-29 20:47:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypage_005freserve_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>적립금 내역</title>\r\n");
      out.write("<!-- 글꼴 -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"icon\" href=\"/images/favicon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/view/all.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".page-container {\r\n");
      out.write("	margin-top: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation {\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-top: 52px;\r\n");
      out.write("	width: 250px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation ul li {\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	padding-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation ul li a {\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation ul .current {\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation li a:after {\r\n");
      out.write("	background-color: #222;\r\n");
      out.write("	content: '';\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	bottom: -5px;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	width: 0;\r\n");
      out.write("	height: 1px;\r\n");
      out.write("	transition: width 0.25s ease-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation li a:hover:after {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("/* 컨텐츠 박스 */\r\n");
      out.write(".page-content {\r\n");
      out.write("	float: right;\r\n");
      out.write("	width: calc(100% - 250px);\r\n");
      out.write("	min-height: 40vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-content .section-title {\r\n");
      out.write("	margin-top: 0;\r\n");
      out.write("	margin-bottom: 50px;\r\n");
      out.write("	border-top: 2px solid #222;\r\n");
      out.write("	padding-top: 50px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h4 {\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-content .section {\r\n");
      out.write("	margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-list .list-row {\r\n");
      out.write("	border-bottom: 1px solid #dcdcdc;\r\n");
      out.write("	padding: 20px 0;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-list .list-header {\r\n");
      out.write("	padding-top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".point-list .list-row .date, .point-list .list-row .balance {\r\n");
      out.write("	width: 15%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".point-list .list-row .detail {\r\n");
      out.write("	width: 70%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-list .list-row:before, .page-list .list-row:after {\r\n");
      out.write("	content: '';\r\n");
      out.write("	display: table;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-list .list-row:after {\r\n");
      out.write("	clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-list .list-row .item {\r\n");
      out.write("	float: left;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-list .list-header .item {\r\n");
      out.write("	font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-content .info-list {\r\n");
      out.write("	margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-content .info-list li {\r\n");
      out.write("	padding-left: 12px;\r\n");
      out.write("	padding-bottom: 5px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	line-height: 1.65;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".info-list li:before {\r\n");
      out.write("	content: '\\00b7';\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	top: -7px;\r\n");
      out.write("	left: 0;\r\n");
      out.write("}\r\n");
      out.write("/* 푸터고정 */\r\n");
      out.write(".footer {\r\n");
      out.write("	clear: both;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/layout/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logoDark", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logoHoverDark", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("mTextColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("black", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menuBtnColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("black", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bgHoverColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("#F9F9F9", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bgScrollColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("white", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"all-margin\">\r\n");
      out.write("		<div class=\"page-header\">\r\n");
      out.write("			<h2>My Page</h2>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"page-container mypage\" data-page-title=\"orders\">\r\n");
      out.write("			<!-- 왼쪽 -->\r\n");
      out.write("			<div class=\"page-navigation\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li data-page-target=\"dashboard\"><a href=\"/mypage\">마이페이지</a></li>\r\n");
      out.write("					<li data-page-target=\"orders\"><a href=\"/mypage/orderlist\">주문내역</a></li>\r\n");
      out.write("					<li data-page-target=\"wishlist\"><a\r\n");
      out.write("						href=\"/mypage/wishlist\">위시리스트</a></li>\r\n");
      out.write("					<li data-page-target=\"coupons\"><a\r\n");
      out.write("						href=\"/mypage/coupon\">쿠폰</a></li>\r\n");
      out.write("					<li data-page-target=\"points\" class=\"current\"><a href=\"/mypage/reserve\">적립금</a></li>\r\n");
      out.write("					<li data-page-target=\"balance\"><a href=\"/mypage/deposit\">예치금</a></li>\r\n");
      out.write("					<li data-page-target=\"support\"><a href=\"/mypage/inquiry\">문의내역</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"page-content\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"section-title\">\r\n");
      out.write("					<h4>현재 보유중인 적립금은 2,900원 입니다.</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"section page-list point-list\">\r\n");
      out.write("					<div class=\"list-header list-row\">\r\n");
      out.write("						<div class=\"item date\">변경일자</div>\r\n");
      out.write("						<div class=\"item detail\">내역</div>\r\n");
      out.write("						<div class=\"item balance\">적립금</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"list-row\">\r\n");
      out.write("						<div class=\"item date\">2023-04-13</div>\r\n");
      out.write("						<div class=\"item detail\">가입축하금입니다.</div>\r\n");
      out.write("						<div class=\"item balance\">2,000원</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"info-list\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li>상품 구매 적립금은 배송 완료 후 자동으로 적립됩니다.</li>\r\n");
      out.write("							<li>보유하신 적립금이 1,000원 이상일 경우, 5,000원 이상 주문 시 현금과 동일하게 사용하실 수\r\n");
      out.write("								있습니다.</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/layout/footer.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
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
