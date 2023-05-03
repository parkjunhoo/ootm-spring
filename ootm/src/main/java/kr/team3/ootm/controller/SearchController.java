package kr.team3.ootm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.product.ProductDTO;
import kr.team3.ootm.service.product.ProductService;

@Controller
public class SearchController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping(value = "/search")
	public ModelAndView search(@RequestParam String keyword) {
		ModelAndView mav = new ModelAndView("search");
		
		List<ProductDTO> searchResult = service.selectByKeyword(keyword);
		
		mav.addObject("searchResult",searchResult);
		return mav;
	}
}
