package org.andy.springboot.project.user.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressParam {

    @NotEmpty(message = "could not be empty")
    private String province;

    @NotEmpty(message = "could not be empty")
    private String city;

    @NotEmpty(message = "could not be empty")
    private String district;
}