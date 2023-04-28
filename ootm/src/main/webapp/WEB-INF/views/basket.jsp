<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" href="/images/favicon.ico">
<title>장바구니</title>

<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/reset.css" />
<link rel="stylesheet" type="text/css" href="/css/view/basket.css" />
<link rel="stylesheet" type="text/css"
	href="/component/hoverbox/hoverbox.css" />
</head>

<body>
	<jsp:include page="../layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor"/>
	</jsp:include>

	<section id="basketSection">
		<div class="basketOuter">
			<div class="basketTitleDiv">
				<h1>Shopping Bag</h1>
			</div>
			<div class="basketForm">
				<div class="basketDeleteDiv">
					<span>✖</span>
				</div>
				<div class="basketItemImgDiv">
					<img
						src="http://www.everfree.co.kr/shopimages/manish/014003000506.jpg?1609143478">
				</div>
				<div class="basketItemDescDiv">
					<h1>지퍼조거 팬츠 9077</h1>
					<h3>컬러: 블랙, 사이즈:L</h3>
				</div>
				<div class="basketItemAmount">
					<div class="amountMinusBtn amountBtn">-</div>
					<input type="number" name="amount">
					<div class="amountPlusBtn amountBtn">+</div>
				</div>
				<div class="basketItemPriceDiv">
					<h1>70000원</h1>
				</div>
			</div>
			<div class="basketForm">
				<div class="basketDeleteDiv">
					<span>✖</span>
				</div>
				<div class="basketItemImgDiv">
					<img
						src="http://www.everfree.co.kr/shopimages/manish/007001000519.jpg?1647490141">
				</div>
				<div class="basketItemDescDiv">
					<h1>조지아 나염 무드 맨투맨</h1>
					<h3>컬러: 버건디, 사이즈:Free</h3>
				</div>
				<div class="basketItemAmount">
					<div class="amountMinusBtn amountBtn">-</div>
					<input type="number" name="amount">
					<div class="amountPlusBtn amountBtn">+</div>
				</div>
				<div class="basketItemPriceDiv">
					<h1>37000원</h1>
				</div>
			</div>
			<div id="basketSummaryDiv">
				<p class="infoP">5만원 이상 구매시 무료배송</p>
				<div id="basketSummaryListDiv">
					<div id="basketSubTotalDiv" class="summaryList">
						<p class="label">주문 금액</p>
						<p class="value">107000원</p>
					</div>
					<div id="basketShippingDiv" class="summaryList">
						<p class="label">배송비</p>
						<p class="value">무료</p>
					</div>
					<hr noshade="true">
					<div id="basketTotalDiv" class="summaryList">
						<h1 id="totalLabel" class="label">합계</h1>
						<h1 id="totalValue" class="value">107000원</h1>
					</div>
					<div onclick="location.href='/payment'" id="basketCheckOutBtn">
						<span>CHECK OUT</span>
					</div>
				</div>
			</div>
		</div>
	</section>

	<jsp:include page="../layout/footer.jsp" />
</body>
</html>