package com.iswust.model;
import java.util.Collection;

public class Community {
    private int co_id;//1.社团编号
    private String co_name;//2名字
    private String co_cate;//3.类别
    private String co_level;//4.等级，校级，院级
    private String co_organ;//5.属于组织，宣传，组织
    private String co_intro;//6.社团简介
    private Collection<CommunityActivity> co_active;//7.社团活动
    private Collection<CommunityConsultation> co_consu;//8.社团咨询

    public Community() {
    }

    public Community(int co_id, String co_name, String co_cate, String co_level, String co_organ, String co_intro, Collection<CommunityActivity> co_active, Collection<CommunityConsultation> co_consu) {
        this.co_id = co_id;
        this.co_name = co_name;
        this.co_cate = co_cate;
        this.co_level = co_level;
        this.co_organ = co_organ;
        this.co_intro = co_intro;
        this.co_active = co_active;
        this.co_consu = co_consu;
    }

    public int getCo_id() {
        return co_id;
    }

    public void setCo_id(int co_id) {
        this.co_id = co_id;
    }

    public String getCo_name() {
        return co_name;
    }

    public void setCo_name(String co_name) {
        this.co_name = co_name;
    }

    public String getCo_cate() {
        return co_cate;
    }

    public void setCo_cate(String co_cate) {
        this.co_cate = co_cate;
    }

    public String getCo_level() {
        return co_level;
    }

    public void setCo_level(String co_level) {
        this.co_level = co_level;
    }

    public String getCo_organ() {
        return co_organ;
    }

    public void setCo_organ(String co_organ) {
        this.co_organ = co_organ;
    }

    public String getCo_intro() {
        return co_intro;
    }

    public void setCo_intro(String co_intro) {
        this.co_intro = co_intro;
    }

    public Collection<CommunityActivity> getCo_active() {
        return co_active;
    }

    public void setCo_active(Collection<CommunityActivity> co_active) {
        this.co_active = co_active;
    }

    public Collection<CommunityConsultation> getCo_consu() {
        return co_consu;
    }

    public void setCo_consu(Collection<CommunityConsultation> co_consu) {
        this.co_consu = co_consu;
    }

    @Override
    public String toString() {
        return "Community{" +
                "co_id=" + co_id +
                ", co_name='" + co_name + '\'' +
                ", co_cate='" + co_cate + '\'' +
                ", co_level='" + co_level + '\'' +
                ", co_organ='" + co_organ + '\'' +
                ", co_intro='" + co_intro + '\'' +
                ", co_active=" + co_active +
                ", co_consu=" + co_consu +
                '}';
    }
}
