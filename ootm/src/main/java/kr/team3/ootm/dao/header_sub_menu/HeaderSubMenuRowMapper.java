package kr.team3.ootm.dao.header_sub_menu;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class HeaderSubMenuRowMapper implements RowMapper<HeaderSubMenuDTO> {

	@Override
	public HeaderSubMenuDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		HeaderSubMenuDTO headerSubMenu = new HeaderSubMenuDTO(
				rs.getInt(1),		//헤더 서브메뉴 아이디
				rs.getInt(2),		//헤더 메뉴 아이디
				rs.getString(3),	//헤더 서브메뉴 네임
				rs.getInt(4),		//헤더 서브메뉴 인덱스
				rs.getBoolean(5),	//헤더 서브메뉴 하이라이트
				rs.getString(6)	//헤더 서브메뉴 kor네임
				);
		return headerSubMenu;
	}

}
