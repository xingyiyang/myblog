package org.scu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.scu.bean.CityBean;
import org.scu.dao.CityDao;
import org.scu.domain.City;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xing on 2018/6/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class CityServiceTest {

    @Resource
    private CityService cityService;
    @Test
    public void getCityListByProvincecode() throws Exception {
        String provincecode = "460000";
        List<CityBean> cityBeans = cityService.getCityListByProvincecode(provincecode);
        for(CityBean cityBean:cityBeans){
            System.out.println(cityBean.toString());
        }

    }

    @Test
    public void getCityListByProvincecode1() throws Exception {
        String provincecode = "460000";
        List<City> citys = cityService.getCityListByProvincecode1(provincecode);
        for(City city:citys){
            System.out.println(city.toString());
        }

    }

}