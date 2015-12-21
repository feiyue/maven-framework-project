/**
 * 
 */
package com.lostyue.ltcms.admin.dao;

import java.util.List;

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
	
	/**
	 * 查询用户列表信息
	 * 2015年12月20日
	 * @author 许彬
	 * @Description
	 */
	@SuppressWarnings("unchecked")
	public List<Ltcms_user_> queryUserList(){
		return sessionFactory.getCurrentSession().createQuery("from Ltcms_user_").list();
	}

}
