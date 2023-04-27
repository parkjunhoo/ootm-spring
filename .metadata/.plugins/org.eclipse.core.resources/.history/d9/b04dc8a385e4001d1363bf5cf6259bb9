<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 회원 가입/수정</title>
<link rel="icon" href="/ootm/images/favicon.ico">
<link rel="stylesheet" href="/ootm/css/all.css">
<style type="text/css">
.all-margin:before, .all-margin:after {
    content: '';
    display: table;
    clear: both;
}
.signup{
	margin: 80px 0;
}
.signup h4{
	font-size: 16px;
	margin: 0 0 20px; 
}
.section-title{
	border-top: 2px solid #222;
	margin: 50px 0 35px;
	padding: 50px 0 0;
}
.form-element{
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
.form-label{
    float: left;
    line-height: 46px;
    width: 150px;
}
label {
    color: #787878;
    display: block;
    margin-bottom: 10px;
}

.form-textbox{
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
a{
display: inline-block;
}
input[type="text"]{
    display: block;
    font-size: 14px;
    float: left;
    height: 46px;
    padding: 12px 15px;
    width: calc(100% - 150px);
    border: 1px solid #c5c5c5;
    outline: none;
}
input[type="radio"]{
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
        <link rel="stylesheet" type="text/css" href="/ootm/component/header/header.css"/>
        <link rel="stylesheet" type="text/css" href="/ootm/component/footer/footer.css"/>
        <link rel="stylesheet" type="text/css" href="/ootm/css/test.css"/>
</head>
<body>
	<header-component logoDark="true" logoHoverDark="true" mTextColor="black" bgHoverColor="#F9F9F9" menuBtnColor="black"></header-component>	
	<div class="header">
		
	</div>
	<div class="all-margin">
		<div class="page-header">
			<h2>Sign Up</h2>
		</div>
		
		<div class="signup form-group">
			<form name="form1" method="post" id="join_form" action="/shop/idinfo.html">
				<div class="section-title">
					<h4>회원 정보</h4>
				</div>
				<div class="form-element">
					<label class="form-label">이름</label> <input type="text"
						name="hname" id="hname" value="" class="MS_input_txt form-textbox"
						size="15" maxlength="30"/>
				</div>
				<div class="form-element">
					<label class="form-label">아이디</label> <input type="text" name="id"
						id="id" value="" class="form-textbox" size="10" maxlength="12">
					<a href="#" class="textbox-button">중복확인</a>
				</div>
				<div class="form-element email">
					<label class="form-label">이메일주소</label> <input type="hidden"
						name="oldemail" value=""> <input type="text" name="email"
						id="email" class="MS_input_txt MS_input_txt06" size="20"
						maxlength="35">
					<a href="" class="textbox-button">중복확인</a>
				</div>
				<div class="form-element">
					<label class="form-label">비밀번호</label> <input type="password"
						name="password1" id="password1" class="MS_input_txt form-textbox"
						value="" size="15" maxlength="20">
				</div>
				<div class="form-element">
					<label class="form-label">비밀번호확인</label> <input type="password"
						name="password2" id="password2" class="MS_input_txt form-textbox"
						value="" size="15" maxlength="20">
				</div>
				<div class="form-element date-of-birth">
					<label class="form-label">생일/성별</label> <input type="tel"
						name="birthyear" class="MS_input_txt" size="6"
						maxlength="4">년 <input type="tel" name="birthmonth"
						class="MS_input_txt" size="4" maxlength="2">월 <input
						type="tel" name="birthdate" class="MS_input_txt" size="4"
						maxlength="2">일&nbsp;&nbsp;<label><input
						type="radio" name="sex" value="-" class="input-radio MS_radio">
						선택안함</label> &nbsp;<label><input type="radio" name="sex" value="1"
						checked="checked" class="MS_radio MS_radio">남</label> <label><input
						type="radio" name="sex" value="2" class="MS_radio MS_radio">여</label>
				</div>

				
				
				<div class="form-title">
					<h4>기본 배송지</h4>
				</div>
				<div class="form-element zipcode">
					<label class="form-label">주소</label> <input type="text"
						name="hpost" form="join_form" id="hpost" class="MS_input_txt"
						value="" size="7" maxlength="15" readonly="readonly"> <a
						href="#" class="textbox-button">우편번호 검색</a>
				</div>
				<div class="form-element addresses">
					<input type="text" name="haddress1" form="join_form" id="haddress1"
						class="MS_input_txt form-textbox" value="" size="40"
						maxlength="100" readonly="readonly"> <input type="text"
						name="haddress2" form="join_form" id="haddress2"
						class="MS_input_txt form-textbox" placeholder="나머지 주소 입력">
				</div>
				<div class="form-element">
					<label class="form-label">연락처</label> <input type="text"
						name="hphone" form="join_form" id="hphone"
						class="MS_input_tel form-textbox" size="15" maxlength="30"
						value="">
				</div>
				<div class="form-element">
					<label class="form-label">휴대폰</label> <input type="text"
						name="etcphone" form="join_form" id="etcphone"
						class="MS_input_tel form-textbox" size="15" maxlength="30">
				</div>

				
				
				<div class="form-title">
					<h4>선택 정보</h4>
				</div>
				<div class="form-element">
					<label class="form-label">추천인</label> <input type="text"
						name="recommand_id" id="recommand_id" class="form-textbox"
						size="15" maxlength="12"> <a
						href="#" class="textbox-button">아이디 확인</a>
				</div>
				<div class="signup-button">
					<input type="submit" value="가입하기" class="sub_button" />
				</div>

			</form>
		</div>
	</div>
	<div class="footer">
	<footer-component/>
	</div>
	<script src="../component/header/header.js"></script>
    <script src="../component/footer/footer.js"></script>
</body>
</html>