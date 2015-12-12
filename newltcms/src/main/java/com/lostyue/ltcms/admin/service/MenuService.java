package com.lostyue.ltcms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lostyue.ltcms.admin.dao.MenuDao;

@Service("menuService")
public class MenuService {
	
	@Autowired
	@Qualifier("menuDao")
	private MenuDao menuDao;
	
	@Transactional( rollbackFor={Exception.class})
	public void saveMenu(){
		menuDao.newMenu();
		menuDao.newMenuError();
	}
}
