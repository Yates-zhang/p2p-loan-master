package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.domain.BaseAuditDomain;
import lombok.Getter;
import lombok.Setter;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 实名认证实体类
 * @date: 2018/02/05
 */
@Setter
@Getter
public class RealAuth extends BaseAuditDomain {
    /**
     * 会员用户ID
     */
    private Long memId;

    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 性别 0=女/1=男
     */
    private Integer sex;
    /**
     * 出生日期
     */
    private String borndate;
    /**
     * 身份证号
     */
    private String idnumber;
    /**
     * 证件住址
     */
    private String address;
    /**
     * 身份证正面照片
     */
    private String image1;
    /**
     * 身份证反面照片
     */
    private String image2;

    /**
     * 获得性别
     * @return
     */
    public String getSex() {
        return sex == 1 ? "男" : "女";
    }

}