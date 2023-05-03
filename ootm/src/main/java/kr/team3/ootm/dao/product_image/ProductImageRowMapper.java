package kr.team3.ootm.dao.product_image;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductImageRowMapper implements RowMapper<ProductImageDTO>{

	@Override
	public ProductImageDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductImageDTO productImage = new ProductImageDTO(
					rs.getInt(1),
					rs.getInt(2),
					rs.getString(3)
				);
		return productImage;
	}
	

}
