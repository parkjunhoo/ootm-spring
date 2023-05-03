package kr.team3.ootm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.cart.CartDTO;
import kr.team3.ootm.service.cart.CartService;

@Controller
public class CartController {

	@Autowired
	CartService service;

	@RequestMapping(value = "/cart/insert.do" , method = RequestMethod.POST)
	public ModelAndView cartInsert(@ModelAttribute CartDTO cart ,HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		service.insert(cart);
		//view 어디로 갈지는 일단 basket으로 해뒀지만
		//호출한 곳이 어디냐에 따라서 여기서 분기처리해서 달라질수도있을것같ㅊ습니다,
		// 같은옵션의 같은상품을 장바구니에 추가하하는거는..(update)
		//분기처리를 해야되지만 ... ,,, pass..
		System.out.println((String)req.getAttribute("toPayment"));
		if(req.getParameter("toPayment") != null) {
			String toPayment = (String)req.getParameter("toPayment");
			if(toPayment.equals("true")) {
				mav.setViewName("redirect:/payment");
			}else {
				mav.setViewName("redirect:/product-detail?product_id="+cart.getProduct_id());
			}
		}else {
			mav.setViewName("redirect:/basket");
		}
		
		return mav;
	}
	
	@RequestMapping(value = "/cart/delete.do" , method = RequestMethod.POST)
	public ModelAndView cartDelete(@RequestParam String cart_id ,HttpServletRequest req) {
		service.delete(Integer.parseInt(cart_id));
		ModelAndView mav = new ModelAndView("redirect:/basket");
		return mav;
	}
	
	@RequestMapping(value = "/cart/update.do" , method = RequestMethod.POST)
	public void cartUpdate(@ModelAttribute CartDTO cart ,HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		service.update(cart);
		
		RequestDispatcher rd = req.getRequestDispatcher("/basket");
		
		Object ts = req.getParameter("tempScroll");
		if(ts!= null) {
			req.setAttribute("tempScroll" , ts);
		}
		
		rd.forward(req, res);
	}

}
