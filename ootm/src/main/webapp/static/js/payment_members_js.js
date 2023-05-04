/**
 * 
 */

//주문정보와 동일 버튼 기능
function copyBillingToShipping() {
	var billingName = document.getElementById('user_name').value;
	var billingPhone1 = document.getElementById('phone_number1').value;
	var billingPhone2 = document.getElementById('phone_number2').value;
	var billingPhone3 = document.getElementById('phone_number3').value;
	var shippingName = document.getElementById('shipping_user_name');
	var shippingPhone1 = document.getElementById('shipping_phone_number1');
	var shippingPhone2 = document.getElementById('shipping_phone_number2');
	var shippingPhone3 = document.getElementById('shipping_phone_number3');
	var copyBilling = document.getElementById('shipping');

	// 체크박스가 체크되면 배송정보 필드에 값을 할당하고
	// 체크 해제되면 배송정보 필드의 값을 제거
	if (copyBilling.checked) {
		shippingName.value = billingName;
		shippingPhone1.value = billingPhone1;
		shippingPhone2.value = billingPhone2;
		shippingPhone3.value = billingPhone3;
	} else {
		shippingName.value = '';
		shippingPhone1.value = '';
		shippingPhone2.value = '';
		shippingPhone3.value = '';
	}
}

var copyBilling = document.getElementById('shipping');
copyBilling.addEventListener('click', copyBillingToShipping);


//최근배송지에서 체크박스가 하나만 선택될 수 있도록 설정하는 기능
function handleCheckboxClick(clickedCheckbox) {
	const checkboxes = document.querySelectorAll('input[type="checkbox"]');
	checkboxes.forEach((checkbox) => {
		if (checkbox !== clickedCheckbox) {
			checkbox.checked = false;
		}
	});
}


//우편번호검색 팝업 ==> 중복해서 뜨는 문제 해결
const post_btn = document.querySelector("#post_button"); // 버튼 아이디
post_btn.addEventListener("click", searchAddress);

function searchAddress() {
  new daum.Postcode({
    oncomplete: function (data) {
      // 팝업에서 검색결과 항목을 클릭했을 때 실행할 코드를 작성하는 부분
      console.log(data);
      //document.form1.address_code1.value = data.zonecode; //우편번호 넣기
      document.getElementById("address_code1").value = data.zonecode; //우편번호 넣기
      document.getElementById("address_code2").value = data.address; //주소 넣기 ==> 도로명만 들어감...
    },
  }).open();
}


//결제정보 체크박스 따로 눌리게..
function handleCheckboxChange1() {
	const kakaopay = document.getElementById("kakaopay");
	const bankbook = document.getElementById("bankbook");
	const credit_card = document.getElementById("credit_card");
	const mobile_payment = document.getElementById("mobile_payment");

	kakaopay.addEventListener("click", function() {
		bankbook.checked = false;
		credit_card.checked = false;
		mobile_payment.checked = false;
	});

	bankbook.addEventListener("click", function() {
		kakaopay.checked = false;
		credit_card.checked = false;
		mobile_payment.checked = false;
	});

	credit_card.addEventListener("click", function() {
		kakaopay.checked = false;
		bankbook.checked = false;
		mobile_payment.checked = false;
	});

	mobile_payment.addEventListener("click", function() {
		kakaopay.checked = false;
		bankbook.checked = false;
		credit_card.checked = false;
	});


	paymentMethods.forEach(checkbox => {
		checkbox.addEventListener("change", handleCheckboxChange);
	});
}

//==> 무통장 입급 선택시 select 가져오기
function toggleSelect() {
	const bankbookCheckbox = document.getElementById('bankbook');
	const selectContainer = document.getElementById('dropdown1');

	if (bankbookCheckbox.checked) {
		selectContainer.style.display = 'block';
	} else {
		selectContainer.style.display = 'none';
	}
}

const bankbookCheckbox = document.getElementById('bankbook');
bankbookCheckbox.addEventListener('change', toggleSelect);


//현금영수증 발급 여부에 따른 select 태그 가져오기
function handleCheckboxChange2() {
	const cashReceiptsNoCheckbox = document.getElementById("cash_receipts_no");
	const cashReceiptsYesCheckbox = document.getElementById("cash_receipts_yes");
	const dropdown = document.getElementById("dropdown2");
	const phoneNumberContainer = document.getElementById("phone_number_container");
	const businessNumberContainer = document.getElementById("business_number_container");
	const revenueContainer = document.getElementById("revenue_container");

	if (cashReceiptsNoCheckbox.checked) {
		dropdown.style.display = "none";
		phoneNumberContainer.style.display = "none";
		businessNumberContainer.style.display = "none";
		revenueContainer.style.display = "none";
	} else if (cashReceiptsYesCheckbox.checked) {
		dropdown.style.display = "inline-block";

		if (dropdown.value === "phone_number") {
			phoneNumberContainer.style.display = "block";
			businessNumberContainer.style.display = "none";
			revenueContainer.style.display = "none";
		} else if (dropdown.value === "business_number") {
			phoneNumberContainer.style.display = "none";
			businessNumberContainer.style.display = "block";
			revenueContainer.style.display = "none";
		} else if (dropdown.value === "revenue") {
			phoneNumberContainer.style.display = "none";
			businessNumberContainer.style.display = "none";
			revenueContainer.style.display = "block";
		}
	}
}

function handleCheckboxChange3() {
	const cashReceiptsNo = document.getElementById("cash_receipts_no");
	const cashReceiptsYes = document.getElementById("cash_receipts_yes");
	const dropdown2 = document.getElementById("dropdown2");

	cashReceiptsNo.addEventListener("click", function() {
		cashReceiptsYes.checked = false; // 발급 체크박스의 체크 해제
		dropdown2.style.display = "none"; // select 태그 숨김
	});

	cashReceiptsYes.addEventListener("click", function() {
		cashReceiptsNo.checked = false; // 발급 안 함 체크박스의 체크 해제
		dropdown2.style.display = "block"; // select 태그 보이게 함
	});

	dropdown2.addEventListener("change", function() {
		const phoneContainer = document.getElementById("phone_number_container");
		const businessContainer = document.getElementById("business_number_container");
		const revenueContainer = document.getElementById("revenue_container");

		// 모든 input 태그 숨김
		phoneContainer.style.display = "none";
		businessContainer.style.display = "none";
		revenueContainer.style.display = "none";

		if (this.value === "phone_number") {
			phoneContainer.style.display = "block"; // 핸드폰 번호 input 태그 보이게 함
		} else if (this.value === "business_number") {
			businessContainer.style.display = "block"; // 사업자 번호 input 태그 보이게 함
		} else if (this.value === "revenue") {
			revenueContainer.style.display = "block"; // 국세청 현금영수증 카드 input 태그 보이게 함
		}
	});
}

//보유적립금 
function getUseableMoney() {
    let reserves = parseInt(document.getElementById('reserves').value);
    // 토탈 가격을 가져오고, 적립금을 빼기
    let totalAmount = 747000; //***************가격 변동 있을시 수정해야함******************
    let finalAmount = totalAmount - reserves;
    // 최종 금액을 화면에 출력
    document.querySelector(".total_price").innerText = finalAmount.toLocaleString() + " 원";
}

function useAllReserves() {
  var reservesInput = document.getElementById("reserves");
  var reservesCheckbox = document.getElementById("reserve_box");
  var okReservesInput = document.getElementById("okreserve");
  var salePrice = document.querySelector(".sale_price");
  var totalPrice = parseInt(document.querySelector(".product_price").getAttribute("price"));

  if (reservesCheckbox.checked) {
    var availableReserves = parseInt(okReservesInput.value.replace(/[^0-9]/g, ""));
    if (availableReserves > 0) {
      reservesInput.value = availableReserves;
      okReservesInput.value = "0";
      var discountPrice = totalPrice - availableReserves;
      salePrice.innerText = "-" + availableReserves.toLocaleString() + " 원";
    }
  } else {
    var usedReserves = parseInt(reservesInput.value.replace(/[^0-9]/g, ""));
    if (usedReserves > 0) {
      var currentReserves = parseInt(okReservesInput.value.replace(/[^0-9]/g, ""));
      okReservesInput.value = (currentReserves + usedReserves) + "";
      reservesInput.value = "0";
      var discountPrice = totalPrice;
      salePrice.innerText = "-" + currentReserves.toLocaleString() + " 원";
    }
  }

  // Update the total price with the discount applied
  document.querySelector(".total_price").innerText = discountPrice.toLocaleString() + " 원";
  // 최종 금액 갱신
  getUseableMoney();
}

// 페이지 로드 시 최초 실행
$(document).ready(function () {
    getUseableMoney();
});



//결제하기 버튼 클릭시 필수정보 입력 여부 확인
function submitForm(event) {
  event.preventDefault();

  var form = document.getElementById('order_form');

  if (form.checkValidity()) {
    alert('결제가 완료되었습니다.');
    window.location.href = "/";
  } else {
    var invalidElement = form.querySelector(':invalid'); //받아옴
    var errorMessage;

    switch (invalidElement.id) {
  case 'name':
    errorMessage = '이름을 입력해주세요.';
    break;
  case 'contact':
    errorMessage = '연락처를 입력해주세요.';
    break;
  case 'address':
    errorMessage = '주소를 입력해주세요.';
    break;
  case 'pay_method':
    errorMessage = '결제 방법을 체크해주세요.';
    break;
  case 'receipt':
    errorMessage = '현금 영수증 체크 여부를 확인해주세요.';
    break;
  case 'pay_agree':
    errorMessage = '주문 및 결제 정보 동의를 체크해주세요.';
    break;
  default:
    errorMessage = '모든 필드를 채워주세요.';
}

    alert(errorMessage);
    invalidElement.scrollIntoView();
  }
}

//최근배송지 체크박스 클릭하면 최근배송지 받아서 input태그에 뿌려줌.
//jsp <script></script>에 구현.. 여기서 받으면 undefined



