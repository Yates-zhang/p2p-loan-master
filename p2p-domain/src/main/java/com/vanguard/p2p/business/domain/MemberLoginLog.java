package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author vanguard
 * @version 1.0
 * @describe 会员用户登录 记录表
 * @date 2018/02/08
 */
@Setter
@Getter
public class MemberLoginLog extends BaseDomain {

    /**
     * 登录时间
     */
    private Date loginTime;
    /**
     * 登录IP
     */
    private String memIp;
    /**
     * 用户登录状态 0=失败/1=成功
     */
    private Integer memberStatus;
    /**
     * 操作系统
     */
    private String operatingSystem;
    /**
     * 浏览器
     */
    private String browser;

    public MemberLoginLog() {
        super();
    }

    public MemberLoginLog(Date loginTime, String userIp, Long userId, String operatingSystem,
                        String browser) {
        super();
        this.loginTime = loginTime;
        this.memIp = userIp;
        this.id = userId;
        this.operatingSystem = operatingSystem;
        this.browser = browser;
    }
}
