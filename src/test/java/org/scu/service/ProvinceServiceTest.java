package org.scu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.scu.bean.ProvinceBean;
import org.scu.domain.Province;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xing on 2018/6/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class ProvinceServiceTest {

    @Resource
    private ProvinceService provinceService;

    @Test
    public void getProvinceList() throws Exception {
        List<Province> provinces = provinceService.getProvinceList();
        for (Province province:provinces){
            System.out.println(province.toString());
        }
    }

    @Test
    public void queryProvinceById() throws Exception {
        String id = "1";
        Province province = provinceService.queryProvinceById(id);
        System.out.println(province.toString());
    }

    @Test
    public void queryProvinceBeanById() throws Exception {
        String id = "1";
        ProvinceBean provinceBean = provinceService.queryProvinceBeanById(id);
        System.out.println(provinceBean.toString());
    }

    @Test
    public void getProvinceBeanList() throws Exception {
        List<ProvinceBean> provinces = provinceService.getProvinceBeanList();
        for (ProvinceBean province : provinces) {
            System.out.println(province.toString());
        }
    }

}