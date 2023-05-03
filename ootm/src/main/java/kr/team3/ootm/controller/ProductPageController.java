package kr.team3.ootm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.team3.ootm.dao.product.ProductDTO;
import kr.team3.ootm.service.product.ProductService;
import util.define.ProductCategory;
import util.define.ProductSubCategory;

@Controller
public class ProductPageController {

	@Autowired
	ProductService service;

	/*
	 * @RequestMapping(value = "/product/*") public ModelAndView productTEST() {
	 * ModelAndView mav = new ModelAndView("product/product");
	 * mav.addObject("cateName", "NEW (10% SALE)");
	 * 
	 * List<ProductDTO> list = service.selectNewProduct(30);
	 * 
	 * mav.addObject("productList", list);
	 * 
	 * return mav; }
	 */

	@RequestMapping(value = "/product/new")
	public ModelAndView productNew() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "NEW (10% SALE)");

		List<ProductDTO> list = service.selectNewProduct(30);

		mav.addObject("productList", list);
		mav.addObject("banner", "new");
		return mav;
	}

	@RequestMapping(value = "/product/best")
	public ModelAndView productBest() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "BEST");

		List<ProductDTO> list = service.selectBestProduct(30);

		mav.addObject("productList", list);
		mav.addObject("banner", "best");
		return mav;
	}

	@RequestMapping(value = "/product/outer")
	public ModelAndView productOuter() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "OUTER");

		List<ProductDTO> list = service.selectByCategoryOrderByBestLimit(ProductCategory.OUTER.getValue(), 0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "outer");

		return mav;
	}

	@RequestMapping(value = "/product/shirt")
	public ModelAndView productShirt() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "SHIRT");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.SHIRT.getValue(), 0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "top");

		return mav;
	}

	@RequestMapping(value = "/product/longsleeve")
	public ModelAndView productLongsleeve() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "LONG SLEEVE");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.LONG_SLEEVE.getValue(),
				0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "top");
		return mav;
	}

	@RequestMapping(value = "/product/knit")
	public ModelAndView productKnit() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "KNIT");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.KNIT.getValue(), 0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "top");
		return mav;
	}

	@RequestMapping(value = "/product/shortsleeve")
	public ModelAndView productShortsleeve() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "SHORT SLEEVE");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.SHORT_SLEEVE.getValue(),
				0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "top");
		return mav;
	}

	@RequestMapping(value = "/product/jean")
	public ModelAndView productJean() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "JEAN");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.JEAN.getValue(), 0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "bottom");
		return mav;
	}

	@RequestMapping(value = "/product/pants")
	public ModelAndView productPants() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "PANTS");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.PANTS.getValue(), 0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "bottom");
		return mav;
	}

	@RequestMapping(value = "/product/shortguys")
	public ModelAndView productShortguys() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "SHORTGUYS");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.SHORT_GUYS.getValue(), 0,
				30);

		mav.addObject("productList", list);
		mav.addObject("banner", "bottom");
		return mav;
	}

	@RequestMapping(value = "/product/shoes")
	public ModelAndView productShoes() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "SHOES");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.SHOES.getValue(), 0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "shoes");
		return mav;
	}

	@RequestMapping(value = "/product/bag")
	public ModelAndView productBag() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "BAG");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.BAG.getValue(), 0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "acc");
		return mav;
	}

	@RequestMapping(value = "/product/acc")
	public ModelAndView productAcc() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "ACCESSORIES");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.ACCESSORY.getValue(), 0,
				30);

		mav.addObject("productList", list);
		mav.addObject("banner", "acc");
		return mav;
	}

	@RequestMapping(value = "/product/suit")
	public ModelAndView productSuit() {
		ModelAndView mav = new ModelAndView("product/product");
		mav.addObject("cateName", "SUIT");

		List<ProductDTO> list = service.selectBySubCategoryOrderByBestLimit(ProductSubCategory.SUIT.getValue(), 0, 30);

		mav.addObject("productList", list);
		mav.addObject("banner", "top");
		return mav;
	}
}
