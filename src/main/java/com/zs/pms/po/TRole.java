package com.zs.pms.po;

import java.io.Serializable;

/**
 * 角色表
 * @author Administrator
 *
 */
public class TRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3919966075357083392L;
	
	private  int  id;
	private  String rname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	@Override
	public String toString() {
		return "TRole [id=" + id + ", rname=" + rname + "]";
	}
	
	
	
	
	
}
