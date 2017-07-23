package cn.gov.wh.complain.sys.pojo;

public class Company {
    private String companyid;

    private String companyname;

    private String admindivi;

    private String parentid;

    private String descript;

    private String comlevel;

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
}