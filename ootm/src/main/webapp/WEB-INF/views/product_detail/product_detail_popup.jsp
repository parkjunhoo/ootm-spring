<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@page import="kr.team3.ootm.dao.product.ProductDAO"%>
<%@page import="kr.team3.ootm.dao.review.ReviewDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ProductDTO product = (ProductDTO) request.getAttribute("product");
List<ReviewDTO> review = (List<ReviewDTO>) request.getAttribute("reviewList");
int size = review.size();	

String memberName = "";
if(session.getAttribute("loginUser") != null){
	MemberDTO member = (MemberDTO)session.getAttribute("loginUser");
	memberName = member.getMember_name();
}

%>

<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://code.jquery.com/jquery-3.4.1.min.js">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->
<div class="modal fade" id="reviewModal" tabindex="-1" role="dialog"
	aria-labelledby="reviewModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="reviewModalLabel">제품 이름</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form role="form" class="form-horizontal" action="/review/insert.do"
				method="POST" name="review">
				<div class="modal-body">
					<h3>리뷰를 남겨주세요</h3>
					<div id="rating">
						<!-- 별점 입력 부분 -->

						<fieldset class="rating">
							<input type="radio" id="star5" name="review_star" value="5" /><label
								for="star5" title="5점">5 stars</label> <input type="radio"
								id="star4" name="review_star" value="4" /><label for="star4"
								title="4점">4 stars</label> <input type="radio" id="star3"
								name="review_star" value="3" /><label for="star3" title="3점">3
								stars</label> <input type="radio" id="star2" name="review_star"
								value="2" /><label for="star2" title="2점">2 stars</label> <input
								type="radio" id="star1" name="review_star" value="1" /><label
								for="star1" title="1점">1 star</label>
						</fieldset>

					</div>
					<hr>
					<hr>
					<hr>
					<!-- <form id="reviewForm"> -->
					
					<div class="form-group">
						<div class="center">
							<label for="productName">상품</label> <input type="hidden"  
								class="form-control" id="ProductId" name="product_id" 
								value="<%=product.getProduct_id()%>">
								<input type="text" readonly style="text-align:center" 
								class="form-control" id="ProductName"
								value="<%=product.getProduct_name()%>">
						</div>
					</div>
					<div class="form-group">
						<label for="reviewerHeight">이름</label> <input readonly type="text" value="<%=memberName%>"
							class="form-control" id="reviewerName" name="review_author_id"
							placeholder="이름을 입력하세요">
					</div>
					<div class="form-group">
						<label for="reviewText">리뷰 내용</label>
						<textarea class="form-control" id="reviewText" rows="3"
							name="review_content" placeholder="리뷰 내용을 입력하세요"></textarea>
					</div>
					<!-- </form> -->
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">닫기</button>
					<!-- 					<button type="button" class="btn btn-primary"
						onclick="submitReview()">리뷰 작성하기</button> -->
					<div class="col-sm-3 col-sm-offset-2">
						<input type="submit" value="등록하기" class="btn btn-success" />
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
