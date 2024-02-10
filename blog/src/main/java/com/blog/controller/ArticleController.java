package com.blog.controller;

import com.blog.entity.Article;
import com.blog.service.impl.ArticleServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 *  ZhangXuan
 *  2024/2/10 17:27
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
/**
* 服务对象
*/
    @Resource
    private ArticleServiceImpl articleServiceImpl;

    @GetMapping("/list")
    public List<Article> test() {
        return articleServiceImpl.list();
    }

}
