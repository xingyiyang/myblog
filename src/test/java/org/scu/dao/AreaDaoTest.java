package org.scu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.scu.domain.Area;
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
public class AreaDaoTest {

    @Resource
    private AreaDao areaDao;

    @Test
    public void getAreaListByCitycode() throws Exception {
        String citycode = "460100";
        List<Area> areas = areaDao.getAreaListByCitycode(citycode);
        for(Area area:areas){
            System.out.println(area.toString());
        }

    }

}