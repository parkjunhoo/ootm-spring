<%@page import="util.Utils"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<ProductDTO> newProductList = (ArrayList<ProductDTO>) request.getAttribute("newProductList");
%>
<!DOCTYPE html>

<section class="promotionSection">
	<div class="outer">
		<div class="promotionHR">
			<hr>
			<h4 style="padding-top: 20px;">Check out our New arrivals</h4>
		</div>
		<div class="promotionTable">
			<div class="promotionTable" id="bowTable">
				<%
				for (ProductDTO dto : newProductList) {
					String price = Utils.priceDot(dto.getProduct_price());
				%>
				<hoverbox-component onclick="location.href='/product-detail?product_id=<%=dto.getProduct_id()%>'" class="promotionProduct">
				<div class="beforeBox"
					style="background-image: url(<%=dto.getProduct_image()%>);"></div>
				<div class="afterBox">
					<div class="downAnim productAfterUp">
						<img src="<%=dto.getProduct_image2()%>" />
					</div>
					<div class="upAnim productAfterDown">
						<h1><%=dto.getProduct_name()%></h1>
						<h2><%=price%>원</h2>
						<div class="descDiv">
							<h3><%=dto.getProduct_tag()%></h3>
							<h4>Free ·</h4>
							<h4>3 Colors</h4>
						</div>
					</div>
				</div>
				</hoverbox-component>
				<%
				}
				%>
			</div>
		</div>
	</div>
</section>

<section id="videoSection3" class="VideoSection">
	<video  autoplay loop muted>
	  <source src="/videos/deco6.mp4" type="video/mp4">
	</video>
</section>