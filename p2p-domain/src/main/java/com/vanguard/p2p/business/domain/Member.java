package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author vanguard
 * @version 1.0
 * @describe 用户实体类
 * @date 18/2/5
 */
@Setter
@Getter
public class Member extends BaseDomain {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 加密密码的盐
     */
    private String salt;
    /**
     * 状态 0=冻结/1=正常
     */
    private Integer status;
    /**
     * 注册时间
     */
    private Date registTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
