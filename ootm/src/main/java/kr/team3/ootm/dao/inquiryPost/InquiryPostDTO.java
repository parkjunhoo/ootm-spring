package kr.team3.ootm.dao.inquiryPost;

import java.sql.Timestamp;

public class InquiryPostDTO {
	private int inquiry_post_id;
	private int product_id;
	private String inquiry_post_title;
	private String inquiry_post_content;
	private String inquiry_post_author;
	private String inquiry_post_pass;
	private Timestamp inquiry_post_regdate;

	
	
	//insert용
	public InquiryPostDTO(int product_id, String inquiry_post_title,String inquiry_post_content, String inquiry_post_author,
			String inquiry_post_pass) {
		this.product_id = product_id;
		this.inquiry_post_title = inquiry_post_title;
		this.inquiry_post_content = inquiry_post_content;
		this.inquiry_post_author = inquiry_post_author;
		this.inquiry_post_pass = inquiry_post_pass;
	}
	
	
	//select read 용
	public InquiryPostDTO(int inquiry_post_id, int product_id, String inquiry_post_title,String inquiry_post_content, String inquiry_post_author,
			String inquiry_post_pass, Timestamp inquiry_post_regdate) {
		super();
		this.inquiry_post_id = inquiry_post_id;
		this.product_id = product_id;
		this.inquiry_post_title = inquiry_post_title;
		this.inquiry_post_content = inquiry_post_content;
		this.inquiry_post_author = inquiry_post_author;
		this.inquiry_post_pass = inquiry_post_pass;
		this.inquiry_post_regdate = inquiry_post_regdate;
	}


	public int getInquiry_post_id() {
		return inquiry_post_id;
	}


	public void setInquiry_post_id(int inquiry_post_id) {
		this.inquiry_post_id = inquiry_post_id;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getInquiry_post_title() {
		return inquiry_post_title;
	}


	public void setInquiry_post_title(String inquiry_post_title) {
		this.inquiry_post_title = inquiry_post_title;
	}


	public String getInquiry_post_author() {
		return inquiry_post_author;
	}


	public void setInquiry_post_author(String inquiry_post_author) {
		this.inquiry_post_author = inquiry_post_author;
	}


	public String getInquiry_post_pass() {
		return inquiry_post_pass;
	}


	public void setInquiry_post_pass(String inquiry_post_pass) {
		this.inquiry_post_pass = inquiry_post_pass;
	}


	public Timestamp getInquiry_post_regdate() {
		return inquiry_post_regdate;
	}


	public void setInquiry_post_regdate(Timestamp inquiry_post_regdate) {
		this.inquiry_post_regdate = inquiry_post_regdate;
	}


	public String getInquiry_post_content() {
		return inquiry_post_content;
	}


	public void setInquiry_post_content(String inquiry_post_content) {
		this.inquiry_post_content = inquiry_post_content;
	}
	
	
	
	
	
}
