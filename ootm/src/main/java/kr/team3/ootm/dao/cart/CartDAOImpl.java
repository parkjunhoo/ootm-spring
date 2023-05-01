package kr.team3.ootm.dao.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOImpl implements CartDAO{
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public int insert(CartDTO cart) {
		String sql = "insert into cart values(null,?,?,?,now(),?,?)";
		int result = template.update(sql,
				cart.getProduct_id(),
				cart.getMember_id(),
				cart.getCart_quantity(),
				cart.getColor(),
				cart.getSize());
		
		return result;
	}

	@Override
	public int delete(int cart_id) {
		String sql = "delete from cart where cart_id = ?";
		int result = template.update(sql,
				cart_id);
		
		return result;
	}
	
	public int update(CartDTO cart) {
		String sql = "update cart set cart_quantity=? where cart_id=?";
		
		int result = template.update(sql,
				cart.getCart_quantity(),
				cart.getCart_id());
		
		return result;
	}

	@Override
	public List<CartDTO> selectByMemberId(String member_id) {
		
		return template.query("select * from cart where member_id = ? order by cart_regdate", 
				new Object[] {member_id} , new CartRowMapper());
	}

	
}
