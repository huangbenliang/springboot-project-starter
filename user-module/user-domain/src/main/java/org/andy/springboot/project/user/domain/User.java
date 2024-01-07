package org.andy.springboot.project.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.andy.springboot.project.user.domain.model.BaseDomain;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseDomain {
    private String id;

    private String userName;

    private String password;

    private String email;

    private String phoneNumber;

    private String description;

    private Address address;
}