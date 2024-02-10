package com.blog.service.impl;

import com.blog.entity.Article;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.mapper.ArticleMapper;
import com.blog.service.ArticleService;
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService{

}
