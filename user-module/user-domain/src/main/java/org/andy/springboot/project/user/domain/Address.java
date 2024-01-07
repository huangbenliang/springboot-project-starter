package org.andy.springboot.project.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.andy.springboot.project.user.domain.model.BaseDomain;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseDomain {

    private String province;

    private String city;

    private String district;
}