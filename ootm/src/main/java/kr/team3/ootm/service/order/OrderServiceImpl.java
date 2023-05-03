package kr.team3.ootm.service.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.order.OrderDAO;
import kr.team3.ootm.dao.order.OrderDTO;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderDAO dao;
	
	@Override
	public List<OrderDTO> selectAllByMemberId(String member_id) {
		return dao.selectAllByMemberId(member_id);
	}

	@Override
	public int insert(OrderDTO order) {
		return dao.insert(order);
	}

}
