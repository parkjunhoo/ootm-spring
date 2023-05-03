package kr.team3.ootm.dao.product_image;

import java.util.List;

public interface ProductImageDAO {
	public int insert(ProductImageDTO productImage);
	public List<ProductImageDTO> selectByProductId(int product_id);
}
