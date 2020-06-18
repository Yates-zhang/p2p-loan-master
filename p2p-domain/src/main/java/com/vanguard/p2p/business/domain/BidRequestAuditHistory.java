package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.domain.BaseAuditDomain;
import lombok.Getter;
import lombok.Setter;

/**
 * @Descripe 标审核记录的实体类
 * @Author vanguard
 * @Date: 2018/02/01
 * @Version 1.0
 */
@Getter
@Setter
public class BidRequestAuditHistory extends BaseAuditDomain {

    /**
     * 审核的标ID
     */
    private Long bidRequestId;
    /**
     * 审核的类型
     * 0=发标前审核
     * 1=满标一审
     * 2=满标二审
     */
    private Integer auditType;

    public String getAuditTypeDisplay() {
        switch (this.auditType) {
            case 0:
                return "发标前审核";
            case 1:
                return "满标一审";
            case 2:
                return "满标二审";
            default:
                return "";
        }
    }
}
