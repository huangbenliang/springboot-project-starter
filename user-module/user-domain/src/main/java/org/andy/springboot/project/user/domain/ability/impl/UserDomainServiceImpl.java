package org.andy.springboot.project.user.domain.ability.impl;

import org.andy.springboot.project.user.domain.model.User;
import org.andy.springboot.project.user.domain.gateway.UserGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDomainServiceImpl implements UserDomainService {

    @Autowired
    private UserGateway userGateway;

    @Override
    public Long addUser(User user) {
        if (!user.getAddress().isValid()) {
            throw new RuntimeException();
        }
        return userGateway.addUser(user);
    }
}
