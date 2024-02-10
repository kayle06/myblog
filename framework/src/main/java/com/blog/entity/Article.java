package com.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ZhangXuan
 * 2024/2/10 17:27
 */
@ApiModel(description = "article")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private String title;

    @ApiModelProperty(value = "")
    private String content;

    @ApiModelProperty(value = "")
    private String summary;

    @ApiModelProperty(value = "")
    private Long categoryId;

    @ApiModelProperty(value = "")
    private String thumbnail;

    @ApiModelProperty(value = "")
    private String isTop;

    @ApiModelProperty(value = "")
    private String status;

    @ApiModelProperty(value = "")
    private Long viewCount;

    @ApiModelProperty(value = "")
    private String isComment;

    @ApiModelProperty(value = "")
    private Long createBy;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Long updateBy;

    @ApiModelProperty(value = "")
    private Date updateTime;

    @ApiModelProperty(value = "")
    private Integer delFlag;
}