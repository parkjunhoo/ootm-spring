package kr.team3.ootm.dao.member;

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
		//System.out.println("<확인3>member값: "+member.getMember_address());
		String sql = "insert into ootm_member (member_id, member_name, member_email, member_password, member_birth,member_zipcode , member_address , member_telnum, member_opt) values(?,?,?,?,?,?,?,?,?)";
		//(member_id, member_name, member_email, member_password, member_birth, "+ "member_zipcode , member_address , member_telnum, member_opt)
		int result=template.update(sql,member.getMember_id(),member.getMember_name(),member.getMember_email(),member.getMember_password(),member.getMember_birth(),member.getMember_zipcode(),member.getMember_address(),member.getMember_telnum(),member.getMember_opt());
		return result;
		
	}
	public int id_check(String id) {
		int result=0;
		try {
			MemberDTO member = template.queryForObject("select * from ootm_member where member_id=?",new Object[] {id},new MemberRowMapper());
			result=1;
		} catch (EmptyResultDataAccessException e) {
			result=0;
		}
		return result;
	}
	public int email_check(String email) {
		int result=0;
		try {
			MemberDTO member = template.queryForObject("select * from ootm_member where member_email=?",new Object[] {email},new MemberRowMapper());
			result=1;
		} catch (EmptyResultDataAccessException e) {
			result=0;
		}
		return result;
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
	public int withdraw(String member_id) {
		String sql="update ootm_member set member_status = 1 where member_id= ? ";
		int result = template.update(sql,member_id);
		return result;
	}
}
