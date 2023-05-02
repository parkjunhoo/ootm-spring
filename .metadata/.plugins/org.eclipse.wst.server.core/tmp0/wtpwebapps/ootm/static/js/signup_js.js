/**
 * 
 */
function checkAll() {
	var full_agreement = document.getElementById("full_agreement");
	var terms_of_use = document.getElementById("terms_of_use");
	var information_use = document.getElementById("information_use");
	var Marketing_opt_in = document.getElementById("Marketing_opt_in");
	var email = document.getElementById("email");
	var SMS = document.getElementById("SMS");

	if (full_agreement.checked) {
		terms_of_use.checked = true;
		information_use.checked = true;
		Marketing_opt_in.checked = true;
		email.checked = true;
		SMS.checked = true;
	} else {
		terms_of_use.checked = false;
		information_use.checked = false;
		Marketing_opt_in.checked = false;
		email.checked = false;
		SMS.checked = false;
	}
	// 전체동의 체크박스 클릭시 모든 체크박스 선택/해제
	document.getElementById("full_agreement").addEventListener("click", function() {
		var checkBoxes = document.querySelectorAll('input[type="checkbox"]');
		for (var i = 0; i < checkBoxes.length; i++) {
			if (checkBoxes[i].id !== "full_agreement") {
				checkBoxes[i].checked = this.checked;
			}
		}
	});

	// 다른 체크박스 클릭시 전체동의 체크박스 선택 해제
	var otherCheckBoxes = document.querySelectorAll('input[type="checkbox"]:not(#full_agreement)');
	for (var i = 0; i < otherCheckBoxes.length; i++) {
		otherCheckBoxes[i].addEventListener("click", function() {
			var allChecked = true;
			var checkBoxes = document.querySelectorAll('input[type="checkbox"]:not(#full_agreement)');
			for (var i = 0; i < checkBoxes.length; i++) {
				if (!checkBoxes[i].checked) {
					allChecked = false;
					break;
				}
			}
			document.getElementById("full_agreement").checked = allChecked;
		});
	}

	// 마케팅 수신동의 체크박스 클릭시 이메일, SMS 체크박스도 함께 선택
	document.getElementById("Marketing_opt_in").addEventListener("click", function() {
		var checkBoxes = document.querySelectorAll('#email, #SMS');
		for (var i = 0; i < checkBoxes.length; i++) {
			checkBoxes[i].checked = this.checked;
		}
	});


}

//이용약관 체크가 안되어있을 떄
const fullAgreeCheckbox = document.getElementById("full_agreement");
const termsOfUseCheckbox = document.getElementById("terms_of_use");
const informationUseCheckbox = document.getElementById("information_use");
const marketingOptInCheckbox = document.getElementById("Marketing_opt_in");
const emailCheckbox = document.getElementById("email");
const smsCheckbox = document.getElementById("SMS");
const continueButton = document.querySelector(".my-button");

function checkFullAgreement() {
	if (fullAgreeCheckbox.checked) {
		termsOfUseCheckbox.checked = true;
		informationUseCheckbox.checked = true;
		marketingOptInCheckbox.checked = true;
		emailCheckbox.checked = true;
		smsCheckbox.checked = true;
	} else {
		termsOfUseCheckbox.checked = false;
		informationUseCheckbox.checked = false;
		marketingOptInCheckbox.checked = false;
		emailCheckbox.checked = false;
		smsCheckbox.checked = false;
	}
}
//왜 안됨.......
function validateAgreements() {
	if (!termsOfUseCheckbox.checked || !informationUseCheckbox.checked) {
		alert("이용약관과 개인정보 수집 이용에 동의해주시기 바랍니다.");
		return false;
	}
	return true;
}

fullAgreeCheckbox.addEventListener("click", checkFullAgreement);
termsOfUseCheckbox.addEventListener("click", function() {
	if (!termsOfUseCheckbox.checked) {
		fullAgreeCheckbox.checked = false;
	}
});
informationUseCheckbox.addEventListener("click", function() {
	if (!informationUseCheckbox.checked) {
		fullAgreeCheckbox.checked = false;
	}
});
marketingOptInCheckbox.addEventListener("click", function() {
	if (marketingOptInCheckbox.checked) {
		emailCheckbox.checked = true;
		smsCheckbox.checked = true;
	}
});
continueButton.addEventListener("click", validateAgreements);



