package com.lostyue.ltcms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lostyue.ltcms.admin.model.LtMenu;
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
	
	@RequestMapping(method=RequestMethod.GET, params="new")
	public String initMenu(Model model){
		model.addAttribute(new LtMenu());
		return "admin/menu/edit";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	/*public String newMenu(HttpServletRequest request, HttpServletResponse response){*/
	public String newMenu(@ModelAttribute("ltMenu") LtMenu ltMenu){
		/*String menuName = request.getParameter("a");*/
		/*LtMenu ltMenu = new LtMenu();*/
		menuService.saveLtMenu(ltMenu);
		
		return "redirect:/menu/" + ltMenu.getMenuId();
	}
	
	@RequestMapping(value="/{menuId}", method=RequestMethod.GET)
	public String showMenu(@PathVariable String menuId, Model model){
		LtMenu m = menuService.getLtMenu(menuId);
		
		model.addAttribute("adminHome", "ltcms admin home");
		model.addAttribute("menuName", m.getMenuName());
		model.addAttribute("menuCode", m.getMenuCode());
		return "admin/menu/edit";
	}
}
