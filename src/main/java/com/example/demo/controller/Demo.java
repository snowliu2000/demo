package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.kit.WrapperKit;
import com.example.demo.mapper.UserMapper;
import com.example.demo.result.Result;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author lsl
 * @Date:2019/3/31
 * @Time:9:06
 */
@RestController
@RequestMapping("/user")
public class Demo {

    @Autowired
    UserService userService;

    @RequestMapping("/query")
    public String query() {
        return "hi";
    }


    @RequestMapping("/query/detail")
//    public List<User> find() {
//        return userService.list(
//                new QueryWrapper<User>().lambda().eq(User::getUsername,"张三")
//        );
//    }
    public  Result find(){
        return new Result(userService.list(
                WrapperKit.<User>query().lambda().eq(User::getUsername,"张三")
        ));
    }
}
