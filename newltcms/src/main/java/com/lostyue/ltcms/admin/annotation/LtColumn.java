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
	
	String columnHeaderName() default "表头";
	
	double columnIndex();
	
	String columnType() default "String";
	
	boolean needSort() default true;
	
	boolean isHiddenColumn() default false;
}
