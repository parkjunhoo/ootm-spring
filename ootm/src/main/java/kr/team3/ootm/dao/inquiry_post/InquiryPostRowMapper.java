package kr.team3.ootm.dao.inquiry_post;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InquiryPostRowMapper implements RowMapper<InquiryPostDTO>{

	@Override
	public InquiryPostDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		InquiryPostDTO inquiryPost = new InquiryPostDTO(
				rs.getInt(1), //pk 
				rs.getString(2), // member_id
				rs.getString(3), // title
				rs.getString(4), // content
				rs.getTimestamp(5) // regdate
				);
		return inquiryPost;
	}

}
