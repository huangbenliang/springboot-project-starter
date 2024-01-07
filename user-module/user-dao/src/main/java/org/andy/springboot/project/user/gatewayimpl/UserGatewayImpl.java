package org.andy.springboot.project.user.gatewayimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.andy.springboot.project.user.dao.UserMapper;
import org.andy.springboot.project.user.domain.User;
import org.andy.springboot.project.user.domain.gateway.UserGateway;
import org.andy.springboot.project.user.entity.UserDo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class UserGatewayImpl extends ServiceImpl<UserMapper, UserDo> implements UserGateway {
    @Override
    public void addUser(User user) {
        UserDo userDo = new UserDo();
        BeanUtils.copyProperties(user, userDo);
        save(userDo);
    }

    @Override
    public List<User> listUser() {
        List<UserDo> userDos = Optional.ofNullable(this.baseMapper.listUser()).orElse(Collections.emptyList());
        List<User> users = new ArrayList<>(userDos.size());
        userDos.forEach(userDo -> {
            User target = new User();
            BeanUtils.copyProperties(userDo, target);
            users.add(target);
        });
        return users;
    }
}
