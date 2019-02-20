import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zs.pms.po.TDep;
import com.zs.pms.po.TPermission;
import com.zs.pms.po.TUser;
import com.zs.pms.service.UserService;
import com.zs.pms.vo.QueryUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext.xml")
public class TestUserService {
	@Autowired
	UserService  us;
	
	/**
	 *检测
	 */
	public void testHello() {
		
		us.hello();
	}
	
	
	
	/**
	 * 部门整理 测试 
	 */
	public void testlogin() {
		List<TPermission> list1=us.queryByUid(1001);
		for(TPermission Per:list1) {
			System.out.println(Per.getPname());
		}
		System.out.println("----------------整理后-------------------------");
		for (TPermission per1 : us.genMenu(list1)) {
			//一级权限
			System.out.println(per1.getPname());
			
			for (TPermission per2 : per1.getChidren()) {
				System.out.println("-------"+per2.getPname());
			}
		}
	}
	
	
	
	/**
	 * 根据登录名  查询的   测试
	 */
	
//	public void testQuery() {
//		//创建查询对象
//		QueryUser query =new QueryUser();
//		query.setLoginname("wdy");
//		query.setPassword("123");
//		query.setSex("男");
//		System.out.println(us.queryByCon(query).size());
//	}
//	
	
	/**
	 * 测试删除
	 */
	
	public  void testDeletes() {
		int[] ids= {1004,1005};
		us.deletaByIds(ids);
	}
	
	
	
//	public void testQuery1() {
//		//创建查询对象
//		QueryUser query =new QueryUser();
//		query.setLoginname("");
//		query.setPassword("123");
//		query.setSex("男");
//		System.out.println(query.getIsenabled());
//	}
//	
	
	/**
	 * 修改测试   测试
	 */
	
	public void testUpdate() {
		TUser user=new TUser();
		user.setId(1003);
		TDep dep =new TDep();
		dep.setId(6);
		user.setDept(dep);
		user.setEmail("update@123.com");
		user.setIsenabled(-1);
		user.setLoginname("update123");
		user.setPassword("upd123");
		user.setPicurl("update123.jpg");
		user.setRealname("修改数据");
		user.setSex("女");
		user.setUpdator(2000);
		user.setBirthday(new Date());
		us.updateUser(user);
	}
	
	/**
	 * 新增
	 */
	@Test
	public void  testInsert() {
		TUser user=new TUser();
		TDep dep =new TDep();
		dep.setId(6);
		user.setDept(dep);
		user.setEmail("insert@123.com");
		user.setIsenabled(1);
		user.setLoginname("insert");
		user.setPassword("insert123");
		user.setPicurl("insert123.jpg");
		user.setRealname("新增数据");
		user.setSex("男");
		user.setCreator(1000);
		
		user.setBirthday(new Date());
		
		System.out.println(us.insertUser(user));
		
	}
	
	/**
	 * 删除一条
	 */
	
	public  void testDelete() {
		us.deleteById(189);
	}
	
	
	
	/**
	 * 查询一条
	 */
	
	public  void testQuseryById() {
		
		System.out.println(us.queryById(1001).getRealname());
	}
	
	/**
	 *   测试分页
	 */
	
	public void testQuery() {
		//创建查询对象
		QueryUser query =new QueryUser();
		query.setSex("男");
		for (TUser user : us.queryByPage(2, query)) {
			System.out.println(user.getId()+"、"+user.getLoginname());
		}
		System.out.println("共"+us.queryPageCont(query)+"页");
	}
	
	
	
}
