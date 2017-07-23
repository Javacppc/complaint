package cn.gov.wh.complain.sys.pojo;

import java.util.Date;

public class Reportfeedback {
    private String refeid;

    private String repid;

    private String retype;

    private String reportstatus;

    private String feebackcontent;

    private Date deadtim;

    private String involvedsub;

    private String sdept;

    public String getRefeid() {
        return refeid;
    }

    public void setRefeid(String refeid) {
        this.refeid = refeid == null ? null : refeid.trim();
    }

    public String getRepid() {
        return repid;
    }

    public void setRepid(String repid) {
        this.repid = repid == null ? null : repid.trim();
    }

    public String getRetype() {
        return retype;
    }

    public void setRetype(String retype) {
        this.retype = retype == null ? null : retype.trim();
    }

    public String getReportstatus() {
        return reportstatus;
    }

    public void setReportstatus(String reportstatus) {
        this.reportstatus = reportstatus == null ? null : reportstatus.trim();
    }

    public String getFeebackcontent() {
        return feebackcontent;
    }

    public void setFeebackcontent(String feebackcontent) {
        this.feebackcontent = feebackcontent == null ? null : feebackcontent.trim();
    }

    public Date getDeadtim() {
        return deadtim;
    }

    public void setDeadtim(Date deadtim) {
        this.deadtim = deadtim;
    }

    public String getInvolvedsub() {
        return involvedsub;
    }

    public void setInvolvedsub(String involvedsub) {
        this.involvedsub = involvedsub == null ? null : involvedsub.trim();
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept == null ? null : sdept.trim();
    }
}