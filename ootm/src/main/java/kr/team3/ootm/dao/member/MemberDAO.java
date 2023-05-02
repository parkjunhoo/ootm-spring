package kr.team3.ootm.dao.member;

public interface MemberDAO {
	public int register(MemberDTO member);
	public MemberDTO login(MemberDTO member);
	public int withdraw(String member_id);
}
