package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.BaseDomain;
import com.vanguard.p2p.constant.BidConst;
import com.vanguard.p2p.utils.CalculatetUtil;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 借款标的实体类
 * @date: 2018/02/05
 */
@Setter
@Getter
public class BidRequest extends BaseDomain {
    /**
     * 版本
     */
    private Integer version;
    /**
     * 还款方式
     */
    private Integer returnType;
    /**
     * 标的类型
     */
    private Integer bidRequestType = BidConst.BIDREQUEST_TYPE_NORMAL;
    /**
     * 标的状态
     */
    private Integer bidRequestState = BidConst.BIDREQUEST_STATE_PUBLISH_PENDING;
    /**
     * 借款金额
     */
    private BigDecimal bidRequestAmount = BidConst.ZERO;
    /**
     * 借款利息
     */
    private BigDecimal currentRate = BidConst.ZERO;
    /**
     * 最小投标
     */
    private BigDecimal minBidAmount = BidConst.SMALLEST_BID_AMOUNT;
    /**
     * 借款期限(月份数1~12)
     */
    private int monthes2Return = 1;
    /**
     * 已有投标数量
     */
    private int bidCount = 0;
    /**
     * 总报酬金额
     */
    private BigDecimal totalRewardAmount = BidConst.ZERO;
    /**
     * 当前已经借到多少钱
     */
    private BigDecimal currentSum = BidConst.ZERO;
    /**
     * 借款标题
     */
    private String title = "";
    /**
     * 借款描述
     */
    private String description = "";
    /**
     * 风控评审意见
     */
    private String note = "";
    /**
     * 招标截止日期 (页面数据是招标天数，无效日期=招标天数+当前日期)
     */
    private Date disableDate = new Date();
    /**
     * 标的有效天数
     */
    private int disableDays = 0;
    /**
     * 借款人
     */
    private Member createUser;
    /**
     * 这个借款已经有的标(已经收到的投标)
     */
    private List<Bid> bids = new ArrayList<Bid>();
    /**
     * 申请时间
     */
    private Date applyTime;
    /**
     * 发布时间
     */
    private Date publishTime;

    public String getReturnTypeDisplay() {
        if (this.returnType == BidConst.RETURN_TYPE_MONTH_INTEREST_PRINCIPAL) {
            return "等额本息";
        } else if (this.returnType == BidConst.RETURN_TYPE_MONTH_INTEREST) {
            return "按月到期";
        } else {
            return "";
        }
    }

    public String getBidRequestStateDisplay() {
        switch (this.bidRequestState) {
            case BidConst.BIDREQUEST_STATE_PUBLISH_PENDING:
                return "待发布";
            case BidConst.BIDREQUEST_STATE_BIDDING:
                return "招标中";
            case BidConst.BIDREQUEST_STATE_UNDO:
                return "已撤销";
            case BidConst.BIDREQUEST_STATE_BIDDING_OVERDUE:
                return "流标";
            case BidConst.BIDREQUEST_STATE_APPROVE_PENDING_1:
                return "满标1审";
            case BidConst.BIDREQUEST_STATE_APPROVE_PENDING_2:
                return "满标2审";
            case BidConst.BIDREQUEST_STATE_REJECTED:
                return "满标审核拒绝";
            case BidConst.BIDREQUEST_STATE_PAYING_BACK:
                return "还款中";
            case BidConst.BIDREQUEST_STATE_COMPLETE_PAY_BACK:
                return "已还清";
            case BidConst.BIDREQUEST_STATE_PAY_BACK_OVERDUE:
                return "逾期";
            case BidConst.BIDREQUEST_STATE_PUBLISH_REFUSE:
                return "初审拒绝状态";
            default:
                return "错误状态";
        }
    }

    /**
     * 计算当前借款标剩余的钱
     *
     * @return
     */
    public BigDecimal getRemainAmount() {
        return this.bidRequestAmount.subtract(this.currentSum);
    }

    /**
     * 计算当前招标金额的百分比
     *
     * @return
     */
    public int getPercent() {
        return this.currentSum.divide(this.bidRequestAmount, 2, RoundingMode.HALF_UP).multiply(CalculatetUtil.ONE_HUNDRED).intValue();
    }


}
