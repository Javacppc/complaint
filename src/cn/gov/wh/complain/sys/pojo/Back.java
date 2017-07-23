package cn.gov.wh.complain.sys.pojo;

public class Back {
    private String returnid;

    private String complainregid;

    private String repid;

    private String returnperson;

    private String returncause;

    private String contact;

    private String returnadvice;

    public String getReturnid() {
        return returnid;
    }

    public void setReturnid(String returnid) {
        this.returnid = returnid == null ? null : returnid.trim();
    }

    public String getComplainregid() {
        return complainregid;
    }

    public void setComplainregid(String complainregid) {
        this.complainregid = complainregid == null ? null : complainregid.trim();
    }

    public String getRepid() {
        return repid;
    }

    public void setRepid(String repid) {
        this.repid = repid == null ? null : repid.trim();
    }

    public String getReturnperson() {
        return returnperson;
    }

    public void setReturnperson(String returnperson) {
        this.returnperson = returnperson == null ? null : returnperson.trim();
    }

    public String getReturncause() {
        return returncause;
    }

    public void setReturncause(String returncause) {
        this.returncause = returncause == null ? null : returncause.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getReturnadvice() {
        return returnadvice;
    }

    public void setReturnadvice(String returnadvice) {
        this.returnadvice = returnadvice == null ? null : returnadvice.trim();
    }
}