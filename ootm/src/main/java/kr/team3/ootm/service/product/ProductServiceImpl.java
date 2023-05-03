package kr.team3.ootm.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.product.ProductDAO;
import kr.team3.ootm.dao.product.ProductDTO;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO dao;
	
	
	@Override
	public int insert(ProductDTO product) {
		return dao.insert(product);
	}

	@Override
	public ProductDTO read(int product_id) {
		return dao.read(product_id);
	}

	@Override
	public int delete(int product_id) {
		return dao.delete(product_id);
	}

	@Override
	public List<ProductDTO> selectAllProduct() {
		return dao.selectAllProduct();
	}

	@Override
	public List<ProductDTO> selectBestProduct(int amount) {
		return dao.selectBestProduct(amount);
	}
	
	@Override
	public List<ProductDTO> selectNewProduct(int amount) {
		return dao.selectNewProduct(amount);
	}

	@Override
	public int countByCategory(int product_category_id) {
		return dao.countByCategory(product_category_id);
	}

	@Override
	public int countBySubCategory(int product_sub_category_id) {
		return dao.countBySubCategory(product_sub_category_id);
	}

	@Override
	public List<ProductDTO> selectByCategoryOrderByBestLimit(int product_category_id, int min, int max) {
		return dao.selectByCategoryOrderByBestLimit(product_category_id, min, max);
	}

	@Override
	public List<ProductDTO> selectBySubCategoryOrderByBestLimit(int product_sub_category_id, int min, int max) {
		return dao.selectBySubCategoryOrderByBestLimit(product_sub_category_id, min, max);
	}

	@Override
	public List<ProductDTO> selectByCategoryOrderByPriceLimit(int product_category_id, int min, int max) {
		return dao.selectByCategoryOrderByPriceLimit(product_category_id, min, max);
	}

	@Override
	public List<ProductDTO> selectBySubCategoryOrderByPriceDescLimit(int product_sub_category_id, int min, int max) {
		return dao.selectBySubCategoryOrderByPriceDescLimit(product_sub_category_id, min, max);
	}

	@Override
	public List<ProductDTO> selectByKeyword(String keyword) {
		return dao.selectByKeyword(keyword);
	}

}
