package org.scu.bean;

/**
 * Created by xing on 2018/6/3.
 */
public class AreaBean {
    private String areaId;
    private String areaCode;
    private String areaName;
    private String citycode;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    @Override
    public String toString() {
        return "AreaBean{" +
                "areaId='" + areaId + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", areaName='" + areaName + '\'' +
                ", citycode='" + citycode + '\'' +
                '}';
    }
}
