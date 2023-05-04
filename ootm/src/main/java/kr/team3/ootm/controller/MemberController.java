package kr.team3.ootm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.member.MemberDTO;
import kr.team3.ootm.service.member.MemberService;
import util.LoginManager;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute MemberDTO member, HttpSession session, Model model) {
		ModelAndView mav = new ModelAndView();
		String errorMessage = "아이디 또는 비밀번호가 일치하지 않습니다.";
		MemberDTO loginUser = service.login(member);
		if(loginUser == null) {
			mav.setViewName("/login");
			return mav;
		}
		
		if(loginUser.getMember_status().equals("1")) {
			loginUser = null;
			errorMessage = "탈퇴한 회원입니다";
		}
		
		

		if (loginUser != null) { // 로그인 성공
			session.setAttribute("loginUser", loginUser);
			
			String sendAfterLogin = LoginManager.getSendAfterLogin(session);
			if(sendAfterLogin != null) {
				mav.setViewName(sendAfterLogin);
				session.removeAttribute("sendAfterLogin");
			}else {
				mav.setViewName("redirect:/mypage");
			}
			
			//System.out.println(loginUser.getMember_name()+"로그인 완료.");
		} else { // 로그인 실패
			//System.out.println(errorMessage);
			mav.addObject("message", errorMessage); // View에 전달할 데이터 추가
			mav.setViewName("/login");
		}
		return mav; // 로그인 후 이동할 페이지 URL
	}
	
	
	@RequestMapping(value = "/signup/term")
	public String signup_term() {
		return "signup/signup_term";
	}

	@RequestMapping(value = "/signup/insert")
	public ModelAndView signup_insert(String member_opt) {
		ModelAndView mav=new ModelAndView("signup/signup_insert");
		mav.addObject("member_opt", member_opt);
		
		return mav;
				
	}

	@RequestMapping(value = "/signup/addr.popup")
	public String signup_addr() {
		return "signup/jusoPopup";
	}
	
	@RequestMapping("/register.do")
	public String register(MemberDTO member,String address2) {
		member.setMember_address(member.getMember_address()+" "+address2);
		//System.out.println("<확인1>member값: "+member.getMember_address());
		service.register(member);
		return "redirect:/login";
	}
	
	@RequestMapping("/delete/member")
	public String memDelete(String member_id , HttpSession session) {
		service.withdraw(member_id);
		
		LoginManager.removeLoginUser(session);
		
		return "redirect:/";
	}
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		LoginManager.removeLoginUser(session);
		return "redirect:/login";
	}
	@ResponseBody
	@RequestMapping("/idcheck.do")
	public int id_check(String member_id) {
		int result= service.id_check(member_id);
		return result;
	}
	@ResponseBody
	@RequestMapping("/emailcheck.do")
	public int email_check(String member_email) {

		int result= service.email_check(member_email);
		return result;
	}
}