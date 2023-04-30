package kr.team3.ootm.dao.product;

import java.sql.Date;
import java.sql.Timestamp;

public class ProductDTO {
	private int product_id;
	private int product_category_id;
	private int product_sub_category_id;
	private String product_name;
	private int product_price;
	private int product_discount_rate;
	private String product_content;
	private String product_image;
	private String product_image2;
	private String product_useyn;
	private Timestamp product_regdate;
	private int product_quantity;
	private int product_sale_rate;
	private String product_tag;

	// select 조회용
	public ProductDTO(int product_id, int product_category_id, int product_sub_category_id, String product_name,
			int product_price, int product_discount_rate, String product_content, String product_image,
			String product_image2, String product_useyn, Timestamp product_regdate, int product_quantity, int product_sale_rate,
			String product_tag) {
		this.product_id = product_id;
		this.product_category_id = product_category_id;
		this.product_sub_category_id = product_sub_category_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_discount_rate = product_discount_rate;
		this.product_content = product_content;
		this.product_image = product_image;
		this.product_image2 = product_image2;
		this.product_useyn = product_useyn;
		this.product_regdate = product_regdate;
		this.product_quantity = product_quantity;
		this.product_sale_rate = product_sale_rate;
		this.product_tag = product_tag;
	}

	// insert 용
	public ProductDTO(int product_category_id, int product_sub_category_id, String product_name, int product_price,
			int product_discount_rate, String product_content, String product_image, String product_image2,
			int product_quantity,int product_sale_rate, String product_tag) {
		this.product_category_id = product_category_id;
		this.product_sub_category_id = product_sub_category_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_discount_rate = product_discount_rate;
		this.product_content = product_content;
		this.product_image = product_image;
		this.product_image2 = product_image2;
		this.product_quantity = product_quantity;
		this.product_sale_rate = product_sale_rate;
		this.product_tag = product_tag;
	}


	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getProduct_category_id() {
		return product_category_id;
	}

	public void setProduct_category_id(int product_category_id) {
		this.product_category_id = product_category_id;
	}

	public int getProduct_sub_category_id() {
		return product_sub_category_id;
	}

	public void setProduct_sub_category_id(int product_sub_category_id) {
		this.product_sub_category_id = product_sub_category_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getProduct_discount_rate() {
		return product_discount_rate;
	}

	public void setProduct_discount_rate(int product_discount_rate) {
		this.product_discount_rate = product_discount_rate;
	}

	public String getProduct_content() {
		return product_content;
	}

	public void setProduct_content(String product_content) {
		this.product_content = product_content;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public String getProduct_image2() {
		return product_image2;
	}

	public void setProduct_image2(String product_image2) {
		this.product_image2 = product_image2;
	}

	public String getProduct_useyn() {
		return product_useyn;
	}

	public void setProduct_useyn(String product_useyn) {
		this.product_useyn = product_useyn;
	}

	public Timestamp getProduct_regdate() {
		return product_regdate;
	}

	public void setProduct_regdate(Timestamp product_regdate) {
		this.product_regdate = product_regdate;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public String getProduct_tag() {
		return product_tag;
	}

	public void setProduct_tag(String product_tag) {
		this.product_tag = product_tag;
	}

	public int getProduct_sale_rate() {
		return product_sale_rate;
	}

	public void setProduct_sale_rate(int product_sale_rate) {
		this.product_sale_rate = product_sale_rate;
	}

	@Override
	public String toString() {
		return "ProductDTO [product_id=" + product_id + ", product_category_id=" + product_category_id
				+ ", product_sub_category_id=" + product_sub_category_id + ", product_name=" + product_name
				+ ", product_price=" + product_price + ", product_discount_rate=" + product_discount_rate
				+ ", product_content=" + product_content + ", product_image=" + product_image + ", product_image2="
				+ product_image2 + ", product_useyn=" + product_useyn + ", product_regdate=" + product_regdate
				+ ", product_quantity=" + product_quantity + ", product_sale_rate=" + product_sale_rate
				+ ", product_tag=" + product_tag + "]";
	}
	
	
	
	
}
