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
	public int insert(InquiryProductPostDTO inquiryProductPost) {
		
		return template.update("insert into inquiry_product_post values(null,?,?,?,?,now())",
				inquiryProductPost.getProduct_id(),
				inquiryProductPost.getMember_id(),
				inquiryProductPost.getInquiry_product_post_title(),
				inquiryProductPost.getInquiry_product_post_content()
				);
	}

	@Override
	public InquiryProductPostDTO read(int inquiry_post_id) {
		return template.queryForObject("select * from inquiry_product_post where inquiry_product_post_id =?",
				new Object[] {inquiry_post_id} , new InquiryProductPostRowMapper());
	}

	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPost() {
		return template.query("select * from inquiry_product_post", new InquiryProductPostRowMapper());
	}

	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPostByProductId(int product_id) {
		return template.query("select * from inquiry_product_post where product_id = ?",
				new Object[] {product_id} , new InquiryProductPostRowMapper());
	}
	

	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPostByMemberId(String member_id) {
		return template.query("select * from inquiry_product_post where member_id =?",
				new Object[] {member_id} ,  new InquiryProductPostRowMapper());
	}

}
