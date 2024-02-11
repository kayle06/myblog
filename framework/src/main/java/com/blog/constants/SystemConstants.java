package com.blog.constants;

/**
 * ZhangXuan
 * 2024/2/11 12:39
 */
public class SystemConstants {

    private SystemConstants(){}

    // 文章未发布
    public static final int ARTICLE_STATUS_DRAFT = 0;

    // 文章已发布
    public static final int ARTICLE_STATUS_NORMAL = 1;

    // 当前查询页
    public static final int CURRENT_PAGE = 1;

    // 页条数
    public static final int PAGE_SIZE = 10;


    // 分类状态：未禁用
    public static final String CATEGORY_STATUS_NORMAL = "0";

    // 分类状态：禁用
    public static final String CATEGORY_STATUS_DELETE = "1";
}
