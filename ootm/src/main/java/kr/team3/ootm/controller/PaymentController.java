package kr.team3.ootm.controller;

import java.util.ArrayList;
import java.util.List;

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
public class PaymentController {
	@Autowired
	CartService cartService;

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/payment")
	public ModelAndView payment(HttpSession session) {
		// mav 객체 생성 (생성자 매개변수 "payment/payment" = setViewName)
		ModelAndView mav = new ModelAndView("payment/payment");

		// MemberDTO 객체를 세션에서 받아오는 작업
		// 로그인 매니저는 제가 그냥 자주쓰는 메서드들 모아둔겁니당.
		// 안에 어떻게 되어잇는지 궁금하시면
		// 									▽컨트롤 누르고 눌러보세용! 	
		MemberDTO loginUser = LoginManager.getLoginUserDTO(session);

		if (loginUser == null) {
			// 세션에 로그인 정보가 없으면 mav의 View를 로그인창으로 변경
			mav.setViewName("/login");
			
			// 요건 설명하기 좀 복잡한데 로그인 이후에 다시 payment창으로 돌아오게하는
			// attribute를 담아서 로그인이후에 다시 payment창으로 돌아오게하는 작업이라고 보시면 되겠습니다!
			LoginManager.setSendAfterLogin(session, "/payment");
			
		} else {
			//cartService에서 로그인되어있는 멤버 아이디를 통해 카트에 담겨있는 정보를 가져옵니다
			List<CartDTO> cartList = cartService.selectByMemberId(loginUser.getMember_id());
			
			//상품DTO 리스트 객체 생성
			List<ProductDTO> productList = new ArrayList<ProductDTO>();

			for (CartDTO cart : cartList) {
				//카트 데이터안에 있는 상품정보를 통해 productService에서 상품DTO를 꺼내어 리스트에 담습니다.
				productList.add(productService.read(cart.getProduct_id()));
			}
			
			//각각 생성한 카트DTOLIST와 상품DTOLIST를 req에 담아 전달합니다.
			mav.addObject("CartList", cartList);
			mav.addObject("CartProductList", productList);
		}

		return mav;
	}
}
