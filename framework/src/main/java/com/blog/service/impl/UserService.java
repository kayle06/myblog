package com.blog.service.impl;

import com.blog.domain.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.domain.vo.BlogUserLoginVo;
import com.blog.result.ResponseResult;

public interface UserService extends IService<User>{


    ResponseResult<BlogUserLoginVo> login(User user);
}
