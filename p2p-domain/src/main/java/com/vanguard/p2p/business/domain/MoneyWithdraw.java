package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.domain.BaseAuditDomain;
import com.vanguard.p2p.constant.BidConst;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 提现记录的实体类
 * @date: 2018/02/05
 */
@Getter
@Setter
public class MoneyWithdraw extends BaseAuditDomain {
    /**
     * 真实的提现金额
     */
    private BigDecimal amount;
    /**
     * 手续费金额
     */
    private BigDecimal fee;
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
     * 账户减去的总金额：提现金额+手续费
     *
     * @return
     */
    public BigDecimal getTotalAmount() {
        this.fee = BidConst.MONEY_WITHDRAW_CHARGEFEE;
        return this.amount.add(this.fee);
    }
}
