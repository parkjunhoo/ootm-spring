package kr.team3.ootm.dao.header;

import java.util.ArrayList;

public interface HeaderMenuDAO {
	public int insert(HeaderMenuDTO headerMenu);
	public ArrayList<HeaderMenuDTO> select();
	public int delete(String id);
}
