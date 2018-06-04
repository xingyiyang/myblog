package org.scu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
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
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CityDaoTest {

    @Resource
    private CityDao cityDao;

    @Test
    public void getCityListByProvincecode() throws Exception {
        String provincecode = "460000";
        List<City> cities = cityDao.getCityListByProvincecode(provincecode);
        for(City city:cities){
            System.out.println(city.toString());
        }
    }

}