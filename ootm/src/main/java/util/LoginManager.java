package util;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import kr.team3.ootm.dao.member.MemberDTO;
import kr.team3.ootm.service.member.MemberService;
import util.define.ProductSubCategory;

public class LoginManager {
	@Autowired
	MemberService service;
	
	/**
	 * 멤버DTO를 반환, 세션에서 로그인loginUser속성이 없을시 null반환
	 * @param session
	 * @return 멤버DTO를 반환, 세션에서 로그인loginUser속성이 없을시 null반환
	 */
	public static MemberDTO getLoginUserDTO(HttpSession session) {
		MemberDTO member = (MemberDTO)session.getAttribute("loginUser");
		if(member != null) {
			session.removeAttribute("sendAfterLogin");
		}
		
		return member;
	}
	
	/***
	 * 멤버DTO가 필요하지 않지만 로그인체크는 해야되는경우, 
	 * @param session
	 * @return 멤버DTO가 필요하지 않지만 로그인체크는 해야되는경우, true or false 리턴
	 */
	public static boolean isLoggedIn(HttpSession session) {
		// 세션 바궈치기하면? todo => 미니프로젝트에서 그런거까진하지 말자
		return session.getAttribute("loginUser") != null ? true : false;
	}
	
	
	/***
	 * 로그인이 끝난뒤 redirect될 페이지를 셋팅 기본값이 redirect:이다.
	 * @param session
	 * @param path
	 */
	public static void setSendAfterLogin(HttpSession session, String path) {
		session.setAttribute("sendAfterLogin", ("redirect:"+path));
	}
	
	/***
	 * sendAfterLogin 어트리뷰트를 세션에서 받아온다. 설정된게 없으면 null
	 * @param session
	 * @return
	 */
	public static String getSendAfterLogin(HttpSession session) {
		return (String)session.getAttribute("sendAfterLogin");
	}
	
	public static void removeLoginUser(HttpSession session) {
		session.removeAttribute("loginUser");
		session.invalidate();
	}
	
}
