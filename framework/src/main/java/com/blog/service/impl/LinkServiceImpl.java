package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.constants.SystemConstants;
import com.blog.domain.entity.Link;
import com.blog.domain.vo.LinkVo;
import com.blog.mapper.LinkMapper;
import com.blog.result.ResponseResult;
import com.blog.service.LinkService;
import com.blog.utils.BeanCopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ZhangXuan
 * 2024/2/12 12:27
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

    @Resource
    private LinkMapper linkMapper;
    @Override
    public ResponseResult<List<LinkVo>> getPassList() {

        List<Link> list = new LambdaQueryChainWrapper<>(linkMapper)
                .eq(Link::getStatus, SystemConstants.LINK_STATUS_PASS)
                .list();

        List<LinkVo> ans = BeanCopyUtil.copyList(list, LinkVo.class);

        return ResponseResult.success(ans);
    }
}
