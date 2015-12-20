package com.lostyue.ltcms.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

   /**
    * ltcms_users_roles 实体类
    * 2015-12-19 10:16 上午 许彬
    */ 

@Entity
@Table(name="LTCMS_USERS_ROLES")
public class Ltcms_users_roles{
	@Id
	@GeneratedValue(generator="system-uuid")  
	@GenericGenerator(name = "system-uuid",strategy="uuid") 
	@Column(name="USERS_ROLES_ID")
	private String users_roles_id;
	
	public String getUsers_roles_id() {
		return users_roles_id;
	}
	public void setUsers_roles_id(String users_roles_id) {
		this.users_roles_id = users_roles_id;
	}
	@Column(name="USERID")
	private String userid;
	@Column(name="ROLEID")
	private String roleid;
	
	public void setUserid(String userid){
	this.userid=userid;
	}
	public String getUserid(){
		return userid;
	}
	public void setRoleid(String roleid){
	this.roleid=roleid;
	}
	public String getRoleid(){
		return roleid;
	}
}

