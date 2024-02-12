package com.blog.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.constants.BusinessConstants;
import com.blog.constants.SystemConstants;
import com.blog.domain.entity.Article;
import com.blog.domain.entity.Category;
import com.blog.domain.vo.ArticleDetailVo;
import com.blog.domain.vo.ArticleVo;
import com.blog.domain.vo.HotArticle;
import com.blog.mapper.ArticleMapper;
import com.blog.service.ArticleService;
import com.blog.service.CategoryService;
import com.blog.result.PageResult;
import com.blog.result.ResponseResult;
import com.blog.utils.BeanCopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ZhangXuan
 * 2024/2/10 17:27
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Resource
    private CategoryService categoryService;

    @Override
    public ResponseResult<List<HotArticle>> hotArticleList() {
        Page<Article> page = new Page<>(SystemConstants.CURRENT_PAGE, SystemConstants.PAGE_SIZE);
        page(page, Wrappers.lambdaQuery(Article.class)
                .eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL)
                .orderByDesc(Article::getViewCount));

        List<HotArticle> hotArticles = BeanCopyUtil.copyList(page.getRecords(), HotArticle.class);

        return ResponseResult.success(hotArticles);
    }

    @Override
    public ResponseResult<PageResult<ArticleVo>> articleList(Integer pageNum, Integer pageSize, Long categoryId) {

        /* ******************* 分页查询数据 ******************* */
        Page<Article> page = new Page<>(pageNum, pageSize);
        Page<Article> articlePage = page(page, Wrappers.lambdaQuery(Article.class)
                .eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL)
                .eq(Objects.nonNull(categoryId) && categoryId > 0, Article::getCategoryId, categoryId)
                .orderByDesc(Article::getIsTop, Article::getUpdateTime));

        /* ******************* 处理分类名称 ******************* */
        List<Article> records = articlePage.getRecords();
        List<Long> unique = records.stream()
                .map(Article::getCategoryId)
                .distinct()
                .collect(Collectors.toList());
        List<Category> categories = categoryService.listByIds(unique);
        Map<Long, String> categoryMap = categories.stream()
                .collect(Collectors.toMap(Category::getId, Category::getName));

        for (Article item : records) {
            Long itemCategoryId = item.getCategoryId();
            String categoryName = categoryMap.get(itemCategoryId);
            if (StringUtils.isNotBlank(categoryName)) {
                item.setCategoryName(categoryName);
            } else {
                item.setCategoryName("未分类");
            }
        }

        List<ArticleVo> ans = BeanCopyUtil.copyList(records, ArticleVo.class);
        PageResult<ArticleVo> res = new PageResult<>(ans, articlePage.getTotal());

        return ResponseResult.success(res);
    }

    @Override
    public ResponseResult<ArticleDetailVo> articleDetail(Long articleId) {
        Article article = getById(articleId);
        if (Objects.isNull(article)) {
            return ResponseResult.error(BusinessConstants.DATABASE_NOT_FOUND.getCode(),
                    BusinessConstants.DATABASE_NOT_FOUND.getMsg());
        }

        ArticleDetailVo articleDetailVo = BeanCopyUtil.copy(article, ArticleDetailVo.class);
        Long categoryId = articleDetailVo.getCategoryId();
        if (Objects.nonNull(categoryId)) {
            Category category = categoryService.getById(categoryId);
            if (Objects.nonNull(category)) {
                articleDetailVo.setCategoryName(category.getName());
            } else {
                articleDetailVo.setCategoryName("未分类");
            }
        }

        return ResponseResult.success(articleDetailVo);
    }
}
