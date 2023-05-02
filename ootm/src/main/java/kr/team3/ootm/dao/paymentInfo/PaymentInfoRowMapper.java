package kr.team3.ootm.dao.paymentInfo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PaymentInfoRowMapper implements RowMapper<PaymentInfoDTO> {

	@Override
	public PaymentInfoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PaymentInfoDTO payment = new PaymentInfoDTO(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getInt(4), 
				rs.getString(5), rs.getString(6));
		return payment;
	}

}
