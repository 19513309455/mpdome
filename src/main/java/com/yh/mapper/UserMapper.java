package com.yh.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yh.pojo.User;

public interface UserMapper extends BaseMapper<User> {
    User findById(long id);
}