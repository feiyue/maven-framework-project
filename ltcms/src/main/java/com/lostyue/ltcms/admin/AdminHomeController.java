/**
 * 
 */
package com.lostyue.ltcms.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ra
 */
@Controller
public class AdminHomeController {
	
	/**
	 * 首页controller
	 * @param model
	 * @return
	 */
	@RequestMapping("/adminHome")
	public String showAdminHomePage(Model model){
		model.addAttribute("adminHome", "ltcms admin home");
		return "admin/NewFile1";
	}
}
