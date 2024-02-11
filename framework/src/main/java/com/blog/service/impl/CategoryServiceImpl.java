package com.blog.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.ResponseResult;
import com.blog.constants.SystemConstants;
import com.blog.domain.entity.Article;
import com.blog.domain.entity.Category;
import com.blog.domain.vo.CategoryVo;
import com.blog.mapper.CategoryMapper;
import com.blog.service.ArticleService;
import com.blog.service.CategoryService;
import com.blog.utils.BeanCopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Resource
    private ArticleService articleService;

    @Override
    public ResponseResult<List<CategoryVo>> getCategoryList() {

        /* ******************* 获取已经发布文章的分类 id 并去重 ******************* */
        List<Article> publishedArticles = articleService.list(Wrappers.lambdaQuery(Article.class)
                .eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL));
        Set<Long> uniqueCategoryId = publishedArticles.stream()
                .map(Article::getCategoryId)
                .collect(Collectors.toSet());

        /* ******************* 通过分类 id 查询状态为禁用的分类信息 ******************* */
        List<Category> normalStatusCategory = listByIds(uniqueCategoryId);
        normalStatusCategory = normalStatusCategory.stream()
                .filter(category -> SystemConstants.CATEGORY_STATUS_NORMAL.equals(category.getStatus()))
                .collect(Collectors.toList());

        List<CategoryVo> ans = BeanCopyUtil.copyList(normalStatusCategory, CategoryVo.class);

        return ResponseResult.success(ans);
    }
}
