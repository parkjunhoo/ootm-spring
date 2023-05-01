package kr.team3.ootm.service.inquiry_post;

import java.util.List;

import kr.team3.ootm.dao.inquiry_post.InquiryPostDTO;

public interface InquiryPostService {
	public int insert(InquiryPostDTO inquiryPost);
	public InquiryPostDTO read(int inquiry_post_id);
	public List<InquiryPostDTO> selectAllInquiryPost();
	public List<InquiryPostDTO> selectAllInquiryPostByAuthor(String inquiry_author);
	
}
