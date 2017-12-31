package com.holyant;

import com.holyant.dao.IUserDao;
import com.holyant.dao.impl.UserDao;
import com.holyant.proxy.CglibProxyFactory;
import com.holyant.proxy.ProxyFactory;
import com.holyant.proxy.UserDaoProxy;
import org.junit.Test;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    }

    /**
     * 测试静态代理
     */
    @Test
    public void testProxy1(){
        //目标对象
        UserDao target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//执行的是代理的方法
    }

    /**
     * 测试动态代理
     */
    @Test
    public void testProxy2(){
        // 目标对象
        IUserDao target = new UserDao();
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
    }

    /**
     * 测试cglib代理
     */
    @Test
    public void testProxy3(){
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new CglibProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
