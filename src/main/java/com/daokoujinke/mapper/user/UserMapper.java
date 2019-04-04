package com.daokoujinke.mapper.user;

import com.daokoujinke.entity.user.User;

public interface UserMapper {
    public User queryUserByName(String name);
}
