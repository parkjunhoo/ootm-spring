<%@page import="java.util.ArrayList"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="kr.team3.ootm.dao.cart.CartDTO"%>
<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
		<title>이달의 룩 - 결제페이지</title>
		<!-- 파비콘 -->
		<link rel="icon" href="/images/favicon.ico">
		 <!-- 글꼴 -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
        <!-- css -->
		<link rel="stylesheet" type="text/css" href="/css/view/payment_members_for_window_style.css"/>
        <!-- 우편번호 검색 팝업-->
        <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
        <!-- javascript -->
        <script type="text/javascript" src="/js/payment_members_js.js"></script>       
	</head>
	<body>
		<jsp:include page="/WEB-INF/layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor"/>
	</jsp:include>
	<% 
		//멤버정보를 받아와서 이름, 연락처, 이메일, 포인트를 뿌려줌.
     	MemberDTO member=(MemberDTO)session.getAttribute("loginUser");
		String name = member.getMember_name(); //이름 가져오기
   		String phone = member.getMember_telnum(); //연락처 가져오기
   		String email = member.getMember_email(); //이메일 가져오기
   		int point = member.getMember_point(); //포인트 가져오기
   		String addr = member.getMember_address(); //주소 가져오기
   		
   		//전화번호 구분짓기
   		String phone1 = phone.substring(0, 3); // 첫 번째 input 칸에 입력되는 값
		String phone2 = phone.substring(3, 7); // 두 번째 input 칸에 입력되는 값
		String phone3 = phone.substring(7);   // 세 번째 input 칸에 입력되는 값
   		
   		ArrayList<CartDTO> cartList = (ArrayList<CartDTO>)request.getAttribute("CartList");
   		ArrayList<ProductDTO> productList = (ArrayList<ProductDTO>)request.getAttribute("CartProductList");
   		
   		/* //장바구니 정보를 받아오기
   		CartDTO cart = (CartDTO)session.getAttribute("cart");
   		String size = cart.getSize(); //사이즈 정보 가져오기
   		String color = cart.getColor(); //색상 정보 가져오기 */
   		
   		/* //상품 정보 가져오기
   		ProductDTO product = (ProductDTO)session.getAttribute("product");
   		int price = product.getProduct_price(); */
    %>
    


		<h1 class="checkout">Checkout</h1>
		<hr class="line1"/>
		<form>
			<div class="user_order_info1">
				<h3 >주문정보</h3>
				<label id="title_name" for="name">이름</label>
				<input type="text" id="user_name" name="user_name" value="<%= name %>"><br/>
				
				<label id="title_phone_number" for="phone_number">연락처</label>
				<input type="text" id="phone_number1" name="phone_number1" maxlength="3" value="<%= phone1 %>">
				<input type="text" id="phone_number2" name="phone_number2" maxlength="4" value="<%= phone2 %>">
				<input type="text" id="phone_number3" name="phone_number3" maxlength="4" value="<%= phone3 %>"><br/>
				
				<label id="title_email" for="email">이메일</label>
				<input type="email" id="user_email" name="user_email" value="<%= email %>"><br/>
			</div>
		</form>
		
		<hr class="line2"/>
		<form>
			<div class="user_order_info2">
				<div class="shipping_container">
					<h3>배송정보</h3>
  					<div>
    					<input type="checkbox" id="shipping" onchange="copyBillingToShipping()">
   						<label for="shipping">주문정보와 동일</label>
   					</div>
				</div>
				<div>
					<label id="title_name" for="shipping_user_name">이름</label>
					<input type="text" id="shipping_user_name"><br/>
					
					<label id="title_phone_number" for="phone_number">연락처</label>
					<input type="text" id="shipping_phone_number1" name="shipping_phone_number1" maxlength="3">
					<input type="text" id="shipping_phone_number2" name="shipping_phone_number2" maxlength="4">
					<input type="text" id="shipping_phone_number3" name="shipping_phone_number3" maxlength="4"><br/>
					
					<label id="title_phone_number_additional" for="phone_number_additional">추가 연락처</label>
					<input type="text" id="phone_number_additional" name="phone_number_additional" maxlength="3">
					<input type="text" id="phone_number_additional" name="phone_number_additional" maxlength="4">
					<input type="text" id="phone_number_additional" name="phone_number_additional" maxlength="4"><br/>
					<!-- 배송지선택 체크박스 만들기 -->
					<div class="last_delivery_address">
						<label id="select_address" for="select_address">배송지선택</label>
						<input type="checkbox" id="home" onclick="handleCheckboxClick(this)">
	   					<label for="home">자택</label>
	   					<input type="checkbox" id="company" onclick="handleCheckboxClick(this)">
	   					<label for="company">회사</label>
	   					<input type="checkbox" id="last_delivery" onclick="handleCheckboxClick(this), handleCheckboxClicka(checkbox)">
	   					<label for="last_delivery">최근 배송지</label>
	   					<a href="/addplace" target="_blank">배송지목록</a>
	   					<input type="checkbox" id="new_delivery" onclick="handleCheckboxClick(this)">
	   					<label for="new_delivery">신규 배송지</label>
   					</div>
					<label id="title_address" for="address">주소</label>
	      			<input type="text" id="address_code1" name="address_code1" maxlength="5" readonly>
	      			<button id="post_button" type="button" value="<%= addr %>" onclick="searchAddress(), searchAddressHandler()">우편번호 검색</button><br/>
	      			<label id="empty_space" for="address">  </label>
	      			<input type="text" id="address_code2" name="address_code2" readonly><br/>
	      			<label id="empty_space" for="address">  </label>
	      			<input type="text" id="remaining_address" name="remaining_address" placeholder="나머지 주소 입력"><br/>
      				<label id="title_shipping_request" for="shipping_request">배송요청사항</label>
      				<input type="text" id="shipping_request" name="shipping_request"><br/>
				</div>
			</div>
		</form>
		<hr class="line3"/>
		 <form method="POST">
        	<div class="coupon_reward">
            <div class="coupon_reward_container">
                <h3>쿠폰/적립금 사용</h3>
                <label id="title_reserves" for="reserves">적립금</label>
                <input type="tel" id="reserves" name="reserves" form="order_form" autocomplete="off" size="7" class="MS_input_txt form-textbox" value="0" onkeyup="reservecheck('2900')" data-okreserve="2900" onblur="getUseableMoney();" style="background: rgb(255, 255, 255);">

                <label class="textbox-button">
                <input id="reserve_box" type="checkbox" name="all_check_reserve" onclick="useAllReserves()">모두 사용</label>

                <span class="available-amount">보유 적립금
                <input type="tel" id="okreserve" name="okreserve" form="order_form" autocomplete="off" size="7" class="MS_input_txt" value="<%=point %>" readonly="">원</span>
            </div>
        </div>
    </form>
		<hr class="line4"/>
		<form>
			<div class="user_order_info3">
				<h3>결제정보</h3>
				<label id="payment_method" for="payment_method">결제방법</label>
			
				<input type="checkbox" id="kakaopay" name="payment_method" value="kakaopay" onclick="handleCheckboxChange1()">
	   			<label for="kakaopay">카카오페이(kakaopay)</label><br/>
   			
   				<!--  -->
   				<input type="checkbox" id="bankbook" name="payment_method" value="bankbook" onclick="handleCheckboxChange1()"  onchange="toggleSelect()">
   				<label for="bankbook">무통장입금</label><br/>
   				<div id="select-container">
					<select id="dropdown1" name="dropdown1" style="display: none;">
						<option value="select">입금계좌 선택</option>
						<option value="woori_bank">우리은행 1002-111-222222</option><br/>
					</select><br/>
				</div>
				<input type="checkbox" id="credit_card" name="payment_method" value="credit_card" onclick="handleCheckboxChange1()">
   				<label for="credit_card">신용카드</label><br/>
   				
   				<input type="checkbox" id="mobile_payment" name="payment_method" value="mobile_payment" onclick="handleCheckboxChange1()">
   				<label for="mobile_payment">휴대폰 결제</label><br/>
   				
   				<div id="cash_receipts_container">
	   				<label id="cash_receipts" for="cash_receipts">현금영수증</label>
	   				
	   				<input type="checkbox" id="cash_receipts_no" name="cash_receipts" value="no" onclick=" handleCheckboxChange2(), handleCheckboxChange3()">
	   				<label for="cash_receipts_no">발급 안 함</label><br/>
	   				
	   				<input type="checkbox" id="cash_receipts_yes" name="cash_receipts" value="yes" onclick=" handleCheckboxChange2(), handleCheckboxChange3()">
	   				<label for="cash_receipts_yes">발급</label><br/>
	   				
	   				<select id="dropdown2" name="dropdown2">
						<option value="phone_number">핸드폰 번호</option>
						<option value="business_number">사업자 번호</option>
						<option value="revenue">국세청 현금영수증 카드</option><br/>
					</select><br/>
					<div id="phone_number_container" style="display: none;">
						<input type="text" id="phone_number" name="phone_number">
						<input type="text" id="phone_number" name="phone_number">
						<input type="text" id="phone_number" name="phone_number"><br/>
					</div>
					<div id="business_number_container" style="display: none;">
						<input type="text" id="business_number" name="business_number">
						<input type="text" id="business_number" name="business_number">
						<input type="text" id="business_number" name="business_number">
						<input type="text" id="business_number_company_name" name="business_number_company_name" placeholder="업체명"><br/>
					</div>
					<div id="revenue_container" style="display: none;">
						<input type="text" id="revenue_number" name="revenue_number">
						<input type="text" id="revenue_number" name="revenue_number">
						<input type="text" id="revenue_number" name="revenue_number">
						<input type="text" id="revenue_number_last" name="revenue_number_last"><br/>
					</div>
   				</div>
			</div>
		</form>
		<hr class="line5"/>
		<form id="order_form" method="POST">
			<div class="checkout_summary">
				<h3>주문요약 및 결제</h3>
				<ul>
			<%
				int totalprice = 0;
				if (cartList != null) {
					for (int i = 0; i < cartList.size(); i++) {
						CartDTO cart = cartList.get(i);
						ProductDTO product = productList.get(i);

						point = 0;
						String all_check_reserve = request.getParameter("all_check_reserve");
						if (all_check_reserve == null) {
							totalprice += product.getProduct_price() * cart.getCart_quantity();
						} else {
							point = Integer.parseInt(all_check_reserve);
							totalprice += product.getProduct_price() * cart.getCart_quantity() - point;
						}

						
			%>
		            <li class="image">
		                <img src="<%=product.getProduct_image2() %>" width="80px;" height="80px;">
		            </li>
		            <li class="product_info">
		                <h4><%=product.getProduct_name()%> x <%=cart.getCart_quantity()%></h4> 
		                <div class="product-option">컬러 : <%=cart.getColor() %> , 사이즈 : <%=cart.getSize() %> </div>
		                <h4 class="price"><%=product.getProduct_price() %> 원</h4>
		            </li>
		     <% 
	            	}
	        	}
        	 %>
				</ul>
				<hr class="line6"/>
				<div class="pay_summary">
					<div class="summary_list">
						<div class="summary_item_subtotal">
							<div class="label">주문금액 
								<span class="product_price" price="DB"><%= totalprice %>원</span>
							</div>
						<div class="summary_item_shipping">
							<div class="label">배송비
								<span class="delivery_price" price="DB">무료</span>
							</div>
						</div>
						<div class="summary_discount">
							<div>
								<div class="lable">할인
									<span class="sale_price">-<%=point %></span>
									 <span class="used-reserves"></span>
								</div>
							</div>
						</div>
						<div class="summary_additional">
							<div class="lable_exception">추가금액
								<span class="additional_price" price="DB">0원</span>
							</div>
						</div>
						</div>
					</div>
				
				</div>
			</div>
			<hr class="line7"/>
				<div class="total_pay_summary">
					<div class="summary_list2">
						<div class="summary_total">
							<div class="lable">총 결제금액
								<span class="total_price" price="DB"><%=totalprice %>원</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="last_checkout">
					<div class="checkout-agreement">
                    	<label><input type="checkbox" id="pay_agree" name="pay_agree" form="order_form" class="agree_terms"> 모든 주문, 결제정보를 확인하였으며 진행에 동의합니다.</label>
                    </div>
				</div>
				<div> 
					<button type="submit" class="payment_button" onclick="submitForm(event)"><a href="/" >결제하기</a></button>
				</div>
		</form>
		<jsp:include page="/WEB-INF/layout/footer.jsp"/>
	</body>	
	<script type="text/javascript">
			//최근배송지 체크박스를 클릭하면 최근 배송지가 address_code2로 넘어감
	        var addr = " <%=addr %>" ; //잘 뜨다가 왜 또 안 뜨는거지...
	
	        function handleCheckboxClicka(checkbox) {
	            if (checkbox.id === "last_delivery" && checkbox.checked) {
	                document.getElementById("address_code2").value = addr;
	            } else {
	                document.getElementById("address_code2").value = "";
	            }
	        }
		</script>	
</html>