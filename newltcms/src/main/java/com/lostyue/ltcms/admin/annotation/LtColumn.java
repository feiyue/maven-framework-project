/**
 * 2015年12月20日
 * @author 许彬
 * @Description 表头注解，用来自动生成单表的表单以及列表
 */
package com.lostyue.ltcms.admin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 2015年12月20日
 * @author 许彬
 * @Description 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.FIELD)
@Documented
public @interface LtColumn {
	
	/**
	 * 定义表头
	 * 2015年12月21日
	 * @author 许彬
	 * @Description
	 */
	String columnHeaderName() default "表头";
	
	/**
	 * 列排序字段
	 * 2015年12月21日
	 * @author 许彬
	 * @Description
	 */
	double columnIndex();
	
	/**
	 * 列类型字段
	 * 2015年12月21日
	 * @author 许彬
	 * @Description
	 */
	String columnType() default "String";
	
	/**
	 * 是否需要展示排序
	 * 2015年12月21日
	 * @author 许彬
	 * @Description
	 */
	boolean needSort() default true;
	
	/**
	 * 隐藏列
	 * 2015年12月21日
	 * @author 许彬
	 * @Description
	 */
	boolean isHiddenColumn() default false;
}
