package com.iswust.model;

public class User {
    private int id; //社团id

    public User(int id, String name, String stuNum, String major, String qq) {
        this.id = id;
        this.name = name;
        this.stuNum = stuNum;
        this.major = major;
        this.qq = qq;
    }

    public User() {
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stuNum='" + stuNum + '\'' +
                ", major='" + major + '\'' +
                ", qq='" + qq + '\'' +
                '}';
    }

    private String name; //用户名
    private String stuNum; //用户学号
    private String major; // 用户专业
    private String qq; //用户qq
}
