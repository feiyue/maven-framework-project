/**
 * 
 */
package com.lostyue.ltcms.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lostyue.ltcms.admin.dao.UserOrgConfigDao;
import com.lostyue.ltcms.admin.model.Ltcms_user_;

/**
 * @author ra
 *
 */
@Service("userOrgConfigService")
public class UserOrgConfigService {
	
	@Autowired
	private UserOrgConfigDao userOrgConfigDao;
	
	@Transactional
	public void saveUser(Ltcms_user_ user){
		userOrgConfigDao.insertUser(user);
	}
	
	public Ltcms_user_ queryUser(String userId){
		return userOrgConfigDao.queryUser(userId);
	}
	
	public List<Ltcms_user_> queryAllUser(){
		return userOrgConfigDao.queryUserList();
	}
}
