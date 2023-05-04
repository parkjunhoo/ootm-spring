<%@page import="util.Utils"%>
<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지 메인</title>
<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">


<link rel="icon" href="/images/favicon.ico">
<link rel="stylesheet" href="/css/view/all.css" />

<style type="text/css">
/* 네비게이터 박스 css */
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

.account-menu {
	position: absolute;
	top: 55px;
	right: 0;
}

.account-menu a {
	font-weight: 500;
	margin-left: 20px;
}

.page-content .section {
	margin-bottom: 50px;
}

.account-summary {
	display: flex;
}

.account-summary .item {
	flex: auto;
}

.account-summary .item .label {
	margin-bottom: 10px;
}

.account-summary .item .label a:after {
	content: '>>';
	font-family: 'Ionicons';
	font-weight: 900;
	margin-left: 5px;
}

.account-summary .item .value {
	font-size: 28px;
	font-weight: 600;
}

.account-summary .membership-grade .value {
	font-size: 32px;
	font-weight: 700;
	color: #c0c4c4;
	position: relative;
	top: -3px;
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

/* 주문내역이 없습니다. */
.page-content .section {
	margin-bottom: 50px;
}

.empty-list {
	border-top: 1px solid #dcdcdc;
	padding-top: 50px;
	font-size: 15px;
	color: #aaa;
}

/* 푸터고정 */
.footer {
	clear: both;
}
</style>
</head>
<body>

	<!-- 세션에서 아이디 받아오기 -->
	<% 
	MemberDTO member=(MemberDTO)session.getAttribute("loginUser");
	String member_id=member.getMember_id();
	int point = member.getMember_point();
	String pointdot = Utils.priceDot(point);
	%>
	
	<jsp:include page="/WEB-INF/layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor"/>
	</jsp:include>

	<div class="all-margin">
		<div class="page-header">
			<h2>My Page</h2>
		</div>

		<div class="page-container mypage" data-page-title="orders">
			<!-- 왼쪽 -->
			<div class="page-navigation">
				<ul>
					<li data-page-target="dashboard" class="current"><a href="/mypage">마이페이지</a></li>
					<li data-page-target="orders"><a href="/mypage/orderlist">주문내역</a></li>
					<li data-page-target="wishlist"><a
						href="/mypage/wishlist">위시리스트</a></li>
					<li data-page-target="coupons"><a
						href="/mypage/coupon">쿠폰</a></li>
					<li data-page-target="points"><a href="/mypage/reserve">적립금</a></li>
					<li data-page-target="balance"><a href="/mypage/deposit">예치금</a></li>
					<li data-page-target="support"><a href="/mypage/inquiry">문의내역</a></li>
				</ul>
			</div>


			<div class="page-content">
				<!-- 첫번째 박스 -->
				<div class="section-title">
					<h4><%=member.getMember_name() %>님 안녕하세요!</h4>
					<div class="account-menu">
						<a href="/delete/member?member_id=<%=member_id %>">회원탈퇴</a> <a href="/logout.do?session<%=session%>">로그아웃</a>
					</div>
				</div>
				<div class="section">
					<div class="account-summary">
						<div class="item membership-grade">
							<div class="label">
								<a href="#">등급</a>
							</div>
							<div style="color:#b57a3e;" class="value" data-member-grade="">Bronze</div>
						</div>
						<div class="item">
							<div class="label">
								<a href="#">쿠폰</a>
							</div>
							<div class="value">0장</div>
						</div>
						<div class="item">
							<div class="label">
								<a href="#">적립금</a>
							</div>
							<div class="value"><%=pointdot %>원</div>
						</div>
						<div class="item">
							<div class="label">
								<a href="#">예치금</a>
							</div>
							<div class="value">0원</div>
						</div>
						<div class="item">
							<div class="label">
								<a href="#">누적주문금액</a>
							</div>
							<div class="value">0원</div>
						</div>
					</div>
					<div class="info-list">
						<ul>
							<li>평생회원 전환으로 Lifetime 등급이 되면 더 많은 혜택을 받으실 수 있습니다.</li>
						</ul>
					</div>
				</div>

				<div class="section-title">
					<h4>최근 주문</h4>
				</div>
				<div class="section page-list order-list">
					<div class="empty-list">주문내역이 없습니다.</div>
				</div>

				<div class="section-title">
					<h4>오늘 본 상품</h4>
				</div>
				<div class="section recommendations">
					<div class="product-list"></div>
				</div>

			</div>
		</div>
	</div>
	<div class="footer">
		<jsp:include page="/WEB-INF/layout/footer.jsp"/>
	</div>
</body>
</html>