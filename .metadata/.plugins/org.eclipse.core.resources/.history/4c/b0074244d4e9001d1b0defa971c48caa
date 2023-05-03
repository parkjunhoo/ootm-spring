package kr.team3.ootm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.product.ProductDAO;
import kr.team3.ootm.dao.product.ProductDTO;
import kr.team3.ootm.dao.review.ReviewDTO;
import kr.team3.ootm.service.review.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	ReviewService reviewservice;
	@Autowired
	ProductDAO productservice;
	
	@RequestMapping("/review/insert.do")
	public String showPage(ReviewDTO review,String product_id) {
		reviewservice.insert(review);
		System.out.println(review);
		return "redirect:/review/read.do?product_id="+product_id;
	}
	
	@RequestMapping("/review/read.do")
	public ModelAndView read(int product_id) {
		ModelAndView mav = new ModelAndView();
		//서비스메소드 호출
		List<ReviewDTO> review = reviewservice.read(product_id);
		ProductDTO product = productservice.read(product_id);
		//데이터공유
		mav.addObject("review",review);
		mav.addObject("product",product);
		//System.out.println(review);
		//뷰정보셋팅
		String view = "";
		view = "product_detail/product_detail";	
		mav.setViewName(view);
		return mav;
	}
	
//	@RequestMapping("/product_detail")
//	public String showProductDetail(@ModelAttribute("review") List<ReviewDTO> review,Model model) {
//		  model.addAttribute("review", review);
//		  System.out.println(model.addAttribute("review", review));
//		    return "product-detail";
//	}
}
