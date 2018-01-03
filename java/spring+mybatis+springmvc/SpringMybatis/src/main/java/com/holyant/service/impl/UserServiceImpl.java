package com.holyant.service.impl;

import com.holyant.dao.MyUserMapper;
import com.holyant.entity.MyUser;
import com.holyant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author holyant
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private MyUserMapper myUserMapper;

    @Override
    public void saveUsers(List<MyUser> us) {
        for (MyUser u : us) {
            myUserMapper.insert(u);
        }
    }

    public List<MyUser> getAllUsernames() {
        Example example = new Example(MyUser.class);
        return myUserMapper.selectByExample(example);
    }
}
