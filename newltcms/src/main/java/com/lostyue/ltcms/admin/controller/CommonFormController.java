/**
 * 2015年12月26日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String addForm(HttpServletRequest request, HttpServletResponse response, RedirectAttributes attr) throws Exception{
		Map formMap = request.getParameterMap();
		String modelName = request.getParameter(Constants.PARA_MODELNAME);
		Class modelClass = null;
		Object formObject = null;
		
		/**
		 * 动态实例化
		 */
		modelClass = Class.forName(Constants.MODEL_CLASS_PACKAGE + modelName);
		formObject = modelClass.newInstance();
		
		/**
		 * 将表单属性同步至BEAN中
		 */
		BeanUtils.populate(formObject, formMap);
		
		commonFormService.saveForm(formObject);
		
		/*页面不管是redirect还是直接返回，都是要给Jsp页面的。, html有个毛用？？*/
		
		Map objectMap = BeanUtils.describe(formObject);
		
		/*attr.addAllAttributes(objectMap);*/
		Iterator objectIter = objectMap.entrySet().iterator();
		while(objectIter.hasNext()){
			Entry e = (Entry) objectIter.next();
			request.setAttribute(String.valueOf(e.getKey()), e.getValue());
		}
		
		attr.addAttribute(Constants.PARA_MODELNAME, modelName);
		/*attr.addAttribute(Constants.PARA_FORMOBJECT, objectMap);*/
		
		/*return "admin/userorg/" + modelName.toLowerCase() + Constants.COMMON_FORM_VIEW_SUFFIX;*/
		return "redirect:/ltcmsform/view";
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String queryFormDataByDataId(HttpServletRequest request, HttpServletResponse response/*, Model model*/){
		String modelName = request.getParameter(Constants.PARA_MODELNAME);
		request.setAttribute("modelAttribute", modelName);
		Map para = request.getParameterMap();
		Iterator objectIter = para.entrySet().iterator();
		while(objectIter.hasNext()){
			Entry e = (Entry) objectIter.next();
			request.setAttribute(String.valueOf(e.getKey()), request.getParameter(String.valueOf(e.getKey())));
		}
		
		/*model.addAllAttributes(request.getParameterMap());*/
		
		return "admin/userorg/" + modelName.toLowerCase() + Constants.COMMON_FORM_VIEW_SUFFIX;
	}
}
