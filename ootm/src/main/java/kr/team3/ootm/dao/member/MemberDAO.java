package kr.team3.ootm.dao.member;

public interface MemberDAO {
	public int register(MemberDTO member);
	public MemberDTO login(MemberDTO member);
	public int withdraw(String member_id);
	public int id_check(String id);
	public int email_check(String email);
}
