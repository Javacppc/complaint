package cn.gov.wh.complain.sys.util;

import org.apache.log4j.Logger;

/**
 * 记录一些全局的数据
 * @author 朱可凡
 *
 */
public class SysConstant {
	private static Logger log = Logger.getLogger(SysConstant.class);
	/**
	 * 当前用户session name
	 */
	public static String CURRENT_USER_INFO = "_CURRENT_USER";
	/**
	 * 分页时一页显示多少条记录
	 */
	public static int PAGE_SIZE = 10;
}
