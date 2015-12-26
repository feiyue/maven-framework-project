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

}
