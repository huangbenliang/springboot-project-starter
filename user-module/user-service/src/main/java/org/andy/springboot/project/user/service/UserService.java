package org.andy.springboot.project.user.service;


import org.andy.springboot.project.user.domain.model.User;

import java.util.List;

public interface UserService {
    Long addUser(User user);

    /**
     * @return user list
     */
    List<User> listUser();

    void updateUser(User user);
}
