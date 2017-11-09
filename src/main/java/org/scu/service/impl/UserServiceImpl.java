package org.scu.service.impl;

import org.scu.dao.UserDao;
import org.scu.domain.User;
import org.scu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by xing on 2017/11/9.
 */
@Service
public class UserServiceImpl implements UserService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserDao userDao;

    public User userLogin(String userName, String userPwd) {
        return userDao.userLogin(userName,userPwd);
    }
}
