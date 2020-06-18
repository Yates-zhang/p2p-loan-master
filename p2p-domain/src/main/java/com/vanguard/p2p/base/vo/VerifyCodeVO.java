package com.vanguard.p2p.base.vo;

import lombok.Getter;

import java.util.Date;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 手机验证码
 * @date: 2018-02-07
 */
@Getter
public class VerifyCodeVO {
	private String code;
	private String phoneNumber;
	private Date sendTime;
	public VerifyCodeVO(String code, String phoneNumber, Date sendTime) {
		super();
		this.code = code;
		this.phoneNumber = phoneNumber;
		this.sendTime = sendTime;
	}
}
