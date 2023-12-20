package org.andy.springboot.project.user.service;

import org.andy.springboot.project.user.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    /**
     * @return user list
     */
    List<User> list();
}
