<%@page import="kr.team3.ootm.dao.review.ReviewDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ReviewDTO review = (ReviewDTO) request.getAttribute("review");
%>
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
						<label for="reviewerName">상품</label> <input type="text"
							class="form-control" id="ProductName" name="product_id"
							placeholder="상품을 입력하세요">
					</div>
					<div class="form-group">
							<label for="reviewerHeight">이름</label> <input type="text"
								class="form-control" id="reviewerName" name="review_author_id"
								placeholder="이름을 입력하세요">
					</div>
					<div class="form-group">
						<label for="reviewText">리뷰 내용</label>
						<textarea class="form-control" id="reviewText" rows="3"
							name="review_content" placeholder="리뷰 내용을 입력하세요"></textarea>
					</div>
					<div class="form-group">
						<label for="imageUpload">이미지 업로드</label> <input type="file"
							class="form-control-file" id="imageUpload">
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
