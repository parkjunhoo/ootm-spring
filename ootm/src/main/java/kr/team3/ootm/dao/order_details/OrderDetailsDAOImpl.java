package kr.team3.ootm.dao.order_details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.team3.ootm.dao.order.OrderDAO;

@Repository
public class OrderDetailsDAOImpl implements OrderDetailsDAO{

	@Autowired
	JdbcTemplate tem;
	
	@Override
	public int insert(OrderDetailsDTO orderDetails) {
		String sql = "insert into order_details values(null,?,?,?,?,?,?)";
		int result = tem.update(sql,
					orderDetails.getOrder_nuber(),
					orderDetails.getProduct_id(),
					orderDetails.getMember_id(),
					orderDetails.getQuantity(),
					orderDetails.getPrice(),
					orderDetails.getResult()
				);
		
		return result;
	}


	@Override
	public List<OrderDetailsDTO> selectAllByOrderNumber(int order_number) {
		String sql = "select * from order_details where order_number = ?";
		List<OrderDetailsDTO> list = tem.query(sql, 
					new Object[] {order_number} , new OrderDetailsRowMapper()
				);
		
		return list;
	}

}
