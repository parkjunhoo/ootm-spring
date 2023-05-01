package kr.team3.ootm.service.header_sub_menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.header_sub_menu.HeaderSubMenuDAO;
import kr.team3.ootm.dao.header_sub_menu.HeaderSubMenuDTO;

@Service
public class HeaderSubMenuServiceImpl implements HeaderSubMenuService{

	@Autowired
	private HeaderSubMenuDAO dao;
	
	@Override
	public List<HeaderSubMenuDTO> selectByHeaderMenuId(int header_menu_id) {
		return dao.selectByHeaderMenuId(header_menu_id);
	}
	
	@Override
	public List<HeaderSubMenuDTO> selectALL() {
		return dao.selectAll();
	}


	
}
