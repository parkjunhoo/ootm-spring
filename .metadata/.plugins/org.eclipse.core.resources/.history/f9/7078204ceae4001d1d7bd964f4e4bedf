package com.ootm.dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBUtil;

public class MemberDAOImpl implements MemberDAO {

	@Override
	// id , name , email , password , birth , zipcode , address , telnum , opt
	public int register(MemberDTO member) {

		String sql = "insert into member(member_id, member_name, member_email, member_password, member_birth, "
				+ "member_zipcode , member_address , member_telnum, member_opt) " + "values(?,?,?,?,?,?,?,?,?)";

		int result = 0;
		Connection con = null;
		PreparedStatement ptmt = null;

		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			ptmt.setString(1, member.getMember_id());
			ptmt.setString(2, member.getMember_name());
			ptmt.setString(3, member.getMember_email());
			ptmt.setString(4, member.getMember_password());
			ptmt.setDate(5, member.getMember_birth());
			ptmt.setString(6, member.getMember_zipcode());
			ptmt.setString(7, member.getMember_address());
			ptmt.setString(8, member.getMember_telnum());
			ptmt.setString(9, member.getMember_opt());

			result = ptmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ptmt, con);
		}
		return result;
	}

	@Override
	public MemberDTO read(String member_id) {
		String sql = "select * from member where member_id = ?";

		MemberDTO result = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, member_id);
			rs = ptmt.executeQuery();
			rs.next();
			
			result = new MemberDTO(
						rs.getString(1), //id
						rs.getString(2), //name
						rs.getString(3), //email
						rs.getString(4), //password
						rs.getDate	(5), //birth
						rs.getString(6), //zipcode
						rs.getString(7), //address
						rs.getString(8), //telnum
						rs.getString(9), //opt
						rs.getString(10),//status
						rs.getDate	(11), //regdate
						rs.getString(12), //grade
						rs.getInt	(13) //point
					);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}

		return result;
	}

	@Override
	public int delete(String member_id) {
		String sql = "delete from member where membder_id=?";
		
		int result = 0;
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, member_id);
			result = ptmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ptmt, con);
		}
		
		
		return result;
	}

	@Override
	public MemberDTO login(MemberDTO member) {
		String sql = "select * from member where member_id = ? and member_password = ?";
		
		MemberDTO result = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, member.getMember_id());
			ptmt.setString(2, member.getMember_password());
			
			rs = ptmt.executeQuery();
			if(rs.next()) {
				result = new MemberDTO(
						rs.getString(1), //id
						rs.getString(2), //name
						rs.getString(3), //email
						rs.getString(4), //password
						rs.getDate	(5), //birth
						rs.getString(6), //zipcode
						rs.getString(7), //address
						rs.getString(8), //telnum
						rs.getString(9), //opt
						rs.getString(10),//status
						rs.getDate	(11), //regdate
						rs.getString(12), //grade
						rs.getInt	(13) //point
					);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt , con);
		}
		
		
		
		
		return result;
	}

}
