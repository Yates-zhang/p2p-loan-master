package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import com.vanguard.p2p.constant.BidConst;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 投资人的回款明细(针对还款计划)
 * @date: 2018/02/05
 */
@Getter
@Setter
public class PaymentScheduleDetail extends BaseDomain {
    /**
     * 该投标人总共投标金额,便于还款/垫付查询
     */
    private BigDecimal bidAmount;
    /**
     * 对应的投标ID
     */
    private Long bidId;
    /**
     * 本期还款总金额(=本金+利息)
     */
    private BigDecimal totalAmount = BidConst.ZERO;
    /**
     * 本期应还款本金
     */
    private BigDecimal principal = BidConst.ZERO;
    /**
     * 本期应还款利息
     */
    private BigDecimal interest = BidConst.ZERO;
    /**
     * 第几期（即第几个月）
     */
    private Integer monthIndex;
    /**
     * 本期还款截止时间
     */
    private Date deadline;
    /**
     * 所属哪个借款
     */
    private Long bidRequestId;
    /**
     * 实际付款日期
     */
    private Date payDate;
    /**
     * 还款方式
     */
    private Integer returnType;
    /**
     * 所属还款计划
     */
    private Long paymentScheduleId;
    /**
     * 还款人(即发标人)
     */
    private Member fromMember;
    /**
     * 收款人(即投标人)
     */
    private Long toMemberId;
}
