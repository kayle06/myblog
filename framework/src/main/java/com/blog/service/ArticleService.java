package com.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.ResponseResult;
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
}
