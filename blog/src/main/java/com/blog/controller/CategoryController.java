package com.blog.controller;

import com.blog.result.ResponseResult;
import com.blog.domain.vo.CategoryVo;
import com.blog.service.impl.CategoryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * 分类控制器
 * ZhangXuan
 * 2024/2/11 11:27
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryServiceImpl categoryServiceImpl;


    /**
     * Gets category list.
     *
     * @return the category list
     */
    @GetMapping("/getCategoryList")
    public ResponseResult<List<CategoryVo>> getCategoryList() {
        ResponseResult<List<CategoryVo>> categoryList = null;
        try {
            categoryList = categoryServiceImpl.getCategoryList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return categoryList;
    }

}
