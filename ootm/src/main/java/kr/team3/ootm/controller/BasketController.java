package kr.team3.ootm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasketController {
	
	@RequestMapping(value = "/basket")
	public String basket() {
		return "basket";
	}
}
