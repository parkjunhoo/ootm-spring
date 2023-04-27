package kr.team3.ootm.service.product;

import java.util.ArrayList;

import kr.team3.ootm.dao.product.ProductDTO;

public interface ProductService {
	public int insertProduct(ProductDTO product);
	public ProductDTO readProduct(int id);
	public int deleteProduct(int id);
	
	public ArrayList<ProductDTO> selectAllProduct();
	public ArrayList<ProductDTO> selectBestProduct(int amount);
	public ArrayList<ProductDTO> selectNewProduct(int amount);
}
