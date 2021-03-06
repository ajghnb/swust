package com.iswust.model;

/**
 * 社团主理人类
 */
public class Director {
    private int id; //社团id
    private String stuNum; //主理人员学号
    private String name; //主理人员姓名
    private String phoneNum; //电话号码

    public Director(int id, String stuNum, String name, String phoneNum) {
        this.id = id;
        this.stuNum = stuNum;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public Director() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


}
