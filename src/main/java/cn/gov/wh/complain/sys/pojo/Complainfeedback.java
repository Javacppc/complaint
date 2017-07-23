package cn.gov.wh.complain.sys.pojo;

import java.io.Serializable;

public class Complainfeedback implements Serializable{
    private String feedbackid;

    private String complainregid;

    private String stype;

    private String reportstatus;

    private String solvedept;

    private String helpcompany;

    private String manager;

    private String registor;

    private Integer satype;

    private Float compensation;

    private Float quamoney;

    private Float restore;

    private String feedbackcontent;

    private Float spiritmoney;

    private String involvedsub;

    public String getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(String feedbackid) {
        this.feedbackid = feedbackid == null ? null : feedbackid.trim();
    }

    public String getComplainregid() {
        return complainregid;
    }

    public void setComplainregid(String complainregid) {
        this.complainregid = complainregid == null ? null : complainregid.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getReportstatus() {
        return reportstatus;
    }

    public void setReportstatus(String reportstatus) {
        this.reportstatus = reportstatus == null ? null : reportstatus.trim();
    }

    public String getSolvedept() {
        return solvedept;
    }

    public void setSolvedept(String solvedept) {
        this.solvedept = solvedept == null ? null : solvedept.trim();
    }

    public String getHelpcompany() {
        return helpcompany;
    }

    public void setHelpcompany(String helpcompany) {
        this.helpcompany = helpcompany == null ? null : helpcompany.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getRegistor() {
        return registor;
    }

    public void setRegistor(String registor) {
        this.registor = registor == null ? null : registor.trim();
    }

    public Integer getSatype() {
        return satype;
    }

    public void setSatype(Integer satype) {
        this.satype = satype;
    }

    public Float getCompensation() {
        return compensation;
    }

    public void setCompensation(Float compensation) {
        this.compensation = compensation;
    }

    public Float getQuamoney() {
        return quamoney;
    }

    public void setQuamoney(Float quamoney) {
        this.quamoney = quamoney;
    }

    public Float getRestore() {
        return restore;
    }

    public void setRestore(Float restore) {
        this.restore = restore;
    }

    public String getFeedbackcontent() {
        return feedbackcontent;
    }

    public void setFeedbackcontent(String feedbackcontent) {
        this.feedbackcontent = feedbackcontent == null ? null : feedbackcontent.trim();
    }

    public Float getSpiritmoney() {
        return spiritmoney;
    }

    public void setSpiritmoney(Float spiritmoney) {
        this.spiritmoney = spiritmoney;
    }

    public String getInvolvedsub() {
        return involvedsub;
    }

    public void setInvolvedsub(String involvedsub) {
        this.involvedsub = involvedsub == null ? null : involvedsub.trim();
    }
}