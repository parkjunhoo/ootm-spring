package kr.team3.ootm.dao.wishlist;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class WishlistRowMapper implements RowMapper<WishlistDTO>{

	@Override
	public WishlistDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		WishlistDTO result = new WishlistDTO(
					rs.getInt(1), // pk
					rs.getString(2), // member_id
					rs.getInt(3), //product_id
					rs.getTimestamp(4) // regdate
				);
				
		return result;
	}
	

}
