package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 平台银行账户信息
 * @date: 2018/02/06
 */
@Getter
@Setter
public class PlatformBankInfo extends BaseDomain {
    /**
     * 开户银行名称
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
     * 开户支行名称
     */
    private String forkName;
}
