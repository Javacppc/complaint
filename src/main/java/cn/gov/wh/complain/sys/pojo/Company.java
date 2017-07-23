package cn.gov.wh.complain.sys.pojo;

import java.io.Serializable;

public class Company implements Serializable{
    private String companyid;

    private String companyname;//单位名称

    private String admindivi;//行政区划号码

    private String parentid;//父单位Id  自关联

    private String descript;//备注信息

    private String comlevel; //单位级别  1:市级  2:区级  3:所级

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getAdmindivi() {
        return admindivi;
    }

    public void setAdmindivi(String admindivi) {
        this.admindivi = admindivi == null ? null : admindivi.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    public String getComlevel() {
        return comlevel;
    }

    public void setComlevel(String comlevel) {
        this.comlevel = comlevel == null ? null : comlevel.trim();
    }

	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", companyname=" + companyname + ", admindivi=" + admindivi
				+ ", parentid=" + parentid + ", descript=" + descript + ", comlevel=" + comlevel + "]";
	}
    
}