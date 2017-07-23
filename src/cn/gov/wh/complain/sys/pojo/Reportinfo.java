package cn.gov.wh.complain.sys.pojo;

import java.util.Date;

public class Reportinfo {
    private String reportid;

    private String urgent;

    private String subject;

    private String createcompany;

    private Date createtime;

    private String reportstatus;

    private String content;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent == null ? null : urgent.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getCreatecompany() {
        return createcompany;
    }

    public void setCreatecompany(String createcompany) {
        this.createcompany = createcompany == null ? null : createcompany.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getReportstatus() {
        return reportstatus;
    }

    public void setReportstatus(String reportstatus) {
        this.reportstatus = reportstatus == null ? null : reportstatus.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}