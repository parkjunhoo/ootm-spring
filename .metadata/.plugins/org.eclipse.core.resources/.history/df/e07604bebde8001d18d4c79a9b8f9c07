package kr.team3.ootm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.team3.ootm.dao.inquiry_post.InquiryPostDTO;
import kr.team3.ootm.service.inquiry_post.InquiryPostService;

@Controller
public class InquiryPostContoller {
	@Autowired
	InquiryPostService service;
	
	@RequestMapping(value = "/inquirypost/insert.do", method = RequestMethod.POST)
	public String inquiryInsert(@ModelAttribute InquiryPostDTO inquiryPost) {
		
		service.insert(inquiryPost);
		
		return "redirect:/helpdesk/inquiry";
	}
	
	@RequestMapping(value = "/inquirypost/update.do", method = RequestMethod.POST)
	public String inquiryUpdate(@ModelAttribute InquiryPostDTO inquiryPost) {
		
		service.update(inquiryPost);
		
		return "redirect:/helpdesk/read?id="+inquiryPost.getInquiry_post_id();
	}
}
