<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이달의 룩 - 회원가입 약관</title>
<!-- 파비콘 -->
<link rel="icon" href="/images/favicon.ico">
<!-- 글꼴 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">
<!-- css -->
<link rel="stylesheet" type="text/css" href="/css/view/signup_style.css" />
<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/reset.css" />
<!-- javascript -->
<script type="text/javascript" src="/js/signup_js.js"></script>


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript">
$( document ).ready( function() {
    $("input[type='checkbox']").change(function(){
    var member_opt
    if($("#email").prop("checked") && $("#SMS").prop("checked")){
        member_opt="y"
    } else if($("#email").prop("checked")){
        member_opt="M"
    } else if($("#SMS").prop("checked")){
        member_opt="S"
    } else{
        member_opt="n"
    }
    $("#opt").val(member_opt)
    })
})
</script>
</head>
<body>
	<jsp:include page="../../layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor"/>
	</jsp:include>
	
	<h1 class="signup">Sign Up</h1>
	<form>
		<div class="terms">
			<h3>약관</h3>
			<div class="terms_box">
				<div class="terms_content">
					<h5>제1조 목적</h5>
					<p>
						이 약관은 주식회사 OOTM(전자상거래 사업자)가 운영하는 OOTM (이하 “몰”)에서 제공하는 인터넷 관련
						서비스(이하 “서비스)를 이용함에 있어 몰과 이용자의 권리·의무 및 책임사항을 규정함을 목적으로 합니다.<br />
						PC통신, 무선 등을 이용하는 전자상거래에 대해서도 그 성질에 반하지 않는 한 이 약관을 준용합니다.
					</p>
					<h5>제2조 정의</h5>
					<p>
						1. “몰”이란 주식회사 OOTM 회사가 재화 또는 용역(이하 “재화 등”이라 함)을 이용자에게 제공하기 위하여 컴퓨터
						등 정보통신설비를 이용하여 재화 등을 거래할 수 있도록 설정한 가상의 영업장을 말하며, 아울러 사이버몰을 운영하는
						사업자의 의미로도 사용합니다.<br /> 2. “이용자”란 “몰”에 접속하여 이 약관에 따라 “몰”이 제공하는
						서비스를 받는 회원 및 비회원을 말합니다.<br /> 3. ‘회원’이라 함은 “몰”에 회원등록을 한 자로서,
						계속적으로 “몰”이 제공하는 서비스를 이용할 수 있는 자를 말합니다.<br /> 4. ‘비회원’이라 함은 회원에
						가입하지 않고 “몰”이 제공하는 서비스를 이용하는 자를 말합니다.<br />
					</p>
					<h5>제3조 약관 등의 명시와 설명 및 개정</h5>
					<p>
						1. “몰”은 이 약관의 내용과 상호 및 대표자 성명, 영업소 소재지 주소(소비자의 불만을 처리할 수 있는 곳의 주소를
						포함), 전화번호·모사전송번호·전자우편주소, 사업자등록번호, 통신판매업 신고번호, 개인정보보호책임자 등을 이용자가 쉽게
						알 수 있도록 주식회사 에버프리 사이버몰의 초기 서비스화면(전면)에 게시합니다. 다만, 약관의 내용은 이용자가
						연결화면을 통하여 볼 수 있도록 할 수 있습니다.<br /> 2. “몰은 이용자가 약관에 동의하기에 앞서 약관에
						정하여져 있는 내용 중 청약철회·배송책임·환불조건 등과 같은 중요한 내용을 이용자가 이해할 수 있도록 별도의 연결화면
						또는 팝업화면 등을 제공하여 이용자의 확인을 구하여야 합니다.<br /> 3. “몰”은 「전자상거래 등에서의
						소비자보호에 관한 법률」, 「약관의 규제에 관한 법률」, 「전자문서 및 전자거래기본법」, 「전자금융거래법」,
						「전자서명법」, 「정보통신망 이용촉진 및 정보보호 등에 관한 법률」, 「방문판매 등에 관한 법률」, 「소비자기본법」 등
						관련 법을 위배하지 않는 범위에서 이 약관을 개정할 수 있습니다.<br /> 4. “몰”이 약관을 개정할 경우에는
						적용일자 및 개정사유를 명시하여 현행약관과 함께 몰의 초기화면에 그 적용일자 7일 이전부터 적용일자 전일까지
						공지합니다. 다만, 이용자에게 불리하게 약관내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고
						공지합니다. 이 경우 "몰“은 개정 전 내용과 개정 후 내용을 명확하게 비교하여 이용자가 알기 쉽도록 표시합니다.<br />
						5. “몰”이 약관을 개정할 경우에는 그 개정약관은 그 적용일자 이후에 체결되는 계약에만 적용되고 그 이전에 이미
						체결된 계약에 대해서는 개정 전의 약관조항이 그대로 적용됩니다. 다만 이미 계약을 체결한 이용자가 개정약관 조항의
						적용을 받기를 원하는 뜻을 제3항에 의한 개정약관의 공지기간 내에 “몰”에 송신하여 “몰”의 동의를 받은 경우에는
						개정약관 조항이 적용됩니다.<br /> 6. 이 약관에서 정하지 아니한 사항과 이 약관의 해석에 관하여는 전자상거래
						등에서의 소비자보호에 관한 법률, 약관의 규제 등에 관한 법률, 공정거래위원회가 정하는 「전자상거래 등에서의 소비자
						보호지침」 및 관계법령 또는 상관례에 따릅니다.<br />
					</p>
					<p>약관 내용 계속.........</p>
					<!-- 약관 내용 계속 ....... -->
				</div>
			</div>
		</div>
	</form>
	<form>
		<div class="privacy">
			<h3>개인정보 수집 및 이용</h3>
			<div class="privacy_box">
				<div class="privacy_content">
					<h5>필수정보</h5>
					<p>- 이름, 아이디, 비밀번호, 생일, 성별, 이메일, 주소, 연락처, 휴대폰 (목적: 회원제 서비스 이용 및
						본인 확인 / 보유기간: 회원 탈퇴 후 5일까지)</p>
					<h5>선택정보</h5>
					<p>휴대폰, 이메일, 쿠키정보 (목적: 마케팅 활용(이벤트, 맞춤형 광고) / 보유기간: 회원 탈퇴 후
						5일까지)</p>
				</div>
			</div>
	</form>
	<form>
		<div class="agree">
			<p id="agree_content">회원 가입을 위해 약관 및 개인정보 수집에 관한 내용을 확인 후 동의해주시기
				바랍니다.</p>
			<div class="agree_box">
				<div class="agree_content">
					<input type="checkbox" id="full_agreement" onclick="checkAll()"> <label
						for="full_agreement">전체동의</label><br /> <input type="checkbox"
						id="terms_of_use"> <label for="terms_of_use">이용약관</label>

					<input type="checkbox" id="information_use"> <label
						for="information_use">개인정보 수집 및 이용 안내</label><br /> <input
						type="checkbox" id="Marketing_opt_in"> <label
						for="Marketing_opt_in">마케팅 수신동의 (</label> <input type="checkbox"
						id="email"> <label for="email">이메일</label> <input
						type="checkbox" id="SMS"> <label for="SMS">SMS )</label><br />

					<p>마케팅 수신에 동의하지 않으셔도 서비스 이용에 지장이 없으나, 주문 관련 정보는 수신여부에 관계없이
						발송됩니다.</p>
				</div>
			</div>

		</div>
	</form>
	
	<form action="/signup/insert" method="POST">
		<input type="hidden" value="" name="member_opt" id="opt">
		<button class="my-button" onclick="checkAgreement(), validateAgreements()">CONTINUE</button>
	</form>

	<jsp:include page="../../layout/footer.jsp"/>
</body>
</html>