package com.vanguard.p2p.pojo;

import java.io.Serializable;

public class EmailSendResult implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 邮件发送结果
	 */
	private Boolean result;
	
	/**
	 * 邮箱标识号
	 */
	private Long emailSign;
	
	public EmailSendResult() {
		super();
	}

	public EmailSendResult(Boolean result, Long emailSign) {
		super();
		this.result = result;
		this.emailSign = emailSign;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public Long getEmailSign() {
		return emailSign;
	}

	public void setEmailSign(Long emailSign) {
		this.emailSign = emailSign;
	}
}
