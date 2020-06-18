package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @descripe 广告位实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class Advert extends BaseDomain {

    /**
     * 广告位名称
     */
	private String name;
    /**
     * 宽度
     */
	private Integer width;
    /**
     * 高度
     */
	private Integer height;
    /**
     * 描述
     */
	private String description;
    /**
     * 代码简称
     */
	private String code;
    /**
     * 模版内容
     */
	private String template;
    /**
     * 默认显示个数
     */
	private Integer defultNumber;
    /**
     * 广告数量
     */
	private Integer number;
    /**
     * 状态 1=显示/0=隐藏
     */
	private Integer status;
    /**
     * 广告位类型 1=图片/0=文本
     */
	private Integer type;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 创建者
     */
	private String createBy;
    /**
     * 更新时间
     */
	private Date updateTime;
    /**
     * 更新者
     */
	private String updateBy;

}
