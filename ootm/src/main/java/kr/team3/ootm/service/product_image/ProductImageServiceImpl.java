package kr.team3.ootm.service.product_image;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.product_image.ProductImageDAO;
import kr.team3.ootm.dao.product_image.ProductImageDTO;

@Service
public class ProductImageServiceImpl implements ProductImageService{

	@Autowired
	ProductImageDAO dao;
	
	@Override
	public int insert(ProductImageDTO productImage) {
		int result = dao.insert(productImage);
		return result;
	}

	@Override
	public List<ProductImageDTO> selectByProductId(int product_id) {
		List<ProductImageDTO> list = dao.selectByProductId(product_id);
		return list;
	}
	
	

}
