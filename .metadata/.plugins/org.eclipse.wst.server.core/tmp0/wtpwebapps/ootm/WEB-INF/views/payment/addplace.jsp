<%@page import="kr.team3.ootm.dao.cart.CartDTO"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>최근 배송지 검색</title>
		<link rel="stylesheet" type="text/css" href="/css/view/addplace_style.css">
	</head>
	<body>
		<%
			MemberDTO member=(MemberDTO)session.getAttribute("loginUser");
			String addr = member.getMember_address();
		%>
		<div class="popup">
			<div class="tab-wrap">
	        	<div class="title-box">최근 배송지</div>
	        </div>
	        <div class="shipping_details">
           		<form name="form_past_list" method="post">
                	<div class="none-ad">
                		<%if(addr != null) {%>
                			<p><%=addr %></p>
                		<%} 
                		else {
                		%>
                			<p>최근 배송지 내역이 없습니다.</p>
                		<%} %>
            		</div>
            	</form>
	        </div>
	        <div class="btn-wrap">
	            <div>
	            	<button><a href="/payment" class="btn-white">닫기</a></button>
	            </div>
           	</div>
		</div>
	</body>
</html>