package kr.team3.ootm.dao.review;

import java.util.List;

public interface ReviewDAO {
	public int insert(ReviewDTO review);
	public List<ReviewDTO> selectByProductId(int product_id);
}
