package cn.gov.wh.complain.sys.pojo;

import java.io.Serializable;
import java.util.Date;

public class Shunt implements Serializable{
    private String shuntid;

    private String repid;

    private String complainregid;

    private String shuntreport;

    private Date deadline;

    private String inputcompany;

    private String outcompany;

    private Date shunttime;

    private String append;

    public String getShuntid() {
        return shuntid;
    }

    public void setShuntid(String shuntid) {
        this.shuntid = shuntid == null ? null : shuntid.trim();
    }

    public String getRepid() {
        return repid;
    }

    public void setRepid(String repid) {
        this.repid = repid == null ? null : repid.trim();
    }

    public String getComplainregid() {
        return complainregid;
    }

    public void setComplainregid(String complainregid) {
        this.complainregid = complainregid == null ? null : complainregid.trim();
    }

    public String getShuntreport() {
        return shuntreport;
    }

    public void setShuntreport(String shuntreport) {
        this.shuntreport = shuntreport == null ? null : shuntreport.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getInputcompany() {
        return inputcompany;
    }

    public void setInputcompany(String inputcompany) {
        this.inputcompany = inputcompany == null ? null : inputcompany.trim();
    }

    public String getOutcompany() {
        return outcompany;
    }

    public void setOutcompany(String outcompany) {
        this.outcompany = outcompany == null ? null : outcompany.trim();
    }

    public Date getShunttime() {
        return shunttime;
    }

    public void setShunttime(Date shunttime) {
        this.shunttime = shunttime;
    }

    public String getAppend() {
        return append;
    }

    public void setAppend(String append) {
        this.append = append == null ? null : append.trim();
    }
}