package com.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description="`user`")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`user`")
public class User {
    /**
     * 主键
     */
    @TableField(value = "id")
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    @ApiModelProperty(value="用户名")
    private String userName;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    @ApiModelProperty(value="昵称")
    private String nickName;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * 账号类型：0-普通用户
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="账号类型：0-普通用户")
    private String type;

    /**
     * 账号状态：0-禁用，1-启用
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="账号状态：0-禁用，1-启用")
    private String status;

    /**
     * 邮箱地址
     */
    @TableField(value = "email")
    @ApiModelProperty(value="邮箱地址")
    private String email;

    /**
     * 手机号
     */
    @TableField(value = "phonenumber")
    @ApiModelProperty(value="手机号")
    private String phonenumber;

    /**
     * 性别
     */
    @TableField(value = "sex")
    @ApiModelProperty(value="性别")
    private String sex;

    /**
     * 账号头像
     */
    @TableField(value = "avatar")
    @ApiModelProperty(value="账号头像")
    private String avatar;

    /**
     * 创建人
     */
    @TableField(value = "create_by")
    @ApiModelProperty(value="创建人")
    private Long createBy;

    /**
     * 创就时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创就时间")
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