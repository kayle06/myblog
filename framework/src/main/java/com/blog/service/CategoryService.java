package com.blog.service;

import com.blog.result.ResponseResult;
import com.blog.domain.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.domain.vo.CategoryVo;

import java.util.List;

public interface CategoryService extends IService<Category>{


    /**
     * Gets category list.
     *
     * @return the category list
     */
    ResponseResult<List<CategoryVo>> getCategoryList();
}
