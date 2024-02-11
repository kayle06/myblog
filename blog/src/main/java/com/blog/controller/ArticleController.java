package com.blog.controller;

import com.blog.ResponseResult;
import com.blog.domain.entity.Article;
import com.blog.domain.vo.HotArticle;
import com.blog.service.ArticleService;
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
    private ArticleService articleService;

    @GetMapping("/list")
    public ResponseResult<List<Article>> test() {
        return ResponseResult.success(articleService.list());
    }

    /**
     * Hot article list response result.
     *
     * @return the response result
     */
    @GetMapping("/hotArticleList")
    public ResponseResult<List<HotArticle>> hotArticleList() {
        ResponseResult<List<HotArticle>> res = null;
        try {
            res = articleService.hotArticleList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return res;
    }

}
