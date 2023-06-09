/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-03 22:41:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.helpdesk;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qna_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    // menu 클래스 바로 하위에 있는 a 태그를 클릭했을때\r\n");
      out.write("    $(\"h6\").click(function(){\r\n");
      out.write("        var menu = $(this).next(\".hide\");\r\n");
      out.write("\r\n");
      out.write("        // submenu 가 화면상에 보일때는 위로 보드랍게 접고 아니면 아래로 보드랍게 펼치기\r\n");
      out.write("        if( menu.is(\":visible\") ){\r\n");
      out.write("            menu.slideUp();\r\n");
      out.write("        }else{\r\n");
      out.write("            menu.slideDown();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<div class=\"helpdeskContentDiv\">\r\n");
      out.write("    <div class=\"deskTitle\">\r\n");
      out.write("        <h3>자주묻는질문</h3>\r\n");
      out.write("        <h4>궁금한 점이 있으신가요? 문의에 앞서 자주묻는 질문들을 확인해보세요.</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"qnaTable\">\r\n");
      out.write("        <div class=\"qnaTableHead\">\r\n");
      out.write("            <a>전체보기</a>\r\n");
      out.write("            <a>상품</a>\r\n");
      out.write("            <a>주문/결제</a>\r\n");
      out.write("            <a>배송</a>\r\n");
      out.write("            <a>교환/환불</a>\r\n");
      out.write("            <a>기타</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <ul class=\"qnaTableBody\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <h5>상품</h5>\r\n");
      out.write("                <h6><a href=\"javascript:0\">구매 전 확인해야 할 것들은 무엇이 있나요?</a></h6>\r\n");
      out.write("                <div class=\"hide\">\r\n");
      out.write("	                <a>온라인 쇼핑은 상품을 직접 보고 구매하는 것이 아니므로 상품구매 전에는 상품 정보를 꼼꼼히 살펴보시기 바랍니다.\r\n");
      out.write("	                OOTM은 최대한 실물 색상에 가까운 사진과 정확한 사이즈 기재를 하고 있으나 컴퓨터 해상도에 따라 색상 차이가 있을 수 있으며, 1~3cm 가량은 재는 방법에 따라 실제 사이즈와 차이가 있을 수 있으니 참고하시기 바랍니다.</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            <li>\r\n");
      out.write("                <h5>상품</h5>\r\n");
      out.write("                <h6><a href=\"javascript:0\">상품에 대해 더 궁금한 점이 있어요.</a></h6>\r\n");
      out.write("                <div class=\"hide\">\r\n");
      out.write("	                <a>카카오톡 상담 신청을 통해 사이즈 또는 상품 문의 주시면 빠른 답변 도와드리도록 하겟습니다</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            <li>\r\n");
      out.write("                <h5>주문</h5>\r\n");
      out.write("                <h6><a href=\"javascript:0\">주문을 취소하고 싶습니다.</a></h6>\r\n");
      out.write("                <div class=\"hide\">\r\n");
      out.write("	                <a>배송전 취소는 카카오톡 상담신청 을 통해 (상품명, 주문자명) 기재후 취소 요청 부탁드립니다. 단, 상품이 이미 출고 된 경우 발송 및 회수에 소요되는 배송료를 제외한 뒤 환불되는 점 참고 바랍니다.</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <li>\r\n");
      out.write("                <h5>주문</h5>\r\n");
      out.write("                <h6><a href=\"javascript:0\">주문하면 언제 받아볼 수 있나요?</a></h6>\r\n");
      out.write("                <div class=\"hide\">\r\n");
      out.write("	                <a>하루 주문 마감시간 오후 5시이며 5시 이후주문건 다다음날 부터 입고 시작 저희가 선 주문 후 입고 배송 시스템이라 당일 발송 진행하지 않고 있어요. 지연상품이 아닌 정상배송 상품의경우 입고준비기간이 주말제외 2~5일정도 소요되는 점 참고 부탁드릴게용:) 상품이 일시품절 등의 사유로 재입고 기간이 필요한 경우 이보다 더 소요될 수 있으며 이러한 경우 별도의 연락을 드리니 참고하시기 바랍니다.</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            <li>\r\n");
      out.write("                <h5>결제</h5>\r\n");
      out.write("                <h6><a href=\"javascript:0\">결제창이 뜨지 않습니다.</a></h6>\r\n");
      out.write("                <div class=\"hide\">\r\n");
      out.write("	                <a>결제 플러그인이 제대로 설치되지 않았을 수 있습니다. 우선 새로고침을 해본 뒤, 증상이 지속되면 아래 링크를 통해 이니시스 결제 플러그인을 수동 설치해 보시기 바랍니다.\r\n");
      out.write("					</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <li>\r\n");
      out.write("                <h5>결제</h5>\r\n");
      out.write("                <h6><a href=\"javascript:0\">결제 방법은 어떤 것이 있나요?</a></h6>\r\n");
      out.write("                <div class=\"hide\">\r\n");
      out.write("	                <a>무통장 입금 결제는 물론 모든 카드사의 신용결제가 가능합니다. 또한 현금 등으로 5만원 이상 구매 시 KB국민은행의 구매안전 서비스를 이용해 안심하고 결제할 수 있습니다.</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           <li>\r\n");
      out.write("                <h5>주문</h5>\r\n");
      out.write("                <h6><a href=\"javascript:0\">장바구니에 담아두고 다른 곳에서 결제해도 되나요?</a></h6>\r\n");
      out.write("                <div class=\"hide\">\r\n");
      out.write("	                <a>장바구니는 DB에 저장되므로 어디서든 불러올 수 있습니다.</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</div>");
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
