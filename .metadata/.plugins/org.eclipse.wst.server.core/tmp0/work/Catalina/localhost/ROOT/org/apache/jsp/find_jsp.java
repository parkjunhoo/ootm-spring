/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-29 12:05:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class find_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- 글꼴 -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"/images/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"/component/header/header.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"/component/footer/footer.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/reset.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/test.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/find.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- 헤더 -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layout/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logoDark", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logoHoverDark", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("mTextColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("black", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menuBtnColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("black", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bgHoverColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("#F9F9F9", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bgScrollColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("white", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 메인화면 -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<p class=\"head\">Find my account</p>\r\n");
      out.write("		<div class=\"find-sub\">\r\n");
      out.write("			<h4>아이디를 잊으셨나요?</h4>\r\n");
      out.write("			<div class=\"find-radio\">\r\n");
      out.write("				<input type=\"radio\" class=\"find-sub1\" name=\"find-id\" value=\"email\">이메일로\r\n");
      out.write("				찾기 <input type=\"radio\" class=\"find-sub1\" name=\"find-id\"\r\n");
      out.write("					value=\"phone\" placeholder=\"이메일\">핸드폰번호로 찾기<br />\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"이름\"><br />\r\n");
      out.write("			<input type=\"text\" id=\"email\" name=\"email\" placeholder=\"이메일\"><br />\r\n");
      out.write("			<input type=\"submit\" id=\"find-id\" value=\"아이디 찾기\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"find-sub\">\r\n");
      out.write("			<h4>비밀번호를 잊으셨나요?</h4>\r\n");
      out.write("			<div class=\"find-radio\">\r\n");
      out.write("				<input type=\"radio\" class=\"find-sub1\" name=\"find-pass\" value=\"email\"\r\n");
      out.write("					placeholder=\"아이디\">이메일로 찾기 <input type=\"radio\"\r\n");
      out.write("					class=\"find-sub1\" name=\"find-pass\" value=\"phone\" placeholder=\"아이디\">핸드폰번호로\r\n");
      out.write("				찾기<br />\r\n");
      out.write("			</div>\r\n");
      out.write("			<input type=\"text\" id=\"id\" name=\"id\" placeholder=\"아이디\"><br />\r\n");
      out.write("			<input type=\"text\" id=\"email\" name=\"email\" placeholder=\"이메일\"><br />\r\n");
      out.write("			<input type=\"submit\" id=\"replace-pass\" value=\"임시 비밀번호 발급\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<a href=\"#\" class=\"login-page\"><h2>로그인 페이지로 돌아가기</h2></a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- 푸터 -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layout/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script src=\"/component/hoverbox/hoverbox.js\"></script>\r\n");
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
