package com.zs.pms.po;

import java.io.Serializable;
import java.util.Date;

import com.zs.pms.utils.DateUtil;
/**
 * 用户表
 */
public class TUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2484835629179763350L;

	//id
	private  int   id ;
	//用户名
	private String loginname;	
	//密码
	private String password;
	//性别
	private String sex;
	//出生
	private Date   birthday;
	//邮箱
	private String  email;
	//部门
	private TDep dept;
	private String  realname;
	private int    creator;
	private Date   creatime;
	private int    updator;
	private Date   updatime;
	private String picurl;
	
	private  int isenabled;
	
	
	private String    isenabledTxt;
	private String 	  birthdayTxt;
	



	public String getIsenabledTxt() {
		if (isenabled==1) {
			return "可用";
		}else {
			return "不可用";
		}
	}

	public String getBirthdayTxt() {
		return DateUtil.getStrDate(birthday);
	}
	
	
	
	

	public int getIsenabled() {
		return isenabled;
	}
	public void setIsenabled(int isenabled) {
		this.isenabled = isenabled;
	}


	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public TDep getDept() {
		return dept;
	}
	public void setDept(TDep dept) {
		this.dept = dept;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getCreator() {
		return creator;
	}
	public void setCreator(int creator) {
		this.creator = creator;
	}
	public Date getCreatime() {
		return creatime;
	}
	public void setCreatime(Date creatime) {
		this.creatime = creatime;
	}
	public int getUpdator() {
		return updator;
	}
	public void setUpdator(int updator) {
		this.updator = updator;
	}
	public Date getUpdatime() {
		return updatime;
	}
	public void setUpdatime(Date updatime) {
		this.updatime = updatime;
	}
	
	
	
	
	
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	
	
	
	
	
	
}
