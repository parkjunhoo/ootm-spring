package com.ootm.dao.headerMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import util.DBUtil;

public class HeaderMenuDAOImpl implements HeaderMenuDAO{

	@Override
	public int insert(HeaderMenuDTO headerMenu) {
		return 0;
	}

	@Override
	public ArrayList<HeaderMenuDTO> select() {
		ArrayList<HeaderMenuDTO> result = new ArrayList<HeaderMenuDTO>();
		ArrayList<HeaderSubMenuDTO> subMenuList = new ArrayList<HeaderSubMenuDTO>(); 
		
		String sql = "select * from header_sub_menu";
		String sql2 = "select * from header_menu";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			HeaderSubMenuDTO subMenuDTO = null;
			while(rs.next()) {
				subMenuDTO = new HeaderSubMenuDTO(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getBoolean(5),rs.getString(6));
				subMenuList.add(subMenuDTO);
			}
			ptmt.close();
			rs.close();
			
			ptmt = con.prepareStatement(sql2);
			rs = ptmt.executeQuery();
			
			
			HeaderMenuDTO menuDTO = null;
			while(rs.next()) {
				ArrayList<HeaderSubMenuDTO> subList = new ArrayList<HeaderSubMenuDTO>();
				int listCount = subMenuList.size();
				for(int i=0; i<listCount; i++) {
					HeaderSubMenuDTO dto = subMenuList.get(i);
					if(dto.getMenuId() == rs.getInt(1)) {
						subList.add(dto);
					}
				}
				menuDTO = new HeaderMenuDTO(rs.getInt(1),rs.getString(2),rs.getInt(3),subList);
				result.add(menuDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return result;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

}
