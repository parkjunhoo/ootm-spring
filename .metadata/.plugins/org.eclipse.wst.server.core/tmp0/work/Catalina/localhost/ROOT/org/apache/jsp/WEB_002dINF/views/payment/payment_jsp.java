/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-03 12:57:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.payment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.team3.ootm.dao.member.MemberDTO;
import kr.team3.ootm.dao.product.ProductDTO;
import java.util.ArrayList;
import kr.team3.ootm.dao.cart.CartDTO;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("kr.team3.ootm.dao.member.MemberDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("kr.team3.ootm.dao.cart.CartDTO");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

ArrayList<CartDTO> cartList = (ArrayList<CartDTO>)request.getAttribute("CartList");
ArrayList<ProductDTO> productList = (ArrayList<ProductDTO>)request.getAttribute("CartProductList");

MemberDTO member = (MemberDTO)session.getAttribute("loginUser");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("	<head>\n");
      out.write("		<meta charset=\"UTF-8\">\n");
      out.write("		<title>이달의 룩 - 결제페이지</title>\n");
      out.write("		<!-- 파비콘 -->\n");
      out.write("		<link rel=\"icon\" href=\"/images/favicon.ico\">\n");
      out.write("		 <!-- 글꼴 -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- css -->\n");
      out.write("		<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/view/payment_members_for_window_style.css\"/>\n");
      out.write("        <!-- 우편번호 검색 팝업-->\n");
      out.write("        <script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("        <!-- javascript -->\n");
      out.write("        \n");
      out.write("       <style type=\"text/css\">\n");
      out.write("       </style>\n");
      out.write("	</head>\n");
      out.write("	<body>\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/layout/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logoDark", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("logoHoverDark", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("mTextColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("black", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menuBtnColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("black", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bgHoverColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("#F9F9F9", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bgScrollColor", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("white", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("		<h1 class=\"checkout\">Checkout</h1>\n");
      out.write("		<hr class=\"line1\"/>\n");
      out.write("		<form>\n");
      out.write("			<div class=\"user_order_info1\">\n");
      out.write("				<h3 >주문정보</h3>\n");
      out.write("				<label id=\"title_name\" for=\"name\">이름</label>\n");
      out.write("				<input readonly type=\"text\" id=\"user_name\" name=\"user_name\" value=\"");
      out.print(member.getMember_name() );
      out.write("\"><br/>\n");
      out.write("				\n");
      out.write("				<label id=\"title_phone_number\" for=\"phone_number\">연락처</label>\n");
      out.write("				<input type=\"text\" id=\"phone_number1\" name=\"phone_number1\" maxlength=\"3\">\n");
      out.write("				<input type=\"text\" id=\"phone_number2\" name=\"phone_number2\" maxlength=\"4\">\n");
      out.write("				<input type=\"text\" id=\"phone_number3\" name=\"phone_number3\" maxlength=\"4\"><br/>\n");
      out.write("				\n");
      out.write("				<label id=\"title_email\" for=\"email\">이메일</label>\n");
      out.write("				<input type=\"email\" id=\"user_email\" name=\"user_email\"><br/>\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("		\n");
      out.write("		<hr class=\"line2\"/>\n");
      out.write("		<form>\n");
      out.write("			<div class=\"user_order_info2\">\n");
      out.write("				<div class=\"shipping_container\">\n");
      out.write("					<h3>배송정보</h3>\n");
      out.write("  					<div>\n");
      out.write("    					<input type=\"checkbox\" id=\"shipping\" onchange=\"copyBillingToShipping()\">\n");
      out.write("   						<label for=\"shipping\">주문정보와 동일</label>\n");
      out.write("   					</div>\n");
      out.write("				</div>\n");
      out.write("				<div>\n");
      out.write("					<label id=\"title_name\" for=\"shipping_user_name\">이름</label>\n");
      out.write("					<input type=\"text\" id=\"shipping_user_name\"><br/>\n");
      out.write("					\n");
      out.write("					<label id=\"title_phone_number\" for=\"phone_number\">연락처</label>\n");
      out.write("					<input type=\"text\" id=\"shipping_phone_number1\" name=\"shipping_phone_number1\" maxlength=\"3\">\n");
      out.write("					<input type=\"text\" id=\"shipping_phone_number2\" name=\"shipping_phone_number2\" maxlength=\"4\">\n");
      out.write("					<input type=\"text\" id=\"shipping_phone_number3\" name=\"shipping_phone_number3\" maxlength=\"4\"><br/>\n");
      out.write("					\n");
      out.write("					<label id=\"title_phone_number_additional\" for=\"phone_number_additional\">추가 연락처</label>\n");
      out.write("					<input type=\"text\" id=\"phone_number_additional\" name=\"phone_number_additional\" maxlength=\"3\">\n");
      out.write("					<input type=\"text\" id=\"phone_number_additional\" name=\"phone_number_additional\" maxlength=\"4\">\n");
      out.write("					<input type=\"text\" id=\"phone_number_additional\" name=\"phone_number_additional\" maxlength=\"4\"><br/>\n");
      out.write("					<!-- 배송지선택 체크박스 만들기 -->\n");
      out.write("					<div class=\"last_delivery_address\">\n");
      out.write("						<label id=\"select_address\" for=\"select_address\">배송지선택</label>\n");
      out.write("						<input type=\"checkbox\" id=\"home\" onclick=\"handleCheckboxClick(this)\">\n");
      out.write("	   					<label for=\"home\">자택</label>\n");
      out.write("	   					<input type=\"checkbox\" id=\"company\" onclick=\"handleCheckboxClick(this)\">\n");
      out.write("	   					<label for=\"company\">회사</label>\n");
      out.write("	   					<input type=\"checkbox\" id=\"last_delivery\" onclick=\"handleCheckboxClick(this)\">\n");
      out.write("	   					<label for=\"last_delivery\">최근 배송지</label>\n");
      out.write("	   					<a href=\"/payment/popup\" target=\"_blank\">배송지목록</a>\n");
      out.write("	   					<input type=\"checkbox\" id=\"new_delivery\" onclick=\"handleCheckboxClick(this)\">\n");
      out.write("	   					<label for=\"new_delivery\">신규 배송지</label>\n");
      out.write("   					</div>\n");
      out.write("					<label id=\"title_address\" for=\"address\">주소</label>\n");
      out.write("	      			<input type=\"text\" id=\"address_code1\" name=\"address_code1\" maxlength=\"5\" readonly>\n");
      out.write("	      			<button id=\"post_button\" type=\"button\" value=\"우편번호검색\" onclick=\"searchAddress()\">우편번호 검색</button><br/>\n");
      out.write("	      			<label id=\"empty_space\" for=\"address\">  </label>\n");
      out.write("	      			<input type=\"text\" id=\"address_code2\" name=\"address_code2\" readonly><br/>\n");
      out.write("	      			<label id=\"empty_space\" for=\"address\">  </label>\n");
      out.write("	      			<input type=\"text\" id=\"remaining_address\" name=\"remaining_address\" placeholder=\"나머지 주소 입력\"><br/>\n");
      out.write("      				<label id=\"title_shipping_request\" for=\"shipping_request\">배송요청사항</label>\n");
      out.write("      				<input type=\"text\" id=\"shipping_request\" name=\"shipping_request\"><br/>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("		<hr class=\"line3\"/>\n");
      out.write("		<form>\n");
      out.write("			<div class=\"coupon_reward\">\n");
      out.write("				<div class=\"coupon_reward_container\">\n");
      out.write("					<h3>쿠폰/적립금 사용</h3>\n");
      out.write("					<label id=\"title_reserves\" for=\"reserves\">적립금</label>\n");
      out.write("					<input type=\"tel\" id=\"reserves\" name=\"reserves\" form=\"order_form\" autocomplete=\"off\" size=\"7\" class=\"MS_input_txt form-textbox\" value=\"0\" onkeyup=\"reservecheck('2900')\" data-okreserve=\"2900\" onblur=\"getUseableMoney();\" style=\"background: rgb(255, 255, 255);\">\n");
      out.write("					\n");
      out.write("					<label class=\"textbox-button\">\n");
      out.write("					<input id=\"reserve_box\" type=\"checkbox\" name=\"all_check_reserve\" onclick=\"allCheckUse('reserves')\">모두 사용</label>\n");
      out.write("					\n");
      out.write("					<span class=\"available-amount\">보유 적립금\n");
      out.write("					<input type=\"tel\" id=\"okreserve\" name=\"okreserve\" form=\"order_form\" autocomplete=\"off\" size=\"7\" class=\"MS_input_txt\" value=\"2900\" readonly=\"\">원</span>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("		<hr class=\"line4\"/>\n");
      out.write("		<form>\n");
      out.write("			<div class=\"user_order_info3\">\n");
      out.write("				<h3>결제정보</h3>\n");
      out.write("				<label id=\"payment_method\" for=\"payment_method\">결제방법</label>\n");
      out.write("			\n");
      out.write("				<input type=\"checkbox\" id=\"kakaopay\" name=\"payment_method\" value=\"kakaopay\" onclick=\"handleCheckboxChange1()\">\n");
      out.write("	   			<label for=\"kakaopay\">카카오페이(kakaopay)</label><br/>\n");
      out.write("   			\n");
      out.write("   				<!--  -->\n");
      out.write("   				<input type=\"checkbox\" id=\"bankbook\" name=\"payment_method\" value=\"bankbook\" onclick=\"handleCheckboxChange1()\"  onchange=\"toggleSelect()\">\n");
      out.write("   				<label for=\"bankbook\">무통장입금</label><br/>\n");
      out.write("   				<div id=\"select-container\">\n");
      out.write("					<select id=\"dropdown1\" name=\"dropdown1\" style=\"display: none;\">\n");
      out.write("						<option value=\"select\">입금계좌 선택</option>\n");
      out.write("						<option value=\"woori_bank\">우리은행 1002-111-222222</option><br/>\n");
      out.write("					</select><br/>\n");
      out.write("				</div>\n");
      out.write("				<input type=\"checkbox\" id=\"credit_card\" name=\"payment_method\" value=\"credit_card\" onclick=\"handleCheckboxChange1()\">\n");
      out.write("   				<label for=\"credit_card\">신용카드</label><br/>\n");
      out.write("   				\n");
      out.write("   				<input type=\"checkbox\" id=\"mobile_payment\" name=\"payment_method\" value=\"mobile_payment\" onclick=\"handleCheckboxChange1()\">\n");
      out.write("   				<label for=\"mobile_payment\">휴대폰 결제</label><br/>\n");
      out.write("   				\n");
      out.write("   				<div id=\"cash_receipts_container\">\n");
      out.write("	   				<label id=\"cash_receipts\" for=\"cash_receipts\">현금영수증</label>\n");
      out.write("	   				\n");
      out.write("	   				<input type=\"checkbox\" id=\"cash_receipts_no\" name=\"cash_receipts\" value=\"no\" onclick=\" handleCheckboxChange2(), handleCheckboxChange3()\">\n");
      out.write("	   				<label for=\"cash_receipts_no\">발급 안 함</label><br/>\n");
      out.write("	   				\n");
      out.write("	   				<input type=\"checkbox\" id=\"cash_receipts_yes\" name=\"cash_receipts\" value=\"yes\" onclick=\" handleCheckboxChange2(), handleCheckboxChange3()\">\n");
      out.write("	   				<label for=\"cash_receipts_yes\">발급</label><br/>\n");
      out.write("	   				\n");
      out.write("	   				<select id=\"dropdown2\" name=\"dropdown2\">\n");
      out.write("						<option value=\"phone_number\">핸드폰 번호</option>\n");
      out.write("						<option value=\"business_number\">사업자 번호</option>\n");
      out.write("						<option value=\"revenue\">국세청 현금영수증 카드</option><br/>\n");
      out.write("					</select><br/>\n");
      out.write("					<div id=\"phone_number_container\" style=\"display: none;\">\n");
      out.write("						<input type=\"text\" id=\"phone_number\" name=\"phone_number\">\n");
      out.write("						<input type=\"text\" id=\"phone_number\" name=\"phone_number\">\n");
      out.write("						<input type=\"text\" id=\"phone_number\" name=\"phone_number\"><br/>\n");
      out.write("					</div>\n");
      out.write("					<div id=\"business_number_container\" style=\"display: none;\">\n");
      out.write("						<input type=\"text\" id=\"business_number\" name=\"business_number\">\n");
      out.write("						<input type=\"text\" id=\"business_number\" name=\"business_number\">\n");
      out.write("						<input type=\"text\" id=\"business_number\" name=\"business_number\">\n");
      out.write("						<input type=\"text\" id=\"business_number_company_name\" name=\"business_number_company_name\" placeholder=\"업체명\"><br/>\n");
      out.write("					</div>\n");
      out.write("					<div id=\"revenue_container\" style=\"display: none;\">\n");
      out.write("						<input type=\"text\" id=\"revenue_number\" name=\"revenue_number\">\n");
      out.write("						<input type=\"text\" id=\"revenue_number\" name=\"revenue_number\">\n");
      out.write("						<input type=\"text\" id=\"revenue_number\" name=\"revenue_number\">\n");
      out.write("						<input type=\"text\" id=\"revenue_number_last\" name=\"revenue_number_last\"><br/>\n");
      out.write("					</div>\n");
      out.write("   				</div>\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("		<hr class=\"line5\"/>\n");
      out.write("		<form>\n");
      out.write("			<div class=\"checkout_summary\">\n");
      out.write("				<h3>주문요약 및 결제</h3>\n");
      out.write("				<ul>\n");
      out.write("				");

				int count = cartList.size();
				for(int i=0; i<count; i++){ 
				CartDTO cart = cartList.get(i);
				ProductDTO product = productList.get(i);
				
      out.write("\n");
      out.write("					<li class=\"image\">\n");
      out.write("						<img width=\"80px;\" height=\"80px;\" src=\"");
      out.print(product.getProduct_image2() );
      out.write("\"> <!-- DB에서 받아오기 -->\n");
      out.write("					</li>\n");
      out.write("					<li class=\"product_info\">\n");
      out.write("						<h4>");
      out.print(product.getProduct_name());
      out.write(' ');
      out.write('x');
      out.write(' ');
      out.print(cart.getCart_quantity());
      out.write("</h4> \n");
      out.write("						<div class=\"product-option\">컬러 : 중청, 사이즈 : L</div>\n");
      out.write("						<h4 class=\"price\">37,000원</h4>\n");
      out.write("					</li>\n");
      out.write("					");
}
      out.write("\n");
      out.write("				</ul>\n");
      out.write("				<hr class=\"line6\"/>\n");
      out.write("				<div class=\"pay_summary\">\n");
      out.write("					<div class=\"summary_list\">\n");
      out.write("						<div class=\"summary_item_subtotal\">\n");
      out.write("							<div class=\"label\">주문금액 \n");
      out.write("								<span class=\"product_price\" price=\"DB\">37,000원</span>\n");
      out.write("							</div>\n");
      out.write("						<div class=\"summary_item_shipping\">\n");
      out.write("							<div class=\"label\">배송비\n");
      out.write("								<span class=\"delivery_price\" price=\"DB\">무료</span>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"summary_discount\">\n");
      out.write("							<div>\n");
      out.write("								<div class=\"lable\">할인\n");
      out.write("									<span class=\"sale_price\" price=\"DB\">-0원</span>\n");
      out.write("								</div>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"summary_additional\">\n");
      out.write("							<div class=\"lable_exception\">추가금액\n");
      out.write("								<span class=\"additional_price\" price=\"DB\">0원</span>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<hr class=\"line7\"/>\n");
      out.write("				<div class=\"total_pay_summary\">\n");
      out.write("					<div class=\"summary_list2\">\n");
      out.write("						<div class=\"summary_total\">\n");
      out.write("							<div class=\"lable\">총 결제금액\n");
      out.write("								<span class=\"total_price\" price=\"DB\">37000원</span>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"last_checkout\">\n");
      out.write("					<div class=\"checkout-agreement\">\n");
      out.write("                    	<label><input type=\"checkbox\" id=\"pay_agree\" name=\"pay_agree\" form=\"order_form\" class=\"agree_terms\" onclick=\"javascript_method()\"> 모든 주문, 결제정보를 확인하였으며 진행에 동의합니다.</label>\n");
      out.write("                    </div>\n");
      out.write("				</div>\n");
      out.write("				<button class=\"payment_button\"><a href=\"javascript:send();\" class=\"button primary\">결제하기</a></button>\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/layout/footer.jsp", out, false);
      out.write("\n");
      out.write("		\n");
      out.write("		\n");
      out.write("		<script type=\"text/javascript\" src=\"/js/payment_members_js.js\"></script>\n");
      out.write("	</body>		\n");
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
