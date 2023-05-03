package kr.team3.ootm.service.order_details;

import java.util.List;

import kr.team3.ootm.dao.order_details.OrderDetailsDTO;

public interface OrderDetailsService {
	public int insert(OrderDetailsDTO orderDetails);
	public List<OrderDetailsDTO> selectAllByOrderNumber(int order_number);
	
}
