package kr.team3.ootm.service.order;

import java.util.List;

import kr.team3.ootm.dao.order.OrderDTO;

public interface OrderService {
	public List<OrderDTO> selectAllByMemberId(String member_id);
	public int insert(OrderDTO order);
}
