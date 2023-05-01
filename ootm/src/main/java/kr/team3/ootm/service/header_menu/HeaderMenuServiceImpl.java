package kr.team3.ootm.service.header_menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.team3.ootm.dao.header_menu.HeaderMenuDAO;
import kr.team3.ootm.dao.header_menu.HeaderMenuDTO;

@Service
public class HeaderMenuServiceImpl implements HeaderMenuService{

	@Autowired
	HeaderMenuDAO dao;
	
	@Override
	public List<HeaderMenuDTO> selectALL() {
		return dao.selectAll();
	}

	public void setDao(HeaderMenuDAO dao) {
		this.dao = dao;
	}
	
	
}
