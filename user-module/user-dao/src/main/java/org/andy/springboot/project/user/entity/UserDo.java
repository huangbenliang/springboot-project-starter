package org.andy.springboot.project.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.andy.springboot.project.common.mybatis.model.BaseDo;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class UserDo extends BaseDo {
    private String id;

    private String userName;

    private String password;

    private String email;

    private String phoneNumber;

    private String description;
}