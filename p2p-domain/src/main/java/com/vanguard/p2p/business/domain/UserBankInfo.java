package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

/**
 * @descripe 用户绑定银行卡信息的实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class UserBankInfo extends BaseDomain {

	/**
	 * 会员用户ID
	 */
	private Long memId;

	/**
	 * 银行名称
	 */
	private String bankName;
	/**
	 * 开户人姓名
	 */
	private String accountName;
	/**
	 * 银行账号
	 */
	private String accountNumber;
	/**
	 * 开户支行
	 */
	private String forkName;
	/**
	 * 会员对象
	 */
	private Member member;

	/**
	 * 获取用户真实名字的隐藏字符串，只显示姓氏
	 *
	 * @return
	 */
	public String getAnonymousRealName () {
		int len = accountName.length();
		String replace = "";
		if (StringUtils.hasLength(this.accountName)) {
			replace += accountName.charAt(0);
			for (int i = 1; i < len; i++) {
				replace += "*";
			}
			return replace;
		}
		return accountName;
	}
	
	/**
	 * 获取用户身份号码的隐藏字符串
	 *
	 * @return
	 */
	public String getAnonymousAccountNumber() {
		int len = accountNumber.length();
		String replace = "";
		if (StringUtils.hasLength(accountNumber)) {
			for (int i = 0; i < len; i++) {
				if ((i > 5 && i < 10) || (i > len - 5)) {
					replace += "*";
				} else {
					replace += accountNumber.charAt(i);
				}
			}
			return replace;
		}
		return accountNumber;
	}

}
