package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

/**
 * @author vanguard
 * @version 1.0
 * @descripe 数据字典项实体类
 * @date: 2018/02/05
 */
@Setter
@Getter
public class SystemDictionaryItem extends BaseDomain {
    /**
     * 系统目录
     */
    private Long parentid;
    /**
     * 名称
     */
    private String title;
    /**
     * 值
     */
    private String tvalue;
    /**
     * 序列
     */
    private Byte sequence;
    /**
     * 说明
     */
    private String intro;

}