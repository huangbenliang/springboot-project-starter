package org.andy.springboot.project.user.controller.convert;


import org.andy.springboot.project.user.controller.request.UserParam;
import org.andy.springboot.project.user.domain.User;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @org.mapstruct.Builder(disableBuilder = true))
public interface UserConverter {
    User toUser(UserParam userParam);

    @InheritConfiguration
    UserParam toUserParam(User user);
}