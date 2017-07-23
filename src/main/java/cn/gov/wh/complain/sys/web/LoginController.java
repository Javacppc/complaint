package cn.gov.wh.complain.sys.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gov.wh.complain.sys.pojo.Adminuser;
import cn.gov.wh.complain.sys.util.SysConstant;
import cn.gov.wh.complain.sys.util.UtilFuns;
/**
 * 登录控制器
 * @author 朱可凡
 *
 */
@Controller
public class LoginController {
	Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("/login")
	public String toLogin() {
		logger.info("即将跳转到登陆页面");
		//跳转到登录页面
		return "login";
	}
	@RequestMapping("/syslogin")
	public String login(String username, String password, 
			HttpServletRequest request, HttpSession session) throws Exception{
		logger.info("进入LoginController模块进行登录认证");
		if (UtilFuns.isEmpty(username) && UtilFuns.isEmpty(password)) {
			logger.info("用户名和密码未填写");
			request.setAttribute("errorInfo", "用户名和密码未填写");
			return "login";
		}
		try {
			Subject subject = SecurityUtils.getSubject();
			subject.login(new UsernamePasswordToken(username, password));
			Adminuser user = (Adminuser) subject.getPrincipal();
			//记录到Session中
			session.setAttribute(SysConstant.CURRENT_USER_INFO, user);
		} catch (Exception e) {
			logger.error(new Date() + "登陆失败!" + " 原因:" + e.getMessage());
			request.setAttribute("errorInfo", "对不起，用户名或密码错误！");
			return "login";
		}
		logger.info("验证通过");
		//跳转到后台系统首页
		return "redirect:/index";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//删除Session会话信息
		session.removeAttribute(SysConstant.CURRENT_USER_INFO);
		//返回到登录界面
		return "redirect:/login";
	}
}
