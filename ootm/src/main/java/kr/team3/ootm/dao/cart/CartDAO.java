package kr.team3.ootm.dao.cart;

import java.util.ArrayList;

public interface CartDAO {
	public int insert(int product_id, int cart_quantity);
	public int delete(int card_id);
	
	public ArrayList<CartDTO> selectMyCart(String id);
}
