package org.andy.springboot.project.user.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseDomain {
    private Long id;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
