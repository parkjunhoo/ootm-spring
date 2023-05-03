package kr.team3.ootm.dao.order;

import java.util.List;

public interface OrderDAO {
	public int insert(OrderDTO order); // insert
    public OrderDTO read(int orderNumber); // read
    public List<OrderDTO> selectAllByMemberId(String member_id); // select By memberID
	
}
