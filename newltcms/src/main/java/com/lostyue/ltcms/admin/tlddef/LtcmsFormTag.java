/**
 * 2015年12月22日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.tlddef;

import java.io.IOException;
import java.lang.reflect.Field;

import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.lostyue.ltcms.admin.annotation.LtForm;
import com.lostyue.ltcms.admin.annotation.LtFormField;
import com.lostyue.ltcms.admin.common.Constants;

/**
 * 2015年12月22日
 * @author 许彬
 * @Description 
 */
public class LtcmsFormTag extends SimpleTagSupport {
	
	private String modelname;
	
	private String attribute;
	
	public void doTag() throws IOException{
		Class modelClass = null;
		try {
			modelClass = Class.forName(Constants.MODEL_CLASS_PACKAGE + getModelname());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//TODO 控件直接的距离使用栅格来进行控制！！！
		/**
		 * 获取实体类上的表单注解
		 */
		LtForm ltform = (LtForm) modelClass.getAnnotation(LtForm.class);
		if(ltform != null){
			/**
			 * 获取所有的字段
			 */
			Field[] fields = modelClass.getDeclaredFields();
			StringBuffer formHtml = new StringBuffer();
			
			formHtml.append("<form > ");
			
			for (Field field : fields) {
				LtFormField column = field.getAnnotation(LtFormField.class);
				if(column != null){
					String fieldId = field.getName();
					String fieldLabel = column.label(); 
					formHtml.append("<div class=\"form-group\">");
					formHtml.append("<label for=\"" + fieldId + "\">");
					formHtml.append(fieldLabel);
					formHtml.append("</label>");
					
					formHtml.append("<input type=\"");
					
					switch (column.fieldType()) {
						case TEXT:
							formHtml.append("text");
							break;
						case PASSWORD:	
							formHtml.append("password");	
						default:
							break;
					}
					formHtml.append("\" class=\"form-control\" id=\"" + fieldId + "\" placeholder=\"请输入" + fieldLabel + " \">");
					
					formHtml.append("</div>");
				}
			}
			formHtml.append("<button type=\"submit\" class=\"btn btn-default\">Submit</button>");
			formHtml.append("</form>");
			
			getJspContext().getOut().println(formHtml.toString());
		}
		
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

}
