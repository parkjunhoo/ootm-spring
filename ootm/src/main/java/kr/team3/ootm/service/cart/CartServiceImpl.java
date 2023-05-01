package kr.team3.ootm.service.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.cart.CartDAO;
import kr.team3.ootm.dao.cart.CartDTO;


@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartDAO dao;
	
	@Override
	public int insert(CartDTO cart) {
		return dao.insert(cart);
	}

	@Override
	public int delete(int cart_id) {
		return dao.delete(cart_id);
	}

	@Override
	public int update(CartDTO cart) {
		return dao.update(cart);
	}

	@Override
	public List<CartDTO> selectByMemberId(String member_id) {
		return dao.selectByMemberId(member_id);
	}
	
	
}
