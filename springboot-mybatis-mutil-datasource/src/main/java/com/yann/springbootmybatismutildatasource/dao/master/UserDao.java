package com.yann.springbootmybatismutildatasource.dao.master;

import com.yann.springbootmybatismutildatasource.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @program: demo3
 * @description: 用户 DAO 接口类
 * @author: Yann
 * @create: 2019-03-28 15:29
 **/

public interface UserDao {
    User findByName(@Param("userName") String userName);


}
