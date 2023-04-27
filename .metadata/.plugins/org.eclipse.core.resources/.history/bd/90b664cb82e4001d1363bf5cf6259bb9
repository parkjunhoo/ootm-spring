<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠폰 내역</title>

<!-- 글꼴 -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
        
<link rel="icon" href="/ootm/images/favicon.ico">
<link rel="stylesheet" href="/ootm/css/all.css" />
<link rel="stylesheet" type="text/css"
	href="/ootm/component/header/header.css" />
<link rel="stylesheet" type="text/css"
	href="/ootm/component/footer/footer.css" />
<style type="text/css">
.page-container {
	margin-top: 80px;
}

.page-navigation {
	float: left;
	margin-top: 52px;
	width: 250px;
}

.page-navigation ul li {
	font-size: 16px;
	padding-bottom: 15px;
}

.page-navigation ul li a {
	position: relative;
}

.page-navigation ul .current {
	font-weight: 700;
}

.page-navigation li a:after {
	background-color: #222;
	content: '';
	position: absolute;
	bottom: -5px;
	left: 0;
	width: 0;
	height: 1px;
	transition: width 0.25s ease-out;
}

.page-navigation li a:hover:after {
	width: 100%;
}
.page-content {
	float: right;
	width: calc(100% - 250px);
	min-height: 40vh;
}
.page-content .section-title {
    margin-top: 0;
    margin-bottom: 50px;
    border-top: 2px solid #222;
    padding-top: 50px;
    position: relative;
}
h4{
	font-size: 18px;
}
.page-content .section {
    margin-bottom: 50px;
}
.empty-list {
    border-top: 1px solid #dcdcdc;
    padding-top: 50px;
    font-size: 15px;
    color: #aaa;
}
.page-content .info-list {
    margin-top: 50px;
}
.page-content .info-list li {
    padding-left: 12px;
    padding-bottom: 5px;
    position: relative;
    line-height: 1.65;
}
.info-list li:before {
    content: '\00b7';
    font-size: 20px;
    position: absolute;
    top: -7px;
    left: 0;
}
.page-content .info-list a {
    font-weight: 600;
    margin: 0 5px;
}
/* 푸터고정 */
.footer {
	clear: both;
}
</style>
</head>
<body>
				<jsp:include page="/component/header/header.jsp">
			<jsp:param value="false" name="logoDark"/>
			<jsp:param value="true" name="logoHoverDark"/>
		</jsp:include>

	<div class="all-margin">
		<div class="page-header">
			<h2>My Page</h2>
		</div>

		<div class="page-container mypage" data-page-title="orders">
			<!-- 왼쪽 -->
			<div class="page-navigation">
				<ul>
					<li data-page-target="dashboard"><a href="./mypage_main.jsp">마이페이지</a></li>
					<li data-page-target="orders"><a href="./mypage_orderlist.jsp">주문내역</a></li>
					<li data-page-target="wishlist"><a
						href="./mypage_wishlist.jsp">위시리스트</a></li>
					<li data-page-target="coupons" class="current"><a
						href="./mypage_coupon.jsp">쿠폰</a></li>
					<li data-page-target="points"><a href="./mypage_reserve.jsp">적립금</a></li>
					<li data-page-target="balance"><a href="./mypage_deposit.jsp">예치금</a></li>
					<li data-page-target="support"><a href="./mypage_inquiry.jsp">문의내역</a></li>
				</ul>
			</div>
			<div class="page-content">

				<div class="section-title">
					<h4>서소영님의 쿠폰 내역입니다.</h4>
				</div>

				<div class="section page-list coupon-list">
					<div class="empty-list">보유중인 쿠폰이 없습니다.</div>
					<div class="info-list">
						<ul>
							<li>보유하신 쿠폰은 주문 시 선택하여 할인 또는 적립 받으실 수 있습니다.</li>
							<li>쿠폰에 따라 최소 주문금액 및 제한 상품이 있을 수 있습니다. 또한 사용기간이 만료된 쿠폰은 자동으로
								소멸됩니다.</li>
							<li>쿠폰 코드를 갖고 계신가요? <a href="#쿠폰등록하기?">쿠폰
									등록하기</a></li>
						</ul>
					</div>
				</div>

			</div>
		</div>
	</div>

	<div class="footer">
		<footer-component />
	</div>
	<script src="/ootm/component/header/header.js"></script>
	<script src="/ootm/component/footer/footer.js"></script>
</body>
</html>