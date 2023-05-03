<%@page import="util.Utils"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
ArrayList<ProductDTO> list = (ArrayList<ProductDTO>)request.getAttribute("productList");
%> 

<%for(ProductDTO dto : list){ %>
<div class="product-box">
	<div class="img-box">
		<a href="/product-detail" class="product-detail-link"><img
			src="<%=dto.getProduct_image() %>"><img
			src="<%=dto.getProduct_image2() %>"></a>
	</div>
	<div class="txt-box">
		<p><%=dto.getProduct_name() %></p>
		<P><%=Utils.priceDot(dto.getProduct_price()) %></P>
		<p class="hashtag"><%=Utils.tagReplaceToSpace(dto.getProduct_tag()) %></p>
	</div>
</div>
<%}%>