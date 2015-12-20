package com.lostyue.ltcms.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

   /**
    * ltcms_role_ 实体类
    * 2015-12-19 10:12 上午 许彬
    */ 

@Entity
@Table(name="LTCMS_ROLE_")
public class Ltcms_role_{
	
	@Id
	@GeneratedValue(generator="system-uuid")  
	@GenericGenerator(name = "system-uuid",strategy="uuid") 
	private String roleid;
	
	private double companyid;
	private double classnameid;
	private double classpk;
	private String name;
	private String description;
	private double type_;
	public void setRoleid(String roleid){
	this.roleid=roleid;
	}
	public String getRoleid(){
		return roleid;
	}
	public void setCompanyid(double companyid){
	this.companyid=companyid;
	}
	public double getCompanyid(){
		return companyid;
	}
	public void setClassnameid(double classnameid){
	this.classnameid=classnameid;
	}
	public double getClassnameid(){
		return classnameid;
	}
	public void setClasspk(double classpk){
	this.classpk=classpk;
	}
	public double getClasspk(){
		return classpk;
	}
	public void setName(String name){
	this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setDescription(String description){
	this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public void setType_(double type_){
	this.type_=type_;
	}
	public double getType_(){
		return type_;
	}
}

