package cn.gov.wh.complain.sys.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.gov.wh.complain.sys.util.SysConstant;

public class LoginInterceptor implements HandlerInterceptor{
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpServletRequest hRequest = (HttpServletRequest) request;
		HttpServletResponse hResponse = (HttpServletResponse) response;
		String uri = hRequest.getRequestURI();
		//静态资源直接放行
		if (uri.contains("image") && uri.contains("css") && uri.contains("js")) {
			return true;
		}
		logger.info(new Date() + " 当前请求的URL为: " + uri);
		if(null != allowUrls && allowUrls.length>=1){  
			for(String url : allowUrls) {    
				if(uri.contains(url)) {
					logger.info("静态资源被拦截?");
					return true;
				}
			}
		}
		//如果请求的URL不是登录请求
		if (!uri.contains("login")) {
			//登录过的用户直接放行
			if (hRequest.getSession().getAttribute(SysConstant.CURRENT_USER_INFO) != null) {
				return true;
			} else {
				//未登录,需要跳转到登陆界面
				hResponse.sendRedirect(hRequest.getContextPath() + "/login");
				return false;
			}
		} else {
			//已经登录过了就直接跳转到后台管理首页
			if (hRequest.getSession().getAttribute(SysConstant.CURRENT_USER_INFO) != null) {
				hResponse.sendRedirect(hRequest.getContextPath() + "/index");
				return false;
			} else {
				logger.info("登录请求直接放行");
				//是登陆请求，那么直接放行
				return true;
			}
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}
	
	
	public String[] allowUrls;//直接配置不拦截的资源，所以在代码里面来排除  
    
    public void setAllowUrls(String[] allowUrls) {  
        this.allowUrls = allowUrls;  
    }  

	
}
