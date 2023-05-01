package kr.team3.ootm.dao.header_sub_menu;

import java.util.List;

import kr.team3.ootm.dao.header_menu.HeaderMenuDTO;

public interface HeaderSubMenuDAO {
	public List<HeaderSubMenuDTO> selectByHeaderMenuId(int header_sub_menu_id);
	public List<HeaderSubMenuDTO> selectAll();
}
