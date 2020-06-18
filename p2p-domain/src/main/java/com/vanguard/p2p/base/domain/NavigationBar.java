package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;

import java.util.Date;

/**
 * @descripe 导航栏实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
public class NavigationBar extends BaseDomain {

    /**
     * 导航ID
     */
	private Long navigationId;
    /**
     * 名称
     */
	private String name;
    /**
     * 打开方式：_blank；_parent；_self；_top
     */
	private String target;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 链接地址
     */
	private String href;
    /**
     * 状态 1=显示/0=隐藏
     */
	private Integer status;
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
    /**
     * 备注信息
     */
	private String remarks;

}
