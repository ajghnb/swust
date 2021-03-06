package com.iswust.model;

import java.util.Date;

public class CommunityActivity {
    private String ac_theme;
    private String ac_address;
    private String ac_sponsor;
    private int ac_id;
    private Date ac_time;

    public CommunityActivity() {
    }

    public CommunityActivity(String ac_theme, String ac_address, String ac_sponsor, int ac_id, Date ac_time) {
        this.ac_theme = ac_theme;
        this.ac_address = ac_address;
        this.ac_sponsor = ac_sponsor;
        this.ac_id = ac_id;
        this.ac_time = ac_time;
    }

    public String getAc_theme() {
        return ac_theme;
    }

    public void setAc_theme(String ac_theme) {
        this.ac_theme = ac_theme;
    }

    public String getAc_address() {
        return ac_address;
    }

    public void setAc_address(String ac_address) {
        this.ac_address = ac_address;
    }

    public String getAc_sponsor() {
        return ac_sponsor;
    }

    public void setAc_sponsor(String ac_sponsor) {
        this.ac_sponsor = ac_sponsor;
    }

    public int getAc_id() {
        return ac_id;
    }

    public void setAc_id(int ac_id) {
        this.ac_id = ac_id;
    }

    public Date getAc_time() {
        return ac_time;
    }

    public void setAc_time(Date ac_time) {
        this.ac_time = ac_time;
    }

    @Override
    public String toString() {
        return "CommunityActivity{" +
                "ac_theme='" + ac_theme + '\'' +
                ", ac_address='" + ac_address + '\'' +
                ", ac_sponsor='" + ac_sponsor + '\'' +
                ", ac_id=" + ac_id +
                ", ac_time=" + ac_time +
                '}';
    }
}
