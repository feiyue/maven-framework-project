/**
 * 2015年12月20日
 * @author 许彬
 * @Description 自定义标签库，整合bootstrap的表格库
 */
package com.lostyue.ltcms.admin.tlddef;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.apache.commons.lang.StringUtils;

import com.lostyue.ltcms.admin.annotation.LtColumn;
import com.lostyue.ltcms.admin.common.Constants;

/**
 * 2015年12月20日
 * @author 许彬
 * @Description 
 */
public class LtcmsObjectDataTableTag extends SimpleTagSupport {
	
	/**
	 * 用于进行数据迭代的集合
	 */
	private String collection;
	
	private String modelname;

	@SuppressWarnings("unchecked")
	public void doTag() throws IOException{
		List<Object> itemList = (List<Object>) getJspContext().findAttribute(collection);
		
		Class modelClass = null;
		try {
			modelClass = Class.forName(Constants.MODEL_CLASS_PACKAGE + getModelname());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/**
		 * 获取所有的字段
		 */
		Field[] fields = modelClass.getDeclaredFields();
		/**
		 * 获取所有的显示列
		 */
		List<DataTableColumnDef> columns = new ArrayList<DataTableColumnDef>();
		
		for (Field field : fields) {
			LtColumn column = field.getAnnotation(LtColumn.class);
			if(column != null){
				DataTableColumnDef c = new DataTableColumnDef();
				c.setColumnName(field.getName());
				c.setColumnIndex(column.columnIndex());
				c.setHeaderName(column.columnHeaderName());
				
				columns.add(c);
			}
		}
		/**
		 * 表头排序
		 */
		Collections.sort(columns);
		
		JspWriter out = getJspContext().getOut();
		StringBuffer tableHeader = new StringBuffer();
		StringBuffer tableBody = new StringBuffer();
		tableHeader.append("<thead><tr>");
		tableBody.append("<tbody>");
		/**
		 * 拼装table html
		 */
		out.println("<table class='table'>");
		
		for (DataTableColumnDef dataTableColumnDef : columns) {
			tableHeader.append("<td>" + dataTableColumnDef.getHeaderName() + "</td>");
		}
		
		for (Object object : itemList) {
			tableBody.append("<tr>");
			for (DataTableColumnDef dataTableColumnDef : columns) {
				Method m = null;
				try {
					m = object.getClass().getMethod("get" + StringUtils.capitalize(dataTableColumnDef.getColumnName()), null);
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					tableBody.append("<td>" + String.valueOf(m.invoke(object, null)) + "</td>");
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block 
					e.printStackTrace();
				}
			}
			tableBody.append("</tr>");
		}
		
		tableBody.append("</tbody>");
		tableHeader.append("</tr></thead>");
		
		out.println(tableHeader.toString());
		out.println(tableBody.toString());
		
		out.println("</table>");
	}
	
	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
}
