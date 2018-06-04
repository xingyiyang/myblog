package org.scu.service.impl;

import org.scu.bean.CityBean;
import org.scu.dao.CityDao;
import org.scu.domain.City;
import org.scu.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xing on 2018/6/4.
 */
@Service
public class CityServiceImpl implements CityService{

    @Resource
    private CityDao cityDao;
    @Override
    public List<CityBean> getCityListByProvincecode(String provincecode) {
        List<CityBean> cityBeans = new ArrayList<CityBean>();
        List<City> cities = cityDao.getCityListByProvincecode(provincecode);
        for (City city:cities){
            CityBean cityBean = new CityBean();
            cityBean.setCityId(String.valueOf(city.getCityId()));
            cityBean.setCityCode(city.getCityCode());
            cityBean.setCityName(city.getCityName());
            cityBean.setProvincecode(city.getProvincecode());
            cityBeans.add(cityBean);
        }
        return cityBeans;
    }

    @Override
    public List<City> getCityListByProvincecode1(String provincecode) {
        return cityDao.getCityListByProvincecode(provincecode);
    }
}
