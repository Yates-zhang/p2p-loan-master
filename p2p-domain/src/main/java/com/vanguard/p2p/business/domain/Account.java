package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import com.vanguard.p2p.constant.BidConst;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Descripe 用户的账户信息实体类
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
@Setter@Getter
public class Account extends BaseDomain {
    /**
     * 会员用户ID
     */
    private Long memId;
    /**
     * 版本
     */
    private Integer version;
    /**
     * 支付密码
     */
    private String tradePassword;
    /**
     * 可用金额
     */
    private BigDecimal usableAmount;
    /**
     * 冻结金额
     */
    private BigDecimal freezedAmount;
    /**
     * 账户待收利息
     */
    private BigDecimal unReceiveInterest = BidConst.ZERO;
    /**
     * 账户待收本金
     */
    private BigDecimal unReceivePrincipal = BidConst.ZERO;
    /**
     * 账户待还金额
     */
    private BigDecimal unReturnAmount = BidConst.ZERO;
    /**
     * 账户剩余授信额度
     */
    private BigDecimal remainBorrowLimit = BidConst.ZERO;
    /**
     * 授信额度（当前还可以信用借款额度）
     */
    private BigDecimal borrowLimitAmount;
}