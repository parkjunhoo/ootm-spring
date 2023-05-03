package kr.team3.ootm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.team3.ootm.dao.wishlist.WishlistDTO;
import kr.team3.ootm.service.wishlist.WishlistService;

@Controller
public class WishlistController {
	
	@Autowired
	WishlistService service;
	
	@RequestMapping(value = "/wishlist/insert.do", method = RequestMethod.POST)
	public String inquiryInsert(@ModelAttribute WishlistDTO wishlist) {
		
		service.insert(wishlist);
		
		return "redirect:/product-detail?product_id="+wishlist.getProduct_id();
	}
	
	@RequestMapping(value = "/wishlist/delete.do", method = RequestMethod.POST)
	public String inquiryDelete(@RequestParam int wishlist_id , @RequestParam int product_id) {
		
		service.delete(wishlist_id);
		
		return "redirect:/product-detail?product_id="+product_id;
	}
}
