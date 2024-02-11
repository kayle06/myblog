package com.blog.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description="category")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "category")
public class CategoryVo {
    /**
     * 主键
     */
    @TableField(value = "id")
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 分类名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="分类名称")
    private String name;

}