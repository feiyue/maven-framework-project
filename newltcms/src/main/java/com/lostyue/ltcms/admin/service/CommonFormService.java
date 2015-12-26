/**
 * 2015年12月26日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lostyue.ltcms.admin.dao.CommonFormDao;

/**
 * 2015年12月26日
 * @author 许彬
 * @Description 
 */
@Service("commonFormService")
public class CommonFormService {
	
	@Autowired
	@Qualifier("commonFormDao")
	private CommonFormDao commonFormDao;
	
	@Transactional
	public void saveForm(Object object){
		commonFormDao.saveForm(object);
	}

}
