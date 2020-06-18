package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 平台账户流水
 * @date: 2018/02/05
 */
@Getter
@Setter
public class SystemAccountFlow extends BaseDomain {

    /**
     * 产生流水的时间
     */
    private Date tradeTime;
    /**
     * 流水的类型
     */
    private int actionType;
    /**
     * 业务金额
     */
    private BigDecimal amount;
    /**
     * 操作后的账户金额
     */
    private BigDecimal usableAmount;
    /**
     * 操作后的冻结金额
     */
    private BigDecimal freezedAmount;
    /**
     * 流水说明
     */
    private String note;
}
