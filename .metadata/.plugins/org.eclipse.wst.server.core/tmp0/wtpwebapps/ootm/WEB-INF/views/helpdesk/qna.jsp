<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    // menu 클래스 바로 하위에 있는 a 태그를 클릭했을때
    $("h6").click(function(){
        var menu = $(this).next(".hide");

        // submenu 가 화면상에 보일때는 위로 보드랍게 접고 아니면 아래로 보드랍게 펼치기
        if( menu.is(":visible") ){
            menu.slideUp();
        }else{
            menu.slideDown();
        }
    });
});
</script>
<style>

    
</style>
</head>
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
                <h6><a href="javascript:0">구매 전 확인해야 할 것들은 무엇이 있나요?</a></h6>
                <div class="hide">
	                <a>온라인 쇼핑은 상품을 직접 보고 구매하는 것이 아니므로 상품구매 전에는 상품 정보를 꼼꼼히 살펴보시기 바랍니다.
	                OOTM은 최대한 실물 색상에 가까운 사진과 정확한 사이즈 기재를 하고 있으나 컴퓨터 해상도에 따라 색상 차이가 있을 수 있으며, 1~3cm 가량은 재는 방법에 따라 실제 사이즈와 차이가 있을 수 있으니 참고하시기 바랍니다.</a>
                </div>
            </li>
            
            <li>
                <h5>상품</h5>
                <h6><a href="javascript:0">상품에 대해 더 궁금한 점이 있어요.</a></h6>
                <div class="hide">
	                <a>카카오톡 상담 신청을 통해 사이즈 또는 상품 문의 주시면 빠른 답변 도와드리도록 하겟습니다</a>
                </div>
            </li>
            
            <li>
                <h5>주문</h5>
                <h6><a href="javascript:0">주문을 취소하고 싶습니다.</a></h6>
                <div class="hide">
	                <a>배송전 취소는 카카오톡 상담신청 을 통해 (상품명, 주문자명) 기재후 취소 요청 부탁드립니다. 단, 상품이 이미 출고 된 경우 발송 및 회수에 소요되는 배송료를 제외한 뒤 환불되는 점 참고 바랍니다.</a>
                </div>
            </li>
            
            
            <li>
                <h5>주문</h5>
                <h6><a href="javascript:0">주문하면 언제 받아볼 수 있나요?</a></h6>
                <div class="hide">
	                <a>하루 주문 마감시간 오후 5시이며 5시 이후주문건 다다음날 부터 입고 시작 저희가 선 주문 후 입고 배송 시스템이라 당일 발송 진행하지 않고 있어요. 지연상품이 아닌 정상배송 상품의경우 입고준비기간이 주말제외 2~5일정도 소요되는 점 참고 부탁드릴게용:) 상품이 일시품절 등의 사유로 재입고 기간이 필요한 경우 이보다 더 소요될 수 있으며 이러한 경우 별도의 연락을 드리니 참고하시기 바랍니다.</a>
                </div>
            </li>
            
            <li>
                <h5>결제</h5>
                <h6><a href="javascript:0">결제창이 뜨지 않습니다.</a></h6>
                <div class="hide">
	                <a>결제 플러그인이 제대로 설치되지 않았을 수 있습니다. 우선 새로고침을 해본 뒤, 증상이 지속되면 아래 링크를 통해 이니시스 결제 플러그인을 수동 설치해 보시기 바랍니다.
					</a>
                </div>
            </li>
            
            
            <li>
                <h5>결제</h5>
                <h6><a href="javascript:0">결제 방법은 어떤 것이 있나요?</a></h6>
                <div class="hide">
	                <a>무통장 입금 결제는 물론 모든 카드사의 신용결제가 가능합니다. 또한 현금 등으로 5만원 이상 구매 시 KB국민은행의 구매안전 서비스를 이용해 안심하고 결제할 수 있습니다.</a>
                </div>
            </li>
            
            
           <li>
                <h5>주문</h5>
                <h6><a href="javascript:0">장바구니에 담아두고 다른 곳에서 결제해도 되나요?</a></h6>
                <div class="hide">
	                <a>장바구니는 DB에 저장되므로 어디서든 불러올 수 있습니다.</a>
                </div>
            </li>
            
        </ul>
    </div>
    
</div>