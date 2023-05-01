package kr.team3.ootm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.member.MemberDTO;
import kr.team3.ootm.service.member.MemberService;

@Controller
public class LoginController {

	@Autowired
	private MemberService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute MemberDTO member, HttpServletRequest request, Model model) {
		System.out.println(member);
		MemberDTO loginUser = service.login(member);

		ModelAndView mav = new ModelAndView();

		if (loginUser != null) { // 로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
			mav.addObject("name", loginUser.getMember_name()); // View에 전달할 데이터 추가
			mav.setViewName("redirect:/mypage");
		} else { // 로그인 실패

			mav.addObject("message", "아이디 또는 비밀번호가 일치하지 않습니다."); // View에 전달할 데이터 추가
			mav.setViewName("/login");
		}
		return mav; // 로그인 후 이동할 페이지 URL
	}
}