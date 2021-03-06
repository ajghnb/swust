package com.iswust.model;

import java.util.Date;

public class ConsultationEvent {
    private int eventId; //事件id
    private int coId; //社团id
    private String stuNum; //咨询人学号
    private String name; //咨询人姓名
    private String title; //咨询事件标题
    private String details; //咨询事件详情
    private Date date; //时间传入为空值

    public ConsultationEvent() {
    }

    public ConsultationEvent(int eventId, int coId, String stuNum, String name, String title, String details, Date date) {
        this.eventId = eventId;
        this.coId = coId;
        this.stuNum = stuNum;
        this.name = name;
        this.title = title;
        this.details = details;
        this.date = date;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getCoId() {
        return coId;
    }

    public void setCoId(int coId) {
        this.coId = coId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ConsultationEvent{" +
                "eventId=" + eventId +
                ", coId=" + coId +
                ", stuNum='" + stuNum + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", date=" + date +
                '}';
    }
}
