/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-03 19:08:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.product_005fdetail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO;
import kr.team3.ootm.dao.member.MemberDTO;
import java.util.List;
import kr.team3.ootm.dao.product.ProductDTO;

public final class product_005fdetail_005finquiry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("kr.team3.ootm.dao.product.ProductDTO");
    _jspx_imports_classes.add("kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("kr.team3.ootm.dao.member.MemberDTO");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

ProductDTO product = (ProductDTO) request.getAttribute("product");
List<InquiryProductPostDTO> postuser = (List<InquiryProductPostDTO>) request.getAttribute("inquiryList");
int size = postuser.size();
String memberId ="";
String memberName ="";
if(session.getAttribute("loginUser")!=null){
	MemberDTO loginUser = (MemberDTO) session.getAttribute("loginUser");
	System.out.println(loginUser.getMember_name());
	memberId = loginUser.getMember_id();
	memberName = loginUser.getMember_name();
}



      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"productInquiryModal\" tabindex=\"-1\"\r\n");
      out.write("	role=\"dialog\" aria-labelledby=\"productInquiryModalLabel\"\r\n");
      out.write("	aria-hidden=\"true\">\r\n");
      out.write("	<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("		<div class=\"modal-content\">\r\n");
      out.write("			<div class=\"modal-header\">\r\n");
      out.write("				<h5 class=\"modal-title\" id=\"productInquiryModalLabel\">상품 문의하기</h5>\r\n");
      out.write("				<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("					aria-label=\"Close\">\r\n");
      out.write("					<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal-body\">\r\n");
      out.write("				<form id=\"productInquiryForm\" action=\"/inquiry/insert.do\"\r\n");
      out.write("					method=\"POST\" name=\"inquiry\">\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<div class=\"center\">\r\n");
      out.write("							<label for=\"productName\">상품</label> <input type=\"hidden\"\r\n");
      out.write("								class=\"form-control\" id=\"ProductId\" name=\"product_id\"\r\n");
      out.write("								value=\"");
      out.print(product.getProduct_id());
      out.write("\"> <input type=\"text\"\r\n");
      out.write("								readonly style=\"text-align: center\" class=\"form-control\"\r\n");
      out.write("								id=\"ProductName\" value=\"");
      out.print(product.getProduct_name());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<div class=\"center\">\r\n");
      out.write("							<label for=\"postUserName\">이름</label> <input type=\"hidden\"\r\n");
      out.write("								class=\"form-control\" id=\"memberId\" name=\"member_id\"\r\n");
      out.write("								value=\"");
      out.print(memberId);
      out.write("\"> <input\r\n");
      out.write("								type=\"text\" readonly style=\"text-align: center\"\r\n");
      out.write("								class=\"form-control\" id=\"memberName\"\r\n");
      out.write("								value=\"");
      out.print(memberName);
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"inquiryTitle\">제목</label> <input type=\"text\"\r\n");
      out.write("							class=\"form-control\" id=\"inquiryTitle\"\r\n");
      out.write("							name=\"inquiry_product_post_title\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"inquiryContent\">문의 내용</label>\r\n");
      out.write("						<textarea class=\"form-control\" id=\"inquiryContent\" rows=\"3\"\r\n");
      out.write("							name=\"inquiry_product_post_content\" required></textarea>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"modal-footer\">\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("							data-dismiss=\"modal\">닫기</button>\r\n");
      out.write("						<div class=\"col-sm-3 col-sm-offset-2\">\r\n");
      out.write("							<input type=\"submit\" value=\"등록하기\" class=\"btn btn-success\" />\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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
