package kr.team3.ootm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductPageController {

	@RequestMapping(value = "/product")
	public String product() {
		return "product/product";
	}
}
