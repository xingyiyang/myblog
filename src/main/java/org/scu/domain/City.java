package org.scu.domain;

/**
 * Created by xing on 2018/6/3.
 */
public class City {
    private Integer cityId;
    private String cityCode;
    private String cityName;
    private String provincecode;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
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
        return "City{" +
                "cityId=" + cityId +
                ", cityCode='" + cityCode + '\'' +
                ", cityName='" + cityName + '\'' +
                ", provincecode='" + provincecode + '\'' +
                '}';
    }
}
