package kr.team3.ootm.dao.order_details;

public class OrderDetailsDTO {
	private int order_detail_no;
	private int order_number;
	private int product_id;
	private String member_id;
	private int quantity;
	private int price;
	private String order_addr;
	private String result;
	
	public OrderDetailsDTO() {
		
	}
	
	//insert용
	public OrderDetailsDTO(int order_number, int product_id, String member_id, int quantity, int price,
			String order_addr, String result) {
		this.order_number = order_number;
		this.product_id = product_id;
		this.member_id = member_id;
		this.quantity = quantity;
		this.price = price;
		this.order_addr = order_addr;
		this.result = result;
	}
	
	//read select 용
	public OrderDetailsDTO(int order_detail_no, int order_number, int product_id, String member_id, int quantity, int price,
			String order_addr, String result) {
		this.order_detail_no = order_detail_no;
		this.order_number = order_number;
		this.product_id = product_id;
		this.member_id = member_id;
		this.quantity = quantity;
		this.price = price;
		this.order_addr = order_addr;
		this.result = result;
	}

	public int getOrder_detail_no() {
		return order_detail_no;
	}

	public void setOrder_detail_no(int order_detail_no) {
		this.order_detail_no = order_detail_no;
	}

	public int getOrder_nuber() {
		return order_number;
	}

	public void setOrder_nuber(int order_number) {
		this.order_number = order_number;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrder_addr() {
		return order_addr;
	}

	public void setOrder_addr(String order_addr) {
		this.order_addr = order_addr;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
