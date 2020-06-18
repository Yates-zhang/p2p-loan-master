package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import com.vanguard.p2p.constant.BidConst;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @descripe 还款计划对象
 *           记录借款每月的还款信息(该信息针对借款用户)
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Getter @Setter
public class PaymentSchedule extends BaseDomain {
	/**
	 * 对象借款ID
	 */
	private Long bidRequestId;
	/**
	 * 借款标题
	 */
	private String bidRequestTitle;
	/**
	 * 还款人
	 */
	private Member borrowUser;
	/**
	 * 本期还款截止期限
	 */
	private Date deadLine;
	/**
	 * 还款时间
	 */
	private Date payDate;
	/**
	 * 本期还款总金额，利息 +本金
	 */
	private BigDecimal totalAmount = BidConst.ZERO;
	/**
	 * 本期还款本金
	 */
	private BigDecimal principal = BidConst.ZERO;
	/**
	 * 本期还款总利息
	 */
	private BigDecimal interest = BidConst.ZERO;
	/**
	 * 第几期 (即第几个月)
	 */
	private int monthIndex;
	/**
	 * 本期还款状态（默认正常待还）
	 */
	private int state = BidConst.PAYMENT_STATE_NORMAL;
	/**
	 * 借款类型
	 */
	private int bidRequestType;
	/**
	 * 还款方式，等同借款(BidRequest)中的还款方式
	 */
	private int returnType;
	/**
	 * 本期还款计划对应的还款计划明细
	 */
	private List<PaymentScheduleDetail> paymentScheduleDetails = new ArrayList<PaymentScheduleDetail>();

	/**
	 * 还款状态显示
	 * @return
	 */
	public String getStateDisplay() {
		switch (state) {
		case BidConst.PAYMENT_STATE_NORMAL:
			return "正常待还";
		case BidConst.PAYMENT_STATE_DONE:
			return "已还";
		case BidConst.PAYMENT_STATE_OVERDUE:
			return "逾期";
		default:
			return "未知";
		}
	}
}
