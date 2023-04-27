package com.ootm.dao.member;

import java.sql.Date;

public class MemberDTO {
	private String 	member_id;
	private String 	member_name;
	private String 	member_email;
	private String 	member_password;
	private Date 	member_birth;
	private String 	member_zipcode;
	private String 	member_address;
	private String 	member_telnum;
	private String 	member_opt; // 마켓팅 수신동의 0=동의 , 1=비동의 , 2= sms동의 mail비동의 3=sms비동의 mail=동의 , 4= sms,mail=동의
	private String 	member_status; // 0= 가입 , 1=탈퇴 default = 0
	private Date	member_regdate; // default = now();
	private String 	member_grade; // b=브론즈 s=실버 g=골드
	private int		member_point; // 적립금
	
	
	//조회용
	public MemberDTO(String member_id, String member_name, String member_email, String member_password,
			Date member_birth, String member_zipcode, String member_address, String member_telnum, String member_opt,
			String member_status, Date member_regdate, String member_grade, int member_point) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_email = member_email;
		this.member_password = member_password;
		this.member_birth = member_birth;
		this.member_zipcode = member_zipcode;
		this.member_address = member_address;
		this.member_telnum = member_telnum;
		this.member_opt = member_opt;
		this.member_status = member_status;
		this.member_regdate = member_regdate;
		this.member_grade = member_grade;
		this.member_point = member_point;
	}

	//회원가입 insert용
	public MemberDTO(String member_id, String member_name, String member_email, String member_password,
			Date member_birth, String member_zipcode, String member_address, String member_telnum, String member_opt) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_email = member_email;
		this.member_password = member_password;
		this.member_birth = member_birth;
		this.member_zipcode = member_zipcode;
		this.member_address = member_address;
		this.member_telnum = member_telnum;
		this.member_opt = member_opt;
	}
	
	//login 용
	public MemberDTO(String member_id, String member_password) {
		super();
		this.member_id = member_id;
		this.member_password = member_password;
	}



	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_password() {
		return member_password;
	}
	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}
	public Date getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(Date member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_zipcode() {
		return member_zipcode;
	}
	public void setMember_zipcode(String member_zipcode) {
		this.member_zipcode = member_zipcode;
	}
	public String getMember_address() {
		return member_address;
	}
	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}
	public String getMember_telnum() {
		return member_telnum;
	}
	public void setMember_telnum(String member_telnum) {
		this.member_telnum = member_telnum;
	}
	public String getMember_opt() {
		return member_opt;
	}
	public void setMember_opt(String member_opt) {
		this.member_opt = member_opt;
	}
	public String getMember_status() {
		return member_status;
	}
	public void setMember_status(String member_status) {
		this.member_status = member_status;
	}
	public Date getMember_regdate() {
		return member_regdate;
	}
	public void setMember_regdate(Date member_regdate) {
		this.member_regdate = member_regdate;
	}
	public String getMember_grade() {
		return member_grade;
	}
	public void setMember_grade(String member_grade) {
		this.member_grade = member_grade;
	}
	public int getMember_point() {
		return member_point;
	}
	public void setMember_point(int member_point) {
		this.member_point = member_point;
	}
	
	
}
