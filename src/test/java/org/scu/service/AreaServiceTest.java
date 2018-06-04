package org.scu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.scu.bean.AreaBean;
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
public class AreaServiceTest {

    @Resource
    private AreaService areaService;

    @Test
    public void getAreabeanListByCitycode() throws Exception {
        String citycode = "460100";
        List<AreaBean> areaBeans = areaService.getAreabeanListByCitycode(citycode);
        for (AreaBean areaBean:areaBeans){
            System.out.println(areaBean.toString());
        }
    }

}