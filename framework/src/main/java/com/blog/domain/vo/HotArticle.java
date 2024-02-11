package com.blog.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ZhangXuan
 * 2024/2/11 11:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotArticle {

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
     * 浏览量
     */
    @TableField(value = "view_count")
    @ApiModelProperty(value="浏览量")
    private Long viewCount;

}
