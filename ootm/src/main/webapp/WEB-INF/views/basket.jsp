<%@page import="java.text.DecimalFormat"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="kr.team3.ootm.dao.cart.CartDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
ArrayList<CartDTO> cartList = (ArrayList<CartDTO>)request.getAttribute("myCartList");
ArrayList<ProductDTO> productList = (ArrayList<ProductDTO>)request.getAttribute("myCartProductList");
Object ts = request.getAttribute("tempScroll");
String scroll = "0";
if(ts != null){
	scroll = (String)ts;
	//System.out.println((String)ts);
}

DecimalFormat priceFormat = new DecimalFormat("###,###");

int allPrice = 0;
int shippingPrice = 2500;
int resultPrice = 0;
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" href="/images/favicon.ico">
<title>장바구니</title>

<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/reset.css" />
<link rel="stylesheet" type="text/css" href="/css/view/basket.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor"/>
	</jsp:include>

	<section id="basketSection">
		<div class="basketOuter">
			<div class="basketTitleDiv">
				<h1>Shopping Bag</h1>
			</div>
			
			<%int count = cartList.size();
			for(int i=0; i<count; i++){ 
			CartDTO cart = cartList.get(i);
			ProductDTO product = productList.get(i);
			int price = cart.getCart_quantity() * product.getProduct_price();
			int disRate = product.getProduct_discount_rate();
			double disPrice = disRate==0? price : price * ( (double)(100-product.getProduct_discount_rate())/100);
			disPrice= Math.ceil(disPrice);
			
			int sumPrice = (int)disPrice;
			%>
				<div class="basketForm">
					<div class="basketDeleteDiv">
						<span onclick="cartDelete(<%=cart.getCart_id()%>)">✖</span>
					</div>
					<div class="basketItemImgDiv">
						<img
							src="<%=product.getProduct_image2()%>">
					</div>
					<div class="basketItemDescDiv">
						<h1><%=product.getProduct_name()%></h1>
						<h3>컬러:<%=cart.getColor()%> / 사이즈:<%=cart.getSize()%></h3>
					</div>
					<div class="basketItemAmount">
						<div onclick="cartUpdate(<%=cart.getCart_id()%>,<%=cart.getCart_quantity()-1 %>)" 
						class="amountMinusBtn amountBtn">-</div>
						<input readonly type="number" name="amount" value=<%=cart.getCart_quantity()%>>
						<div onclick="cartUpdate(<%=cart.getCart_id() %>, <%=cart.getCart_quantity()+1 %>)" 
						class="amountPlusBtn amountBtn">+</div>
					</div>
					<div class="basketItemPriceDiv">
						<h1><%=priceFormat.format(sumPrice) %>원</h1>
					</div>
				</div>
				<%allPrice += sumPrice;%>
			<%}
				if(allPrice >= 50000){
					shippingPrice = 0;
				}
				resultPrice = allPrice + shippingPrice;
			%>
			
			
			<div id="basketSummaryDiv">
				<p class="infoP">5만원 이상 구매시 무료배송</p>
				<div id="basketSummaryListDiv">
					<div id="basketSubTotalDiv" class="summaryList">
						<p class="label">주문 금액</p>
						<p class="value"><%=priceFormat.format(allPrice)%>원</p>
					</div>
					<div id="basketShippingDiv" class="summaryList">
						<p class="label">배송비</p>
						<%if(shippingPrice == 0){%>
							<p class="value">무료 배송</p>
						<%}else{%>
						<p class="value"><%=shippingPrice %></p>
						<%}%>
					</div>
					<hr noshade="true">
					<div id="basketTotalDiv" class="summaryList">
						<h1 id="totalLabel" class="label">합계</h1>
						<h1 id="totalValue" class="value"><%=priceFormat.format(resultPrice)%>원</h1>
					</div>
					<div onclick="location.href='/payment'" id="basketCheckOutBtn">
						<span>CHECK OUT</span>
					</div>
				</div>
			</div>
		</div>
	</section>

	<jsp:include page="/WEB-INF/layout/footer.jsp"/>
	
	<script type="text/javascript">
		//console.log(<%=scroll%>);
		window.scrollTo(0,<%=scroll %>);

	
		function cartDelete(id){
	 		let form = document.createElement("form");
		    form.setAttribute("action", "/cart/delete.do");
			form.setAttribute("method", "post");
		    document.charset = "UTF-8";
		    
		    let input = document.createElement("input");
		    input.setAttribute("type", "hidden");
		    input.setAttribute("name", "cart_id");
		    input.setAttribute("value", id);
		    form.appendChild(input);
		    
		    let input2 = document.createElement("input");
		    input2.setAttribute("type", "hidden");
		    input2.setAttribute("name", "tempScroll");
		    input2.setAttribute("value", window.scrollY);
		    form.appendChild(input2);
		    
		    document.body.appendChild(form);
		    form.submit();
		}
		
		function cartUpdate(id,num){
			if(num<=0){
				cartDelete(id);
				return;
			}
			let form = document.createElement("form");
		    form.setAttribute("action", "/cart/update.do");
			form.setAttribute("method", "post");
		    document.charset = "UTF-8";
		    
		    let input = document.createElement("input");
		    input.setAttribute("type", "hidden");
		    input.setAttribute("name", "cart_id");
		    input.setAttribute("value", id);
		    form.appendChild(input);
		    
		    let input2 = document.createElement("input");
		    input2.setAttribute("type", "hidden");
		    input2.setAttribute("name", "cart_quantity");
		    input2.setAttribute("value", num);
		    form.appendChild(input2);
		    
		    let input3 = document.createElement("input");
		    input3.setAttribute("type", "hidden");
		    input3.setAttribute("name", "tempScroll");
		    input3.setAttribute("value", window.scrollY);
		    form.appendChild(input3);
		    
		    document.body.appendChild(form);
		    form.submit(); 
		}
	</script>
</body>
</html>