<%@page import="util.define.HeaderSubMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String cateName = (String)request.getAttribute("cateName");
%>
<section id="titleSection" style="position: relative;">
		<h1 id="testID" class="pic_text"><%=cateName %></h1>
</section>