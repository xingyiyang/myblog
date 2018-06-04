package org.scu.service;


import org.scu.bean.ProvinceBean;
import org.scu.domain.Province;

import java.util.List;

/**
 * Created by xing on 2018/6/3.
 */
public interface ProvinceService {

    public List<Province> getProvinceList();

    public Province queryProvinceById(String pid);

    public ProvinceBean queryProvinceBeanById(String pid);

    public List<ProvinceBean> getProvinceBeanList();

}
