package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.domain.BaseAuditDomain;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author vanguard
 * @version 1.0
 * @describe 充值的实体类
 * @date 2018/02/05
 */
public class RechargeMoney extends BaseAuditDomain {
    /**
     * 平台银行账户
     */
    private PlatformBankInfo bankInfo;
    /**
     * 交易码
     */
    private String tradeCode;
    /**
     * 交易时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date tradeTime;
    /**
     * 交易金额
     */
    private BigDecimal amount;
}
