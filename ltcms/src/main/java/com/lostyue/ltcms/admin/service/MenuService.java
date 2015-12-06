package com.lostyue.ltcms.admin.service;

import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lostyue.ltcms.admin.dao.MenuDao;
import com.lostyue.ltcms.admin.dao.NewMenuDao;
import com.lostyue.ltcms.admin.model.Menu;

@Component("menuService")
public class MenuService {
	
	@Autowired
	@Qualifier("newMenuDao")
	private NewMenuDao newMenuDao;
	
	@Autowired
	@Qualifier("menuDao")
	private MenuDao menuDao;
	
	public void saveMenu(Menu m){
		if(StringUtils.isBlank(m.getLt_menu_id())){
			m.setLt_menu_id(UUID.randomUUID().toString());
		}
		newMenuDao.save(m);
		
		menuDao.newMenu();
	}
}
