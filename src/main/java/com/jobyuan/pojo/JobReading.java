package com.jobyuan.pojo;

import java.util.Date;

public class JobReading {
    private Integer id;

    private Integer interId;

    private Integer read;

    private Date readtime;

    private String reservel1;

    private String reservel2;

    private String reservel3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInterId() {
        return interId;
    }

    public void setInterId(Integer interId) {
        this.interId = interId;
    }

    public Integer getRead() {
        return read;
    }

    public void setRead(Integer read) {
        this.read = read;
    }

    public Date getReadtime() {
        return readtime;
    }

    public void setReadtime(Date readtime) {
        this.readtime = readtime;
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