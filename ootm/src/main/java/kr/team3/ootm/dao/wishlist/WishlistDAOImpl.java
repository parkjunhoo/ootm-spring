package kr.team3.ootm.dao.wishlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WishlistDAOImpl implements WishlistDAO {

	@Autowired
	JdbcTemplate tem;

	@Override
	public List<WishlistDTO> selectByMemberId(String member_id) {
		String sql = "select * from wishlist where member_id = ?";
		List<WishlistDTO> list = tem.query(sql, new Object[] { member_id }, new WishlistRowMapper());

		return list;
	}

	@Override
	public int insert(WishlistDTO wishlist) {
		String sql = "insert into wishlist value(null,?,?,now())";
		int result = tem.update(sql, wishlist.getMember_id(), wishlist.getProduct_id());
		return result;
	}

	@Override
	public int delete(int wishlist_id) {
		String sql = "delete from wishlist where wishlist_id = ?";
		int result = tem.update(sql, wishlist_id);
		return result;
	}

	@Override
	public WishlistDTO readByProductIdAndMemberId(int product_id , String member_id) {
		String sql = "select * from wishlist where product_id = ? and member_id = ?";
		WishlistDTO wishlist = null;
		try {
			wishlist = tem.queryForObject(sql, 
					new Object[] {product_id, member_id} , new WishlistRowMapper()
					);
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
		return wishlist;
	}

}
