package kr.team3.ootm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.team3.ootm.dao.product.ProductDTO;
import kr.team3.ootm.service.product.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	@RequestMapping(value = "/product/insert.do")
	public String insertProduct() {
		service.insertProduct(new ProductDTO(1, 1, "테스트제품", 3333, 0, "테스트제품컨텐츠", "https://picsum.photos/250/250",
				"https://picsum.photos/250/250", 5, 1000, "#랜덤"));
		return "/login"; // 임시 메인페이지로 forward
	}

	@RequestMapping(value = "/product/selectall.do")
	public String selectAllProduct() {
		List<ProductDTO> list = service.selectAllProduct();
		/*
		 * 여기서는 테스트용으로 여기서 끝냈지만 페이지로 넘길땐 ModelAndView mav = new
		 * ModelAndView("넘길path (ex:main/index)"); mav.addObject("어트리뷰트명마음대로",list);
		 * 
		 * jsp에서는 <% ArrayList<ProductDTO> list = (ArrayList<ProductDTO>)
		 * request.getAttribute("어트리뷰트명");
		 * 
		 * %>
		 * 
		 * 로 받아와서 쓰면된다.
		 */
		return "/login"; // 임시 메인페이지로 forward
	}

	@RequestMapping(value = "/product/read.do")
	public String readProduct(int id, String state) {
		ProductDTO product = service.readProduct(id);

		/*
		 * 여기서는 테스트용으로 여기서 끝냈지만 페이지로 넘길땐 ModelAndView mav = new
		 * ModelAndView("넘길path (ex:main/index)"); mav.addObject("어트리뷰트명마음대로",product);
		 * 
		 * jsp에서는 <% ProductDTO product = (ArrayList<ProductDTO>)
		 * request.getAttribute("어트리뷰트명");
		 * 
		 * %>
		 * 
		 * 로 받아와서 쓰면된다.
		 */
		
		//state는 프론트단에서 호출할떄는  
		//path?state="READ" 
		///ex:) product/read.do?state='READ'
		//?param1='value'&state='update'
		//여러개의 값을 넘길땐 &로 이으면된다.
		//이런식으로 파라미터를 넘겨서 받는다
		if (state.equals("READ")) {
			// view = "/read";
		} else {
			// veiw = "/update";
		}
		// mav.setViewName(view); => return mav;
		return "/login"; // 임시 메인페이지로 forward
	}

}
