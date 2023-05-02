package kr.team3.ootm.dao.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class ReviewDAOImpl implements ReviewDAO{
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public int insert(ReviewDTO review) {
		return template.update("insert into review values(null,?,?,?,?)",
				review.getProduct_id(),
				review.getReview_author_id(),
				review.getReview_content(),
				review.getReview_star()
				);
	}

	@Override
	public ReviewDTO read(int product_id) {
		return template.queryForObject("select * from review where product_id =?",
						new Object[] {product_id}, new ReviewRowMapper());
	}
	
}
