package kr.team3.ootm.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelpDeskController {
	
	@RequestMapping(value = "/helpdesk")
	public String helpdesk(HttpServletRequest req) {
		if(req.getAttribute("desk") == null) {
			req.setAttribute("desk", "qna");
		}
		return "helpdesk/helpdesk";
	}
}
