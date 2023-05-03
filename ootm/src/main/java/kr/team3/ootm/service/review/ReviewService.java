package kr.team3.ootm.service.review;

import java.util.List;

import kr.team3.ootm.dao.review.ReviewDTO;

public interface ReviewService {
	public int insert(ReviewDTO review);
	public List<ReviewDTO> selectByProductId(int product_id);
}
