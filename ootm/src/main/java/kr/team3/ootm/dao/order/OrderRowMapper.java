package kr.team3.ootm.dao.order;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrderRowMapper implements RowMapper<OrderDTO>{

	@Override
	public OrderDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrderDTO order = new OrderDTO(
				rs.getInt(1),
				rs.getTimestamp(2)
				);
		return null;
	}

	
}
