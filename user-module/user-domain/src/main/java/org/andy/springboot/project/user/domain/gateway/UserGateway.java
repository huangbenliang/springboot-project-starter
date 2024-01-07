package org.andy.springboot.project.user.domain.gateway;

import org.andy.springboot.project.user.domain.User;

import java.util.List;

public interface UserGateway {
    void addUser(User user);

    List<User> listUser();
}
