<%@page import="util.Utils"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) request.getAttribute("searchResult");
int count = list.size();
%>
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
	<jsp:include page="/WEB-INF/layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor" />
	</jsp:include>

	<section id="searchResultSection">
		<div class="searchPageOuter">
			<form action="/search" id="searchPageForm" name="searchPageForm">
				<h1>#</h1>
				<input onkeydown="" type="text" id="searchPageInput" name="keyword" />
				<div id="searchformOutline">
					<p>검색어 입력 후 엔터</p>
				</div>
			</form>

			<div id="searchResultDiv">
				<p id="searchResCountText">
					검색어와 관련된
					<%=count%>개의 상품을 찾았습니다.
				</p>
				<span onclick="focusToSearchBar()" class="anotherSearch">다른
					검색어로 찾기</span>

				<div id="searchResultTable">
					<%for(ProductDTO dto : list){
						String price = Utils.priceDot(dto.getProduct_price());
					%>
						<div onclick="location.href = '/product-detail?product_id=<%=dto.getProduct_id()%>'" class="searchResItemDiv">
							<hoverbox-component class="searchResProduct">
								<div class="beforeBox"
									style="background-image: url(<%=dto.getProduct_image2()%>);"></div>
								<div class="afterBox">
									<img style="width:100%; height:100%;"
										src="<%=dto.getProduct_image() %>">
								</div>
							</hoverbox-component>
							<div class="searchResDesc">
								<h1><%=dto.getProduct_name()%></h1>
								<h2><%=price%> 원</h2>
								<h3>Free / 3 Colors</h3>
							</div>
						</div>
					<%}%>
				</div>
			</div>
		</div>
	</section>

	<jsp:include page="/WEB-INF/layout/footer.jsp" />


	<script src="/js/searchPage.js"></script>
	<script src="/web-component/hoverbox/hoverbox.js"></script>
</body>

</html>