package kr.team3.ootm.service.wishlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.wishlist.WishlistDAO;
import kr.team3.ootm.dao.wishlist.WishlistDTO;

@Service
public class WishlistServiceImpl implements WishlistService {

	@Autowired
	WishlistDAO dao;
	
	@Override
	public List<WishlistDTO> selectByMemberId(String member_id) {
		List<WishlistDTO> list = dao.selectByMemberId(member_id);
		
		return list;
	}

	@Override
	public int delete(int wishlist_id) {
		int result = dao.delete(wishlist_id);
		
		return result;
	}

	@Override
	public WishlistDTO readByProductIdAndMemberId(int product_id, String member_id) {
		return dao.readByProductIdAndMemberId(product_id, member_id);
	}

	@Override
	public int insert(WishlistDTO wishlist) {
		return dao.insert(wishlist);
	}

}
