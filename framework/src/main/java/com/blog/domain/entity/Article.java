package com.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description="article")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "article")
public class Article {
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
     * 文章是否置顶：0-不置顶，1-置顶
     */
    @TableField(value = "is_top")
    @ApiModelProperty(value="文章是否置顶：0-不置顶，1-置顶")
    private String isTop;

    /**
     * 发布状态：0-未发布，1-发布
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="发布状态：0-未发布，1-发布")
    private String status;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    @ApiModelProperty(value="更新人")
    private Long updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
     * 是否删除：0-未删除，1-已删除
     */
    @TableField(value = "del_flag")
    @ApiModelProperty(value="是否删除：0-未删除，1-已删除")
    private Integer delFlag;
}