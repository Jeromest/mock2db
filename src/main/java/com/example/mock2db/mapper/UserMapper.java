package com.example.mock2db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mock2db.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
