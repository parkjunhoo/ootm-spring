<%@page import="util.define.HeaderSubMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String cateName = (String)request.getAttribute("cateName");
String bannerPath = (String)request.getAttribute("banner");
%>
<section id="titleSection" style="position: relative; margin-top:80px;">
		<video class="productTitleBanner" autoplay loop muted>
	  		<source src="/videos/productbanner/<%=bannerPath%>.mp4" type="video/mp4">
		</video>
		<h1 style="padding-bottom:100px; font-size: 4rem;" id="testID" class="pic_text"><%=cateName %></h1>
</section>