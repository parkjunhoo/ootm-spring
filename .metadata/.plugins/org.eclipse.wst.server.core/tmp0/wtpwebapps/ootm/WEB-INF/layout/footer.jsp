<%@page import="util.LoginManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	boolean isLoggedIn = LoginManager.isLoggedIn(session);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="/css/layout/footer.css"/>
</head>
<body>
	<footer>
		<div class="footerOuter">
			<hr>
			<div class="footerContentDiv">
				<div class="footerContentLeftDiv">
					<div class="deskInfo">
						<p>
							문자 메세지 수신불가 / 카톡 상담, Q &amp; A 게시판 이용 <br> 10:00 AM ~ 6:30
							PM (Lunch time 12:00 AM ~ 1:00 PM) <br> 토,일요일 및 공휴일 휴무
						</p>
					</div>
					<div class="deskLinkDiv">
						<!-- <a href="/helpdesk/qna">개인정보취급방침
							<div class="footerTextUnderline"></div>
						</a><a href="/helpdesk?desk=qna">약관
							<div class="footerTextUnderline"></div> -->
						</a><a href="/helpdesk/qna">자주묻는질문
							<div class="footerTextUnderline"></div>
						</a><a href="/helpdesk/inquiry">문의게시판
							<div class="footerTextUnderline"></div>
						</a>
					</div>
				</div>
				<div class="footerContentRightDiv">
					<div class="footerMenuDiv">
						<h5>OOTM News</h5>
						<a href="/helpdesk/notice">유선 문의 불가 안내<span class="date">08.16</span></a><a
							href="/helpdesk/notice">2022년 8월 휴무 일정 안내<span class="date">07.27</span></a><a
							href="/helpdesk/notice">2022년 6월 휴무 일정 안내<span class="date">05.31</span></a>
					</div>
					<div class="footerMenuDiv">
						<h5>My Account</h5>
						<a <%if(isLoggedIn){%>href="/mypage"<%}else{%>href="/login"<%}%>>마이페이지</a>
						<a <%if(isLoggedIn){%>href="/mypage/orderlist"<%}else{%>href="/login"<%}%>>주문내역</a>
					</div>
					<div class="footerMenuDiv">
						<h5>Shipping &amp; Returns</h5>
						<a href="/helpdesk/inquiry">문의게시판</a>
						<a href="/helpdesk/returns">교환반품안내</a>
						<a target=”_blank” href="https://www.cjlogistics.com/ko/tool/parcel/reservation-return">CJ대한통운
							택배 반품접수</a>
					</div>
					<div style="display:flex; flex-direction: column; " class="footerIconMenu">
						<a href="https://ko-kr.facebook.com/">facebook</a>
						<a href="https://www.instagram.com/">instagram</a>
					</div>
				</div>
			</div>
			<div class="companyDescDiv">
				<ul>
					<li>상호 OOTM</li>
					<li>3조</li>
					<li>경기도 세종시 멀티캠퍼스 학원</li>
					<li>사업자등록번호 <a href="/">###-##-#####</a></li>
					<li>통신판매업신고번호 제####-@@@@-#### 호</li>
					<li>개인정보담당자 주지현 <a href="/">jhjoo0221@naver.com</a></li>
					<li>반품주소: ##### 경기도 세종시 5층 OOTM사</li>
					<li>입금계좌: 농협은행 ###-####-####-## 주지현(OOTM)</li>
				</ul>
				<p class="copyright">© 2023 OOTM, Inc. All rights reserved.</p>
			</div>
		</div>
	</footer>
</body>
</html>