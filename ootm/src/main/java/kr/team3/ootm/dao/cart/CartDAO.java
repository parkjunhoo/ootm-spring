package kr.team3.ootm.dao.cart;

import java.util.List;

public interface CartDAO {
	public int insert(CartDTO cart);
	public int delete(int cart_id);
	public int update(CartDTO cart);
	
	public List<CartDTO> selectByMemberId(String member_id);
}
