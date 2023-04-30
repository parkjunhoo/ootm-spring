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
                <h6><a href="javascript:0">구매 전 확인해야 할 것들은 무엇이 있나요?</a></h6>
                <div class="hide">
	                <a>온라인 쇼핑은 상품을 직접 보고 구매하는 것이 아니므로 상품구매 전에는 상품 정보를 꼼꼼히 살펴보시기 바랍니다.
	                OOTM은 최대한 실물 색상에 가까운 사진과 정확한 사이즈 기재를 하고 있으나 컴퓨터 해상도에 따라 색상 차이가 있을 수 있으며, 1~3cm 가량은 재는 방법에 따라 실제 사이즈와 차이가 있을 수 있으니 참고하시기 바랍니다.</a>
                </div>
            </li>
        </ul>
    </div>
    
</div>