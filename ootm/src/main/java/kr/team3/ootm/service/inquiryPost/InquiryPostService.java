package kr.team3.ootm.service.inquiryPost;

import java.util.List;

import kr.team3.ootm.dao.inquiryPost.InquiryPostDTO;

public interface InquiryPostService {
	public int insert(InquiryPostDTO inquiryPost);
	public InquiryPostDTO read(int inquiry_post_id);
	public List<InquiryPostDTO> selectAllInquiryPost();
	public List<InquiryPostDTO> selectAllInquiryPostByProductId(int product_id);
	public List<InquiryPostDTO> selectAllInquiryPostByAuthor(String inquiry_author);
	
}
