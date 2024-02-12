package com.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.domain.entity.Link;
import com.blog.domain.vo.LinkVo;
import com.blog.result.ResponseResult;

import java.util.List;

/**
 * ZhangXuan
 * 2024/2/12 12:27
 */
public interface LinkService extends IService<Link> {
    /**
     * Gets pass list.
     */
    ResponseResult<List<LinkVo>> getPassList();
}
