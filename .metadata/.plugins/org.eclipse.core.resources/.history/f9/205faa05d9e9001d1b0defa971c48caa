package kr.team3.ootm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.service.inquiry_proudct_post.InquiryProductPostService;
import kr.team3.ootm.service.product.ProductService;
import kr.team3.ootm.service.product_image.ProductImageService;
import kr.team3.ootm.service.review.ReviewService;
import kr.team3.ootm.service.wishlist.WishlistService;

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
	public ModelAndView productDetail(@RequestParam int id , HttpSession session) {
		ModelAndView mav = new ModelAndView("product");
		
		
		return mav;
	}
	
}
