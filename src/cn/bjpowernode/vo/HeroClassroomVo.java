package cn.bjpowernode.vo;

public class HeroClassroomVo {
    private String hid;
    private String hname;
    private int hattack;
    private String hbirthplace;

    private String cid;
    private String cname;

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public int getHattack() {
        return hattack;
    }

    public void setHattack(int hattack) {
        this.hattack = hattack;
    }

    public String getHbirthplace() {
        return hbirthplace;
    }

    public void setHbirthplace(String hbirthplace) {
        this.hbirthplace = hbirthplace;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "HeroClassroomVo{" +
                "hid='" + hid + '\'' +
                ", hname='" + hname + '\'' +
                ", hattack=" + hattack +
                ", hbirthplace='" + hbirthplace + '\'' +
                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
