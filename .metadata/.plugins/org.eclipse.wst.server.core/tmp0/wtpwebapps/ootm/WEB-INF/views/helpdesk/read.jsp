<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@page import="kr.team3.ootm.dao.inquiry_post.InquiryPostDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="helpdeskContentDiv">
<%
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
	<div class="deskTitle">
		<div class="inquiryTitleDiv">
			<div>
				<h3 onclick="location.href='/helpdesk/inquiry'" style="cursor:pointer;">&lt 문의게시판</h3>
			</div>
		</div>
	</div>
	<%if(pass){ %>
	<div>
		<h3><%=post.getInquiry_post_title()%></h3>
		<div onclick="location.href='/helpdesk/edit?id=<%=post.getInquiry_post_id()%>'" class="editBtn">수정하기</div>
	</div>
	<h5 style="margin: 30px 0">by <%=post.getMember_id()%> · <%=post.getInquiry_post_regdate()%></h5>
	
	<hr style="margin: 30px 0">
	
	<h6><%=post.getInquiry_post_content()%></h6>
	<%}else{%>
		<h1>작성자만 게시글을 볼 수 있습니다.</h1>
	<%} %>
</div>

<script type="text/javascript">
	
</script>