package org.andy.springboot.project.user.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class User extends BaseDomain {
    private String userName;

    private String password;

    private String email;

    private String phoneNumber;

    private String description;

    private Address address;
}