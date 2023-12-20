package org.andy.springboot.project.user.controller;

import org.andy.springboot.project.response.ResponseResult;
import org.andy.springboot.project.user.entity.User;
import org.andy.springboot.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @param user user param
     * @return user
     */
    @PostMapping("/add")
    public ResponseResult<User> add(User user) {
        userService.addUser(user);
        return ResponseResult.success();
    }


    /**
     * @return user list
     */
    @GetMapping("/list")
    public ResponseResult<List<User>> list() {
        return ResponseResult.success(userService.list());
    }
}