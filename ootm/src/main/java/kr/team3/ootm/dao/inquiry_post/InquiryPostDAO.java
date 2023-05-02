package kr.team3.ootm.dao.inquiry_post;

import java.util.ArrayList;
import java.util.List;


public interface InquiryPostDAO {
	
	public int insert(InquiryPostDTO inquiryPost);
	public int update(InquiryPostDTO inquiryPost);
	
	public InquiryPostDTO read(int inquiry_post_id);
	public List<InquiryPostDTO> selectAllInquiryPost();
	public List<InquiryPostDTO> selectAllInquiryPostByMemberId(String member_id);
}
