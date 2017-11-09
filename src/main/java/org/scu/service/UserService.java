package org.scu.service;

import org.scu.domain.User;

/**
 * Created by xing on 2017/11/9.
 */
public interface UserService {

    public User userLogin(String userName,String userPwd);
}
