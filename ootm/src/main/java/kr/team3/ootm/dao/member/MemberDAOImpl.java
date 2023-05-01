package kr.team3.ootm.dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	JdbcTemplate template;

	@Override
	// id , name , email , password , birth , zipcode , address , telnum , opt
	public int register(MemberDTO member) {

		String sql = "insert into ootm_member(member_id, member_name, member_email, member_password, member_birth, "
				+ "member_zipcode , member_address , member_telnum, member_opt) " + "values(?,?,?,?,?,?,?,?,?)";

		int result = template.update(sql,
				member.getMember_id(),
				member.getMember_name(),
				member.getMember_email(),
				member.getMember_password(),
				member.getMember_birth(),
				member.getMember_zipcode(),
				member.getMember_address(),
				member.getMember_telnum(),
				member.getMember_opt()
				);

		return result;
	}

	@Override
	public MemberDTO read(String member_id) {
		String sql = "select * from ootm_member where member_id = ?";
		
		return template.queryForObject(sql,
				new Object[] {member_id} , new MemberRowMapper());
	}


	@Override
	public MemberDTO login(MemberDTO member) {
		MemberDTO loginMember = null;
		try {
			loginMember = template.queryForObject("select * from ootm_member where member_id=? AND member_password=?",
					new Object[] { member.getMember_id(), member.getMember_password() }, new MemberRowMapper());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

		return loginMember;
	}

}
