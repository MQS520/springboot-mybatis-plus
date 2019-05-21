package com.mqs.controller;


import com.mqs.entity.User;
import com.mqs.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MQS
 * @since 2019-05-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "selectAll", method = RequestMethod.POST)
    public List<User> selectAll(){
        return userService.selectAll();
    }

}
