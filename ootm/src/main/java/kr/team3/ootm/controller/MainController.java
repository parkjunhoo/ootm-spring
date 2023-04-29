package kr.team3.ootm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.service.product.ProductService;

@Controller
public class MainController {
	@Autowired
	ProductService service;
	
	@RequestMapping(value = "/")
	public ModelAndView main() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("bestProductList", service.selectBestProduct(14));
		model.put("newProductList", service.selectNewProduct(10));
		ModelAndView mav = new ModelAndView("main/index", model);
		return mav;
	}
}
