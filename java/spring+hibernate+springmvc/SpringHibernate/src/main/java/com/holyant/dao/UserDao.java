package com.holyant.dao;

import com.holyant.entity.User;

import java.util.List;

/**
 * @author holyant
 */
public interface UserDao {
    int save(User u);

    List<User> findAll();
}
