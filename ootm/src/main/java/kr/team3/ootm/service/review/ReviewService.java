package kr.team3.ootm.service.review;

import kr.team3.ootm.dao.review.ReviewDTO;

public interface ReviewService {
	public int insert(ReviewDTO review);
	public ReviewDTO read(int product_id);
}
