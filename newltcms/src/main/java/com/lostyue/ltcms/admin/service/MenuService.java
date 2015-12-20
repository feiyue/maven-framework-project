package com.lostyue.ltcms.admin.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lostyue.ltcms.admin.dao.MenuDao;
import com.lostyue.ltcms.admin.model.LtMenu;

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
	
	@Transactional
	public void saveLtMenu(LtMenu menu){
		/*if(StringUtils.isBlank(menu.getMenuId())){
			menu.setMenuId(UUID.randomUUID().toString());
			menuDao.insertLtMenu(menu);
		}else{
			
		}*/
		menu.setCreateDate(Calendar.getInstance().getTime());
		menuDao.insertLtMenu(menu);
	}
	
	public LtMenu getLtMenu(String menuId){
		return menuDao.queryLtMenu(menuId);
	}
}
