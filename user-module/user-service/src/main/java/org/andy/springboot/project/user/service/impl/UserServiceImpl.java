package org.andy.springboot.project.user.service.impl;

import org.andy.springboot.project.user.domain.model.User;
import org.andy.springboot.project.user.domain.ability.impl.UserDomainService;
import org.andy.springboot.project.user.domain.gateway.UserGateway;
import org.andy.springboot.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDomainService userDomainService;

    @Autowired
    private UserGateway userGateway;

    /**
     * @param user user
     */
    @Override
    public Long addUser(User user) {
       return userDomainService.addUser(user);
    }

    /**
     * @return user list
     */
    @Override
    public List<User> listUser() {
        return userGateway.listUser();
    }

    @Override
    public void updateUser(User user) {
        userGateway.updateUser(user);
    }

}