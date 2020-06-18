package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @descripe 日志记录表
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class Log extends BaseDomain {

    /**
     * 管理员ID
     */
	private Long userId;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 耗时
     */
	private Integer spendTime;
    /**
     * 请求类型
     */
	private String method;
    /**
     * 用户标识
     */
	private String userAgent;
    /**
     * 用户IP
     */
	private String userIp;
    /**
     * 请求内容
     */
	private String optContent;
    /**
     * 请求路径
     */
	private String url;

}
