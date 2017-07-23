package cn.gov.wh.complain.sys.vo;

import java.io.Serializable;
/**
 * EasyUI树形菜单控件  树控件需要传输的JSON数据
 * @author 朱可凡
 *
 */
public class EasyUITreeNode implements Serializable{
	private long id;
	private String text;
	private String state;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}	
}
