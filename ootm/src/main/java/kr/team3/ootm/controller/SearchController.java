package kr.team3.ootm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {
	
	@RequestMapping(value = "/search")
	public String search() {
		return "search";
	}
}
