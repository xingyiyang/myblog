package org.scu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.scu.domain.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xing on 2017/11/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void userLoginTest() throws Exception {
        User user = userService.userLogin("fty","123");
        System.out.println(user.toString());
    }

}