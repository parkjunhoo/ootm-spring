package kr.team3.ootm.service.headerSubMenu;

import java.util.List;

import kr.team3.ootm.dao.headerSubMenu.HeaderSubMenuDTO;

public interface HeaderSubMenuService {
	public List<HeaderSubMenuDTO> selectByHeaderMenuId(int header_menu_id);
	public List<HeaderSubMenuDTO> selectALL();
}
