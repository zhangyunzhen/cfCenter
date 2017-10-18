package com.cf.mapper;


import com.cf.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {

    @Select("select * from user")
    List<User> getAll();

}
