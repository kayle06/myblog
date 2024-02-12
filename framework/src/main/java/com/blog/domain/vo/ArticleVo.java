package com.blog.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description="articleVo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVo {
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
     * 摘要
     */
    @TableField(value = "summary")
    @ApiModelProperty(value="摘要")
    private String summary;

    /**
     * 分类名称
     */
    @TableField(value = "category_name")
    @ApiModelProperty(value="分类名称")
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
     * 创建时间
     */
    @TableField(value = "create_time")
    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

}