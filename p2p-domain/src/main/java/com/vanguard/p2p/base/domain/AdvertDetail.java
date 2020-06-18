package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;

import java.util.Date;

/**
 * @descripe 广告位管理实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
public class AdvertDetail extends BaseDomain {

    /**
     * 广告位ID
     */
	private Long advertId;
    /**
     * 标题
     */
	private String title;
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
     * 展示图片
     */
	private String picImg;
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
    /**
     * 广告内容
     */
	private String content;
    /**
     * 广告起始时间
     */
	private Date beginTime;
    /**
     * 广告结束时间
     */
	private Date endTime;

}
