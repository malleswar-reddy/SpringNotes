
package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.dao.SqlMapAccountDao;
import com.main.dao.SqlMapItemDao;

public class PetStoreServiceImpl {

	@Autowired
	private SqlMapAccountDao accountDao;

	@Autowired
	private SqlMapItemDao itemDao;

	public List<String> getUsernameList() {
		return accountDao.getUsernames();
	}

	public List<String> getItemsList() {
		return itemDao.getItems();
	}

	public void setAccountDao(SqlMapAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setItemDao(SqlMapItemDao itemDao) {
		this.itemDao = itemDao;
	}

}
