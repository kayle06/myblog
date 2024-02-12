package com.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description="link")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "link")
public class Link {
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

    /**
     * 审核状态：0-未通过，1-已通过
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="审核状态：0-未通过，1-已通过")
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