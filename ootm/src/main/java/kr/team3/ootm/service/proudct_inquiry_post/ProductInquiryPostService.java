package kr.team3.ootm.service.proudct_inquiry_post;

import java.util.List;

import kr.team3.ootm.dao.product_Inquiry_post.ProductInquiryPostDTO;

public interface ProductInquiryPostService {
	public int insert(ProductInquiryPostDTO productInquiryPost);
	public ProductInquiryPostDTO read(int product_inquiry_post_id);
	public List<ProductInquiryPostDTO> selectAllInquiryPost();
	public List<ProductInquiryPostDTO> selectAllInquiryPostByProductId(int product_id);
	public List<ProductInquiryPostDTO> selectAllInquiryPostByMemberId(String member_id);
	
}
