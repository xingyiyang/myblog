package org.scu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
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
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ProvinceDaoTest {

    @Resource
    private ProvinceDao provinceDao;

    @Test
    public void getProvinceList() throws Exception {
        List<Province> provinces = provinceDao.getProvinceList();
        for(Province province: provinces){
            System.out.println(province.toString());
        }
    }

    @Test
    public void queryProvinceById() throws Exception {
        int id = 1;
        Province province = provinceDao.queryProvinceById(id);
        System.out.println(province.toString());
    }

}