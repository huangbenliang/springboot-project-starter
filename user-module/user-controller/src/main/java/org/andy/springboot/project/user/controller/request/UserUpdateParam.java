package org.andy.springboot.project.user.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@Builder
@ApiModel("userParam")
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateParam {
    @NotNull
    private Long id;

    @ApiModelProperty(required = true, example = "huangbenliang")
    private String userName;

    @ApiModelProperty(required = true, example = "123456")
    private String password;

    @Email
    @ApiModelProperty(example = "123@qq.com")
    private String email;

    @ApiModelProperty(example = "15323853881")
    private String phoneNumber;

    @ApiModelProperty(example = "description")
    private String description;

    private AddressParam address;
}


