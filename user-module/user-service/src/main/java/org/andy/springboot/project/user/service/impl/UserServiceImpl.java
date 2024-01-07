package org.andy.springboot.project.user.service.impl;

import org.andy.springboot.project.user.domain.User;
import org.andy.springboot.project.user.domain.gateway.UserGateway;
import org.andy.springboot.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserGateway userGateway;

    /**
     * @param user user
     */
    @Override
    public void addUser(User user) {
        userGateway.addUser(user);
    }

    /**
     * @return user list
     */
    @Override
    public List<User> listUser() {
        return userGateway.listUser();
    }

}