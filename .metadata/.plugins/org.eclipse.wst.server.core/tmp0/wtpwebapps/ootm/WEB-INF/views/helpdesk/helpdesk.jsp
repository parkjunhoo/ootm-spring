<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String desk = (String)request.getAttribute("desk");
	if(desk == null) desk = "qna";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>OOTM : HELP DESK</title>
<link rel="icon" href="/images/favicon.ico">

<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/reset.css" />
<link rel="stylesheet" type="text/css" href="/css/view/helpdesk.css">

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
	
	<section id="helpdeskSection">
		<h1>Help Desk</h1>
		<div class="helpdeskViewDiv">
			<jsp:include page="./helpdeskAside.jsp"/>
			
			<% if(desk.equals("qna")){%>
			<jsp:include page="./qna.jsp"/>
			<%}%>
			<% if(desk.equals("notice")){%>
			<jsp:include page="./notice.jsp"/>
			<%}%>
			<% if(desk.equals("returns")){%>
			<jsp:include page="./returns.jsp"/>
			<%}%>
			<% if(desk.equals("inquiry")){%>
			<jsp:include page="./inquiry.jsp"/>
			<%}%>
			<% if(desk.equals("write")){%>
			<jsp:include page="./write.jsp"/>
			<%}%>
			<% if(desk.equals("read")){%>
			<jsp:include page="./read.jsp"/>
			<%}%>
			<% if(desk.equals("edit")){%>
			<jsp:include page="./edit.jsp"/>
			<%}%>
		</div>
	</section>
	
	
	<jsp:include page="/WEB-INF/layout/footer.jsp"/>
</body>
</html>