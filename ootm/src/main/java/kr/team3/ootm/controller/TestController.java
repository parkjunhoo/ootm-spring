package kr.team3.ootm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.inquiry_post.InquiryPostDTO;
import kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO;
import kr.team3.ootm.dao.member.MemberDTO;
import kr.team3.ootm.dao.product.ProductDTO;
import kr.team3.ootm.dao.wishlist.WishlistDTO;
import kr.team3.ootm.service.inquiry_post.InquiryPostService;
import kr.team3.ootm.service.inquiry_proudct_post.InquiryProductPostService;
import kr.team3.ootm.service.product.ProductService;
import kr.team3.ootm.service.wishlist.WishlistService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {

	@Autowired
	WishlistService wishService;
	
	@Autowired
	InquiryPostService inquiryService;
	
	@Autowired
	InquiryProductPostService inquiryProductService;
	
	@Autowired
	ProductService productService;
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
	public ModelAndView mypage_inquiry(HttpSession session) {
		ModelAndView mav = new ModelAndView("mypage/mypage_inquiry");
		
		MemberDTO member = (MemberDTO)session.getAttribute("loginUser");
		String memberId = member.getMember_id();
		List<InquiryPostDTO> inquiryList = inquiryService.selectAllInquiryPostByMemberId(memberId);
		List<InquiryProductPostDTO> inquiryProductList = inquiryProductService.selectAllInquiryPostByMemberId(memberId);
		
		mav.addObject("inquiryList",inquiryList);
		
		mav.addObject("inquiryProductList",inquiryProductList);
		
		
		return mav;
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
	public ModelAndView mypage_wishlist(HttpSession session) {
		ModelAndView mav = new ModelAndView("mypage/mypage_wishlist");
		
		MemberDTO member = (MemberDTO)session.getAttribute("loginUser");
		List<WishlistDTO> wishList = wishService.selectByMemberId(member.getMember_id());
		ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();
		for(WishlistDTO wish : wishList) {
			productList.add(productService.read(wish.getProduct_id()));
		}
		
		mav.addObject("productList",productList);
		
		
		return mav;
	}

	/////////////////////////////////////////////
	@RequestMapping(value = "/find")
	public String find() {
		return "find/find";
	}

	@RequestMapping(value = "/payment/popup")
	public String paymentpopup() {
		return "payment/payment";
	}
	/////////////////////////////////////////////////

}
