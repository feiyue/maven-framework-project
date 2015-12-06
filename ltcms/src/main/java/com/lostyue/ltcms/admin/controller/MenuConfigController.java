/**
 * 
 */
package com.lostyue.ltcms.admin.controller;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lostyue.ltcms.admin.dao.MenuDao;
import com.lostyue.ltcms.admin.model.Menu;
import com.lostyue.ltcms.admin.service.MenuService;

/**
 * @author ra
 */
@Controller
@RequestMapping("/menu")
public class MenuConfigController {
	
	@Autowired
	@Qualifier("menuService")
	private MenuService menuService;
	
	/**
	 * 展现菜单配置列表
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String showMenuList(Model model){
		Menu m = new Menu();
		m.setCreate_date(Calendar.getInstance().getTime());
		m.setLt_menu_code("menu code");
		m.setLt_menu_name("menu name");
		menuService.saveMenu(m);
		
		return "admin/menu/menuList";
	}
}
