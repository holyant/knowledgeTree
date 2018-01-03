package com.holyant.service;

import com.holyant.entity.MyUser;

import java.util.List;

/**
 * @author holyant
 */
public interface UserService {
    void saveUsers(List<MyUser> usr);
    List<MyUser> getAllUsernames();
}
