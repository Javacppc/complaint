package cn.gov.wh.complain.sys.pojo;

import java.io.Serializable;
import java.util.Date;

public class Reportreg implements Serializable{
    private String repid;

    private String shuntid;

    private String userid;

    private String refeid;

    private String returnid;

    private String repname;

    private Boolean gender;

    private String contact;

    private String address;

    private String zipcode;

    private Integer identify;

    private String atype;

    private String companyname;

    private String companyaddress;

    private String companytele;

    private String companyzipcode;

    private Date happentime;

    private String happendaddress;

    private Integer belongarea;

    private String contentdesc;

    private String processstatu;

    public String getRepid() {
        return repid;
    }

    public void setRepid(String repid) {
        this.repid = repid == null ? null : repid.trim();
    }

    public String getShuntid() {
        return shuntid;
    }

    public void setShuntid(String shuntid) {
        this.shuntid = shuntid == null ? null : shuntid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRefeid() {
        return refeid;
    }

    public void setRefeid(String refeid) {
        this.refeid = refeid == null ? null : refeid.trim();
    }

    public String getReturnid() {
        return returnid;
    }

    public void setReturnid(String returnid) {
        this.returnid = returnid == null ? null : returnid.trim();
    }

    public String getRepname() {
        return repname;
    }

    public void setRepname(String repname) {
        this.repname = repname == null ? null : repname.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public Integer getIdentify() {
        return identify;
    }

    public void setIdentify(Integer identify) {
        this.identify = identify;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype == null ? null : atype.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getCompanytele() {
        return companytele;
    }

    public void setCompanytele(String companytele) {
        this.companytele = companytele == null ? null : companytele.trim();
    }

    public String getCompanyzipcode() {
        return companyzipcode;
    }

    public void setCompanyzipcode(String companyzipcode) {
        this.companyzipcode = companyzipcode == null ? null : companyzipcode.trim();
    }

    public Date getHappentime() {
        return happentime;
    }

    public void setHappentime(Date happentime) {
        this.happentime = happentime;
    }

    public String getHappendaddress() {
        return happendaddress;
    }

    public void setHappendaddress(String happendaddress) {
        this.happendaddress = happendaddress == null ? null : happendaddress.trim();
    }

    public Integer getBelongarea() {
        return belongarea;
    }

    public void setBelongarea(Integer belongarea) {
        this.belongarea = belongarea;
    }

    public String getContentdesc() {
        return contentdesc;
    }

    public void setContentdesc(String contentdesc) {
        this.contentdesc = contentdesc == null ? null : contentdesc.trim();
    }

    public String getProcessstatu() {
        return processstatu;
    }

    public void setProcessstatu(String processstatu) {
        this.processstatu = processstatu == null ? null : processstatu.trim();
    }
}