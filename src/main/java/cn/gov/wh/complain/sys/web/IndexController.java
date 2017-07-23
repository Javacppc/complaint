package cn.gov.wh.complain.sys.web;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gov.wh.complain.sys.exception.SysException;
/**
 * 页面跳转控制器
 * @author 朱可凡
 *
 */
@Controller
public class IndexController {
	/**
	 * 跳转到系统首页
	 * @return
	 * @throws SysException 
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) throws SysException, UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		return "index";
	}
	/**
	 * 跳转到相应的页面(页面名称和uri路径一样)
	 * @param uri
	 * @return
	 *//*
	@RequestMapping("/{uri}")
	public String page(@PathVariable String uri) {
		return "redirect:/" + uri + "/";
	}*/
}
