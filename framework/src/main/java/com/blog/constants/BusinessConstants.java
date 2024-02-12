package com.blog.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ZhangXuan
 * 2024/2/12 11:53
 */
@Getter
@AllArgsConstructor
public enum BusinessConstants {

    /* ******************* Database ******************* */
    DATABASE_NOT_FOUND(1004, "未查询到数据");

    private final int code;

    private final String msg;

}
