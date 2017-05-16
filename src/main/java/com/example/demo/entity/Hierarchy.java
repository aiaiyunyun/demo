package com.example.demo.entity;

/**
 * Created by lsd on 2017-05-16.
 */
public class Hierarchy {
    private Integer HID;
    private Integer numberH;
    private Integer nameH;
    private Integer HHID;

    public Integer getHID() {
        return HID;
    }

    public void setHID(Integer HID) {
        this.HID = HID;
    }

    public Integer getNumberH() {
        return numberH;
    }

    public void setNumberH(Integer numberH) {
        this.numberH = numberH;
    }

    public Integer getNameH() {
        return nameH;
    }

    public void setNameH(Integer nameH) {
        this.nameH = nameH;
    }

    public Integer getHHID() {
        return HHID;
    }

    public void setHHID(Integer HHID) {
        this.HHID = HHID;
    }

    @Override
    public String toString() {
        return "Hierarchy{" +
                "HID=" + HID +
                ", numberH=" + numberH +
                ", nameH=" + nameH +
                ", HHID=" + HHID +
                '}';
    }
}
