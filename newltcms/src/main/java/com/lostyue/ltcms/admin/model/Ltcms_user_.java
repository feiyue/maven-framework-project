package com.lostyue.ltcms.admin.model;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import com.lostyue.ltcms.admin.annotation.LtColumn;

   /**
    * ltcms_user_ 实体类
    * 2015-12-19 09:53 上午 许彬
    */ 

@Entity
@Table(name="LTCMS_USER_")
public class Ltcms_user_{
	
	@Id
	@GeneratedValue(generator="system-uuid")  
	@GenericGenerator(name = "system-uuid",strategy="uuid") 
	private String userid;
	
	private Double companyid;
	private Timestamp createdate;
	private Timestamp modifieddate;
	private Double defaultuser;
	private Double contactid;
	
	@LtColumn(columnHeaderName="用户密码", columnIndex=2)
	private String password_;
	
	private Double passwordencrypted;
	private Double passwordreset;
	private Timestamp passwordmodifieddate;
	private Double gracelogincount;
	
	@Size(min=6, max=20, message="Login name must in 6 and 20")
	@LtColumn(columnHeaderName="登录名称", columnIndex=1)
	private String screenname;
	
	@LtColumn(columnHeaderName="邮箱", columnIndex=3)
	private String emailaddress;
	
	private Double portraitid;
	private String languageid;
	private String timezoneid;
	private String greeting;
	private String comments;
	private Timestamp logindate;
	private String loginip;
	private Timestamp lastlogindate;
	private String lastloginip;
	private Timestamp lastfailedlogindate;
	private Double failedloginattempts;
	private Double lockout;
	private Timestamp lockoutdate;
	private Double agreedtotermsofuse;
	private Double active_;
	private String uuid_;
	private Double seq;
	public void setUserid(String userid){
	this.userid=userid;
	}
	public String getUserid(){
		return userid;
	}
	public void setCompanyid(Double companyid){
	this.companyid=companyid;
	}
	public Double getCompanyid(){
		return companyid;
	}
	public void setCreatedate(Timestamp createdate){
	this.createdate=createdate;
	}
	public Timestamp getCreatedate(){
		return createdate;
	}
	public void setModifieddate(Timestamp modifieddate){
	this.modifieddate=modifieddate;
	}
	public Timestamp getModifieddate(){
		return modifieddate;
	}
	public void setDefaultuser(Double defaultuser){
	this.defaultuser=defaultuser;
	}
	public Double getDefaultuser(){
		return defaultuser;
	}
	public void setContactid(Double contactid){
	this.contactid=contactid;
	}
	public Double getContactid(){
		return contactid;
	}
	public void setPassword_(String password_){
	this.password_=password_;
	}
	public String getPassword_(){
		return password_;
	}
	public void setPasswordencrypted(Double passwordencrypted){
	this.passwordencrypted=passwordencrypted;
	}
	public Double getPasswordencrypted(){
		return passwordencrypted;
	}
	public void setPasswordreset(Double passwordreset){
	this.passwordreset=passwordreset;
	}
	public Double getPasswordreset(){
		return passwordreset;
	}
	public void setPasswordmodifieddate(Timestamp passwordmodifieddate){
	this.passwordmodifieddate=passwordmodifieddate;
	}
	public Timestamp getPasswordmodifieddate(){
		return passwordmodifieddate;
	}
	public void setGracelogincount(Double gracelogincount){
	this.gracelogincount=gracelogincount;
	}
	public Double getGracelogincount(){
		return gracelogincount;
	}
	public void setScreenname(String screenname){
	this.screenname=screenname;
	}
	public String getScreenname(){
		return screenname;
	}
	public void setEmailaddress(String emailaddress){
	this.emailaddress=emailaddress;
	}
	public String getEmailaddress(){
		return emailaddress;
	}
	public void setPortraitid(Double portraitid){
	this.portraitid=portraitid;
	}
	public Double getPortraitid(){
		return portraitid;
	}
	public void setLanguageid(String languageid){
	this.languageid=languageid;
	}
	public String getLanguageid(){
		return languageid;
	}
	public void setTimezoneid(String timezoneid){
	this.timezoneid=timezoneid;
	}
	public String getTimezoneid(){
		return timezoneid;
	}
	public void setGreeting(String greeting){
	this.greeting=greeting;
	}
	public String getGreeting(){
		return greeting;
	}
	public void setComments(String comments){
	this.comments=comments;
	}
	public String getComments(){
		return comments;
	}
	public void setLogindate(Timestamp logindate){
	this.logindate=logindate;
	}
	public Timestamp getLogindate(){
		return logindate;
	}
	public void setLoginip(String loginip){
	this.loginip=loginip;
	}
	public String getLoginip(){
		return loginip;
	}
	public void setLastlogindate(Timestamp lastlogindate){
	this.lastlogindate=lastlogindate;
	}
	public Timestamp getLastlogindate(){
		return lastlogindate;
	}
	public void setLastloginip(String lastloginip){
	this.lastloginip=lastloginip;
	}
	public String getLastloginip(){
		return lastloginip;
	}
	public void setLastfailedlogindate(Timestamp lastfailedlogindate){
	this.lastfailedlogindate=lastfailedlogindate;
	}
	public Timestamp getLastfailedlogindate(){
		return lastfailedlogindate;
	}
	public void setFailedloginattempts(Double failedloginattempts){
	this.failedloginattempts=failedloginattempts;
	}
	public Double getFailedloginattempts(){
		return failedloginattempts;
	}
	public void setLockout(Double lockout){
	this.lockout=lockout;
	}
	public Double getLockout(){
		return lockout;
	}
	public void setLockoutdate(Timestamp lockoutdate){
	this.lockoutdate=lockoutdate;
	}
	public Timestamp getLockoutdate(){
		return lockoutdate;
	}
	public void setAgreedtotermsofuse(Double agreedtotermsofuse){
	this.agreedtotermsofuse=agreedtotermsofuse;
	}
	public Double getAgreedtotermsofuse(){
		return agreedtotermsofuse;
	}
	public void setActive_(Double active_){
	this.active_=active_;
	}
	public Double getActive_(){
		return active_;
	}
	public void setUuid_(String uuid_){
	this.uuid_=uuid_;
	}
	public String getUuid_(){
		return uuid_;
	}
	public void setSeq(Double seq){
	this.seq=seq;
	}
	public Double getSeq(){
		return seq;
	}
}

