package com.main.dao;

import java.util.ArrayList;
import java.util.List;

public class SqlMapItemDao {

	public List<String> getItems() {
		List<String> items = new ArrayList<String>();
		items.add("Mango");
		items.add("bananna");
		items.add("Apple");
		items.add("Orange");
		return items;
	}

}
