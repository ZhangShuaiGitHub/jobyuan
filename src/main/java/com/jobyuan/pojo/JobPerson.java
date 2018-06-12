package com.jobyuan.pojo;

import java.util.Date;

public class JobPerson {
    private Integer id;

    private String nickname;

    private Integer isvip;

    private String position;

    private String city;

    private Integer sex;

    private String sign;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
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