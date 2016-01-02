package com.lostyue.ltcms.admin.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.lostyue.ltcms.admin.annotation.LtFieldType;
import com.lostyue.ltcms.admin.annotation.LtForm;
import com.lostyue.ltcms.admin.annotation.LtFormField;

   /**
    * lt_menu 实体类
    * 2016-01-02 03:47 下午 许彬
    */ 

@Entity
@Table(name="lt_menu")
@LtForm
public class Lt_menu{
	
	@Id
	@GenericGenerator(strategy="hilo", name="lt_menu_pk")
	@GeneratedValue(generator="lt_menu_pk")
	@Column(name="menuId")
	private int menuId;
	
	private int menuTypeId;
	
	@LtFormField(label="菜单名称", fieldType=LtFieldType.TEXT)
	private String menuName;
	
	@LtFormField(label="菜单排序", fieldType=LtFieldType.TEXT)
	private int menuOrder;
	
	private int deleteFlag;
	
	@LtFormField(label="是否需要显示", fieldType=LtFieldType.TEXT)
	private int displayFlag;
	
	@LtFormField(label="菜单地址", fieldType=LtFieldType.TEXT)
	private String menuUrl;
	
	private String menuClass;
	private String menuDesc;
	private Date createDate;
	public void setMenuId(int menuId){
	this.menuId=menuId;
	}
	public int getMenuId(){
		return menuId;
	}
	public void setMenuTypeId(int menuTypeId){
	this.menuTypeId=menuTypeId;
	}
	public int getMenuTypeId(){
		return menuTypeId;
	}
	public void setMenuName(String menuName){
	this.menuName=menuName;
	}
	public String getMenuName(){
		return menuName;
	}
	public void setMenuOrder(int menuOrder){
	this.menuOrder=menuOrder;
	}
	public int getMenuOrder(){
		return menuOrder;
	}
	public void setDeleteFlag(int deleteFlag){
	this.deleteFlag=deleteFlag;
	}
	public int getDeleteFlag(){
		return deleteFlag;
	}
	public void setDisplayFlag(int displayFlag){
	this.displayFlag=displayFlag;
	}
	public int getDisplayFlag(){
		return displayFlag;
	}
	public void setMenuUrl(String menuUrl){
	this.menuUrl=menuUrl;
	}
	public String getMenuUrl(){
		return menuUrl;
	}
	public void setMenuClass(String menuClass){
	this.menuClass=menuClass;
	}
	public String getMenuClass(){
		return menuClass;
	}
	public void setMenuDesc(String menuDesc){
	this.menuDesc=menuDesc;
	}
	public String getMenuDesc(){
		return menuDesc;
	}
	public void setCreateDate(Date createDate){
	this.createDate=createDate;
	}
	public Date getCreateDate(){
		return createDate;
	}
}

