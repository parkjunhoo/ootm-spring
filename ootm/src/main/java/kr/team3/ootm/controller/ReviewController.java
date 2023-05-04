package kr.team3.ootm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	public String showPage(ReviewDTO review,String product_id, HttpServletRequest req) {
		reviewservice.insert(review);
		
		req.getSession().setAttribute("detailScroll", "toReview");
		
		return "redirect:/product-detail/?product_id="+product_id;
	}
}
