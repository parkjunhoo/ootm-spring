package kr.team3.ootm.dao.wishlist;

import java.sql.Timestamp;

public class WishlistDTO {
	private int wishlist_id;
	private String member_id;
	private int product_id;
	private Timestamp wishlist_regdate;
	
	public WishlistDTO() {
		
	}

	
	//insert용
	public WishlistDTO(String member_id, int product_id) {
		this.member_id = member_id;
		this.product_id = product_id;
	}
	
	//read용
	public WishlistDTO(int wishlist_id, String member_id, int product_id, Timestamp wishlist_regdate) {
		super();
		this.wishlist_id = wishlist_id;
		this.member_id = member_id;
		this.product_id = product_id;
		this.wishlist_regdate = wishlist_regdate;
	}


	public int getWishlist_id() {
		return wishlist_id;
	}


	public void setWishlist_id(int wishlist_id) {
		this.wishlist_id = wishlist_id;
	}


	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public Timestamp getWishlist_regdate() {
		return wishlist_regdate;
	}


	public void setWishlist_regdate(Timestamp wishlist_regdate) {
		this.wishlist_regdate = wishlist_regdate;
	}
	
	
	
	
	
}
