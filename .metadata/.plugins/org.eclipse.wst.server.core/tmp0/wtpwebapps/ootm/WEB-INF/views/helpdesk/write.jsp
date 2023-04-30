<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="helpdeskContentDiv">

	<div class="deskTitle">
		<div class="inquiryTitleDiv">
			<div>
				<h3 onclick="location.href='/helpdesk?desk=inquiry'" style="cursor:pointer;">&lt 문의게시판</h3>
			</div>
		</div>
	</div>
	
	<form id="inquiryWriteForm" name="inquiryWriteForm">
		<div class="writeFormRowHalf">
			<p class="writeFormLabel">이름</p>
			<input class="InquirytextInput" type="text" name="inquiryAuthor"/>
		</div>
		<div class="writeFormRowHalf">
			<p class="writeFormLabel">글 비밀번호</p>
			<input class="InquirytextInput" type="text" name="inquiryPass"/>
		</div>
		<div class="writeFormRow">
			<p class="writeFormLabel">내용</p>
			<textarea class="InquirytextArea" form="inquiryWriteForm" name="inquiryContent"></textarea>
		</div>
		<div class="writeFormRow">
			<p class="writeFormLabel">글 비밀번호</p>
			<input class="InquirytextInput" type="text" name="inquiryPass"/>
		</div>
		
		<div style="display:flex;" class="writeFormRow">
			<input type="submit" value="문의하기" id="inquirySubmit" name="inquirySubmit"/>
		</div>
	</form>
	
	
	
</div>