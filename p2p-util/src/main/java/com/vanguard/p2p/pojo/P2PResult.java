package com.vanguard.p2p.pojo;


import com.vanguard.p2p.base.BaseResult;
import com.vanguard.p2p.exception.ReturnCode;

/**
 * @author vanguard
 * @version 1.0
 * @descripe P2P平台统一返回结构类
 * @date: 2018-02-08
 */
public class P2PResult extends BaseResult {

	private static final long serialVersionUID = 1L;

	public P2PResult(ReturnCode returnCode) {
		super(returnCode.getCode(), returnCode.getMessage());
	}
	
	public P2PResult(ReturnCode returnCode, Object data) {
		super(returnCode.getCode(), returnCode.getMessage(), data);
	}
	
	public P2PResult(Integer code, String message) {
		super(code, message);
	}
}
