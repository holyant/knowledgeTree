package com.holyant.service;

import com.holyant.entity.User;

import java.util.List;

/**
 * @author holyant
 */
public interface UserService {
    void saveUsers(List<User> usr);
    List<User> getAllUsernames();
}
