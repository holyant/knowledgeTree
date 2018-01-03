package com.holyant.service.impl;

import com.holyant.dao.MyUserMapper;
import com.holyant.entity.MyUser;
import com.holyant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * @author holyant
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private DataSourceTransactionManager transactionManager;

    @Autowired
    private MyUserMapper myUserMapper;

    @Override
    public void saveUsers(List<MyUser> us) {
        for (MyUser u : us) {
            myUserMapper.insert(u);
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<MyUser> getAllUsernames(){
        Example example = new Example(MyUser.class);
        return myUserMapper.selectByExample(example);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public MyUser updateUser(MyUser user) {
        try{
            Connection connection = transactionManager.getDataSource().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement ps = connection.prepareStatement("update my_user set username='hello' where id = 5");
            ps.executeUpdate();
            connection.commit();
            return null;
        }catch (Exception e){
            return null;
        }

    }

    public MyUser getById(int id) {
        return myUserMapper.selectByPrimaryKey(id);
    }
}
