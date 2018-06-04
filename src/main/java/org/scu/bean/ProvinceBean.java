package org.scu.bean;

/**
 * Created by xing on 2018/6/3.
 */
public class ProvinceBean {
    private String provinceId;
    private String provinceCode;
    private String provinceName;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "ProvinceBean{" +
                "provinceId='" + provinceId + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
