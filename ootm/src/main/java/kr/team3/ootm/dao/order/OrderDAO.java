package kr.team3.ootm.dao.order;

import java.util.List;

public interface OrderDAO {
    void insertOrder(OrderDTO order); // insert
    OrderDTO getOrder(int orderNumber); // read
    List<OrderDTO> getAllOrders(); // selectAll (List)
    void updateOrder(OrderDTO order); // update
    void deleteOrder(int orderNumber); // delete
}
