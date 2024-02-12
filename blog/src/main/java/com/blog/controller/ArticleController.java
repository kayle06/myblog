package com.blog.controller;

import com.blog.domain.vo.ArticleDetailVo;
import com.blog.domain.vo.ArticleVo;
import com.blog.result.PageResult;
import com.blog.result.ResponseResult;
import com.blog.domain.entity.Article;
import com.blog.domain.vo.HotArticle;
import com.blog.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * 文章控制器
 * ZhangXuan
 * 2024/2/10 17:27
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

    /**
     * Article list response result.
     *
     * @param pageNum    the page num
     * @param pageSize   the page size
     * @param categoryId the category id
     * @return the response result
     */
    @GetMapping("/articleList")
    public ResponseResult<PageResult<ArticleVo>> articleList(Integer pageNum, Integer pageSize, Long categoryId) {
        ResponseResult<PageResult<ArticleVo>> res = null;
        try {
            res = articleService.articleList(pageNum, pageSize, categoryId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    /**
     * Article detail response result.
     *
     * @param articleId the article id
     * @return the response result
     */
    @GetMapping("/{id}")
    public ResponseResult<ArticleDetailVo> articleDetail(@PathVariable("id") Long articleId) {
        ResponseResult<ArticleDetailVo> res = null;
        try {
            res = articleService.articleDetail(articleId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return res;
    }


}
