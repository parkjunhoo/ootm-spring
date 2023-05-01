package kr.team3.ootm.service.header_sub_menu;

import java.util.List;

import kr.team3.ootm.dao.header_sub_menu.HeaderSubMenuDTO;

public interface HeaderSubMenuService {
	public List<HeaderSubMenuDTO> selectByHeaderMenuId(int header_menu_id);
	public List<HeaderSubMenuDTO> selectALL();
}
