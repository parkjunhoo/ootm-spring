package kr.team3.ootm.service.cart;

import java.util.ArrayList;

import kr.team3.ootm.dao.cart.CartDTO;

public interface CartService {
	public int insertProduct(CartDTO cart);
	public CartDTO readProduct(int cart_id);
	public int deleteProduct(int id);
	
	public ArrayList<CartDTO> selectMyCart(String id);
}
