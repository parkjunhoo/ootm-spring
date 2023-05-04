package kr.team3.ootm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO;
import kr.team3.ootm.service.inquiry_proudct_post.InquiryProductPostService;

@Controller
public class InquiryProductPostContoller {
	@Autowired
	InquiryProductPostService service;
	
	@RequestMapping(value = "/inquiryproductpost/insert.do", method = RequestMethod.POST)
	public String inquiryProductInsert(@ModelAttribute InquiryProductPostDTO inquiryProductPost , HttpServletRequest req) {
		
		service.insert(inquiryProductPost);
		
		req.getSession().setAttribute("detailScroll", "toInquiry");

		
		return "redirect:/product-detail?product_id="+inquiryProductPost.getProduct_id();
	}
	
}
