package com.jobyuan.pojo;

import java.util.Date;

public class JobRealname {
    private Integer id;

    private Integer uid;

    private String realname;

    private Integer numberid;

    private String idimg1;

    private String idimg2;

    private Date createtime;

    private String reservel1;

    private String reservel2;

    private String reservel3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getNumberid() {
        return numberid;
    }

    public void setNumberid(Integer numberid) {
        this.numberid = numberid;
    }

    public String getIdimg1() {
        return idimg1;
    }

    public void setIdimg1(String idimg1) {
        this.idimg1 = idimg1 == null ? null : idimg1.trim();
    }

    public String getIdimg2() {
        return idimg2;
    }

    public void setIdimg2(String idimg2) {
        this.idimg2 = idimg2 == null ? null : idimg2.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getReservel1() {
        return reservel1;
    }

    public void setReservel1(String reservel1) {
        this.reservel1 = reservel1 == null ? null : reservel1.trim();
    }

    public String getReservel2() {
        return reservel2;
    }

    public void setReservel2(String reservel2) {
        this.reservel2 = reservel2 == null ? null : reservel2.trim();
    }

    public String getReservel3() {
        return reservel3;
    }

    public void setReservel3(String reservel3) {
        this.reservel3 = reservel3 == null ? null : reservel3.trim();
    }
}