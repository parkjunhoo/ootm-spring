<%@page import="java.util.ArrayList"%>
<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@page import="util.Utils"%>
<%@page import="kr.team3.ootm.dao.wishlist.WishlistDTO"%>
<%@page import="kr.team3.ootm.dao.product_image.ProductImageDTO"%>
<%@page
	import="kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="java.util.List"%>
<%@page import="kr.team3.ootm.dao.review.ReviewDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ProductDTO product = (ProductDTO) request.getAttribute("product");

boolean isLoggedIn = session.getAttribute("loginUser") != null;
String memberId = "";
if (isLoggedIn) {
	memberId = ((MemberDTO) session.getAttribute("loginUser")).getMember_id();
}

ArrayList<ProductImageDTO> productImageList = (ArrayList<ProductImageDTO>) request.getAttribute("productImageList");
int productImageCount = productImageList.size();

WishlistDTO wishlist = (WishlistDTO) request.getAttribute("wishlist");
int wishlistId = -1;
if(wishlist != null){
	wishlistId = wishlist.getWishlist_id();
}

ArrayList<ReviewDTO> reviewList = (ArrayList<ReviewDTO>) request.getAttribute("reviewList");
int reviewCount = reviewList.size();

ArrayList<InquiryProductPostDTO> inquiryList = (ArrayList<InquiryProductPostDTO>) request.getAttribute("inquiryList");
boolean wishRed = (isLoggedIn && wishlist != null);

String scroll = "";
if(session.getAttribute("detailScroll") != null){
	scroll = (String)session.getAttribute("detailScroll");
}
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css"
	rel="stylesheet">

<title>홈쇼핑웹 상품 상세 페이지</title>
<link rel="icon" href="/images/favicon.ico">
<link rel="stylesheet" href="/css/view/1.css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/static/js/bootstrap.bundle.js"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.content-container {
	margin-left: 70px;
	margin-right: 70px;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor" />
	</jsp:include>
	<div class="content-container">
		<!-- 섹션 1: 제품 이름 및 구매 버튼 -->

		<section style="padding-top: 150px;">
			<h1><%=product.getProduct_name()%></h1>
			<span class="price-now"><%=Utils.priceDot(product.getProduct_price())%>원</span>
			<div class="option-detail">
				Free : 95~105<br> 디테일 수정 및 컬러 변경 ! <br> 한경 : 170/58,
				베이지(삭제) 그린 블루(삭제) 블랙 착용<br> 이탁 : 170/52, 그레이 착용 - 추 후 피팅사진 업데이트
				예정
			</div>
			<div class="text-center">
				<div id="carouselExample" class="carousel slide"
					data-ride="carousel carousel-dark">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="<%=product.getProduct_image2()%>" class="d-block w-50" alt="제품 이미지 1">
						</div>
						<div class="carousel-item">
							<img src="<%=product.getProduct_image()%>" class="d-block w-50" alt="제품 이미지 2">
						</div>
					</div>
					<a class="carousel-control-prev" href="#carouselExample"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">이전</span>
					</a> <a class="carousel-control-next" href="#carouselExample"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">다음</span>
					</a>
				</div>
			</div>
			<!-- 위시리스트 버튼 -->
			<button class="wishlist-btn" onclick="toggleWishlist(this)">
				<%
				if (wishRed) {
				%>
				<i class="fa fa-heart" aria-hidden="true"></i>
				<%
				} else {
				%>
				<i class="fa fa-heart-o" aria-hidden="true"></i>
				<%
				}
				%>
			</button>
			<script src="https://kit.fontawesome.com/your-font-awesome-kit.js"
				crossorigin="anonymous"></script>

			<button <%if(!isLoggedIn){%>disabled<%}%>  class="buy-now-button" data-toggle="modal"
				data-target="#orderModal">BUY NOW</button>
		</section>
		<!-- 팝업 상품 주문 폼 -->

		<div class="modal fade" id="orderModal" tabindex="-1" role="dialog"
			aria-labelledby="orderModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="orderModalLabel">상품 주문 폼</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<h3>옵션과 수량 선택</h3>
						<hr>
						<h4>컬러</h4>
						<button class="color-btn" onclick="selectColor(this)">Black</button>
						<button class="color-btn" onclick="selectColor(this)">Green</button>
						<button class="color-btn" onclick="selectColor(this)">Gray</button>
						<h4>사이즈</h4>
						<button class="size-btn" onclick="selectSize(this)">Free</button>

						<h4>수량</h4>
						<div class="quantity-container">
							<button class="quantity-btn" onclick="decreaseQuantity()">-</button>
							<input type="text" id="quantity" value="1" readonly>
							<button class="quantity-btn" onclick="increaseQuantity()">+</button>
						</div>
						<hr>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button onclick="cartInsert('false')" type="button" class="btn btn-primary">ADD TO BAG</button>
						<button onclick="cartInsert('true')" type="button" class="btn btn-primary">BUY NOW</button>
					</div>
				</div>
			</div>
		</div>

		<!-- 섹션 2: 상세 정보 -->
		<section>
			<h1>상세 정보</h1>
			<img src="http://yam0513.diskn.com/top/TS/990392/a_01.jpg"
				style="display: block; margin: 0 auto;"> <img
				src="http://yam0513.diskn.com/top/TS/990392/a_05.jpg"
				style="display: block; margin: 0 auto;">
		</section>
		<!-- 섹션 3: 리뷰 -->
		<section id="toReview">
			<h1 class="testh1">Reviews</h1>
			<button <%if (!isLoggedIn) {%> disabled <%}%> class="review_button"
				data-toggle="modal" data-target="#reviewModal">리뷰 작성하기</button>
			<ul>리뷰 작성 시 텍스트 리뷰 500원, 포토리뷰 + 텍스트 리뷰는 1,000원, 착용샷 + 텍스트는
				2,000원의 적립금을 드립니다.
			</ul>
			<div class="review-display">
				<%
				for (ReviewDTO review : reviewList) {
					int starsize = review.getReview_star();
				%>
				<h3>상품 리뷰</h3>
				<p>
					작성자:<%=review.getReview_author_id()%></p>
				<p>
					리뷰 내용:<%=review.getReview_content()%></p>
				<p>
					별점:
					
				<%for (int j = 1; j <= starsize; j++) {%>
				
					<span><img src="/images/star.png"></span>
					<%
					}
					%>
				</p>
				<hr />
				<%}%>
			</div>
		</section>
		<!-- 팝업 리뷰 작성 폼 -->
		<jsp:include page="./product_detail_popup.jsp"></jsp:include>

		<!-- 섹션 4: Q&A -->
		<section id="toInquiry" class="slide">
			<h1 class="testh1">Q&A</h1>
			<button <%if (!isLoggedIn) {%> disabled <%}%> class="Q-A_button"
				data-toggle="modal" data-target="#productInquiryModal">상품
				문의하기</button>
			<ul>궁금한 점이 있으신가요? 언제든지 질문해주세요.
			</ul>
			<div class="inquiry-display">
				<ul class="qnaTableBody">
					<%
					for (InquiryProductPostDTO inquiry : inquiryList) {
					%>
					<li><span>작성자 : <%=inquiry.getMember_id()%></span>
						<h3 class="hyperlink">
							<a href="javascript:0"><%=inquiry.getInquiry_product_post_title()%></a>
						</h3>
						<div class="hide">
							<a><%=inquiry.getInquiry_product_post_content()%></a>
						</div>
						<hr /></li>
					<%
					}
					%>
				</ul>
			</div>
		</section>
		<!-- 상품 문의하기 모달 -->
		<jsp:include page="./product_detail_inquiry.jsp" />

		<!-- 섹션 5: Shopping -->
		<section>
			<h1 class="testh1">Shopping</h1>
			<ul class="info-list testfont">
				<li>OOTM 에서 구매하신 상품은 CJ 대한통운 택배를 통해 안전하게 고객님께 배송됩니다.</li>
				<li>택배는 월~금 오후 6시에 출고되며, 토, 일 및 공휴일은 출고되지 않습니다.</li>
				<li>주문 시 장바구니 상품 합계 금액이 50,000원 이상은 무료배송이며, 그 미만일 경우 3,000원의
					배송비가 추가됩니다.</li>
				<li>배송 준비기간은 결제 확인 시점으로부터 평균 3일 이내입니다. 단, 재고 소진으로 인해 재입고가 될 경우
					며칠 더 소요될 수 있습니다.</li>
				<li>촬영 사진과 실제 상품은 화면에 보여지는 이미지와 다소 차이가 있을 수 있습니다.<br> 또한
					상품 사이즈는 측정하는 위치 등 여러 요인에 따라 오차가 발생할 수 있으니 참고 바랍니다.
				</li>
			</ul>
		</section>
		<!-- 섹션 6: Returns & Refunds -->
		<section>
			<h1 class="testh1">Returns & Refunds</h1>
			<ul class="info-list testfont">
				<li>상품 수령일로부터 7일 이내에는 반품 및 환불이 가능합니다. (단, 주말, 공휴일을 제외하고 수령일로부터
					7일 이내에 OOTM에 상품이 회수되어야 가능)</li>
				<li>아래의 사유는 환불이 불가능합니다.<br> 처음 출고된 상태와 달라진 경우 (세탁, 착용, 수선
					등) / 일부 구성품이 훼손 또는 제거 된 경우 (택, 단추, 패키지 아이템 등) / 일부 품목 (속옷류 및 일부
					액세서리 제품 등)
				</li>
				<li>상품이 불량인 경우 동일상품으로 교환(배송비 OOTM 부담) 또는 배송비를 포함한 전액 환불이 가능합니다.<br>
					단, 단순 변심 및 제품의 실밥, 주름 등 허용 범위 내의 제품 특성으로 인한 교환/환불의 경우 왕복 배송비를 차감한
					금액이 환불됩니다.
				</li>
				<li>동일상품 사이즈 교환의 경우 교환 사유가 고객 변심의 범주인 관계로, 편도 배송비를(3,000원)
					부담해주셔야 합니다.</li>
				<li>이미 상품이 출고된 이후에는 상품을 다시 회수받은 뒤에 환불 처리가 가능합니다.</li>
			</ul>
		</section>



		<script>
			$(document).ready(function() {
				// menu 클래스 바로 하위에 있는 a 태그를 클릭했을때
				$(".hyperlink").click(function() {
					var menu = $(this).next(".hide");

					// submenu 가 화면상에 보일때는 위로 보드랍게 접고 아니면 아래로 보드랍게 펼치기
					if (menu.is(":visible")) {
						menu.slideUp();
					} else {
						menu.slideDown();
					}
				});
			});
			
			let sc = "<%=scroll%>";
			if(sc != ""){
				document.getElementById(sc).scrollIntoView(true);
				<%session.removeAttribute("detailScroll"); %>
			}
			
			function submitReview() {
				const reviewerName = document.getElementById("reviewerName").value;
				const reviewerHeight = document
						.getElementById("reviewerHeight").value;
				const reviewerWeight = document
						.getElementById("reviewerWeight").value;
				const productSize = document.getElementById("productSize").value;
				const reviewText = document.getElementById("reviewText").value;
				const rating = document
						.querySelector('input[name="rating"]:checked').value;
				const imageUpload = document.getElementById("imageUpload").files[0];

				const reviewSection = document.createElement("div");
				reviewSection.className = "review-section";

				const nameAndRating = document.createElement("div");
				nameAndRating.className = "name-and-rating";
				nameAndRating.innerHTML = `<strong>${reviewerName}</strong> <span>${rating}점</span>`;
				reviewSection.appendChild(nameAndRating);

				const heightAndWeight = document.createElement("div");
				heightAndWeight.className = "height-and-weight";
				heightAndWeight.innerHTML = `키: ${reviewerHeight}cm, 체중: ${reviewerWeight}kg, 사이즈: ${productSize}`;
				reviewSection.appendChild(heightAndWeight);

				const reviewContent = document.createElement("p");
				reviewContent.className = "review-content";
				reviewContent.textContent = reviewText;
				reviewSection.appendChild(reviewContent);

				if (imageUpload) {
					const imageUrl = URL.createObjectURL(imageUpload);
					const reviewImage = document.createElement("img");
					reviewImage.src = imageUrl;
					reviewImage.className = "review-image";
					reviewSection.appendChild(reviewImage);
				}

				document.querySelector("section:nth-child(3)").appendChild(
						reviewSection);
				$("#reviewModal").modal("hide");
			}
			function increaseQuantity() {
				let quantityInput = document.getElementById('quantity');
				let quantity = parseInt(quantityInput.value);
				quantityInput.value = quantity + 1;
			}

			function decreaseQuantity() {
				let quantityInput = document.getElementById('quantity');
				let quantity = parseInt(quantityInput.value);
				if (quantity > 1) {
					quantityInput.value = quantity - 1;
				}
			}
			function selectColor(btn) {
				let colorButtons = document.getElementsByClassName('color-btn');
				for (let i = 0; i < colorButtons.length; i++) {
					colorButtons[i].classList.remove('selected');
				}
				btn.classList.add('selected');
			}

			function selectSize(btn) {
				let sizeButtons = document.getElementsByClassName('size-btn');
				for (let i = 0; i < sizeButtons.length; i++) {
					sizeButtons[i].classList.remove('selected');
				}
				btn.classList.add('selected');
			}
			function submitReview() {
				const reviewerName = document.getElementById('reviewerName').value;
				const reviewText = document.getElementById('reviewText').value;

				const reviewSection = document
						.querySelector('section:nth-of-type(3)');
				const newReview = document.createElement('div');
				const reviewName = document.createElement('h4');
				const reviewContent = document.createElement('p');

				reviewName.textContent = reviewerName;
				reviewContent.textContent = reviewText;
				newReview.appendChild(reviewName);
				newReview.appendChild(reviewContent);
				reviewSection.appendChild(newReview);

				$('#reviewModal').modal('hide');
				document.getElementById('reviewForm').reset();
			}

			function toggleWishlist(btn) {
		<%if (!isLoggedIn) {%>
			alert("위시리스트는 로그인 이후 가능합니다.");
				return;
		<%}%>
			var heartIcon = btn.querySelector("i");
				if (heartIcon.classList.contains("fa-heart-o")) {
					heartIcon.classList.remove("fa-heart-o");
					heartIcon.classList.add("fa-heart");
					wishlistInsert();
				} else {
					heartIcon.classList.remove("fa-heart");
					heartIcon.classList.add("fa-heart-o");
					wishlistDelete();
					
				}
			}
			
			
			function cartInsert(toPayment) {
			    let productId = <%=product.getProduct_id()%>;
			    let memberId = "<%=memberId%>";

			    let selectedColor = document.querySelector('.color-btn.selected');
			    let color = selectedColor ? selectedColor.textContent : "";
			    let selectedSize = document.querySelector('.size-btn.selected');
			    let size = selectedSize ? selectedSize.textContent : "";
			    let quantityInput = document.getElementById('quantity');
			    let quantity = parseInt(quantityInput.value);

			    orderForm = document.getElementById("orderForm");
			    
			     let form = document.createElement("form");
			     form.setAttribute("action", "/cart/insert.do");
			    form.setAttribute("method", "post");
			     document.charset = "UTF-8";
			     
			     let input = document.createElement("input");
			     input.setAttribute("type", "hidden");
			     input.setAttribute("name", "product_id");
			     input.setAttribute("value", productId);
			     form.appendChild(input);
			     
			     let input2 = document.createElement("input");
			     input2.setAttribute("type", "hidden");
			     input2.setAttribute("name", "member_id");
			     input2.setAttribute("value", memberId);
			     form.appendChild(input2);
			     
			     let input3 = document.createElement("input");
			     input3.setAttribute("type", "hidden");
			     input3.setAttribute("name", "cart_quantity");
			     input3.setAttribute("value", quantity);
			     form.appendChild(input3);
			     
			     let input4 = document.createElement("input");
			     input4.setAttribute("type", "hidden");
			     input4.setAttribute("name", "color");
			     input4.setAttribute("value", color);
			     form.appendChild(input4);
			     
			     let input5 = document.createElement("input");
			     input5.setAttribute("type", "hidden");
			     input5.setAttribute("name", "size");
			     input5.setAttribute("value", size);
			     form.appendChild(input5);
			     
			     let input6 = document.createElement("input");
			     input6.setAttribute("type", "hidden");
			     input6.setAttribute("name", "toPayment");
			     input6.setAttribute("value", toPayment);
			     form.appendChild(input6);
			     
			     
			     document.body.appendChild(form);
			     form.submit();
			     
			     if(toPayment != "true") alert("장바구니 추가완료");
			     
			 }
			
			function wishlistInsert() {
				let memberId = "<%=memberId%>";
				let productId = <%=product.getProduct_id()%>;

				if (memberId == "") {
					alert("위시 리스트 등록에 실패하였습니다.");
					return;
				}

				let form = document.createElement("form");
				form.setAttribute("action", "/wishlist/insert.do");
				form.setAttribute("method", "post");
				document.charset = "UTF-8";

				let input = document.createElement("input");
				input.setAttribute("type", "hidden");
				input.setAttribute("name", "member_id");
				input.setAttribute("value", memberId);
				form.appendChild(input);

				let input2 = document.createElement("input");
				input2.setAttribute("type", "hidden");
				input2.setAttribute("name", "product_id");
				input2.setAttribute("value", productId);
				form.appendChild(input2);

				alert("위시리스트 추가 완료");

				document.body.appendChild(form);
				form.submit();
			}
			
			function wishlistDelete() {
				let wishlistId = "<%=wishlistId%>";
				let productId = <%=product.getProduct_id()%>;

				if (wishlistId == -1) {
					alert("위시 리스트 삭제에 실패하였습니다.");
					return;
				}

				let form = document.createElement("form");
				form.setAttribute("action", "/wishlist/delete.do");
				form.setAttribute("method", "post");
				document.charset = "UTF-8";

				let input = document.createElement("input");
				input.setAttribute("type", "hidden");
				input.setAttribute("name", "product_id");
				input.setAttribute("value", productId);
				form.appendChild(input);

				let input2 = document.createElement("input");
				input2.setAttribute("type", "hidden");
				input2.setAttribute("name", "wishlist_id");
				input2.setAttribute("value", wishlistId);
				form.appendChild(input2);

				alert("위시리스트 삭제 완료");

				document.body.appendChild(form);
				form.submit();
			}
		</script>
		<script
			src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.min.js"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	</div>
	<!-- 푸터 -->
	<jsp:include page="/WEB-INF/layout/footer.jsp" />
</body>
</html>