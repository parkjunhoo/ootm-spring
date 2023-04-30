package kr.team3.ootm.dao.product;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
//쿼리메소드 내부에서 DB에서 조회한 레코드를 어떤 객체에 매핑시켜야 하는지 정보를 담고 있는 객체
//where (){}, if(){}안에서 처리해야 할 내용을 정의
public class ProductRowMapper implements RowMapper<ProductDTO>{

	@Override
	public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDTO product = new ProductDTO(
				rs.getInt(1), 		// product_id
				rs.getInt(2), 		// product_category_id
				rs.getInt(3), 		// product_sub_category_id
				rs.getString(4), 	// product_name
				rs.getInt(5),		// product_price
				rs.getInt(6),		// product_discount_rate
				rs.getString(7),	// product_content
				rs.getString(8),	// product_image
				rs.getString(9),	// product_image2
				rs.getString(10),	// product_useyn
				rs.getTimestamp(11),		// product_regdate
				rs.getInt(12),		// product_quantity
				rs.getInt(13),		// product_sale_rate
				rs.getString(14)	// product_tag
				);
		return product;
	}
	
}
