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
@RequestMapping("/spring2")
public class Main2Controller {
    Logger logger = LoggerFactory.getLogger(Main2Controller.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/json")
    @ResponseBody
    public MyUser json(){
        try{
            MyUser user = userService.getById(6);
            return user;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return null;
        }

    }

    @ExceptionHandler
    public void showMsg(Exception e){
        System.out.println(e);
    }

}
