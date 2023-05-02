<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String desk = (String)request.getAttribute("desk");
if(desk == null) desk = "qna";
%>
<!DOCTYPE html>
<div id="helpdeskAside">
	<ul>
		<li value="qna">
			<a href="/helpdesk/qna"><h2>자주묻는질문<div class="hoverUnderline"></div></h2></a>
		</li>
		<li value="notice">
			<a href="/helpdesk/notice"><h2>공지사항<div class="hoverUnderline"></div></h2></a>
		</li>
		<li value="returns">
			<a href="/helpdesk/returns"><h2>교환반품안내<div class="hoverUnderline"></div></h2></a>
		</li>
		<li value="inquiry">
			<a href="/helpdesk/inquiry"><h2>문의게시판<div class="hoverUnderline"></div></h2></a>
		</li>
	</ul>
</div>

<script type="text/javascript">
	var currentTab = document.querySelector('li[value="<%=desk %>"]');
	currentTab.firstElementChild.style.fontWeight = "bold";

</script>