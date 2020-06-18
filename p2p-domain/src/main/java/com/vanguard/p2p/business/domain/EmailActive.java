package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @descripe 邮件认证
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class EmailActive extends BaseDomain {

    /**
     * 邮件地址
     */
    private String email;
    /**
     * 会员用户ID
     */
    private Long memId;
    /**
     * 发送时间
     */
    private Date sendTime;
    /**
     * 发送的激活url的验证码
     */
    private String captcha;

}