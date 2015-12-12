/**
 * 
 */
package com.lostyue.ltcms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		menuService.saveMenu();
		return "admin/menu/menuList";
	}
	
	@RequestMapping("/edit")
	public String doMenuEdit(Model model){
		menuService.saveMenu();
		
		return "admin/menu/menuList";
	}
}
