/**
 * 2015年12月21日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2015年12月21日
 * @author 许彬
 * @Description 
 */
@Controller
public class ErrorRedirectController {

	@RequestMapping("/error404")
	public String error404(){
		return "error/404";
	}
	
	@RequestMapping("/error500")
	public String error500(){
		return "error/500";
	}
}
