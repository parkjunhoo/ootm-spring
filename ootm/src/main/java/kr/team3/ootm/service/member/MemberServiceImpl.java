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
	public int insert(MemberDTO member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDTO read(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> selectAllMember() {
		return null;
	}

	@Override
	public MemberDTO login(MemberDTO member) {
		return dao.login(member);
	}
	
}
