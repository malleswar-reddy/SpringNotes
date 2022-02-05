package com.main.dao;

import java.util.ArrayList;
import java.util.List;

public class SqlMapAccountDao {

	public List<String> getUsernames() {
		List<String> users= new ArrayList<String>();
		users.add("Pavan");
		users.add("siva");
		users.add("uday");
		users.add("venket");
		return users;
	}
	
}
