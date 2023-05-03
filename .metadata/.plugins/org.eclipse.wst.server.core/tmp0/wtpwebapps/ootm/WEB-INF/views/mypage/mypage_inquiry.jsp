<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@page import="kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO"%>
<%@page import="kr.team3.ootm.dao.inquiry_post.InquiryPostDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<InquiryPostDTO> inquiryList = (ArrayList<InquiryPostDTO>)request.getAttribute("inquiryList");
	ArrayList<InquiryProductPostDTO> inquiryProductList = (ArrayList<InquiryProductPostDTO>)request.getAttribute("inquiryProductList");
	boolean noInquiry = ( inquiryList.size() + inquiryProductList.size() ) <= 0;
	
	String memberName = ((MemberDTO)session.getAttribute("loginUser")).getMember_name();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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


/* 임시추가 */
.testheader{
    border-bottom: 1px solid #dcdcdc;
    padding: 20px 0;
    position: relative;
    display: flex;
    justify-content: space-between;
}
.test{
	border-bottom: 1px solid #dcdcdc;
    padding: 20px 0;
    position: relative;
    display: flex;
    justify-content: space-between;
    }
/* 임시추가 */
</style>
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
					<li data-page-target="wishlist"><a
						href="/mypage/wishlist">위시리스트</a></li>
					<li data-page-target="coupons"><a
						href="/mypage/coupon">쿠폰</a></li>
					<li data-page-target="points"><a href="/mypage/reserve">적립금</a></li>
					<li data-page-target="balance"><a href="/mypage/deposit">예치금</a></li>
					<li data-page-target="support" class="current"><a href="/mypage/inquiry">문의내역</a></li>
				</ul>
			</div>
			<div class="page-content">
				<div class="section-title">
					<h4><%=memberName %>님의 문의 내역입니다.</h4>
				</div>
				<%if(noInquiry){%>
					<div class="section page-list table-list">
						<div class="empty-list">문의 내역이 없습니다.</div>
					</div>
				<%}else{%>
					<div class="section page-list point-list">
						<div class="list-header list-row testheader">
							<div style="width:10%;" class="item date">번호</div>
							<div style="width:80%;" class="item detail">제목</div>
							<div style="width:10%;" class="item balance">날짜</div>
						</div>
						<%for(InquiryPostDTO inq : inquiryList){%>
							<div class="list-row test">
								<div style="width:10%;" class="item date"><%=inq.getInquiry_post_id()%></div>
								<div style="width:80%;" class="item detail"><%=inq.getInquiry_post_title()%></div>
								<div style="width:10%;" class="item balance"><%=inq.getInquiry_post_regdate()%></div>
							</div>
						<%}%>
						<%for(InquiryProductPostDTO inq : inquiryProductList){%>
							<div class="list-row test">
								<div style="width:10%;" class="item date"><%=inq.getInquiry_product_post_id()%></div>
								<div style="width:80%;" class="item detail"><%=inq.getInquiry_product_post_title()%></div>
								<div style="width:10%;" class="item balance"><%=inq.getInquiry_product_post_regdate()%></div>
							</div>
						<%}%>
					</div>
				<%}%>
			</div>
		</div>
	</div>
	<div class="footer">
		<jsp:include page="/WEB-INF/layout/footer.jsp"/>
	</div>
</body>
</html>