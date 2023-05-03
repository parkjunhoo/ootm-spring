package kr.team3.ootm.service.product_image;

import java.util.List;

import kr.team3.ootm.dao.product_image.ProductImageDTO;

public interface ProductImageService {
	public int insert(ProductImageDTO productImage);
	public List<ProductImageDTO> selectByProductId(int product_id);

}
