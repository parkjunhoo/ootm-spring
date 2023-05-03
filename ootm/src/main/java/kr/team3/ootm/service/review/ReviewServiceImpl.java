package kr.team3.ootm.service.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.review.ReviewDAO;
import kr.team3.ootm.dao.review.ReviewDTO;
@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	ReviewDAO dao;
	@Override
	public int insert(ReviewDTO review) {
		
		return dao.insert(review);
	}

	@Override
	public List<ReviewDTO> selectByProductId(int product_id) {
		return dao.selectByProductId(product_id);
	}

}
