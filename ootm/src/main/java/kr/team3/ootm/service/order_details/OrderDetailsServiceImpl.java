package kr.team3.ootm.service.order_details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.order_details.OrderDetailsDAO;
import kr.team3.ootm.dao.order_details.OrderDetailsDTO;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Autowired
	OrderDetailsDAO dao;
	
	@Override
	public int insert(OrderDetailsDTO orderDetails) {
		return dao.insert(orderDetails);
	}

	@Override
	public List<OrderDetailsDTO> selectAllByOrderNumber(int order_number) {
		return dao.selectAllByOrderNumber(order_number);
	}

}
