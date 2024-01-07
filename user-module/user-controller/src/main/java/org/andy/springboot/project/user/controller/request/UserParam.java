package org.andy.springboot.project.user.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Builder
@ApiModel("userParam")
@NoArgsConstructor
@AllArgsConstructor
public class UserParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty
    @ApiModelProperty(required = true, example = "10001")
    private String id;

    @NotEmpty
    @ApiModelProperty(required = true, example = "huangbenliang")
    private String userName;

    @NotEmpty
    @ApiModelProperty(required = true, example = "123456")
    private String password;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String phoneNumber;

    @NotEmpty
    private String description;

    @Valid
    private AddressParam address;
}

