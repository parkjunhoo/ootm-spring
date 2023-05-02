<%@page import="kr.team3.ootm.dao.inquiry_post.InquiryPostDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<InquiryPostDTO> postList =(ArrayList<InquiryPostDTO>)request.getAttribute("inquiryPostList");
%>
<div class="helpdeskContentDiv">

	<div class="deskTitle">
		<div class="inquiryTitleDiv">
			<div>
				<h3>문의게시판</h3>
				<h4>문의게시판은 본인이 작성한 글만 확인하실 수 있습니다.</h4>
			</div>
			<div onclick="location.href='/helpdesk/write'" class="inquiryWriteBtn">
				<p>문의하기</p>
			</div>
		</div>
	</div>
	
	<div class="helpTable">
	
			<div class="helpTableHead">
				<span class="boardNo">번호</span>
				<span class="title">제목</span>
				<span class="regdate">작성자</span>
			</div>
			
			<div class="helpTableBody">
				<span class="boardNo">></span>
				<span class="title">발송전 취소 시 콜센터 및 게시판으로 연락 부탁드립니다.</span>
				<span class="regdate"></span>
			</div>
			<div class="helpTableBody">
				<span class="boardNo">></span>
				<span class="title">무통장 주문시 안내사항</span>
				<span class="regdate"></span>
			</div>
			<%for(InquiryPostDTO dto :postList){ %>
			<div class="helpTableBody">
				<span class="boardNo"><%=dto.getInquiry_post_id() %></span>
				<a href="/helpdesk/read?id=<%=dto.getInquiry_post_id()%>" class="title"><%=dto.getInquiry_post_title() %></a>
				<span class="regdate"><%=dto.getMember_id()%></span>
			</div>
			<%} %>
	</div>
	
</div>