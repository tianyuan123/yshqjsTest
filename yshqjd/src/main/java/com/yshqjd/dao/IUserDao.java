package com.yshqjd.dao;

import com.yshqjd.domain.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有
     */
    List<User> findAll();


}
