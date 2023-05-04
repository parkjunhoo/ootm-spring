<%@page import="kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO"%>
<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="kr.team3.ootm.dao.product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ProductDTO product = (ProductDTO) request.getAttribute("product");
List<InquiryProductPostDTO> postuser = (List<InquiryProductPostDTO>) request.getAttribute("inquiryList");
int size = postuser.size();
String memberId ="";
String memberName ="";
if(session.getAttribute("loginUser")!=null){
	MemberDTO loginUser = (MemberDTO) session.getAttribute("loginUser");
	//System.out.println(loginUser.getMember_name());
	memberId = loginUser.getMember_id();
	memberName = loginUser.getMember_name();
}


%>
<div class="modal fade" id="productInquiryModal" tabindex="-1"
	role="dialog" aria-labelledby="productInquiryModalLabel"
	aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="productInquiryModalLabel">상품 문의하기</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<form id="productInquiryForm" action="/inquiryproductpost/insert.do"
					method="POST" name="inquiry">
					<div class="form-group">
						<div class="center">
							<label for="productName">상품</label> <input type="hidden"
								class="form-control" id="ProductId" name="product_id"
								value="<%=product.getProduct_id()%>"> <input type="text"
								readonly style="text-align: center" class="form-control"
								id="ProductName" value="<%=product.getProduct_name()%>">
						</div>
					</div>
					<div class="form-group">
						<div class="center">
							<label for="postUserName">이름</label> <input type="hidden"
								class="form-control" id="memberId" name="member_id"
								value="<%=memberId%>"> <input
								type="text" readonly style="text-align: center"
								class="form-control" id="memberName"
								value="<%=memberName%>">
						</div>
					</div>
					<div class="form-group">
						<label for="inquiryTitle">제목</label> <input type="text"
							class="form-control" id="inquiryTitle"
							name="inquiry_product_post_title">
					</div>
					<div class="form-group">
						<label for="inquiryContent">문의 내용</label>
						<textarea class="form-control" id="inquiryContent" rows="3"
							name="inquiry_product_post_content" required></textarea>
					</div>

					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">닫기</button>
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="등록하기" class="btn btn-success" />
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>