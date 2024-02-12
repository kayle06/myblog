package com.blog.controller;

import com.blog.domain.vo.LinkVo;
import com.blog.result.ResponseResult;
import com.blog.service.LinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ZhangXuan
 * 2024/2/12 12:26
 */
@RestController
@RequestMapping("/link")
public class LinkController {

    @Resource
    private LinkService linkService;

    /**
     * 返回所有审核通过的友链
     *
     * @return the response result
     */
    @GetMapping("/getAllLink")
    public ResponseResult<List<LinkVo>> list() {
        ResponseResult<List<LinkVo>> res = null;
        try {
            res = linkService.getPassList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return res;
    }

}
