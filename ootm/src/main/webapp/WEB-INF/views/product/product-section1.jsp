<%@page import="util.define.HeaderSubMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int sc = Integer.parseInt(request.getParameter("subcategory"));
String cateName = HeaderSubMenu.getLabel(sc);
%>
<section style="position: relative;">
		<h1 id="testID" class="pic_text"><%=cateName %></h1>
</section>