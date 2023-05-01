package kr.team3.ootm.dao.header_menu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HeaderMenuDAOImpl implements HeaderMenuDAO{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<HeaderMenuDTO> selectAll() {
		return template.query("select * from header_menu order by header_menu_idx",
				new HeaderMenuRowMapper());
	}

	@Override
	public int insert(HeaderMenuDTO headerMenu) {
		return 0;
	}

	@Override
	public ArrayList<HeaderMenuDTO> select() {
		return null;
	}

	@Override
	public int delete(String id) {
		return 0;
	}
	
}
