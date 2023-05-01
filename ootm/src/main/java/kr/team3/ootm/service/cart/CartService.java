package kr.team3.ootm.service.cart;

import java.util.List;

import kr.team3.ootm.dao.cart.CartDTO;

public interface CartService {
	public int insert(CartDTO cart);
	public int delete(int cart_id);
	public int update(CartDTO cart);
	
	public List<CartDTO> selectByMemberId(String member_id);
}
