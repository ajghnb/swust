package com.iswust.model;

/**
 * 申请人的类
 */
public class ApplicantUser {
    private int id; //申请的社团id
    private String name; //姓名
    private String stuNum; //学号
    private String major; //专业
    private String reason; //申请原因
    private String qq; //qq
    public int getId() {
        return id;
    }

    public ApplicantUser() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ApplicantUser(int id, String name, String stuNum, String major, String reason, String qq) {
        this.id = id;
        this.name = name;
        this.stuNum = stuNum;
        this.major = major;
        this.reason = reason;
        this.qq = qq;
    }


}
