<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
MemberDTO member = (MemberDTO)session.getAttribute("loginUser");
if(member==null) response.sendRedirect("/helpdesk/write");
%>
<div class="helpdeskContentDiv">

	<div class="deskTitle">
		<div class="inquiryTitleDiv">
			<div>
				<h3 onclick="location.href='/helpdesk/inquiry'" style="cursor:pointer;">&lt 문의게시판</h3>
			</div>
		</div>
	</div>
	
	<form method="post" action="/inquirypost/insert.do" id="inquiryWriteForm" name="inquiryWriteForm">
<!-- 		<div class="writeFormRowHalf">
			<p class="writeFormLabel">이름</p>
			<input class="InquirytextInput" type="text" name="inquiry_post_author"/>
		</div>
		<div class="writeFormRowHalf">
			<p class="writeFormLabel">글 비밀번호</p>
			<input class="InquirytextInput" type="text" name="inquiry_post_pass"/>
		</div> -->
		<input type="hidden" name="member_id"  value="<%=member.getMember_id() %>"/>
		<div class="writeFormRow">
			<p class="writeFormLabel">제목</p>
			<select form="inquiryWriteForm" id="inquiry_post_title" class="InquirytextInput" name="inquiry_post_title">
				<option value="입금/결제관련 문의">입금/결제관련 문의</option>
				<option value="배송관련 문의">배송관련 문의</option>
				<option value="교환/반품 문의">교환/반품 문의</option>
				<option value="상품관련 문의">상품관련 문의</option>
				<option value="기타 문의">기타 문의</option>
			</select >
		</div>
		
		<div class="writeFormRow">
			<p class="writeFormLabel">내용</p>
			<textarea class="InquirytextArea" form="inquiryWriteForm" name="inquiry_post_content"></textarea>
		</div>
<!-- 	<div class="writeFormRow">
			<p class="writeFormLabel">파일 첨부</p>
			<input class="InquirytextInput" type="text" name="file"/>
		</div> -->
		
		<div style="display:flex;" class="writeFormRow">
			<input type="submit" value="문의하기" id="inquirySubmit" name="inquirySubmit"/>
		</div>
	</form>
	
	
	
</div>