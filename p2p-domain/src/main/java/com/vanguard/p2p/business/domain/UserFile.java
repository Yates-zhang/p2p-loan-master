package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.domain.BaseAuditDomain;
import com.vanguard.p2p.base.domain.SystemDictionaryItem;
import lombok.Getter;
import lombok.Setter;

/**
 * @descripe 风控材料实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class UserFile extends BaseAuditDomain {
    /**
     * 材料分数
     */
    private Byte score;
    /**
     * 材料文件地址
     */
    private String file;
    /**
     * 文件类型
     */
    private SystemDictionaryItem fileType;

}