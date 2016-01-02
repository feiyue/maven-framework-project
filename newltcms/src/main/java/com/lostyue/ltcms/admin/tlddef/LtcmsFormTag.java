/**
 * 2015年12月22日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.tlddef;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.lostyue.ltcms.admin.annotation.LtFieldType;
import com.lostyue.ltcms.admin.annotation.LtForm;
import com.lostyue.ltcms.admin.annotation.LtFormField;
import com.lostyue.ltcms.admin.common.Constants;

/**
 * 2015年12月22日
 * @author 许彬
 * @Description 
 */
public class LtcmsFormTag extends SimpleTagSupport {
	
	private static String INPUT_TEXT = "<input id=\"${fieldId}\" name=\"${fieldId}\" type=\"text\" class=\"form-control\"  placeholder=\"${fieldLabel}\" ${Readonly} ${value} />";
	
	private static String INPUT_PASSWORD = "<input id=\"${fieldId}\" name=\"${fieldId}\"  type=\"password\" class=\"form-control\"  placeholder=\"${fieldLabel}\" ${Readonly} ${value} />";
	
	private static String INPUT_HIDDEN = "<input type=\"hidden\" id=\"${fieldId}\" name=\"${fieldId}\" value=\"${fieldValue}\">";
	
	private String modelAttribute;
	
	private String readOnly;
	
	public void doTag() throws IOException, JspException{
		Class modelClass = null;
		boolean isReadOnly = "true".equals(getReadOnly());
		try {
			modelClass = Class.forName(Constants.MODEL_CLASS_PACKAGE + getModelAttribute());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//TODO 控件直接的距离使用栅格来进行控制！！！
		//TODO 按钮列表，根据action表来查询
		//TODO 
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
			for (Field field : fields) {
				LtFormField column = field.getAnnotation(LtFormField.class);
				if(column != null){
					String fieldId = field.getName();
					String fieldLabel = column.label();
					StringBuffer columnHtml = new StringBuffer();
					
					/**
					 * 拼装LABEL
					 */
					switch (column.fieldType()) {
						case CHECKBOX:
							break;
						default:
							columnHtml.append("<label for=\"" + fieldId + "\">");
							columnHtml.append(fieldLabel);
							columnHtml.append("</label>");
							break;
					}
					/**
					 * 拼装控件
					 */
					switch (column.fieldType()) {
						case TEXT:
							columnHtml.append(LtcmsFormTag.INPUT_TEXT.replace("${fieldId}", fieldId).replace("${fieldLabel}", fieldLabel));
							break;
						case PASSWORD:
							columnHtml.append(INPUT_PASSWORD.replace("${fieldId}", fieldId).replace("${fieldLabel}", fieldLabel));	
						default:
							break;
					}
					
					this.parseFormGroup(columnHtml, null, column.fieldType());
					/**
					 * 处理只读状态
					 */
					int index = columnHtml.indexOf("${Readonly}");
					
					if(isReadOnly){
						columnHtml.replace(index, index + 11, "Readonly");
					}else{
						columnHtml.replace(index, index + 11, "");
					}
					
					int index1 = columnHtml.indexOf("${value}");
					if(isReadOnly){
						columnHtml.replace(index1, index1 + 8, "value=\"" + (String)getJspContext().findAttribute(field.getName()) + "\"" );
					}else{
						columnHtml.replace(index1, index1 + 8, "");
					}
					
					formHtml.append(columnHtml);
				}
			}
			formHtml.append("<button type=\"submit\" class=\"btn btn-default\">新增</button>");
			
			formHtml.append(INPUT_HIDDEN.replace("${fieldId}", Constants.PARA_MODELNAME).replace("${fieldValue}", getModelAttribute()));
			
			this.parseForm(formHtml, null);
			
			getJspContext().getOut().println(formHtml.toString());
		}
	}
	
	/**
	 * 包裹form html
	 * 2015年12月26日
	 * @author 许彬
	 * @Description
	 */
	private void parseForm(StringBuffer formHtml, Map criterial){
		PageContext pageContext = (PageContext) this.getJspContext();
		String path = pageContext.getServletContext().getContextPath();
		formHtml.insert(0, "<form action=\""+ path + "/ltcmsform/new\" method=\"post\"> ");
		formHtml.append("</form>");
	}
	
	/**
	 * 处理实际控件外面包裹的div
	 * 2015年12月26日
	 * @author 许彬
	 * @Description
	 */
	private void parseFormGroup(StringBuffer formHtml, Map criterial, LtFieldType fieldType){
		switch (fieldType) {
			case CHECKBOX:
				formHtml.insert(0, "<div class=\"checkbox\">");
				formHtml.append("</div>");
				break;
			default:
				formHtml.insert(0, "<div class=\"form-group\">");
				formHtml.append("</div>");
				break;
		}
	}
	
	private void parseControl(StringBuffer formHtml, Map criterial, LtFieldType fieldType){
		
	}

	public String getModelAttribute() {
		return modelAttribute;
	}

	public void setModelAttribute(String modelAttribute) {
		this.modelAttribute = modelAttribute;
	}

	public String getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}
}
