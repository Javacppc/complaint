package cn.gov.wh.complain.sys.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SysExceptionResolver implements HandlerExceptionResolver{
	Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		logger.error(ex.getMessage());
		SysException exp = null;
		if (ex instanceof SysException) {
			exp = (SysException) ex;
		} else {
			exp = new SysException("系统错误,请与管理员联系");
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("error");
		model.addObject("message", ex.getMessage());
		return model;
	}

}
