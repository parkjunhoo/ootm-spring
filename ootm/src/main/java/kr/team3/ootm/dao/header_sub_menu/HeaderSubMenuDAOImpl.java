package kr.team3.ootm.dao.header_sub_menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HeaderSubMenuDAOImpl implements HeaderSubMenuDAO{

	@Autowired
	JdbcTemplate template;
	
	
	@Override
	public List<HeaderSubMenuDTO> selectByHeaderMenuId(int header_menu_id) {
		return template.query("select * from header_sub_menu where id = header_menu_id order by header_sub_menu_idx"
				, new HeaderSubMenuRowMapper());
	}
	
	@Override
	public List<HeaderSubMenuDTO> selectAll() {
		return template.query("select * from header_sub_menu", new HeaderSubMenuRowMapper());
	}



}
