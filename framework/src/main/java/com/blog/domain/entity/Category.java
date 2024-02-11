package com.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description="category")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "category")
public class Category {
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

    /**
     * 父主键，如果没有父分类则为 -1
     */
    @TableField(value = "pid")
    @ApiModelProperty(value="父主键，如果没有父分类则为 -1")
    private Long pid;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value="描述")
    private String description;

    /**
     * 状态：0-为禁用，1-禁用
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="状态：0-为禁用，1-禁用")
    private String status;

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
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
     * 逻辑删除：0-未删除，1-已删除
     */
    @TableField(value = "del_flag")
    @ApiModelProperty(value="逻辑删除：0-未删除，1-已删除")
    private Integer delFlag;
}