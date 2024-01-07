package org.andy.springboot.project.user.domain.gateway;

import org.andy.springboot.project.user.domain.model.User;

import java.util.List;

public interface UserGateway {
    Long addUser(User user);

    List<User> listUser();

    void updateUser(User user);
}
