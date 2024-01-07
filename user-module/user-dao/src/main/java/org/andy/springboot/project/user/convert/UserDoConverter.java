package org.andy.springboot.project.user.convert;

import org.andy.springboot.project.user.domain.User;
import org.andy.springboot.project.user.entity.UserDo;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",builder = @org.mapstruct.Builder(disableBuilder = true))
public interface UserDoConverter {
    UserDoConverter INSTANCE = Mappers.getMapper(UserDoConverter.class);
    UserDo toUserDo(User user);

    @InheritConfiguration
    User toUser(UserDo userDo);

    List<User> toUserList(List<UserDo> userDos);
}