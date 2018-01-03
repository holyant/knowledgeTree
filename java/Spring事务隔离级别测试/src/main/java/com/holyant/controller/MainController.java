package com.holyant.controller;

import com.holyant.entity.MyUser;
import com.holyant.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author holyant
 */
@Controller
@RequestMapping("/")
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public @ResponseBody
    String home(){
        List<MyUser> us = new ArrayList<MyUser>();
        MyUser u = new MyUser();
        u.setUsername("MarK");
        us.add(u);
        u = new MyUser();
        u.setUsername("Fawofolo");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<MyUser> json(){
        try{
            List<MyUser> users = userService.getAllUsernames();
            return users;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return null;
        }

    }

    @RequestMapping("/json2")
    @ResponseBody
    public List<MyUser> json2(){
        try{
            List<MyUser> users = userService.getAllUsernames();
            return users;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return null;
        }

    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(){
        MyUser user = userService.getById(5);
        user.setUsername(user.getUsername()+"index");
        userService.updateUser(user);
        return "true";
    }

    @ExceptionHandler
    public void showMsg(Exception e){
        System.out.println(e);
    }

}
