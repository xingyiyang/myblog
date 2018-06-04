package org.scu.bean;

/**
 * Created by xing on 2018/6/3.
 */
public class CityBean {
    private String cityId;
    private String cityCode;
    private String cityName;
    private String provincecode;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    @Override
    public String toString() {
        return "CityBean{" +
                "cityId='" + cityId + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", cityName='" + cityName + '\'' +
                ", provincecode='" + provincecode + '\'' +
                '}';
    }
}
