package kr.team3.ootm.dao.cart;

import java.sql.Date;
import java.sql.Timestamp;

public class CartDTO {
	private int cart_id;
	private int product_id;
	private String member_id;
	private int cart_quantity;
	private Timestamp cart_regdate;
	private String color;
	private String size;
	
	public CartDTO() {
		
	}
	
	//select read 용
	
	
	
	public int getCart_id() {
		return cart_id;
	}
	
	//update 용
	public CartDTO(int cart_id,int cart_quantity) {
		this.cart_id = cart_id;
		this.cart_quantity = cart_quantity;
	}
	
	//insert 용
	public CartDTO(int product_id, String member_id, int cart_quantity, String color,
			String size) {
		this.product_id = product_id;
		this.member_id = member_id;
		this.cart_quantity = cart_quantity;
		this.color = color;
		this.size = size;
	}
	public CartDTO(int cart_id, int product_id, String member_id, int cart_quantity, Timestamp cart_regdate, String color,
			String size) {
		this.cart_id = cart_id;
		this.product_id = product_id;
		this.member_id = member_id;
		this.cart_quantity = cart_quantity;
		this.cart_regdate = cart_regdate;
		this.color = color;
		this.size = size;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCart_quantity() {
		return cart_quantity;
	}
	public void setCart_quantity(int cart_quantity) {
		this.cart_quantity = cart_quantity;
	}
	public Timestamp getCart_regdate() {
		return cart_regdate;
	}
	public void setCart_regdate(Timestamp cart_regdate) {
		this.cart_regdate = cart_regdate;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
