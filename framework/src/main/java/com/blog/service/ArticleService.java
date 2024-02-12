package com.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.domain.vo.ArticleDetailVo;
import com.blog.domain.vo.ArticleVo;
import com.blog.result.PageResult;
import com.blog.result.ResponseResult;
import com.blog.domain.entity.Article;
import com.blog.domain.vo.HotArticle;

import java.util.List;

/**
 * ZhangXuan
 * 2024/2/10 17:27
 */
public interface ArticleService extends IService<Article>{

    /**
     * Hot article list response result.
     *
     * @return the response result
     */
    ResponseResult<List<HotArticle>> hotArticleList();

    /**
     * Article list response result.
     *
     * @param pageNum    the page num
     * @param pageSize   the page size
     * @param categoryId the category id
     * @return the response result
     */
    ResponseResult<PageResult<ArticleVo>> articleList(Integer pageNum, Integer pageSize, Long categoryId);

    /**
     * Article detail response result.
     *
     * @param articleId the article id
     * @return the response result
     */
    ResponseResult<ArticleDetailVo> articleDetail(Long articleId);
}
