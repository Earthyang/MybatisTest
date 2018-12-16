package com.yang.db;

import com.yang.bean.User;

public interface UserMapper {
    public User getUser(Long id);

    public int insertUser(User user);

    public int deleteUser(Long id);
}
