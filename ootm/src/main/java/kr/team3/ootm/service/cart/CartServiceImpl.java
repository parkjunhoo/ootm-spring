package kr.team3.ootm.service.cart;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.cart.CartDAO;
import kr.team3.ootm.dao.cart.CartDAOImpl;
import kr.team3.ootm.dao.cart.CartDTO;


@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private CartDAO dao;
	

	@Override
	public int insertProduct(CartDTO cart) {
		
		return dao.insert(0, 0);
	}

	@Override
	public CartDTO readProduct(int cart_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<CartDTO> selectMyCart(String id) {
		// TODO Auto-generated method stub
		return null;
	} 
}
