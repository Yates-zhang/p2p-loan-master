package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import com.vanguard.p2p.business.domain.Member;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 审核实体类的基本类
 * @date: 2018/02/05
 */
@Getter
@Setter
abstract public class BaseAuditDomain extends BaseDomain {

    /**
     * 申请人
     */
    private Member applier;
    /**
     * 申请时间
     */
    private Date applyTime;
    /**
     * 审核人
     */
    private User auditor;
    /**
     * 审核时间
     */
    private Date auditTime;
    /**
     * 状态 0=审请状态/1=审核通过/2=审核拒绝
     */
    private Integer state;
    /**
     * 审核备注
     */
    private String remark;

    /**
     * 返回状态
     * @return
     */
    public String getStateDisplay() {
        switch (state) {
            case 0:
                return "申请状态";
            case 1:
                return "审核通过";
            case 2:
                return "审核失败";
            default:
                return "异常";
        }
    }
}
