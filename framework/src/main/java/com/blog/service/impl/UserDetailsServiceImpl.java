package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.blog.domain.entity.User;
import com.blog.domain.pojo.LoginUserPojo;
import com.blog.mapper.UserMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ZhangXuan
 * 2024/2/12 14:33
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User userInfo = new LambdaQueryChainWrapper<>(userMapper)
                .eq(User::getUserName, username)
                .one();

        if (userInfo == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        return new LoginUserPojo(userInfo);
    }
}
