<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>최근 배송지 검색</title>
		<link rel="stylesheet" type="text/css" href="/css/view/addplace.css"/>
	</head>
	<body>
		<div class="popup">
			<div class="tab-wrap">
	        	<div class="title-box">최근 배송지</div>
	        </div>
	        <div class="shipping_details">
           		<form name="form_past_list" method="post">
                	<div class="none-ad">
                		<p>최근 배송지 내역이 없습니다.</p>
            		</div>
            	</form>
	        </div>
	        <div class="btn-wrap">
	            <div>
	            	<button><a href="javascript:close_addplace();" class="btn-white">닫기</a></button>
	            </div>
           	</div>
		</div>
	</body>
</html>