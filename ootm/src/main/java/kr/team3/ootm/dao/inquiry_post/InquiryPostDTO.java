package kr.team3.ootm.dao.inquiry_post;

import java.sql.Timestamp;

public class InquiryPostDTO {
	private int inquiry_post_id;
	private String member_id;
	private String inquiry_post_title;
	private String inquiry_post_content;
	private Timestamp inquiry_post_regdate;

	public InquiryPostDTO() {

	}

	// insert용
	public InquiryPostDTO(String member_id, String inquiry_post_title, String inquiry_post_content,
			String inquiry_post_pass) {
		this.member_id = member_id;
		this.inquiry_post_title = inquiry_post_title;
		this.inquiry_post_content = inquiry_post_content;
	}

	// select read 용
	public InquiryPostDTO(int inquiry_post_id, String member_id, String inquiry_post_title, String inquiry_post_content,
			Timestamp inquiry_post_regdate) {
		this.inquiry_post_id = inquiry_post_id;
		this.member_id = member_id;
		this.inquiry_post_title = inquiry_post_title;
		this.inquiry_post_content = inquiry_post_content;
		this.inquiry_post_regdate = inquiry_post_regdate;
	}
	
	// update 용
	public InquiryPostDTO(int inquiry_post_id, String inquiry_post_title, String inquiry_post_content) {
		this.inquiry_post_id = inquiry_post_id;
		this.inquiry_post_title = inquiry_post_title;
		this.inquiry_post_content = inquiry_post_content;
	}

	public int getInquiry_post_id() {
		return inquiry_post_id;
	}

	public void setInquiry_post_id(int inquiry_post_id) {
		this.inquiry_post_id = inquiry_post_id;
	}

	public String getInquiry_post_title() {
		return inquiry_post_title;
	}

	public void setInquiry_post_title(String inquiry_post_title) {
		this.inquiry_post_title = inquiry_post_title;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
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
