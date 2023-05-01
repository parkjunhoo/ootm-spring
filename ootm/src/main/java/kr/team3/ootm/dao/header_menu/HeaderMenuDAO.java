package kr.team3.ootm.dao.header_menu;

import java.util.ArrayList;
import java.util.List;

public interface HeaderMenuDAO {
	public List<HeaderMenuDTO> selectAll();
	
	public int insert(HeaderMenuDTO headerMenu);
	public ArrayList<HeaderMenuDTO> select();
	public int delete(String id);
}
