package com.blog.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用于用户登录成功时时返回的响应体
 * ZhangXuan
 * 2024/2/12 15:41
 */
@Data
@AllArgsConstructor
public class BlogUserLoginVo {

    private String token;

    private UserInfoVo userInfoVo;
}
