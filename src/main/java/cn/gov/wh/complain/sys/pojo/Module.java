package cn.gov.wh.complain.sys.pojo;

import java.io.Serializable;
/**
 * È¨ÏÞ
 * @author Öì¿É·²
 *
 */
public class Module implements Serializable{
    private String moduleid;

    private String parentid;

    private String parentname;//ÈßÓà×Ö¶Î

    private String modulename;

    private Integer ordernum;//ÅÅÐòºÅ

    private String description;

    private String modulestatus;

    private String url;

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid == null ? null : moduleid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getModulestatus() {
        return modulestatus;
    }

    public void setModulestatus(String modulestatus) {
        this.modulestatus = modulestatus == null ? null : modulestatus.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}