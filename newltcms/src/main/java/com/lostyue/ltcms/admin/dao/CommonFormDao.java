/**
 * 2015年12月26日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.dao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.lostyue.ltcms.admin.common.Constants;

/**
 * 2015年12月26日
 * @author 许彬
 * @Description 
 */
@Repository("commonFormDao")
public class CommonFormDao {
	
	private static Logger logger = LoggerFactory.getLogger(CommonFormDao.class);
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	public void saveForm(Object object){
		sessionFactory.getCurrentSession().saveOrUpdate(object);
	}
	
	/**
	 * 根据对象ID获取对象信息
	 * 2015年12月27日
	 * @author 许彬
	 * @Description
	 */
	public Object queryFormObject(String dataid, String modelName){
		Class modelClass = null;
		
		/**
		 * 动态实例化
		 */
		try {
			modelClass = Class.forName(Constants.MODEL_CLASS_PACKAGE + modelName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sessionFactory.getCurrentSession().get(modelClass, dataid);
	}

}
