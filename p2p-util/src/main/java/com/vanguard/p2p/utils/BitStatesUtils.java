package com.vanguard.p2p.utils;

/**
 * 用户状态类，记录用户在平台使用系统中所有的状态。
 * 
 * @author Administrator
 */
public class BitStatesUtils {
	/**
	 * 用户绑定手机状态码
	 */
	public final static Long OP_BIND_PHONE = 1L << 0;
	/**
	 * 用户绑定邮箱
	 */
	public final static Long OP_BIND_EMAIL = 1L << 1;
	/**
	 * 用户是否填写基本资料
	 */
	public final static Long OP_BASE_INFO = 1L << 2;
	/**
	 * 用户是否实名认证
	 */
	public final static Long OP_REAL_AUTH = 1L << 3;
	/**
	 * 用户是否视频认证
	 */
	public final static Long OP_VIDEO_AUTH = 1L << 4;
	/**
	 * 用户是否有一个借款正在处理流程当中
	 */
	public final static Long OP_HAS_BIDREQUEST_PROCESS = 1L << 5;
	/**
	 * 用户是否绑定了银行卡
	 */
	public final static Long OP_BIND_BANKCARD = 1L << 6;
	/**
	 *  用户有在申请中的提现
	 */
	public final static Long OP_MOENY_WITHDRAW_PROCESS = 1L << 7;
	
	/**
	 * @param states
	 *            所有状态值
	 * @param value
	 *            需要判断状态值
	 * @return 是否存在
	 */
	public static boolean hasState(long states, long value) {
		return (states & value) != 0;
	}

	/**
	 * @param states
	 *            已有状态值
	 * @param value
	 *            需要添加状态值
	 * @return 新的状态值
	 */
	public static long addState(long states, long value) {
		if (hasState(states, value)) {
			return states;
		}
		//有一个为1则为1，全部为0则为0
		return (states | value);
	}

	/**
	 * @param states
	 *            已有状态值
	 * @param value
	 *            需要删除状态值
	 * @return 新的状态值
	 */
	public static long removeState(long states, long value) {
		if (!hasState(states, value)) {
			return states;
		}
		//位运算异或，相同为0,不同为1,0^0=0,0^1=1，1^1=0
		return states ^ value;
	}
}
