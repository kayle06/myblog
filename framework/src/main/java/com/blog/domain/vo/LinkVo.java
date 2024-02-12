package com.blog.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description="linkVo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkVo {
    /**
     * 主键
     */
    @TableField(value = "id")
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 友链名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="友链名称")
    private String name;

    /**
     * 友链图标地址
     */
    @TableField(value = "logo")
    @ApiModelProperty(value="友链图标地址")
    private String logo;

    /**
     * 友链简介
     */
    @TableField(value = "description")
    @ApiModelProperty(value="友链简介")
    private String description;

    /**
     * 友链地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value="友链地址")
    private String address;

}