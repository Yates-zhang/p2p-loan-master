package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import com.vanguard.p2p.constant.BidConst;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * @descripe 用户一次投资标的记录实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Getter@Setter
public class Bid extends BaseDomain {
	/**
	 * 实际年利率(应该是等同于标的的利率)
	 */
	private BigDecimal actualRate = BidConst.ZERO;
	/**
	 * 投标有效金额(就是投标金额)
	 */
	private BigDecimal availableAmount = BidConst.ZERO;
	/**
	 * 来自于哪个借款标
	 */
	private Long bidRequestId;
	/**
	 * 标的标题
	 */
	private String bidRequestTitle;
	/**
	 * 投标人id(User)
	 */
	private Member bidUser;
	/**
	 * 投标时间
	 */
	private Date bidTime;
	/**
	 * 标的状态
	 * 这个属性不需要保存到数据库中,
	 * 只是在查询的时候,关联到到bidrequest查询;
	 */
	private int bidRequestState;
}
