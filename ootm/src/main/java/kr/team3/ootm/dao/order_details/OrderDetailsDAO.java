package kr.team3.ootm.dao.order_details;

import java.util.List;

import kr.team3.ootm.dao.order.OrderDTO;

public interface OrderDetailsDAO {
	public int insert(OrderDetailsDTO orderDatails); // insert
    public OrderDetailsDTO read(int order_detail_no); // read
    public List<OrderDetailsDTO> selectAllByOrderNumber(int order_number); // select By orderNumber
}
