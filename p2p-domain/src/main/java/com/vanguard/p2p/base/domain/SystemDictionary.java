package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 数据字典实体类
 * @date: 2018/02/05
 */
@Setter
@Getter
public class SystemDictionary extends BaseDomain {
    /**
     * 编码
     */
    private String sn;
    /**
     * 名称
     */
    private String title;
    /**
     * 简介
     */
    private String intro;

}