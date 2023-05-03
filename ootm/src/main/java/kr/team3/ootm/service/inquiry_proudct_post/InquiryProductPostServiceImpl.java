package kr.team3.ootm.service.inquiry_proudct_post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDAO;
import kr.team3.ootm.dao.inquiry_product_post.InquiryProductPostDTO;

@Service
public class InquiryProductPostServiceImpl implements InquiryProductPostService {

	@Autowired
	InquiryProductPostDAO dao;
	
	@Override
	public int insert(InquiryProductPostDTO productInquiryPost) {
		return dao.insert(productInquiryPost);
	}

	@Override
	public InquiryProductPostDTO read(int product_inquiry_post_id) {
		return dao.read(product_inquiry_post_id);
	}

	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPost() {
		return dao.selectAllInquiryPost();
	}


	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPostByMemberId(String member_id) {
		return dao.selectAllInquiryPostByMemberId(member_id);
	}

	@Override
	public List<InquiryProductPostDTO> selectAllInquiryPostByProductId(int product_id) {
		return dao.selectAllInquiryPostByProductId(product_id);
	}



}
