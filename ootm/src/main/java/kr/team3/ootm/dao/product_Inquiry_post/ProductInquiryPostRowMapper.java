package kr.team3.ootm.dao.product_Inquiry_post;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductInquiryPostRowMapper implements RowMapper<ProductInquiryPostDTO>{

	@Override
	public ProductInquiryPostDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductInquiryPostDTO inquiryPost = new ProductInquiryPostDTO(
				rs.getInt(1), // pk
				rs.getInt(2), // product_id
				rs.getString(3), // member_id
				rs.getString(4), // title
				rs.getString(5), // content
				rs.getTimestamp(6) // regdate
				);
		return inquiryPost;
	}

}
