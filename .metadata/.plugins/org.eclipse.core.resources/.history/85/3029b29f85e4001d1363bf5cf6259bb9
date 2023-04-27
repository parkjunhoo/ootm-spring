<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>적립금 내역</title>
<!-- 글꼴 -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
<link rel="icon" href="/ootm/images/favicon.ico">
<link rel="stylesheet" href="../css/all.css" />
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
/* 컨텐츠 박스 */
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
h4 {
	font-size: 18px;
}
.page-content .section {
    margin-bottom: 50px;
}

.page-list .list-row {
    border-bottom: 1px solid #dcdcdc;
    padding: 20px 0;
    position: relative;
}
.page-list .list-header {
    padding-top: 0;
}
.point-list .list-row .date, .point-list .list-row .balance {
    width: 15%;
}
.point-list .list-row .detail {
    width: 70%;
}
.page-list .list-row:before, .page-list .list-row:after {
    content: '';
    display: table;
}
.page-list .list-row:after {
    clear: both;
}
.page-list .list-row .item {
    float: left;
    font-weight: 600;
}
.page-list .list-header .item {
    font-weight: 400;
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
/* 푸터고정 */
.footer{
	clear: both;
}
</style>
</head>
<body>
		<header-component logoDark="true" logoHoverDark="true"
			mTextColor="black" bgHoverColor="#F9F9F9" menuBtnColor="black"></header-component>

	<div class="all-margin">
		<div class="page-header">
			<h2>My Page</h2>
		</div>

		<div class="page-container mypage" data-page-title="orders">
			<!-- 왼쪽 -->
			<div class="page-navigation">
				<ul>
					<li data-page-target="dashboard"><a
						href="./mypage_main.jsp">마이페이지</a></li>
					<li data-page-target="orders"><a href="./mypage_orderlist.jsp">주문내역</a></li>
					<li data-page-target="wishlist"><a
						href="./mypage_wishlist.jsp">위시리스트</a></li>
					<li data-page-target="coupons"><a href="./mypage_coupon.jsp">쿠폰</a></li>
					<li data-page-target="points" class="current"><a href="./mypage_reserve.jsp">적립금</a></li>
					<li data-page-target="balance"><a href="./mypage_deposit.jsp">예치금</a></li>
					<li data-page-target="support"><a href="./mypage_inquiry.jsp">문의내역</a></li>
				</ul>
			</div>
			<div class="page-content">

				<div class="section-title">
					<h4>현재 보유중인 적립금은 2,900원 입니다.</h4>
				</div>

				<div class="section page-list point-list">
					<div class="list-header list-row">
						<div class="item date">변경일자</div>
						<div class="item detail">내역</div>
						<div class="item balance">적립금</div>
					</div>
					<div class="list-row">
						<div class="item date">2023-04-13</div>
						<div class="item detail">가입축하금입니다.</div>
						<div class="item balance">2,000원</div>
					</div>
					<div class="info-list">
						<ul>
							<li>상품 구매 적립금은 배송 완료 후 자동으로 적립됩니다.</li>
							<li>보유하신 적립금이 1,000원 이상일 경우, 5,000원 이상 주문 시 현금과 동일하게 사용하실 수
								있습니다.</li>
						</ul>
					</div>
				</div>

			</div>
		</div>
	</div>
	<div class="footer">
		<footer-component />
	</div>
	<script src="../component/header/header.js"></script>
	<script src="../component/footer/footer.js"></script>
</body>
</html>