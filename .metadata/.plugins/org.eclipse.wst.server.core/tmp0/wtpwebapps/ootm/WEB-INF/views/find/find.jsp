<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">

<link rel="icon" href="/images/favicon.ico">

<!-- CSS -->
<link rel="stylesheet" type="text/css"
	href="/component/header/header.css" />
<link rel="stylesheet" type="text/css"
	href="/component/footer/footer.css" />
<link rel="stylesheet" type="text/css" href="/css/reset.css" />
<link rel="stylesheet" type="text/css" href="/css/test.css" />
<link rel="stylesheet" type="text/css" href="/css/view/find.css" />

<!-- jquery -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
</head>
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
	<div class="container">
		<p class="head">Find my account</p>
		<div class="find-sub">
			<h4>아이디를 잊으셨나요?</h4>
			<div class="find-radio">
				<input type="radio" class="find-sub1" name="find-id" value="email">이메일로
				찾기 <input type="radio" class="find-sub2" name="find-id"
					value="phone">핸드폰번호로 찾기<br />
			</div>

			<input type="text" id="name-id" name="name" placeholder="이름"><br />
			<input type="text" id="email-id" name="email" placeholder="이메일"><br />
			<input type="submit" id="find-id" value="아이디 찾기">
		</div>
		<div class="find-sub">
			<h4>비밀번호를 잊으셨나요?</h4>
			<div class="find-radio">
				<input type="radio" class="find-sub3" name="find-pass" value="email"
					placeholder="아이디">이메일로 찾기 <input type="radio"
					class="find-sub4" name="find-pass" value="phone">핸드폰번호로
				찾기<br />
			</div>
			<input type="text" id="name-pass" name="id" placeholder="아이디"><br />
			<input type="text" id="email-pass" name="email" placeholder="이메일"><br />
			<input type="submit" id="replace-pass" value="임시 비밀번호 발급">
		</div>
		<a href="/login" class="login-page"><h2>로그인 페이지로 돌아가기</h2></a>
	</div>
	<!-- 푸터 -->
	<jsp:include page="/WEB-INF/layout/footer.jsp"/>
	<script src="/js/find.js"></script>
	<script src="/component/hoverbox/hoverbox.js"></script>
</body>
</html>