package org.andy.springboot.project.user.entity;

import lombok.Data;

@Data
public class User {

    /**
     * user id
     */
    private int userId;

    /**
     * username.
     */
    private String userName;
}