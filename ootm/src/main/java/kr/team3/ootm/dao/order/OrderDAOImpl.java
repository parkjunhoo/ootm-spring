package kr.team3.ootm.dao.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl implements OrderDAO{
    @Autowired
    private JdbcTemplate template;

    private static final String INSERT_ORDER = "INSERT INTO ootm_order VALUES (null, ?)"; //insert 
    private static final String SELECT_ORDER = "SELECT * FROM ootm_order WHERE order_number = ?"; //read 
    private static final String SELECT_ALL_ORDERS = "SELECT * FROM ootm_order"; // select ALL
    private static final String UPDATE_ORDER = "UPDATE ootm_order SET order_date = ? WHERE order_number = ?"; 
    private static final String DELETE_ORDER = "DELETE FROM ootm_order WHERE order_number = ?"; // delete

    @Override
    public void insert(OrderDTO order) {
        template.update(INSERT_ORDER, order.getOrder_date(),
        		order.getOrder_date());
    }

	@Override
	public OrderDTO read(int orderNumber) {
		
		OrderDTO order = template.queryForObject(SELECT_ORDER,
				new Object[] {orderNumber},new OrderRowMapper());
		
		return order;
	}
}

