package kr.team3.ootm.dao.product_Inquiry_post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ProductInquiryPostDAOImpl implements ProductInquiryPostDAO {

	@Autowired
	JdbcTemplate template;
	
	
	@Override
	public int insert(ProductInquiryPostDTO inquiryPost) {
		
		return template.update("insert into inquiry_post values(null,?,?,?,?,?,now())",
				inquiryPost.getProduct_id(),
				inquiryPost.getInquiry_post_title(),
				inquiryPost.getInquiry_post_content(),
				inquiryPost.getInquiry_post_author(),
				inquiryPost.getInquiry_post_pass()
				);
	}

	@Override
	public ProductInquiryPostDTO read(int inquiry_post_id) {
		return template.queryForObject("select * from product where inquiry_post_id =?",
				new Object[] {inquiry_post_id} , new ProductInquiryPostRowMapper());
	}

	@Override
	public List<ProductInquiryPostDTO> selectAllInquiryPost() {
		return template.query("select * from inquiry_post", new ProductInquiryPostRowMapper());
	}

	@Override
	public List<ProductInquiryPostDTO> selectAllInquiryPostByProductId(int product_id) {
		return template.query("select * from inquiry_post where product_id = ?",
				new Object[] {product_id} , new ProductInquiryPostRowMapper());
	}
	

	@Override
	public List<ProductInquiryPostDTO> selectAllInquiryPostByAuthor(String inquiry_author) {
		return template.query("select * from inquiry_post where inquiry_author =?",
				new Object[] {inquiry_author} ,  new ProductInquiryPostRowMapper());
	}

}
