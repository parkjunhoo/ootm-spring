package kr.team3.ootm.dao.inquiryPost;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InquiryPostRowMapper implements RowMapper<InquiryPostDTO>{

	@Override
	public InquiryPostDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		InquiryPostDTO inquiryPost = new InquiryPostDTO(
				rs.getInt(1),
				rs.getInt(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getTimestamp(6)
				);
		return inquiryPost;
	}

}
