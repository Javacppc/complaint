package cn.gov.wh.complain.sys.vo;

import java.io.Serializable;
import java.util.List;
/**
 * EasyUI Datagrid控件前后台传输的JSON数据封装成的对象
 * @author 朱可凡
 *
 */
public class EasyUIDataGridResult implements Serializable{

	private long total;
	private List rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
}
