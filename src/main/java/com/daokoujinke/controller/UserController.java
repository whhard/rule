package com.daokoujinke.controller;

import com.daokoujinke.common.bean.ResponseBean;
import com.daokoujinke.entity.user.User;
import com.daokoujinke.service.user.UserService;
import com.daokoujinke.vo.UserReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户登陆",tags = "用户登陆")
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "规则引擎登陆接口",notes = "规则引擎登陆接口")
    @CrossOrigin
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseBean login(@RequestBody UserReqVO reqVO){
        try {
            User user = userService.userLogin(reqVO.getUsername(), reqVO.getPassword());
            return new ResponseBean(200,"操作成功",user);
        } catch (Exception e) {
            return new ResponseBean(404,"操作失败",e.getMessage());
        }
    }
}
