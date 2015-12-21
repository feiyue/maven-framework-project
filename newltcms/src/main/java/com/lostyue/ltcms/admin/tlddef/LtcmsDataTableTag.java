/**
 * 2015年12月20日
 * @author 许彬
 * @Description 自定义标签库，整合bootstrap的表格库
 */
package com.lostyue.ltcms.admin.tlddef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.apache.commons.collections.MapUtils;

/**
 * 2015年12月20日
 * @author 许彬
 * @Description 
 */
public class LtcmsDataTableTag extends SimpleTagSupport {
	
	/**
	 * 用于进行数据迭代的集合
	 */
	private String collection;
	
	public String getColumns() {
		return columns;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}

	/**
	 * 定义列属性
	 */
	private String columns;

	@SuppressWarnings("unchecked")
	public void doTag() throws IOException{
		List<Map<String, String>> itemList = (List<Map<String, String>>) getJspContext().getAttribute(collection);
		List<DataTableColumnDef> columnList = (List<DataTableColumnDef>) getJspContext().getAttribute(columns);
		
		JspWriter out = getJspContext().getOut();
		StringBuffer tableHeader = new StringBuffer();
		StringBuffer tableBody = new StringBuffer();
		tableHeader.append("<thead><tr>");
		tableBody.append("<tbody>");
		/**
		 * 拼装table html
		 */
		out.println("<table class='table'>");
		
		for (DataTableColumnDef dataTableColumnDef : columnList) {
			tableHeader.append("<td>" + dataTableColumnDef.getHeaderName() + "</td>");
		}
		
		for (Map<String, String> map : itemList) {
			tableBody.append("<tr>");
			for (DataTableColumnDef dataTableColumnDef : columnList) {
				tableBody.append("<td>" + MapUtils.getString(map, dataTableColumnDef.getColumnName(), "&nbsp;") + "</td>");
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
}
