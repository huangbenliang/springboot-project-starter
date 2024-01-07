package org.andy.springboot.project.user.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseDomain {

    private String province;

    private String city;

    private String district;

    /**
     * 省份和城市需要同时存在或者同时不存在
     *
     * @return result
     */
    public boolean isValid() {
        if (StringUtils.hasText(province)) {
            return StringUtils.hasText(city);
        } else {
            return !StringUtils.hasText(city);
        }
    }
}