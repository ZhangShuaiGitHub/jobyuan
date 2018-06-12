package com.jobyuan.pojo;

import java.util.Date;

public class JobLearning {
    private Integer id;

    private Integer subject;

    private String primaryImg;

    private String middleImg;

    private String highImg;

    private Date createtime;

    private Date updatetime;

    private String reservel1;

    private String reservel2;

    private String reservel3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public String getPrimaryImg() {
        return primaryImg;
    }

    public void setPrimaryImg(String primaryImg) {
        this.primaryImg = primaryImg == null ? null : primaryImg.trim();
    }

    public String getMiddleImg() {
        return middleImg;
    }

    public void setMiddleImg(String middleImg) {
        this.middleImg = middleImg == null ? null : middleImg.trim();
    }

    public String getHighImg() {
        return highImg;
    }

    public void setHighImg(String highImg) {
        this.highImg = highImg == null ? null : highImg.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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