/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public  class contactPrivate {
    private Integer cid;
    private String fnume;
    private String lnume;
    private String bdate;
    private String sex;
    private String phone;
    private String tipTel;
    
    public contactPrivate() {};

    public contactPrivate(Integer cid, String fnume, String lnume, String bdate, String sex, String phone, String tipTel) {
        this.cid = cid;
        this.fnume = fnume;
        this.lnume = lnume;
        this.bdate = bdate;
        this.sex = sex;
        this.phone = phone;
        this.tipTel = tipTel;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFnume() {
        return fnume;
    }

    public void setFnume(String fnume) {
        this.fnume = fnume;
    }

    public String getLnume() {
        return lnume;
    }

    public void setLnume(String lnume) {
        this.lnume = lnume;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTipTel() {
        return tipTel;
    }

    public void setTipTel(String tipTel) {
        this.tipTel = tipTel;
    }

}
