<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록 페이지</title>


<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Rock+Salt&family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">


<link rel="icon" href="/images/favicon.ico">

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/reset.css" />
<link rel="stylesheet" type="text/css" href="/css/test.css" />
<link rel="stylesheet" type="text/css" href="/css/view/product.css">

<!-- jQuery -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
</head>
<body>
	<!-- 헤더 -->
	<jsp:include page="../../layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor"/>
	</jsp:include>
	<!-- 애니메이션 outer -->
	<jsp:include page="./product-section1.jsp"/>
	<!-- 카테고리 -->

	<!-- 상품전체 테이블 -->
	<jsp:include page="./product-section2.jsp"/>
	<div class="product-list">
		<jsp:include page="./product-section3.jsp"/>
		<!-- 상품 개별테이블 -->
		<jsp:include page="./product-section4.jsp"/>
	</div>
	<jsp:include page="/WEB-INF/layout/footer.jsp"/>

	<script src="/js/product.js"></script>
</body>
</html>
