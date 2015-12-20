/**
 * 2015年12月20日
 * @author 许彬
 * @Description 自定义标签的演示，用来展示一个日期类型的标签
 */
package com.lostyue.ltcms.admin.tlddef;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 2015年12月20日
 * @author 许彬
 * @Description 
 */
public class LtcmsDateTag extends SimpleTagSupport{

	public void doTag() throws JspException, IOException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		getJspContext().getOut().write("当前日期：" + sdf.format(Calendar.getInstance().getTime()));
	}
}
