package cn.gov.wh.complain.sys.login;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import cn.gov.wh.complain.sys.util.Encrypt;

/**
 * 密码比较器
 * @author 朱可凡
 *
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher{
	/**
	 * @param token 用户输入的用户名和密码等信息
	 * @param info  数据库中的密码
	 */
	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		UsernamePasswordToken tp = (UsernamePasswordToken) token;
		//将用户的密码加密  这样才能和数据库中加密的密码作比较
		Object pwd = Encrypt.md5(new String(tp.getPassword()), tp.getUsername());
		//数据库中的密码
		Object dbPwd = info.getCredentials();
		return this.equals(pwd, dbPwd);
	}
}
