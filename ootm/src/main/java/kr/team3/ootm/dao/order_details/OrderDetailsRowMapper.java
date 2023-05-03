package kr.team3.ootm.dao.order_details;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrderDetailsRowMapper implements RowMapper<OrderDetailsDTO>{

	@Override
	public OrderDetailsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrderDetailsDTO orderDetails = new OrderDetailsDTO(
					rs.getInt(1),	//pk
					rs.getInt(2),	//order_num
					rs.getInt(3),	//product_id
					rs.getString(4),	//memberid
					rs.getInt(5),	//quantity
					rs.getInt(6),	//price
					rs.getString(7),	//order_addr
					rs.getString(8)	//result
				);
				
				
		return null;
	}

	
	
}
