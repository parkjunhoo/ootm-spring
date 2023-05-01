package kr.team3.ootm.dao.header_menu;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import kr.team3.ootm.service.header_sub_menu.HeaderSubMenuService;

public class HeaderMenuRowMapper implements RowMapper<HeaderMenuDTO>{
	@Autowired
	
	@Override
	public HeaderMenuDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		HeaderMenuDTO headerMenu = new HeaderMenuDTO(
				rs.getInt(1), 		// 메뉴id
				rs.getString(2), 	// 메뉴 이름
				rs.getInt(3)		// 메뉴 idx
				);		
		return headerMenu;
	}
}
