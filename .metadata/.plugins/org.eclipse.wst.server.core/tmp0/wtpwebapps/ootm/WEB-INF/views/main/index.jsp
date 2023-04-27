<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="/images/favicon.ico">

        <!-- 글꼴 -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
        
        
        <!-- CSS -->
        
        <link rel="stylesheet" type="text/css" href="/web-component/carousel/carousel.css"/>
        <link rel="stylesheet" type="text/css" href="/web-component/hoverbox/hoverbox.css"/>
        <link rel="stylesheet" type="text/css" href="/css/reset.css"/>
        <link rel="stylesheet" type="text/css" href="/css/view/index.css"/>
        
        
        
        <title>OOTM - 이달의 착장</title>
    </head>

    <body>
		<jsp:include page="/WEB-INF/layout/header.jsp">
			<jsp:param value="false" name="logoDark"/>
			<jsp:param value="true" name="logoHoverDark"/>
			<jsp:param value="black" name="menuBtnColor"/>
		</jsp:include>

		<jsp:include page="./main-section1.jsp"/>
        <jsp:include page="./main-section2.jsp"/>
        <jsp:include page="./main-section3.jsp"/>
        <jsp:include page="./main-section4.jsp"/>
        
        <jsp:include page="/WEB-INF/layout/footer.jsp"/>

        <script type="text/javascript" src="/js/index.js"></script>
        <script type="text/javascript" src="/web-component/carousel/carousel.js"></script>
        <script type="text/javascript" src="/web-component/hoverbox/hoverbox.js"></script>
    </body>


</html>