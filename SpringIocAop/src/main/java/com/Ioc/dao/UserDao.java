package com.Ioc.dao;

import java.util.List;

import com.Ioc.table.User;

public interface UserDao {
    List<User> findAll();
}
