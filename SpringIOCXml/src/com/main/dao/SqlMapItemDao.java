package com.main.dao;

import java.util.List;
import java.util.Map;

public class SqlMapItemDao {

	private List<String> items;
	private Map<String, Integer> imageFormats;

	public void setItems(List<String> items) {
		this.items = items;
	}

	public void setImageFormats(Map<String, Integer> imageFormats) {
		this.imageFormats = imageFormats;
	}

	public Map<String, Integer> getImageFormats() {
		return imageFormats;
	}

	public List<String> getItems() {
//		List<String> items = new ArrayList<String>();
//		items.add("Mango");
//		items.add("bananna");
//		items.add("Apple");
//		items.add("Orange");
		return items;
	}

}
