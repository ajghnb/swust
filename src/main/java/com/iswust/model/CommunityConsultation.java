package com.iswust.model;

public class CommunityConsultation {
    String comcon_title;
    String comcon_content;
    int comcon_id;

    public CommunityConsultation() {
    }

    public CommunityConsultation(String comcon_title, String comcon_content, int comcon_id) {
        this.comcon_title = comcon_title;
        this.comcon_content = comcon_content;
        this.comcon_id = comcon_id;
    }

    public String getComcon_title() {
        return comcon_title;
    }

    public void setComcon_title(String comcon_title) {
        this.comcon_title = comcon_title;
    }

    public String getComcon_content() {
        return comcon_content;
    }

    public void setComcon_content(String comcon_content) {
        this.comcon_content = comcon_content;
    }

    public int getComcon_id() {
        return comcon_id;
    }

    public void setComcon_id(int comcon_id) {
        this.comcon_id = comcon_id;
    }

    @Override
    public String toString() {
        return "CommunityConsultation{" +
                "comcon_title='" + comcon_title + '\'' +
                ", comcon_content='" + comcon_content + '\'' +
                ", comcon_id=" + comcon_id +
                '}';
    }
}
