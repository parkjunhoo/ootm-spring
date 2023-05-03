package kr.team3.ootm.service.inquiry_proudct_post;

import java.util.List;

import kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO;

public interface InquiryProductPostService {
	public int insert(InquiryProductPostDTO productInquiryPost);
	public InquiryProductPostDTO read(int product_inquiry_post_id);
	public List<InquiryProductPostDTO> selectAllInquiryPost();
	public List<InquiryProductPostDTO> selectAllInquiryPostByProductId(int product_id);
	public List<InquiryProductPostDTO> selectAllInquiryPostByMemberId(String member_id);
	
}
