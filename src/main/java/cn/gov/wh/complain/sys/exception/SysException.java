package cn.gov.wh.complain.sys.exception;
/**
 * 自定义系统异常
 * @author 朱可凡
 *
 */
public class SysException extends Exception {

	private String message;

	public SysException(String message) {
		this.message  = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
