package cn.gov.wh.complain.sys.vo;
/**
 * 返回给前台的 单位 信息JSON对象
 * @author 朱可凡
 * @since 2017/7/22 17:26
 * @see 在寝室
 */
public class CompanyVo {
	private String companyid;
	private String companyname;
	public String getCompanyid() {
		return companyid;
	}
	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public CompanyVo(String companyid, String companyname) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
	}
	public CompanyVo() {
	}
	
}
