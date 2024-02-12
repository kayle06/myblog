package com.blog.controller;

import com.blog.domain.entity.User;
import com.blog.domain.vo.BlogUserLoginVo;
import com.blog.result.ResponseResult;
import com.blog.service.impl.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户登录
     *
     * @param user the user
     * @return the response result <>
     */
    @PostMapping("/login")
    public ResponseResult<BlogUserLoginVo> login(@RequestBody User user) {
        ResponseResult<BlogUserLoginVo> login = null;
        try {
            login = userService.login(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return login;
    }


}
