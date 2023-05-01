package kr.team3.ootm.dao.header_menu;

import java.io.Serializable;
import java.util.List;

import kr.team3.ootm.dao.header_sub_menu.HeaderSubMenuDTO;

public class HeaderMenuDTO implements Serializable{
	private int id;
	private String name;
	private int idx;
	
	public HeaderMenuDTO() {
	}
	
	public HeaderMenuDTO(int id ,String name,int idx) {
		this.id = id;
		this.name = name;
		this.idx = idx;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	
	
	
	
}