package org.scu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.scu.domain.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xing on 2017/11/8.
 * 配置spring和junit整合,juni启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
@SuppressWarnings("SpringJavaAutowiringInspection")
public class UserDaoTest {

    //注入Dao实现类依赖
    @Resource
    private UserDao userDao;

    @Test
    public void loginTest() throws Exception {
        String name = "fty";
        String pass = "123";
        User user = userDao.userLogin(name,pass);
        System.out.println(user.toString());
    }

}