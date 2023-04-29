package kr.team3.ootm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {

	@RequestMapping(value = "/signup/term")
	public String signup_term() {
		return "signup/signup_term";
	}

	@RequestMapping(value = "/signup/insert")
	public String signup_insert() {
		return "signup/signup_insert";
	}

	@RequestMapping(value = "/signup/addr.popup")
	public String signup_addr() {
		return "signup/jusoPopup";
	}

	///////////////////////////////////////////

	@RequestMapping(value = "/mypage/coupon")
	public String mypage_coupon() {
		return "mypage/mypage_coupon";
	}

	@RequestMapping(value = "/mypage/deposit")
	public String mypage_deposit() {
		return "mypage/mypage_deposit";
	}

	@RequestMapping(value = "/mypage/inquiry")
	public String mypage_inquiry() {
		return "mypage/mypage_inquiry";
	}

	@RequestMapping(value = "/mypage")
	public String mypage_main() {
		return "mypage/mypage_main";
	}

	@RequestMapping(value = "/mypage/orderlist")
	public String mypage_orderlist() {
		return "mypage/mypage_orderlist";
	}

	@RequestMapping(value = "/mypage/reserve")
	public String mypage_reserve() {
		return "mypage/mypage_reserve";
	}

	@RequestMapping(value = "/mypage/wishlist")
	public String mypage_wishlist() {
		return "mypage/mypage_wishlist";
	}

	/////////////////////////////////////////////
	@RequestMapping(value = "/find")
	public String find() {
		return "find/find";
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/product")
	public String product() {
		return "product/product";
	}

	////////////////////////////////////////////////
	@RequestMapping(value = "/product-detail")
	public String product_detail() {
		return "product_detail";
	}
	/////////////////////////////////////////////////

	@RequestMapping(value = "/payment")
	public String payment() {
		return "payment";
	}
	/////////////////////////////////////////////////

}
