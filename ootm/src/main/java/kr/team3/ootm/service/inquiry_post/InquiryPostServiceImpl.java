package kr.team3.ootm.service.inquiry_post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.inquiry_post.InquiryPostDAO;
import kr.team3.ootm.dao.inquiry_post.InquiryPostDTO;

@Service
public class InquiryPostServiceImpl implements InquiryPostService {

	@Autowired
	InquiryPostDAO dao;
	
	@Override
	public int insert(InquiryPostDTO inquiryPost) {
		return dao.insert(inquiryPost);
	}
	
	@Override
	public int update(InquiryPostDTO inquiryPost) {
		return dao.update(inquiryPost);
	}

	@Override
	public InquiryPostDTO read(int inquiry_post_id) {
		return dao.read(inquiry_post_id);
	}

	@Override
	public List<InquiryPostDTO> selectAllInquiryPost() {
		return dao.selectAllInquiryPost();
	}

	@Override
	public List<InquiryPostDTO> selectAllInquiryPostByMemberId(String member_id) {
		return dao.selectAllInquiryPostByMemberId(member_id);
	}



}
