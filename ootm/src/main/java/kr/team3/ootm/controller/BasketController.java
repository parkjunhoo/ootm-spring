package kr.team3.ootm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.cart.CartDTO;
import kr.team3.ootm.dao.member.MemberDTO;
import kr.team3.ootm.dao.product.ProductDTO;
import kr.team3.ootm.service.cart.CartService;
import kr.team3.ootm.service.product.ProductService;
import util.LoginManager;

@Controller
public class BasketController {
	@Autowired
	CartService cartService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/basket")
	public ModelAndView basket(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		HttpSession session = req.getSession();
		
		MemberDTO loginUser = LoginManager.getLoginUserDTO(session);
		
		if(loginUser == null) {
			mav.setViewName("/login");
			LoginManager.setSendAfterLogin(session, "/basket");
		}else {
			List<CartDTO> cartList = cartService.selectByMemberId(loginUser.getMember_id());
			List<ProductDTO> productList = new ArrayList<ProductDTO>();
			
			for(CartDTO cart : cartList) {
				productList.add(productService.read(cart.getProduct_id()));
			}
			
			mav.addObject("myCartList",cartList);
			mav.addObject("myCartProductList",productList);
			mav.setViewName("/basket");
		}
		
		Object ts = req.getAttribute("tempScroll");
		//System.out.println((String)ts);
		if(ts!= null) {
			mav.addObject("tempScroll" , ts);
		}
		
		return mav;
	}
}
