/**
 * 2015年12月22日
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
 * 2015年12月22日
 * @author 许彬
 * @Description 表单注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
@Documented
public @interface LtForm {

	int cols() default 2;
}
