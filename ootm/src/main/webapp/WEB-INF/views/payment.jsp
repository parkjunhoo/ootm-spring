<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>이달의 룩 - 결제페이지</title>
		<!-- 파비콘 -->
		<link rel="icon" href="/images/favicon.ico">
		 <!-- 글꼴 -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
        <!-- css -->
		<link rel="stylesheet" type="text/css" href="/css/view/payment_non_members_for_window_style.css"/>
        
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
		<h1 class="checkout">Checkout</h1>
		<hr class="line1"/>
		<form>
			<div class="user_order_info1">
				<h3 >주문정보</h3>
				<label id="title_name" for="name">이름</label>
				<input type="text" id="name" name="name"><br/>
				
				<label id="title_phone_number" for="phone_number">연락처</label>
				<input type="text" id="phone_number" name="phone_number">
				<input type="text" id="phone_number" name="phone_number">
				<input type="text" id="phone_number" name="phone_number"><br/>
				
				<label id="title_email" for="email">이메일</label>
				<input type="email" id="email" name="email"><br/>
			</div>
		</form>
		
		<hr class="line2"/>
		<form>
			<div class="user_order_info2">
				<div class="shipping-container">
					<h3>배송정보</h3>
  					<div>
    					<input type="checkbox" id="shipping">
   						<label for="shipping">주문정보와 동일</label>
   					</div>
				</div>
				<div>
					<label id="title_name" for="name">이름</label>
					<input type="text" id="name" name="name"><br/>
					
					<label id="title_phone_number" for="phone_number">연락처</label>
					<input type="text" id="phone_number" name="phone_number">
					<input type="text" id="phone_number" name="phone_number">
					<input type="text" id="phone_number" name="phone_number"><br/>
					
					<div class="phone_number_additional_box">
						<label id="title_phone_number_additional" for="phone_number_additional">추가 연락처</label>
						<input type="text" id="phone_number_additional" name="phone_number_additional">
						<input type="text" id="phone_number_additional" name="phone_number_additional">
						<input type="text" id="phone_number_additional" name="phone_number_additional"><br/>
					</div>
					<label id="title_address" for="address">주소</label>
      				<input type="text" id="address_code1" name="address">
      				<button id="post_button" type="submit">우편번호 검색</button><br/>
      				<label id="empty_space" for="address">  </label>
      				<input type="text" id="address_code2" name="address"><br/>
      				<label id="empty_space" for="address">  </label>
      				<input type="text" id="remaining_address" name="address" placeholder="나머지 주소 입력"><br/>
      				<label id="title_shipping_request" for="shipping_request">배송요청사항</label>
      				<input type="text" id="shipping_request" name="shipping_request"><br/>
				</div>
			</div>
		</form>
		<hr class="line3"/>
		<form>
			<div class="user_order_info3">
				<h3>결제정보</h3>
				<label id="payment_method" for="payment_method">결제방법</label>
				
				<input type="checkbox" id="kakaopay">
   				<label for="kakaopay">카카오페이(kakaopay)</label><br/>
   				
   				<input type="checkbox" id="bankbook">
   				<label for="bankbook">무통장입금</label><br/>
				<select id="dropdown" name="dropdown">
					<option value="select">입금계좌 선택</option>
					<option value="woori_bank">우리은행 1002-111-222222</option><br/>
				</select><br/>
				
				<input type="checkbox" id="credit_card">
   				<label for="credit_card">신용카드</label><br/>
   				
   				<input type="checkbox" id="realtime_bank">
   				<label for="realtime_bank">실시간 계좌이체</label><br/>
   				
   				<input type="checkbox" id="escrow">
   				<label for="escrow">에스크로</label><br/>
   				
   				<input type="checkbox" id="mobile_payment">
   				<label for="mobile_payment">휴대폰 결제</label><br/>
   				
   				<div id="cash_receipts_container">
	   				<label id="cash_receipts" for="cash_receipts">현금영수증</label>
	   				
	   				<input type="checkbox" id="cash_receipts_no">
	   				<label for="cash_receipts_no">발급 안 함</label><br/>
	   				
	   				<input type="checkbox" id="cash_receipts_yes">
	   				<label for="cash_receipts_yes">발급</label><br/>
	   				
	   				<select id="dropdown" name="dropdown">
						<option value="phone_number">핸드폰 번호</option>
						<option value="business_number">사업자 번호</option>
						<option value="revenue">국세청 현금영수증 카드</option><br/>
					</select><br/>
					<div id="phone_number_container">
						<input type="text" id="phone_number" name="phone_number">
						<input type="text" id="phone_number" name="phone_number">
						<input type="text" id="phone_number" name="phone_number"><br/>
					</div>
					<div id="business_number_container">
						<input type="text" id="business_number" name="business_number">
						<input type="text" id="business_number" name="business_number">
						<input type="text" id="business_number" name="business_number">
						<input type="text" id="business_number_company_name" name="business_number_company_name" placeholder="업체명"><br/>
					</div>
					<div id="revenue_container">
						<input type="text" id="revenue_number" name="revenue_number">
						<input type="text" id="revenue_number" name="revenue_number">
						<input type="text" id="revenue_number" name="revenue_number">
						<input type="text" id="revenue_number_last" name="revenue_number_last"><br/>
					</div>
   				</div>
			</div>
		</form>
		<hr class="line4"/>
		<form>
			<div class="privacy">
				<h3>비회원 구매동의</h3>
				<h5>개인정보 수집·이용</h5>
				<table class="privacy_table">
					<colgroup>
						<col width="33.33%">
						<col width="33.33%">
						<col width="33.33%">	
					</colgroup>
					<thead>
						<tr>
							<th scope="col">목적</th>
							<th scope="col">항목</th>
							<th scope="col">보유기간</th>
						</tr>
					</thead>
					<tbody>
						<tr class="privacy1">
							<td>주문자 정보 확인, 주문 내역 안내, 주문 내역 조회</td>
							<td>주문자 정보(이름, 연락처, 이메일)</td>
							<td id="bold" rowspan="4">주문일로부터 90일까지 보유하며, 관계 법령에 따라<br/> 5년간 보관</td>
						</tr>
						<tr class="privacy2">
	                        <td>상품 배송(구매/환불/취소/교환)을 위한 수취인 정보</td>
	                        <td>수취인 정보(이름, 연락처1, 연락처2, 주소)</td>                     
                   		</tr>
                   		<tr class="privacy3" style="display: table-row;">
	                        <td>무통장 결제 내역 확인을 위한 입금자명</td>
	                        <td>무통장 입금자명(미입력 시, 주문자명 사용)</td>                   
                   		</tr>
                   		<tr class="privacy4" style="display: table-row;">
	                        <td>현금영수증 발행</td>
	                        <td>휴대폰번호, 국세청 현금영수증 카드번호</td>                      
                    	</tr>				
					</tbody>
				</table>					
			</div>
		</form>
		<hr class="line5"/>
		<form>
			<div class="checkout_summary">
				<h3>주문요약 및 결제</h3>
				<ul>
					<li class="image">
						<img src="/images/pants.jpg"> <!-- DB에서 받아오기 -->
					</li>
					<li class="product_info">
						<h4>8036 버뮤다 카펜터 반밴딩 x 1</h4> 
						<div class="product-option">컬러 : 중청, 사이즈 : L</div>
						<h4 class="price">37,000원</h4>
					</li>
				</ul>
				<hr class="line6"/>
				<div class="pay_summary">
					<div class="summary_list">
						<div class="summary_item_subtotal">
							<div class="label">주문금액 
								<span class="product_price" price="DB">37,000원</span>
							</div>
						<div class="summary_item_shipping">
							<div class="label">배송비
								<span class="delivery_price" price="DB">무료</span>
							</div>
						</div>
						<div class="summary_discount">
							<div>
								<div class="lable">할인
									<span class="sale_price" price="DB">-0원</span>
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
				<hr class="line7"/>
				<div class="total_pay_summary">
					<div class="summary_list2">
						<div class="summary_total">
							<div class="lable">총 결제금액
								<span class="total_price" price="DB">37000원</span>
							</div>
						</div>
					</div>
				</div>
				<div class="last_checkout">
					<div class="checkout-agreement">
                    	<label><input type="checkbox" id="pay_agree" name="pay_agree" form="order_form" class="agree_terms" onclick="javascript_method()"> 모든 주문, 결제정보를 확인하였으며 진행에 동의합니다.</label>
                    </div>
				</div>
				<button class="payment_button"><a href="javascript:send();" class="button primary">결제하기</a></button>
			</div>
		</form>
	<jsp:include page="/WEB-INF/layout/footer.jsp"/>
	</body>		
</html>