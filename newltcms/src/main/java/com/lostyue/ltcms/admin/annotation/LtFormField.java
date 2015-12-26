/**
 * 2015年12月21日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 2015年12月21日
 * @author 许彬
 * @Description 自定义表单注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.FIELD)
@Documented
public @interface LtFormField {
	
	String label() default "字段";
	
	LtFieldType fieldType() default LtFieldType.TEXT;
	
	boolean isHidden() default false;

}
