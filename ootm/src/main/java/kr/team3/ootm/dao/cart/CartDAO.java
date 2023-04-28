package kr.team3.ootm.dao.cart;

import java.util.ArrayList;

public interface CartDAO {
	public int insert(int product_id, int cart_quantity);
	public CartDTO read(int cart_id);
	public int delete(int cart_id);
	
	public ArrayList<CartDTO> selectMyCart(String id);
}
