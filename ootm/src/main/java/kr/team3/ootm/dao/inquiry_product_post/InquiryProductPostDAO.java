package kr.team3.ootm.dao.inquiry_product_post;

import java.util.ArrayList;
import java.util.List;


public interface InquiryProductPostDAO {
	
	public int insert(InquiryProductPostDTO inquiryPost);
	
	public InquiryProductPostDTO read(int inquiry_post_id);
	public List<InquiryProductPostDTO> selectAllInquiryPost();
	public List<InquiryProductPostDTO> selectAllInquiryPostByProductId(int product_id);
	public List<InquiryProductPostDTO> selectAllInquiryPostByMemberId(String member_id);
}
