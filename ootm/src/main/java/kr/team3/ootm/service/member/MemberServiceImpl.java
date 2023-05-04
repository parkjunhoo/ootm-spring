package kr.team3.ootm.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.member.MemberDAO;
import kr.team3.ootm.dao.member.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDAO dao;

	@Override
	public int register(MemberDTO member) {
		return dao.register(member);
	}
	
	@Override
	public MemberDTO login(MemberDTO member) {
		return dao.login(member);
	}
	
	@Override
	public int withdraw(String member_id) {
		
		return dao.withdraw(member_id);
	}
	
	public int id_check(String member_id) {
		return dao.id_check(member_id);
	}
	
	public int email_check(String member_email) {
		return dao.email_check(member_email);
	}
}
