/**
 * 
 */
package com.lostyue.ltcms.admin.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.lostyue.ltcms.admin.model.Ltcms_user_;

/**
 * @author ra
 *
 */
@Repository("userOrgConfigDao")
public class UserOrgConfigDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	/**
	 * 新增用户
	 * @param user
	 */
	public void insertUser(Ltcms_user_ user){
		sessionFactory.getCurrentSession().save(user);
	}
	
	/**
	 * 根据ID查询用户信息
	 * @param userId
	 * @return
	 */
	public Ltcms_user_ queryUser(String userId){
		return (Ltcms_user_) sessionFactory.getCurrentSession().get(Ltcms_user_.class, userId);
	}

}
