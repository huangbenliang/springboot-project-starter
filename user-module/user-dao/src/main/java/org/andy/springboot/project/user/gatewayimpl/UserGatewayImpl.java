package org.andy.springboot.project.user.gatewayimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.andy.springboot.project.user.convert.UserDoConverter;
import org.andy.springboot.project.user.dao.UserMapper;
import org.andy.springboot.project.user.domain.model.User;
import org.andy.springboot.project.user.domain.gateway.UserGateway;
import org.andy.springboot.project.user.entity.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class UserGatewayImpl extends ServiceImpl<UserMapper, UserDo> implements UserGateway {
    @Autowired
    private UserDoConverter userDoConverter;

    @Override
    public Long addUser(User user) {
        UserDo userDo = userDoConverter.toUserDo(user);
        save(userDo);
        return userDo.getId();
    }

    @Override
    public List<User> listUser() {
        List<UserDo> userDos = Optional.ofNullable(this.baseMapper.listUser()).orElse(Collections.emptyList());
        List<User> users = userDoConverter.toUserList(userDos);
        return users;
    }

    @Override
    public void updateUser(User user) {
        updateById(userDoConverter.toUserDo(user));
    }
}
