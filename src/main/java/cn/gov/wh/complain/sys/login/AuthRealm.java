package cn.gov.wh.complain.sys.login;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.gov.wh.complain.sys.mapper.AdminuserMapper;
import cn.gov.wh.complain.sys.mapper.ModuleMapper;
import cn.gov.wh.complain.sys.mapper.RoleModuleMapper;
import cn.gov.wh.complain.sys.mapper.UserRoleMapper;
import cn.gov.wh.complain.sys.pojo.Adminuser;
import cn.gov.wh.complain.sys.pojo.AdminuserExample;
import cn.gov.wh.complain.sys.pojo.AdminuserExample.Criteria;
import cn.gov.wh.complain.sys.pojo.Module;
import cn.gov.wh.complain.sys.pojo.RoleModuleExample;
import cn.gov.wh.complain.sys.pojo.RoleModuleKey;
import cn.gov.wh.complain.sys.pojo.UserRoleExample;
import cn.gov.wh.complain.sys.pojo.UserRoleKey;
/**
 * Shiro realm域
 * @author 朱可凡
 *
 */
public class AuthRealm extends AuthorizingRealm{
	Logger logger = LoggerFactory.getLogger(getClass());
	/**
	 * 用户Mapper--用于取出数据库中的用户名和密码
	 */
	@Autowired
	private AdminuserMapper adminuserMapper;
	@Autowired
	private UserRoleMapper userRoleMapper;
	@Autowired
	private RoleModuleMapper roleModuleMapper;
	@Autowired
	private ModuleMapper moduleMapper;
	
	/**
	 * 授权(即有相应的权限才能访问某一个功能模块)
	 * 在页面中配合shiro标签使用,就可以实现不同用户加载不同模块  实现权限控制
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
		logger.info("进入授权验证模块");
		Adminuser user = (Adminuser) pc.fromRealm(this.getName()).iterator().next();
		//权限列表
		List<String> permissions = new ArrayList<String>();
		//查出该用户的所有role
		String userid = user.getUserid();
		//通过userid查询  在userrole表中查询,先查出这个用户的所有角色
		UserRoleExample example = new UserRoleExample();
		cn.gov.wh.complain.sys.pojo.UserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<UserRoleKey> list = userRoleMapper.selectByExample(example);
		
		for (UserRoleKey uk : list) {
			String roleid = uk.getRoleid();
			RoleModuleExample example1 = new RoleModuleExample();
			cn.gov.wh.complain.sys.pojo.RoleModuleExample.Criteria criteria2 = example1.createCriteria();
			criteria2.andRoleidEqualTo(roleid);
			List<RoleModuleKey> list2 = roleModuleMapper.selectByExample(example1);
			
			for (RoleModuleKey module : list2) {
				Module module2 = moduleMapper.selectByPrimaryKey(module.getModuleid());
				//有了就不加了
				if (!permissions.contains(module2.getModulename()))
					permissions.add(module2.getModulename());
			}
		}
		
		SimpleAuthorizationInfo sa = new SimpleAuthorizationInfo();
		//加入权限列表
		sa.addStringPermissions(permissions);
		
		return sa;
	}
	/**
	 * 认证(即登录)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		logger.info("进入登录验证模块");
		UsernamePasswordToken up = (UsernamePasswordToken) token;
		AdminuserExample example = new AdminuserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(up.getUsername());//用户输入的用户名
		List<Adminuser> list = adminuserMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			Adminuser au = list.get(0);
			AuthenticationInfo ainfo = new SimpleAuthenticationInfo(au, au.getPassword(), this.getName());
			return ainfo;//进入密码比较器
		}
		//抛出异常
		return null;
	}
}
