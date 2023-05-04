package kr.team3.ootm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO;
import kr.team3.ootm.dao.member.MemberDTO;
import kr.team3.ootm.dao.product.ProductDTO;
import kr.team3.ootm.dao.product_image.ProductImageDTO;
import kr.team3.ootm.dao.review.ReviewDTO;
import kr.team3.ootm.dao.wishlist.WishlistDTO;
import kr.team3.ootm.service.inquiry_proudct_post.InquiryProductPostService;
import kr.team3.ootm.service.product.ProductService;
import kr.team3.ootm.service.product_image.ProductImageService;
import kr.team3.ootm.service.review.ReviewService;
import kr.team3.ootm.service.wishlist.WishlistService;
import util.LoginManager;

@Controller
public class ProductDetailController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ProductImageService productImageService;
	
	@Autowired
	WishlistService wishlistService;
	
	@Autowired
	ReviewService reviewService;
	
	@Autowired
	InquiryProductPostService inquiryService;
	
	@RequestMapping(value = "/product-detail")
	public ModelAndView productDetail(@RequestParam int product_id , HttpSession session , HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("product_detail/product_detail");
		MemberDTO loginUser = LoginManager.getLoginUserDTO(session);
		String member_id = "";
		if(loginUser != null) {
			member_id = loginUser.getMember_id();
		}
		ProductDTO product = productService.read(product_id);
		List<ProductImageDTO> productImageList = productImageService.selectByProductId(product_id);
		WishlistDTO wishlist = null;
		if(loginUser!=null) {
			wishlist = wishlistService.readByProductIdAndMemberId(product_id, member_id);
		}
		List<ReviewDTO> reviewList = reviewService.selectByProductId(product_id);
		List<InquiryProductPostDTO> inquiryList = inquiryService.selectAllInquiryPostByProductId(product_id);
		
		mav.addObject("product",product);
		mav.addObject("productImageList",productImageList);
		mav.addObject("wishlist",wishlist);
		mav.addObject("reviewList",reviewList);
		mav.addObject("inquiryList",inquiryList);
		
		
		
		return mav;
	}
	
}
