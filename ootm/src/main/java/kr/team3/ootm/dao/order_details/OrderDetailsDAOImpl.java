package kr.team3.ootm.dao.order_details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.team3.ootm.dao.order.OrderDAO;
import kr.team3.ootm.dao.order.OrderDTO;

@Repository
public class OrderDetailsDAOImpl implements OrderDAO{

	@Autowired
	JdbcTemplate tem;
	
	@Override
	public int insert(OrderDTO order) {
		return 0;
	}

	@Override
	public OrderDTO read(int orderNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> selectAllByMemberId(String member_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
