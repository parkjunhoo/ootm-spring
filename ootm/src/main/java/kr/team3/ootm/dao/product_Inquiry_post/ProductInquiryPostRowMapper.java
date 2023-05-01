package kr.team3.ootm.dao.product_Inquiry_post;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductInquiryPostRowMapper implements RowMapper<ProductInquiryPostDTO>{

	@Override
	public ProductInquiryPostDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductInquiryPostDTO inquiryPost = new ProductInquiryPostDTO(
				rs.getInt(1),
				rs.getInt(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6),
				rs.getTimestamp(7)
				);
		return inquiryPost;
	}

}
