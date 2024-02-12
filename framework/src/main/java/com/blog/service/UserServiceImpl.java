package com.blog.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.domain.entity.User;
import com.blog.domain.pojo.LoginUserPojo;
import com.blog.domain.vo.BlogUserLoginVo;
import com.blog.domain.vo.UserInfoVo;
import com.blog.mapper.UserMapper;
import com.blog.result.ResponseResult;
import com.blog.service.impl.UserService;
import com.blog.utils.BeanCopyUtil;
import com.blog.utils.JwtUtil;
import com.blog.utils.RedisCache;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Resource
    private RedisCache redisCache;

    @Resource
    private AuthenticationManager authenticationManager;
    @Override
    public ResponseResult<BlogUserLoginVo> login(User user) {

        UsernamePasswordAuthenticationToken credentials = new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(credentials);

        if (Objects.isNull(authenticate)) {
            throw new RuntimeException("用户名或密码错误");
        }

        /* ******************* 生成&缓存 token ******************* */
        LoginUserPojo userLoginInfo = (LoginUserPojo) authenticate.getPrincipal();
        String userId = userLoginInfo.getUser().getId().toString();
        String jwt = JwtUtil.createJWT(userId);
        redisCache.setCacheObject("bloglogin:" + userId, jwt);

        UserInfoVo ans = BeanCopyUtil.copy(userLoginInfo.getUser(), UserInfoVo.class);
        return ResponseResult.success(new BlogUserLoginVo(jwt, ans));
    }
}
