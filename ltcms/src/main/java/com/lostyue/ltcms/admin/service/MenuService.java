package com.lostyue.ltcms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lostyue.ltcms.admin.dao.MenuDao;

@Component("menuService")
public class MenuService {
	
	@Autowired
	@Qualifier("menuDao")
	private MenuDao menuDao;
	
	public void saveMenu(){
		menuDao.newMenu();
	}
}
