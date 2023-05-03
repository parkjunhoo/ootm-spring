package kr.team3.ootm.dao.wishlist;

import java.util.List;

public interface WishlistDAO {
	public List<WishlistDTO> selectByMemberId(String member_id);
	public int insert(WishlistDTO wishlist);
	public int delete(int wishlist_id);
}
