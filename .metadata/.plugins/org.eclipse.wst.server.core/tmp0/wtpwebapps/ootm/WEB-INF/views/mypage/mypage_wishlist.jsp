<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@page import="util.Utils"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="kr.team3.ootm.dao.wishlist.WishlistDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<ProductDTO> productList = (ArrayList<ProductDTO>) request.getAttribute("productList");

String memberName = ((MemberDTO) session.getAttribute("loginUser")).getMember_name();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 보관함</title>
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

.page-content .product-list {
	padding: 0;
}

.product-list .product {
	float: left;
	overflow: hidden;
	padding: 12px;
	position: relative;
	width: 16.666%;
}

.product-list .product .overview .image {
	text-align: center;
	margin-bottom: 25px;
	position: relative;
}

.product-list .product .overview .image .image-holder {
	background-color: #fff;
	background-size: cover;
	background-position: center center;
	background-repeat: no-repeat;
	width: 100%;
	height: 0;
	padding-top: 100%;
}

.product-list .product .overview .name {
	font-weight: 700;
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}

자바스크립트로 손보기 /* .product .remove-button {
    position: absolute;
    right: 10px;
    top: 10px;
    opacity: 0;
    transition: opacity .25s ease-out;
}
.product .remove-button:after {
    content: 'X';
    font-family: 'Ionicons';
    font-size: 20px;
}
 .product .remove-button:hover{
 	opacity: 1;
 } */  
.product .remove-button {
	position: absolute;
	right: 10px;
	top: 10px;
}
/* 푸터고정 */
.footer {
	clear: both;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor" />
	</jsp:include>


	<div class="all-margin">
		<div class="page-header">
			<h2>My Page</h2>
		</div>

		<div class="page-container mypage" data-page-title="orders">
			<!-- 왼쪽 -->
			<div class="page-navigation">
				<ul>
					<li data-page-target="dashboard"><a href="/mypage">마이페이지</a></li>
					<li data-page-target="orders"><a href="/mypage/orderlist">주문내역</a></li>
					<li data-page-target="wishlist"><a href="/mypage/wishlist"
						class="current">위시리스트</a></li>
					<li data-page-target="coupons"><a href="/mypage/coupon">쿠폰</a></li>
					<li data-page-target="points"><a href="/mypage/reserve">적립금</a></li>
					<li data-page-target="balance"><a href="/mypage/deposit">예치금</a></li>
					<li data-page-target="support"><a href="/mypage/inquiry">문의내역</a></li>
				</ul>
			</div>
			<div class="page-content">

				<div class="section-title">
					<h4><%=memberName%>님이 ♥를 누른 상품들입니다.
					</h4>
				</div>
				<div class="section recommendations">
					<div class="product-list">
						<div class="product">
							<a>
								<div class="overview">
									<ul>
										<%
										for (ProductDTO product : productList) {
											String price = Utils.priceDot(product.getProduct_price());
										%>
										<li
											onclick="location.href='/product-detail?product_id=<%=product.getProduct_id()%>'"
											class="image">
											<div class="image-holder"
												style="background-image: url('<%=product.getProduct_image2()%>');"></div>
										</li>
										<li class="name"><%=product.getProduct_name()%></li>
										<li class="price"><%=price%></li>
										<%
										}
										%>
									</ul>
								</div>
							</a> <a href="#삭제서블릿?" class="remove-button"></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer">
		<jsp:include page="/WEB-INF/layout/footer.jsp" />
	</div>
</body>
</html>