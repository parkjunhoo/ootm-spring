package kr.team3.ootm.dao.paymentInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentInfoDAOImpl implements PaymentInfoDAO {
	@Autowired
	JdbcTemplate template;

	@Override
	public int addPaymentInfo(PaymentInfoDTO paymentInfo) {
		String sql = "insert into payment_info values(payment_info_id, order_number, payment_info_regdate, payment_info_amount, payment_info_method, payment_info_status) values (?, ?, ?, ?, ?, ?)";
		return template.update(sql, paymentInfo.getPayment_info_id(), paymentInfo.getOrder_number2(), paymentInfo.getPayment_info_regdate(), paymentInfo.getPayment_info_amount(), paymentInfo.getPayment_info_method(), paymentInfo.getPayment_info_status());
    }

	@Override
	public PaymentInfoDTO getPaymentInfo(int payment_info_id) {
		return template.queryForObject("select * from payment_info where payment_info_id = ?", new Object[]{payment_info_id}, new PaymentInfoRowMapper());

	}

	@Override
	public List<PaymentInfoDTO> getAllPaymentInfo() {
		return template.query("select * from payment_info", new PaymentInfoRowMapper());
	}
}
