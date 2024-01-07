package org.andy.springboot.project.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.andy.springboot.project.common.response.ResponseResult;
import org.andy.springboot.project.user.controller.convert.UserConverter;
import org.andy.springboot.project.user.controller.request.UserAddParam;
import org.andy.springboot.project.user.controller.request.UserUpdateParam;
import org.andy.springboot.project.user.domain.model.User;
import org.andy.springboot.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "User Module", tags = "User Module")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;

    /**
     * @param userAddParam userParam
     * @return userParam
     */
    @PostMapping("")
    @ApiOperation("add userParam")
    public ResponseResult<Long> addUser(@RequestBody @Valid UserAddParam userAddParam) {
        userService.addUser(userConverter.toUser(userAddParam));
        return ResponseResult.success();
    }

    @PutMapping("")
    @ApiOperation("update userParam")
    public ResponseResult<User> updateUser(@RequestBody @Valid UserUpdateParam userUpdateParam) {
        userService.updateUser(userConverter.toUser(userUpdateParam));
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