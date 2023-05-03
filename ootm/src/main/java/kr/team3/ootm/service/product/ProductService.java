package kr.team3.ootm.service.product;

import java.util.ArrayList;
import java.util.List;

import kr.team3.ootm.dao.product.ProductDTO;

public interface ProductService {
	public int insert(ProductDTO product);
	public ProductDTO read(int product_id);
	public int delete(int product_id);
	
	public List<ProductDTO> selectAllProduct();
	public List<ProductDTO> selectBestProduct(int amount);
	public List<ProductDTO> selectNewProduct(int amount);
	
	public int countByCategory(int product_category_id);
	public int countBySubCategory(int product_sub_category_id);
	
	public List<ProductDTO> selectByCategoryOrderByBestLimit(int product_category_id , int min, int max);
	public List<ProductDTO> selectBySubCategoryOrderByBestLimit(int product_sub_category_id, int min , int max);
	
	public List<ProductDTO> selectByCategoryOrderByPriceLimit(int product_category_id , int min, int max);
	public List<ProductDTO> selectBySubCategoryOrderByPriceDescLimit(int product_sub_category_id, int min , int max);
	
	public List<ProductDTO> selectByKeyword(String keyword);
	
}
