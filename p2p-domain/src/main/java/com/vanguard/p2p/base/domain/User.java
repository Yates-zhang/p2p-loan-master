package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Descripe 管理员用户实体类
 * @Author vanguard
 * @Date: 2018/02/05
 * @Version 1.0
 */
@Setter
@Getter
public class User extends BaseDomain {

    /**
     * 用户名
     */
    private String userName;
    /**
     * 管理员密码
     */
    private String loginPassword;
    /**
     * 加密密码的盐
     */
    private String salt;

    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 性别 0=女/1=男
     */
    private Integer sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 用户头像
     */
    private String picImg;
    /**
     * 状态 0=冻结/1=正常
     */
    private Integer status;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String telephone;
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;
    /**
     * 最后登录IP
     */
    private String lastLoginIp;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新者
     */
    private String updateBy;

    public String getSex() {
        return sex == 0 ? "女" : "男";
    }

}