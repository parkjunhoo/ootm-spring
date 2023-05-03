package kr.team3.ootm.service.wishlist;

import java.util.List;

import kr.team3.ootm.dao.wishlist.WishlistDTO;

public interface WishlistService {
	public int insert(WishlistDTO wishlist);
	public List<WishlistDTO> selectByMemberId(String member_id);
	public int delete(int wishlist_id);
	public WishlistDTO readByProductIdAndMemberId(int product_id , String member_id);
}
