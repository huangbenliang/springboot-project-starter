package org.andy.springboot.project.user.domain;

import lombok.*;
import org.andy.springboot.project.user.domain.model.BaseDomain;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Builder
public class User extends BaseDomain {
    private String userName;

    private String password;

    private String email;

    private String phoneNumber;

    private String description;

    private Address address;
}