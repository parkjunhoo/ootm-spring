package kr.team3.ootm.service.proudct_inquiry_post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.product_Inquiry_post.ProductInquiryPostDAO;
import kr.team3.ootm.dao.product_Inquiry_post.ProductInquiryPostDTO;

@Service
public class ProductInquiryPostServiceImpl implements ProductInquiryPostService {

	@Autowired
	ProductInquiryPostDAO dao;
	
	@Override
	public int insert(ProductInquiryPostDTO productInquiryPost) {
		return dao.insert(productInquiryPost);
	}

	@Override
	public ProductInquiryPostDTO read(int product_inquiry_post_id) {
		return dao.read(product_inquiry_post_id);
	}

	@Override
	public List<ProductInquiryPostDTO> selectAllInquiryPost() {
		return dao.selectAllInquiryPost();
	}


	@Override
	public List<ProductInquiryPostDTO> selectAllInquiryPostByAuthor(String product_inquiry_author) {
		System.out.println(dao.selectAllInquiryPostByAuthor(product_inquiry_author));
		return dao.selectAllInquiryPostByAuthor(product_inquiry_author);
	}

	@Override
	public List<ProductInquiryPostDTO> selectAllInquiryPostByProductId(int product_id) {
		return dao.selectAllInquiryPostByProductId(product_id);
	}



}
