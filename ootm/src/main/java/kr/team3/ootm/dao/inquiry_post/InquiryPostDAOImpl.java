package kr.team3.ootm.dao.inquiry_post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class InquiryPostDAOImpl implements InquiryPostDAO {

	@Autowired
	JdbcTemplate template;
	
	
	@Override
	public int insert(InquiryPostDTO inquiryPost) {
		
		return template.update("insert into inquiry_post values(null,?,?,?,?,now())",
				inquiryPost.getInquiry_post_title(),
				inquiryPost.getInquiry_post_content(),
				inquiryPost.getInquiry_post_author(),
				inquiryPost.getInquiry_post_pass()
				);
	}
	@Override
	public int insertNonProduct(InquiryPostDTO inquiryPost) {
		
		return template.update("insert into inquiry_post values(null,null,?,?,?,?,now())",
				inquiryPost.getInquiry_post_title(),
				inquiryPost.getInquiry_post_content(),
				inquiryPost.getInquiry_post_author(),
				inquiryPost.getInquiry_post_pass()
				);
	}

	@Override
	public InquiryPostDTO read(int inquiry_post_id) {
		return template.queryForObject("select * from product where inquiry_post_id =?",
				new Object[] {inquiry_post_id} , new InquiryPostRowMapper());
	}

	@Override
	public List<InquiryPostDTO> selectAllInquiryPost() {
		return template.query("select * from inquiry_post order by inquiry_post_regdate desc", new InquiryPostRowMapper());
	}


	@Override
	public List<InquiryPostDTO> selectAllInquiryPostByAuthor(String inquiry_author) {
		return template.query("select * from inquiry_post where inquiry_author =?",
				new Object[] {inquiry_author} ,  new InquiryPostRowMapper());
	}

}
