package kr.team3.ootm.dao.cart;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CartRowMapper implements RowMapper<CartDTO>{

	@Override
	public CartDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CartDTO cart = new CartDTO(
				rs.getInt(1),
				rs.getInt(2),
				rs.getString(3),
				rs.getInt(4),
				rs.getTimestamp(5),
				rs.getString(6),
				rs.getString(7)
				);
				
		
		return cart;
	}
	
}
