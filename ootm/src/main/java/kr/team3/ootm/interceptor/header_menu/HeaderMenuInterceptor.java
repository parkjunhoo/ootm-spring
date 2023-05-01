package kr.team3.ootm.interceptor.header_menu;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.header_menu.HeaderMenuDTO;
import kr.team3.ootm.dao.header_sub_menu.HeaderSubMenuDTO;
import kr.team3.ootm.service.header_menu.HeaderMenuService;
import kr.team3.ootm.service.header_sub_menu.HeaderSubMenuService;

public class HeaderMenuInterceptor implements HandlerInterceptor{

	@Autowired
	HeaderMenuService service;
	@Autowired
	HeaderSubMenuService service2;
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		//컨트롤러의 메서드가 호출되기 전 return false = 컨트롤러 호출 중단
		HttpSession session = req.getSession();
		
		if(session.getAttribute("headerMenuList") == null || session.getAttribute("headerSubMenuList") == null){
			session.setAttribute("headerMenuList", (ArrayList<HeaderMenuDTO>)(service.selectALL()));
			session.setAttribute("headerSubMenuList", (ArrayList<HeaderSubMenuDTO>)(service2.selectALL()));
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//컨트롤러의 메서드가 실행된 후
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 렌더링 된 후 
	}

}
