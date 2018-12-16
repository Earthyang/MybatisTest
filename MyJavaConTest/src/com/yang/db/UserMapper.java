package com.yang.db;

import org.apache.ibatis.annotations.Select;
import com.yang.bean.User;

public interface UserMapper {
    @Select(value = "select * from user where id=#{id}")
    public User getUser(Long id);
}
