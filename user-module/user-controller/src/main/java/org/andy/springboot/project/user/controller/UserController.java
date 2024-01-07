package org.andy.springboot.project.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.andy.springboot.project.common.response.ResponseResult;
import org.andy.springboot.project.user.controller.convert.UserConverter;
import org.andy.springboot.project.user.controller.request.UserParam;
import org.andy.springboot.project.user.domain.User;
import org.andy.springboot.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "User Interfaces", tags = "User Interfaces")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;

    /**
     * @param userParam userParam param
     * @return userParam
     */
    @PostMapping("")
    @ApiOperation("Add userParam")
    public ResponseResult<User> addUser(@RequestBody @Valid UserParam userParam) {
        userService.addUser(userConverter.toUser(userParam));
        return ResponseResult.success();
    }


    /**
     * @return user list
     */
    @GetMapping("/list")
    public ResponseResult<List<User>> listUser() {
        return ResponseResult.success(userService.listUser());
    }
}