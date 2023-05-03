package kr.team3.ootm.dao.review;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO;

public class ReviewRowMapper implements RowMapper<ReviewDTO>{

	@Override
	public ReviewDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ReviewDTO review = new ReviewDTO(
				rs.getInt(1), // pk
				rs.getInt(2), // product_id
				rs.getString(3), // id
				rs.getString(4), // content
				rs.getInt(5) // star
				);
		return review;
	}

}
