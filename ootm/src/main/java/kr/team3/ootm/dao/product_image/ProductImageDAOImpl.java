package kr.team3.ootm.dao.product_image;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductImageDAOImpl implements ProductImageDAO{

	@Autowired
	JdbcTemplate tem;
	
	@Override
	public int insert(ProductImageDTO productImage) {
		String sql = "insert into product_image values(null,?,?)";
		int result = tem.update(sql,
				productImage.getProduct_image_id(),
				productImage.getProduct_image_url()
				);
		return result;
	}

	@Override
	public List<ProductImageDTO> selectByProductId(int product_id) {
		String sql ="select * from product_image where product_id = ?";
		List<ProductImageDTO> list = tem.query(sql,
				new Object[] {product_id} , new ProductImageRowMapper());
		
		return list;
	}
	
}
