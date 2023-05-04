<%@page import="kr.team3.ootm.dao.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 회원 가입/수정</title>
<link rel="icon" href="/images/favicon.ico">
<link rel="stylesheet" href="/css/view/all.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	function goPopup() {
		// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(https://business.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
		var pop = window.open("/signup/addr.popup", "pop",
				"width=570,height=420, scrollbars=yes, resizable=yes");
	}
	function jusoCallBack(roadFullAddr, roadAddrPart1, addrDetail,
			roadAddrPart2, engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn,
			detBdNmList, bdNm, bdKdcd, siNm, sggNm, emdNm, liNm, rn, udrtYn,
			buldMnnm, buldSlno, mtYn, lnbrMnnm, lnbrSlno, emdNo) {
		document.getElementById("haddress1").value = roadAddrPart1;
		document.getElementById("haddress2").value = addrDetail;
		document.getElementById("hpost").value = zipNo;
	}
	//아이디 중복확인 
	function checkDuplicateId() {
		if (!!document.getElementById("checkID")) {
			$('div').remove('#checkID');
		}
		var idNode = document.getElementById("id");
		var member_id=idNode.value;
		var parentNode = document.getElementById("id-element");
		var newDiv = document.createElement("div")
		newDiv.setAttribute("id", "checkID")
		
		$.ajax({
			type:'GET',
			url:"/idcheck.do",
			data:{"member_id":member_id},
			async: false,
			success: function(result){
				if(result==0){
					var text = "사용가능한 아이디입니다."
						newDiv.setAttribute("style", "color:blue; margin-left:150px")
				}else{
					var text = "중복되는 아이디입니다."
						newDiv.setAttribute("style", "color:red; margin-left:150px")
				}
				var text_node = document.createTextNode(text);
				parentNode.appendChild(newDiv);
				document.getElementById("checkID").appendChild(text_node);
			}
		})
	}
	//이메일 change id@naver.com
	
	//이메일 중복확인 
	function checkDuplicateEmail() {
		if (!!document.getElementById("checkEmail")) {
			$('div').remove('#checkEmail');
		}
		var mailNode = document.getElementById("member_email");
		var member_email=mailNode.value
		var parentNode = document.getElementById("email-element");
		var newDiv = document.createElement("div")
		newDiv.setAttribute("id", "checkEmail")
				
		$.ajax({
			type:'GET',
			url:"/emailcheck.do",
			data:{"member_email":member_email},
			async: false,
			success: function(result){
				if (result!=0) {
					var text = "중복되는 메일입니다."
					newDiv.setAttribute("style", "color:red; margin-left:150px")
				} else {
					var text = "사용가능한 메일입니다."
					newDiv.setAttribute("style", "color:blue; margin-left:150px")
				}
				var text_node = document.createTextNode(text);
				parentNode.appendChild(newDiv);
				document.getElementById("checkEmail").appendChild(text_node);
			}
		})
	}
	//비밀번호 확인
	function confirmPassword() {
	if (!!document.getElementById("passcheck")) {
		$('div').remove('#passcheck');
	}
	var pass = document.getElementById("password1").value
	var passconfirm = document.getElementById("password2").value

	if (pass !== passconfirm) {
		var text = "비밀번호가 일치하지 않습니다."
		var parentNode = document.getElementById("pass-confirm");
		var newdiv = document.createElement("div")
		newdiv.setAttribute("style", "color:red; margin-left:150px")
		newdiv.setAttribute("id", "passcheck")

		var text_node = document.createTextNode(text);
		parentNode.appendChild(newdiv);
		document.getElementById("passcheck").appendChild(text_node);
	} else {
		if (!!document.getElementById("passcheck")) {
			$('div').remove('#passcheck');
		}
	}
}
	//휴대폰 글자제한
	
</script>
<style type="text/css">
.all-margin:before, .all-margin:after {
	content: '';
	display: table;
	clear: both;
}

.signup {
	margin: 80px 0;
}

.signup h4 {
	font-size: 16px;
	margin: 0 0 20px;
}

.section-title {
	border-top: 2px solid #222;
	margin: 50px 0 35px;
	padding: 50px 0 0;
}

.form-element {
	position: relative;
}

.signup .form-element {
	max-width: 700px;
	margin-bottom: 10px;
}

.signup .form-element:before, .signup .form-element:after {
	content: '';
	display: table;
}

.signup .form-element:after {
	clear: both;
}

.form-label {
	float: left;
	line-height: 46px;
	width: 150px;
}

label {
	color: #787878;
	display: block;
	margin-bottom: 10px;
}

.form-textbox {
	float: left;
	width: calc(100% - 150px);
	border: 1px solid #c5c5c5;
	display: block;
	font-size: 14px;
	height: 46px;
	outline: none;
	padding: 12px 15px;
}

.textbox-button {
	position: absolute;
	right: 0;
	border: 1px solid #c5c5c5;
	font-weight: 500;
	height: 46px;
	line-height: 44px;
	padding: 0 20px;
	bottom: auto;
}

a {
	display: inline-block;
}

input[type="text"] {
	display: block;
	font-size: 14px;
	float: left;
	height: 46px;
	padding: 12px 15px;
	width: calc(100% - 150px);
	border: 1px solid #c5c5c5;
	outline: none;
}

input[type="radio"] {
	margin-left: 10px;
	margin-right: 5px;
}

.form-title {
	border-top: 1px solid #dcdcdc;
	margin: 50px 0 30px;
	padding-top: 50px;
	position: relative;
}

.signup .zipcode {
	margin-bottom: 0;
}

.zipcode .MS_input_txt {
	border: 1px solid #c5c5c5;
	border-right: none;
	float: left;
	font-size: 14px;
	height: 46px;
	outline: none;
	padding: 12px 15px;
	width: 220px;
}

.signup .zipcode .textbox-button {
	padding: 0;
	position: relative;
	text-align: center;
	width: 100px;
}

.addresses {
	padding-left: 150px;
}

.addresses .form-textbox {
	width: 100%;
	margin-bottom: 10px;
}

.signup-button {
	margin-top: 50px;
	text-align: right;
}

.signup-button .button {
	max-width: 350px;
}

.sub_button {
	border-width: 2px;
	font-size: 15px;
	font-weight: 700;
	height: 50px;
	line-height: 50px;
	text-transform: uppercase;
	width: 100%;
}

.signup-button input {
	max-width: 350px;
	background-color: transparent;
	border: 2px solid #222;
}
</style>
<!-- CSS -->
<link rel="stylesheet" type="text/css" href="/css/test.css" />
</head>
<body>
	<% 
		
	%>
	<jsp:include page="../../layout/header.jsp">
		<jsp:param value="true" name="logoDark" />
		<jsp:param value="true" name="logoHoverDark" />
		<jsp:param value="black" name="mTextColor" />
		<jsp:param value="black" name="menuBtnColor" />
		<jsp:param value="#F9F9F9" name="bgHoverColor" />
		<jsp:param value="white" name="bgScrollColor"/>
	</jsp:include>
	<div class="header"></div>
	<div class="all-margin">
		<div class="page-header">
			<h2>Sign Up</h2>
		</div>

		<div class="signup form-group">
			<form name="form1" method="POST" id="join_form"
				action="/register.do">
				<div class="section-title">
					<h4>회원 정보</h4>
				</div>
				<div class="form-element">
					<label class="form-label">*이름</label> <input type="text"
						name="member_name" id="hname" value="" class="MS_input_txt form-textbox"
						size="15" maxlength="30" />
				</div>
				<div class="form-element" id="id-element">
					<label class="form-label">*아이디</label> <input type="text" name="member_id"
						id="id" value="" class="form-textbox" size="10" maxlength="12">
					<a href="javascript:0" class="textbox-button"
						onclick="checkDuplicateId();">중복확인</a>
				</div>
				<div class="form-element email" id="email-element">
					<label class="form-label">*이메일주소</label> <input type="text" name="member_email"
						id="member_email" class="MS_input_txt MS_input_txt06" size="20"
						maxlength="35"> <a href="javascript:;"
						class="textbox-button" onclick="checkDuplicateEmail();">중복확인</a>
				</div>
				<div class="form-element">
					<label class="form-label">*비밀번호</label> <input type="password"
						name="member_password" id="password1" class="MS_input_txt form-textbox"
						value="" size="15" maxlength="20">
				</div>
				<div class="form-element" id="pass-confirm">
					<label class="form-label">비밀번호확인</label> <input type="password"
						name="password2" id="password2" class="MS_input_txt form-textbox"
						value="" size="15" maxlength="20" onchange="confirmPassword();">
				</div>
				<div class="form-element date-of-birth">
					<label class="form-label">*생년월일(yyyy/mm/dd)</label>  <input type="tel"
						name="member_birth" class="MS_input_txt form-textbox" size="15" maxlength="10">
					&nbsp;&nbsp;<label><input
						type="radio" name="sex" value="-" class="input-radio MS_radio">
						선택안함</label> &nbsp;<label><input type="radio" name="sex" value="1"
						checked="checked" class="MS_radio MS_radio">남</label> <label><input
						type="radio" name="sex" value="2" class="MS_radio MS_radio">여</label>
				</div>



				<div class="form-title">
					<h4>기본 배송지</h4>
				</div>
				<div class="form-element zipcode">
					<label class="form-label">*주소</label> <input type="text"
						name="member_zipcode" form="join_form" id="hpost" class="MS_input_txt"
						value="" size="7" maxlength="15" readonly="readonly"> <a
						href='javascript:;' class="textbox-button" onclick="goPopup();">우편번호
						검색</a>
				</div>
				<div class="form-element addresses">
					<input type="text" name="member_address" form="join_form" id="haddress1"
						class="MS_input_txt form-textbox" value="" size="40"
						maxlength="100" readonly="readonly"> <input type="text"
						name="address2" form="join_form" id="haddress2"
						class="MS_input_txt form-textbox" placeholder="나머지 주소 입력">
				</div>
				<div class="form-element">
					<label class="form-label">연락처</label> <input type="text"
						name="hphone" form="join_form" id="hphone"
						class="MS_input_tel form-textbox" size="15" maxlength="30"
						value="">
				</div>
				<div class="form-element">
					<label class="form-label">*휴대폰</label> <input type="text"
						name="member_telnum" form="join_form" id="etcphone"
						class="MS_input_tel form-textbox" size="15" maxlength="30">
				</div>



				<div class="form-title">
					<h4>선택 정보</h4>
				</div>
				<div class="form-element">
					<label class="form-label">추천인</label> <input type="text"
						name="recommand_id" id="recommand_id" class="form-textbox"
						size="15" maxlength="12"> <a href="#"
						class="textbox-button">아이디 확인</a>
				</div>
				<% String member_opt=(String)request.getAttribute("member_opt"); %>
				<div class="form-element">
					 <input type="hidden"
						name="member_opt" value="<%=member_opt%>"> 
				</div>
				<div class="signup-button">
					<input type="submit" value="가입하기" class="sub_button" />
				</div>

			</form>
		</div>
	</div>
	<div class="footer">
		<jsp:include page="../../layout/footer.jsp"/>
	</div>
</body>
</html>