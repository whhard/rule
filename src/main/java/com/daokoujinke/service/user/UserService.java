package com.daokoujinke.service.user;

import com.daokoujinke.entity.user.User;

public interface UserService {
    public User userLogin(String username, String password);
}
