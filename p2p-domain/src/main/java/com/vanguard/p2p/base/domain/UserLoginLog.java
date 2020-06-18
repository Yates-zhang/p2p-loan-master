package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Descripe 用户登录日志实体类
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 */
@Setter
@Getter
public class UserLoginLog extends BaseDomain {

    /**
     * 用户登录IP
     */
    private String userIp;
    /**
     * 登录时间
     */
    private Date loginTime;
    /**
     * 用户登录状态 0=失败/1=成功
     */
    private Integer userStatus;
    /**
     * 用户名
     */
    private String username;
    /**
     * 操作系统
     */
    private String operatingSystem;
    /**
     * 浏览器
     */
    private String browser;

    public UserLoginLog() {
        super();
    }

    public UserLoginLog(Date loginTime, String userIp, Long userId, String operatingSystem,
                        String browser) {
        super();
        this.loginTime = loginTime;
        this.userIp = userIp;
        this.id = userId;
        this.operatingSystem = operatingSystem;
        this.browser = browser;
    }


}