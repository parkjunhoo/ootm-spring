<%@page import="kr.team3.ootm.dao.inquiry_post.InquiryPostDTO"%>
<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
MemberDTO member = (MemberDTO)session.getAttribute("loginUser");
if(member==null) response.sendRedirect("/helpdesk/edit");

InquiryPostDTO post = new InquiryPostDTO();

boolean pass = (boolean)request.getAttribute("pass");
if(pass){
	post = (InquiryPostDTO)request.getAttribute("post");
}


MemberDTO user = (MemberDTO)session.getAttribute("loginUser");
/* front단에서도 더블체크 */
if(!user.getMember_id().equals(post.getMember_id())){
	pass = false;
}
%>
<div class="helpdeskContentDiv">

	<div class="deskTitle">
		<div class="inquiryTitleDiv">
			<div>
				<h3 onclick="location.href='/helpdesk/inquiry'" style="cursor:pointer;">&lt 문의게시판</h3>
			</div>
		</div>
	</div>
	
	<form method="post" action="/inquirypost/update.do" id="inquiryWriteForm" name="inquiryWriteForm">
<!-- 		<div class="writeFormRowHalf">
			<p class="writeFormLabel">이름</p>
			<input class="InquirytextInput" type="text" name="inquiry_post_author"/>
		</div>
		<div class="writeFormRowHalf">
			<p class="writeFormLabel">글 비밀번호</p>
			<input class="InquirytextInput" type="text" name="inquiry_post_pass"/>
		</div> -->
		<input type="hidden" name="inquiry_post_id"  value="<%=post.getInquiry_post_id()%>"/>
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
			<textarea class="InquirytextArea" form="inquiryWriteForm" name="inquiry_post_content"><%=post.getInquiry_post_content()%></textarea>
		</div>
<!-- 	<div class="writeFormRow">
			<p class="writeFormLabel">파일 첨부</p>
			<input class="InquirytextInput" type="text" name="file"/>
		</div> -->
		
		<div style="display:flex;" class="writeFormRow">
			<input type="submit" value="수정하기" id="inquirySubmit" name="inquirySubmit"/>
		</div>
	</form>
</div>

<script type="text/javascript">

	let opts = document.getElementById("inquiry_post_title");
	
	let count = opts.length;
	let postTitle = "<%=post.getInquiry_post_title()%>";
	
	for(let i=0; i<count; i++){
	    if(opts[i].value == postTitle){
	    	opts[i].setAttribute("selected",true);
	    }
	}
</script>
	
