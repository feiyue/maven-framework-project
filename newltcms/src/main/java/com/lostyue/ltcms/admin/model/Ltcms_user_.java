package com.lostyue.ltcms.admin.model;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

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
	
	private double companyid;
	private Timestamp createdate;
	private Timestamp modifieddate;
	private double defaultuser;
	private double contactid;
	private String password_;
	private double passwordencrypted;
	private double passwordreset;
	private Timestamp passwordmodifieddate;
	private double gracelogincount;
	
	@Size(min=6, max=20, message="Login name must in 6 and 20")
	private String screenname;
	
	private String emailaddress;
	private double portraitid;
	private String languageid;
	private String timezoneid;
	private String greeting;
	private String comments;
	private Timestamp logindate;
	private String loginip;
	private Timestamp lastlogindate;
	private String lastloginip;
	private Timestamp lastfailedlogindate;
	private double failedloginattempts;
	private double lockout;
	private Timestamp lockoutdate;
	private double agreedtotermsofuse;
	private double active_;
	private String uuid_;
	private double seq;
	public void setUserid(String userid){
	this.userid=userid;
	}
	public String getUserid(){
		return userid;
	}
	public void setCompanyid(double companyid){
	this.companyid=companyid;
	}
	public double getCompanyid(){
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
	public void setDefaultuser(double defaultuser){
	this.defaultuser=defaultuser;
	}
	public double getDefaultuser(){
		return defaultuser;
	}
	public void setContactid(double contactid){
	this.contactid=contactid;
	}
	public double getContactid(){
		return contactid;
	}
	public void setPassword_(String password_){
	this.password_=password_;
	}
	public String getPassword_(){
		return password_;
	}
	public void setPasswordencrypted(double passwordencrypted){
	this.passwordencrypted=passwordencrypted;
	}
	public double getPasswordencrypted(){
		return passwordencrypted;
	}
	public void setPasswordreset(double passwordreset){
	this.passwordreset=passwordreset;
	}
	public double getPasswordreset(){
		return passwordreset;
	}
	public void setPasswordmodifieddate(Timestamp passwordmodifieddate){
	this.passwordmodifieddate=passwordmodifieddate;
	}
	public Timestamp getPasswordmodifieddate(){
		return passwordmodifieddate;
	}
	public void setGracelogincount(double gracelogincount){
	this.gracelogincount=gracelogincount;
	}
	public double getGracelogincount(){
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
	public void setPortraitid(double portraitid){
	this.portraitid=portraitid;
	}
	public double getPortraitid(){
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
	public void setFailedloginattempts(double failedloginattempts){
	this.failedloginattempts=failedloginattempts;
	}
	public double getFailedloginattempts(){
		return failedloginattempts;
	}
	public void setLockout(double lockout){
	this.lockout=lockout;
	}
	public double getLockout(){
		return lockout;
	}
	public void setLockoutdate(Timestamp lockoutdate){
	this.lockoutdate=lockoutdate;
	}
	public Timestamp getLockoutdate(){
		return lockoutdate;
	}
	public void setAgreedtotermsofuse(double agreedtotermsofuse){
	this.agreedtotermsofuse=agreedtotermsofuse;
	}
	public double getAgreedtotermsofuse(){
		return agreedtotermsofuse;
	}
	public void setActive_(double active_){
	this.active_=active_;
	}
	public double getActive_(){
		return active_;
	}
	public void setUuid_(String uuid_){
	this.uuid_=uuid_;
	}
	public String getUuid_(){
		return uuid_;
	}
	public void setSeq(double seq){
	this.seq=seq;
	}
	public double getSeq(){
		return seq;
	}
}

