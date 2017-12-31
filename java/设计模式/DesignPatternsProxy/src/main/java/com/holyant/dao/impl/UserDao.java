package com.holyant.dao.impl;

import com.holyant.dao.IUserDao;

/**
 * @author holyant
 */
public class UserDao implements IUserDao{
    
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
