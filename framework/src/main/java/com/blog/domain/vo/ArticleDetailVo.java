package com.blog.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description="articleDetailVo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDetailVo {
    /**
     * 主键
     */
    @TableField(value = "id")
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="标题")
    private String title;

    /**
     * 文章内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="文章内容")
    private String content;

    /**
     * 摘要
     */
    @TableField(value = "summary")
    @ApiModelProperty(value="摘要")
    private String summary;

    /**
     * 分类主键
     */
    @TableField(value = "category_id")
    @ApiModelProperty(value="分类主键")
    private Long categoryId;

    /**
     * 分类名称
     */
    @TableField(exist = false)
    private String categoryName;

    /**
     * 缩略图
     */
    @TableField(value = "thumbnail")
    @ApiModelProperty(value="缩略图")
    private String thumbnail;

    /**
     * 浏览量
     */
    @TableField(value = "view_count")
    @ApiModelProperty(value="浏览量")
    private Long viewCount;

    /**
     * 是否可评论：0-不可评论，1-可评论
     */
    @TableField(value = "is_comment")
    @ApiModelProperty(value="是否可评论：0-不可评论，1-可评论")
    private String isComment;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    @ApiModelProperty(value="创建人")
    private Long createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

}