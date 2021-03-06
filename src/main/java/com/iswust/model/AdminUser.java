package com.iswust.model;

/**
 * 管理者类
 */
public class AdminUser {
    private int id; //社团id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "id=" + id +
                ", stuNum='" + stuNum + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    private String stuNum; //管理人员学号
    private String name; //管理人员姓名
    private String phoneNum; //电话号码
}
