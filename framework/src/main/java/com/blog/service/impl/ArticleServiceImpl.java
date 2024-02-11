package com.blog.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.ResponseResult;
import com.blog.domain.entity.Article;
import com.blog.domain.vo.HotArticle;
import com.blog.mapper.ArticleMapper;
import com.blog.service.ArticleService;
import com.blog.utils.BeanCopyUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ZhangXuan
 * 2024/2/10 17:27
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {


    @Override
    public ResponseResult<List<HotArticle>> hotArticleList() {
        Page<Article> page = new Page<>(1, 10);
        page(page, Wrappers.lambdaQuery(Article.class)
                .eq(Article::getStatus, 1)
                .orderByDesc(Article::getViewCount));
        List<Article> records = page.getRecords();

        List<HotArticle> hotArticles = BeanCopyUtil.copyList(records, HotArticle.class);

        return ResponseResult.success(hotArticles);
    }
}
