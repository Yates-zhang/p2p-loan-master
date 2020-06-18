package com.vanguard.p2p.business.domain;


import com.vanguard.p2p.base.BaseDomain;
import com.vanguard.p2p.constant.BidConst;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 平台账户
 * @date: 2018/02/05
 */
@Setter
@Getter
public class SystemAccount extends BaseDomain {
    /**
     * 版本
     */
    private int version;
    /**
     * 平台账户剩余金额
     */
    private BigDecimal usableAmount = BidConst.ZERO;
    /**
     * 平台账户冻结金额
     */
    private BigDecimal freezedAmount = BidConst.ZERO;
}
