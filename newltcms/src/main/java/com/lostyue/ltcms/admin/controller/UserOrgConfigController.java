/**
 * 
 */
package com.lostyue.ltcms.admin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lostyue.ltcms.admin.common.Constants;
import com.lostyue.ltcms.admin.model.Ltcms_user_;
import com.lostyue.ltcms.admin.service.UserOrgConfigService;

/**
 * @author ra
 *
 */
@Controller
@RequestMapping("/urconfig")
public class UserOrgConfigController {
	
	@Autowired
	private UserOrgConfigService userOrgConfigService;
	
	/**
	 * 带参数新增用户
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, params="new")
	public String initNewUser(Model model){
		model.addAttribute(new Ltcms_user_());
		return "admin/userorg/userEdit";
	}
	
	/**
	 * 新增用户处理方法
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String addUser(@Valid Ltcms_user_ user, BindingResult result){
		if(result.hasErrors()){
			return "admin/userorg/userEdit";
		}
		userOrgConfigService.saveUser(user);
		return "redirect:/urconfig/" + user.getUserid();
	}
	
	@RequestMapping("/newuser")
	public String addbsUser(@Valid Ltcms_user_ user, BindingResult result){
		if(result.hasErrors()){
			return "admin/userorg/userEdit";
		}
		userOrgConfigService.saveUser(user);
		return "redirect:/urconfig/" + user.getUserid();
	}
	
	/**
	 * 根据用户ID查询用户信息
	 * @param userid
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/{userid}")
	public String queryUser(@PathVariable String userid, Model model){
		Ltcms_user_ user = userOrgConfigService.queryUser(userid);
		model.addAttribute(user);
		return "admin/userorg/userEdit";
	}
	
	@RequestMapping("/userlist")
	public String queryAllUser(Model model){
		List<Ltcms_user_> list = userOrgConfigService.queryAllUser(); 
		model.addAttribute("userlist", list);
		return "admin/userorg/userList";
	}
	
	@RequestMapping("/newformuser")
	public String addFormUser(Model model){
		model.addAttribute(Constants.MODEL_ATTRIBUTE, "Ltcms_user_");
		return "admin/userorg/userFormEdit";
	}
	
}
