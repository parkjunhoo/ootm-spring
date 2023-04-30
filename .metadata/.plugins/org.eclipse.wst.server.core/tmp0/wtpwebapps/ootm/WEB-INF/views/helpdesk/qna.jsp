<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="helpdeskContentDiv">
	<div class="deskTitle">
		<h3>자주묻는질문</h3>
		<h4>궁금한 점이 있으신가요? 문의에 앞서 자주묻는 질문들을 확인해보세요.</h4>
	</div>
	
	<div class="qnaTable">
		<div class="qnaTableHead">
			<a>전체보기</a>
			<a>상품</a>
			<a>주문/결제</a>
			<a>배송</a>
			<a>교환/환불</a>
			<a>기타</a>
		</div>
		
		<ul class="qnaTableBody">
			<li>
				<h5>상품</h5> 
				
				<div>
					<h6 onclick="openQuestion(this)" class="qnaQuestion">구매 전 확인해야 할 것들은 무엇이 있나요?</h6>
					<p class="qnaAnswer">
						<br>
						온라인 쇼핑은 상품을 직접 보고 구매하는 것이 아니므로 상품구매 전에는 상품 정보를 꼼꼼히<br>
						살펴보시기 바랍니다. 에버프리는 최대한 실물 색상에 가까운 사진과 정확한 사이즈 기재를 하고 있으나<br>
						컴퓨터 해상도에 따라 색상 차이가 있을 수 있으며, 1~3cm 가량은 재는 방법에 따라 실제 사이즈와<br>
						차이가 있을 수 있으니 참고하시기 바랍니다.
					</p>
				</div>
				
			</li>
			
			<li>
				<h5>상품</h5> 
				
				<div>
					<h6 onclick="openQuestion(this)" class="qnaQuestion">구매 전 확인해야 할 것들은 무엇이 있나요?</h6>
					<p class="qnaAnswer">
						<br>
						온라인 쇼핑은 상품을 직접 보고 구매하는 것이 아니므로 상품구매 전에는 상품 정보를 꼼꼼히<br>
						살펴보시기 바랍니다. 에버프리는 최대한 실물 색상에 가까운 사진과 정확한 사이즈 기재를 하고 있으나<br>
						컴퓨터 해상도에 따라 색상 차이가 있을 수 있으며, 1~3cm 가량은 재는 방법에 따라 실제 사이즈와<br>
						차이가 있을 수 있으니 참고하시기 바랍니다.
					</p>
				</div>
				
			</li>
			
		</ul>
	</div>
	
</div>


<script type="text/javascript">
	function openQuestion(el){
		let els = document.getElementsByClassName("qnaOpen");
		for(let i=0; i<els.length; i++){
			let cl = els[i].classList;
			cl.remove("qnaOpen");
		    cl.add("qnaClose");
		}
		el.nextElementSibling .classList.remove("qnaClose");
		el.nextElementSibling .classList.add("qnaOpen");
	}
</script>