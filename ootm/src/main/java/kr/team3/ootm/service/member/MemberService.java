package kr.team3.ootm.service.member;


import kr.team3.ootm.dao.member.MemberDTO;

public interface MemberService {
	public int register(MemberDTO member); //
	public int email_check(String member_email);
	public MemberDTO login(MemberDTO member);
	public int withdraw(String member_id);
	public int id_check(String id);
}
