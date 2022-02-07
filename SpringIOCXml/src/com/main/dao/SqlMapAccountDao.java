package com.main.dao;

import java.util.ArrayList;
import java.util.List;

public class SqlMapAccountDao {

	private List<String> accaountlist;
	
	
	public List<String> getAccaountlist() {
		return accaountlist;
	}


	public void setAccaountlist(List<String> accaountlist) {
		this.accaountlist = accaountlist;
	}


	public List<String> getUsernames() {
		/*
		 * List<String> users= new ArrayList<String>(); users.add("Pavan");
		 * users.add("siva"); users.add("uday"); users.add("venket");
		 */
		return accaountlist;
	}
	
}
