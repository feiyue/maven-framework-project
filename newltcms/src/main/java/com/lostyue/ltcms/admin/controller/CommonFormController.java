/**
 * 2015年12月26日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lostyue.ltcms.admin.common.Constants;
import com.lostyue.ltcms.admin.service.CommonFormService;

/**
 * 2015年12月26日
 * @author 许彬
 * @Description 
 */
@Controller
@RequestMapping("/ltcmsform")
public class CommonFormController {
	
	@Autowired
	@Qualifier("commonFormService")
	private CommonFormService commonFormService;

	@RequestMapping("/new")
	public String addForm(HttpServletRequest request, HttpServletResponse response){
		Map formMap = request.getParameterMap();
		String modelName = request.getParameter("_MODELNAME");
		Class modelClass = null;
		Object formObject = null;
		
		/**
		 * 动态实例化
		 */
		try {
			modelClass = Class.forName(Constants.MODEL_CLASS_PACKAGE + modelName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			formObject = modelClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * 将表单属性同步至BEAN中
		 */
		try {
			BeanUtils.populate(formObject, formMap);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		commonFormService.saveForm(formObject);
		
		return "redirect:/urconfig/newformuser";
	}
}
