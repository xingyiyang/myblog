package org.scu.dao;

import org.apache.ibatis.annotations.Param;
import org.scu.domain.User;

/**
 * Created by xing on 2017/11/8.
 */
public interface UserDao {

    public User userLogin(@Param("userName") String userName,@Param("userPwd") String userPwd);
}
