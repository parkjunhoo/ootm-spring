package kr.team3.ootm.dao.inquiry_product_post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class InquiryProductPostDAOImpl implements InquiryProductPostDAO {

	@Autowired
	JdbcTemplate template;
	
	
	@Override
	public int insert(InquiryProductPostDTO inquiryPost) {
		
		return template.update("insert into inquiry_post values(null,?,?,?,?,now())",
				inquiryPost.getProduct_id(),
				inquiryPost.getMember_id(),
				inquiryPost.getInquiry_post_title(),
				inquiryPost.getInquiry_post_content()
				);
	}

	@Override
	public InquiryProductPostDTO read(int inquiry_post_id) {
		return template.queryForObject("select * from product where inquiry_post_id =?",
				new Object[] {inquiry_post_id} , new InquiryProductPostRowMapper());
	}

	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPost() {
		return template.query("select * from inquiry_post", new InquiryProductPostRowMapper());
	}

	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPostByProductId(int product_id) {
		return template.query("select * from inquiry_post where product_id = ?",
				new Object[] {product_id} , new InquiryProductPostRowMapper());
	}
	

	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPostByMemberId(String member_id) {
		return template.query("select * from inquiry_post where member_id =?",
				new Object[] {member_id} ,  new InquiryProductPostRowMapper());
	}

}
