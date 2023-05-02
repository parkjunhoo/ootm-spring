<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>

<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">

<link rel="icon" href="/images/favicon.ico">

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/reset.css" />
<link rel="stylesheet" type="text/css" href="/css/test.css" />
<link rel="stylesheet" type="text/css" href="/css/view/login.css">


</head>
<body>
	<!-- 헤더 -->
	<jsp:include page="/WEB-INF/layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor"/>
	</jsp:include>

	<!-- 메인화면 -->

	<div class="login-box">
		<p class="login-sign">Sign In</p>
		<div class="login-table">
			<form method="post" action="/login.do">
				<input type="text" class="sub1" name="member_id" placeholder="아이디"><br />
				<input type="password" class="sub1" name="member_password" placeholder="비밀번호"><br />
				<input type="submit" id="sign-in" value="sign in">
			</form>
			<div class="login-channeling">
				<a href="/signup/term" class="login-channeling-naver">N</a> <a
					href="/signup/term" class="login-channeling-kakao">K</a> <a
					href="/signup/term" class="login-channeling-google">G</a>
			</div>
			<div class="find">
				<a class="find-pass" href="find">비밀번호 찾기</a>
			</div>
		</div>
	</div>
	<!-- 푸터 -->
	<jsp:include page="/WEB-INF/layout/footer.jsp"/>

</body>
</html>