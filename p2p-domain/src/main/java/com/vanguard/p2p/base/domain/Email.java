package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @descripe 邮箱记录实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class Email extends BaseDomain {

    /**
     * 邮箱标识号
     */
	private Long emailSign;
    /**
     * 用户邮箱
     */
	private String userEmail;
    /**
     * 邮箱类型：0.找回密码; 1.注册; 2.改变邮箱; 3.通知
     */
	private Integer emailType;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 有效开始时间
     */
	private Date startTime;
    /**
     * 有效结束时间
     */
	private Date endTime;
    /**
     * 新电子邮箱
     */
	private String newEmail;
    /**
     * 链接是否已失效：0.失效；1.未失效；
     */
	private Integer status;
    /**
     * 发送状态：0.发送失败；1.发送成功；
     */
	private Integer sendStatus;
    /**
     * 验证码
     */
	private String captcha;
    /**
     * 邮箱主题
     */
	private String emailSubject;
    /**
     * 邮箱正文
     */
	private String emailContent;
	
	public Email() {
		super();
	}

	public Email(Long emailSign, String userEmail, Integer emailType, Date createTime, Date startTime, Date endTime,
                 Integer sendStatus, String captcha, String emailSubject, String emailContent) {
		super();
		this.emailSign = emailSign;
		this.userEmail = userEmail;
		this.emailType = emailType;
		this.createTime = createTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.sendStatus = sendStatus;
		this.captcha = captcha;
		this.emailSubject = emailSubject;
		this.emailContent = emailContent;
	}

}
