package kr.team3.ootm.dao.inquiry_post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class InquiryPostDAOImpl implements InquiryPostDAO {

	@Autowired
	JdbcTemplate template;
	
	
	@Override
	public int insert(InquiryPostDTO inquiryPost) {
		
		return template.update("insert into inquiry_post values(null,?,?,?,now())",
				inquiryPost.getMember_id(),
				inquiryPost.getInquiry_post_title(),
				inquiryPost.getInquiry_post_content()
				);
	}
	
	@Override
	public int update(InquiryPostDTO inquiryPost) {
		String sql = "update inquiry_post set inquiry_post_title=? , inquiry_post_content=? where inquiry_post_id= ? ";
		int result = template.update(sql,
				inquiryPost.getInquiry_post_title(),
				inquiryPost.getInquiry_post_content(),
				inquiryPost.getInquiry_post_id()
				);
		
		return result;
	}

	@Override
	public InquiryPostDTO read(int inquiry_post_id) {
		InquiryPostDTO post = null;
		
		try {
			post = template.queryForObject("select * from inquiry_post where inquiry_post_id =?",
					new Object[] {inquiry_post_id} , new InquiryPostRowMapper());
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
				
		return post;
	}

	@Override
	public List<InquiryPostDTO> selectAllInquiryPost() {
		return template.query("select * from inquiry_post order by inquiry_post_regdate desc", new InquiryPostRowMapper());
	}


	@Override
	public List<InquiryPostDTO> selectAllInquiryPostByMemberId(String member_id) {
		return template.query("select * from inquiry_post where member_id =?",
				new Object[] {member_id} ,  new InquiryPostRowMapper());
	}

	

}
