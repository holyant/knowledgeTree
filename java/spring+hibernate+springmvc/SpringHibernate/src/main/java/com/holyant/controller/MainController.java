package com.holyant.controller;

import com.holyant.entity.User;
import com.holyant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public @ResponseBody String home(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("MarK");
        us.add(u);
        u = new User();
        u.setUsername("Fawofolo");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        List<User> users = userService.getAllUsernames();
        return users;
    }

}
