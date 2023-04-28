<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" href="/images/favicon.ico">
<title>검색결과</title>
<link rel="icon" href="/images/favicon.ico">

<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/reset.css" />
<link rel="stylesheet" type="text/css" href="/css/view/search.css" />
<link rel="stylesheet" type="text/css"
	href="/web-component/carousel/carousel.css" />
<link rel="stylesheet" type="text/css"
	href="/web-component/hoverbox/hoverbox.css" />






<body>
	<jsp:include page="../layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
	</jsp:include>

	<section id="searchResultSection">
		<div class="searchPageOuter">
			<form action="/jsp/search.jsp" id="searchPageForm"
				name="searchPageForm">
				<h1>#</h1>
				<input onkeydown="" type="text" id="searchPageInput"
					name="searchPageInput" />
				<div id="searchformOutline">
					<p>검색어 입력 후 엔터</p>
				</div>
			</form>

			<div id="searchResultDiv">
				<p id="searchResCountText">검색어와 관련된 230개의 상품을 찾았습니다.</p>
				<span onclick="focusToSearchBar()" class="anotherSearch">다른
					검색어로 찾기</span>

				<div id="searchResultTable"></div>
			</div>
		</div>
	</section>

	<jsp:include page="../layout/footer.jsp" />


	<script src="/js/searchPage.js"></script>
	<script src="/web-component/hoverbox/hoverbox.js"></script>
</body>

</html>