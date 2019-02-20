package com.zs.pms.service;

import java.util.List;

import com.zs.pms.po.TPermission;
import com.zs.pms.po.TUser;
import com.zs.pms.vo.QueryUser;

public interface UserService {
	//测试方法
	public  void hello();
	
	//根据用户id获得权限列表
	public  List<TPermission> queryByUid(int id);
	
	//根据原有权限整理菜单
	public List<TPermission> genMenu(List<TPermission> pers);
	
	//按条件查询
	public List<TUser>queryByCon(QueryUser query);
	
	//批量删除
	public  void deletaByIds(int [] ids);
	
	//修改
	public void updateUser(TUser user);
	
	//新增 返回主键
	public int insertUser(TUser user);
	
	//删除一条
	public void deleteById(int id);
	
	//查一条
	public  TUser queryById(int id);
	
	//分页记录
	public List<TUser> queryByPage(int page,QueryUser query);
	
	//计算总页数
	public int queryPageCont(QueryUser query);
	
	
	
}
