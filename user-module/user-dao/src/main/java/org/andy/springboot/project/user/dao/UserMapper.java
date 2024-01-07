package org.andy.springboot.project.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.andy.springboot.project.user.entity.UserDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserDo> {
    List<UserDo> listUser();
}