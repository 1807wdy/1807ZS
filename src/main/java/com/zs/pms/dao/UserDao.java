package com.zs.pms.dao;

import java.util.List;

import com.zs.pms.po.TPermission;
import com.zs.pms.po.TUser;
import com.zs.pms.vo.QueryUser;

public interface UserDao {

	//根据用户id获权限列表
	public  List<TPermission> queryByUid(int id);
	
	
	//根据登录名查询  条件查询
	public List<TUser> queryByCon(QueryUser query);
	
	
	//批量删除
	public void deleteByIds(int[] ids);
	
	//修改
	public void updateUser(TUser user);
	
	//新增 返回主键
	public int insertUser(TUser user);
	
	
	//删除一条
	public void deleteById(int id);
	
	//查一条
	public  TUser queryById(int id);
	
	//分页查询
	public  List<TUser> queryByPage(QueryUser query);
	
	//获得总条数
	public int queryCount(QueryUser query);
	
	
}
