package org.scu.service;

import org.scu.bean.CityBean;
import org.scu.domain.City;

import java.util.List;

/**
 * Created by xing on 2018/6/4.
 */
public interface CityService {
    public List<CityBean> getCityListByProvincecode(String provincecode);

    public List<City> getCityListByProvincecode1(String provincecode);
}
