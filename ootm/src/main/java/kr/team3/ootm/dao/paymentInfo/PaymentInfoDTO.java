package kr.team3.ootm.dao.paymentInfo;

import java.sql.Date;

public class PaymentInfoDTO {
	private int payment_info_id;
	private int order_number2;
	private Date payment_info_regdate;
	private int payment_info_amount;
	private String payment_info_method;
	private String payment_info_status;

	// select
	public PaymentInfoDTO(int payment_info_id, int order_number2, Date payment_info_regdate, int payment_info_amount,
			String payment_info_method, String payment_info_status) {
		super();
		this.payment_info_id = payment_info_id;
		this.order_number2 = order_number2;
		this.payment_info_regdate = payment_info_regdate;
		this.payment_info_amount = payment_info_amount;
		this.payment_info_method = payment_info_method;
		this.payment_info_status = payment_info_status;
	}

	// insert
	public PaymentInfoDTO(String payment_info_method) {
		super();
		this.payment_info_method = payment_info_method;
	}

	@Override
	public String toString() {
		return "PaymentInfoDTO [payment_info_id=" + payment_info_id + ", order_number2=" + order_number2
				+ ", guest_order_id=" + ", payment_info_regdate=" + payment_info_regdate + ", payment_info_amount="
				+ payment_info_amount + ", payment_info_method=" + payment_info_method + ", payment_info_status="
				+ payment_info_status + "]";
	}

	public int getPayment_info_id() {
		return payment_info_id;
	}

	public void setPayment_info_id(int payment_info_id) {
		this.payment_info_id = payment_info_id;
	}

	public int getOrder_number2() {
		return order_number2;
	}

	public void setOrder_number2(int order_number2) {
		this.order_number2 = order_number2;
	}

	public Date getPayment_info_regdate() {
		return payment_info_regdate;
	}

	public void setPayment_info_regdate(Date payment_info_regdate) {
		this.payment_info_regdate = payment_info_regdate;
	}

	public int getPayment_info_amount() {
		return payment_info_amount;
	}

	public void setPayment_info_amount(int payment_info_amount) {
		this.payment_info_amount = payment_info_amount;
	}

	public String getPayment_info_method() {
		return payment_info_method;
	}

	public void setPayment_info_method(String payment_info_method) {
		this.payment_info_method = payment_info_method;
	}

	public String getPayment_info_status() {
		return payment_info_status;
	}

	public void setPayment_info_status(String payment_info_status) {
		this.payment_info_status = payment_info_status;
	}

}
