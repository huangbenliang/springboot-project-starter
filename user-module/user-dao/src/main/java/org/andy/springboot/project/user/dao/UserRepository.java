package org.andy.springboot.project.user.dao;

import org.andy.springboot.project.user.entity.UserDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<UserDo> userDoDemoList = new ArrayList<>();

    public void save(UserDo userDo) {
        userDoDemoList.add(userDo);
    }

    public List<UserDo> findAll() {
        return userDoDemoList;
    }
}