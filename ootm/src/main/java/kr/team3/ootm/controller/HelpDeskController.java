package kr.team3.ootm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.member.MemberDTO;
import kr.team3.ootm.service.inquiry_post.InquiryPostService;
import util.LoginManager;

@Controller
public class HelpDeskController {

	@Autowired
	InquiryPostService InquiryService;

	@RequestMapping(value = "/helpdesk/qna")
	public ModelAndView qna() {
		ModelAndView mav = new ModelAndView("helpdesk/helpdesk");
		mav.addObject("desk", "qna");
		return mav;
	}

	@RequestMapping(value = "/helpdesk/inquiry")
	public ModelAndView inquiry() {
		ModelAndView mav = new ModelAndView("helpdesk/helpdesk");
		mav.addObject("desk", "inquiry");
		mav.addObject("inquiryPostList", InquiryService.selectAllInquiryPost());
		return mav;
	}

	@RequestMapping(value = "/helpdesk/notice")
	public ModelAndView notice() {
		ModelAndView mav = new ModelAndView("helpdesk/helpdesk");
		mav.addObject("desk", "notice");
		return mav;
	}

	@RequestMapping(value = "/helpdesk/returns")
	public ModelAndView returns() {
		ModelAndView mav = new ModelAndView("helpdesk/helpdesk");
		mav.addObject("desk", "returns");
		return mav;
	}

	@RequestMapping(value = "/helpdesk/write")
	public ModelAndView write(HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		
		MemberDTO loginUser = LoginManager.getLoginUserDTO(session);
		
		if(loginUser == null) {
			mav.setViewName("/login");
			LoginManager.setSendAfterLogin(session, "/helpdesk/write");
		}else {
			mav.setViewName("helpdesk/helpdesk");
		}
		
		mav.addObject("desk", "write");
		return mav;
	}
	@RequestMapping(value = "/helpdesk/read")
	public ModelAndView read(HttpSession session) {
		MemberDTO member = LoginManager.getLoginUserDTO(session);
		ModelAndView mav = new ModelAndView();
		if(member == null) {
			
		}
		
		mav.addObject("desk", "read");
		return mav;
	}

}
