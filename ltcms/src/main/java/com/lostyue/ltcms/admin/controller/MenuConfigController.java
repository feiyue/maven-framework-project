/**
 * 
 */
package com.lostyue.ltcms.admin.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lostyue.ltcms.admin.dao.LtMenuDao;

/**
 * @author ra
 */
@Controller
@RequestMapping("/menu")
public class MenuConfigController {
	
	@Autowired
	@Qualifier("ltMenuDao")
	private LtMenuDao ltMenuDao;
	
	/**
	 * 展现菜单配置列表
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String showMenuList(Model model){
		List menus = ltMenuDao.getMenu();
		for (Object object : menus) {
			System.out.println(MapUtils.getString((Map) object, "LT_MENU_NAME"));
		}
		return "admin/menu/menuList";
	}
}
