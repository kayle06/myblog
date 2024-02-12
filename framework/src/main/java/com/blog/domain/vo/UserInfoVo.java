package com.blog.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description="`user`")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`user`")
public class UserInfoVo {
    /**
     * 主键
     */
    @TableField(value = "id")
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    @ApiModelProperty(value="昵称")
    private String nickName;

    /**
     * 邮箱地址
     */
    @TableField(value = "email")
    @ApiModelProperty(value="邮箱地址")
    private String email;

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

}