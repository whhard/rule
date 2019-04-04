package com.daokoujinke.service.user;

import com.daokoujinke.common.exception.CustomException;
import com.daokoujinke.common.utils.Md5Util;
import com.daokoujinke.config.datasource.DS;
import com.daokoujinke.entity.user.User;
import com.daokoujinke.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @DS("datasource1")
    public User userLogin(String username,String password) {
        User user = userMapper.queryUserByName(username);
        if (user != null){
            if (Md5Util.EncoderByMd5(user.getPassword()).equals(Md5Util.EncoderByMd5(password))){
                user.setToken(UUID.randomUUID().toString().replaceAll("-",""));
                return user;
            }else {
                throw new CustomException("密码错误，请重新输入");
            }
        }else{
            throw new CustomException("用户不存在，请重新核对用户名");
        }
    }
}
