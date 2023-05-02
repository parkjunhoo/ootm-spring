package kr.team3.ootm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.review.ReviewDTO;
import kr.team3.ootm.service.review.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	ReviewService service;
	
	@RequestMapping("/review/insert.do")
	public String showPage(ReviewDTO review) {
		service.insert(review);
		System.out.println(review);
		return "redirect:/product-detail";
	}
	@RequestMapping("/review/read.do")
	public ModelAndView read(int product_id,String state) {
		ModelAndView mav = new ModelAndView();
		//서비스메소드 호출
		ReviewDTO review = service.read(product_id);
		//데이터공유
		mav.addObject("review",review);
		//뷰정보셋팅
		String view = "";
		view = "redirect:/product-detail";
		mav.setViewName(view);
		return mav;
	}
	
}
