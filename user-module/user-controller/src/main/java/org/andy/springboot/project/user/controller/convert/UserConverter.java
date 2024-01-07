package org.andy.springboot.project.user.controller.convert;


import org.andy.springboot.project.user.controller.request.UserAddParam;
import org.andy.springboot.project.user.controller.request.UserUpdateParam;
import org.andy.springboot.project.user.domain.model.User;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @org.mapstruct.Builder(disableBuilder = true))
public interface UserConverter {
    User toUser(UserAddParam userAddParam);

    User toUser(UserUpdateParam userAddParam);

    @InheritConfiguration
    UserAddParam toUserParam(User user);
}