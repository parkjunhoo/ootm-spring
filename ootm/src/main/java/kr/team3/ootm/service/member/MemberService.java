package kr.team3.ootm.service.member;

import java.util.List;

import kr.team3.ootm.dao.member.MemberDTO;

public interface MemberService {
	public int register(MemberDTO member); //
	
	public MemberDTO login(MemberDTO member);
	public int withdraw(String member_id);
}
