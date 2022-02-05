package com.main.services;

import java.util.List;
import java.util.Map;

import com.main.dao.SqlMapAccountDao;
import com.main.dao.SqlMapItemDao;

public class PetStoreServiceImpl {

	private SqlMapAccountDao accountDao;
	private SqlMapItemDao itemDao;

	public List<String> getUsernameList() {
		return accountDao.getUsernames();
	}

	public List<String> getItemsList() {
		return itemDao.getItems();
	}
	
	public  Map<String, Integer> getImageFormats() {
		return itemDao.getImageFormats();
	}

	public void setAccountDao(SqlMapAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setItemDao(SqlMapItemDao itemDao) {
		this.itemDao = itemDao;
	}

}
