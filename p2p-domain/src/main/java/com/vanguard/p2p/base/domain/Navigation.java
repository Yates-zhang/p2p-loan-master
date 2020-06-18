package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @descripe 导航实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class Navigation extends BaseDomain {

    /**
     * 代码简称
     */
	private String code;
    /**
     * 名称
     */
	private String name;
    /**
     * 状态 1=显示/0=隐藏
     */
	private Integer status;
    /**
     * 数量
     */
	private Integer number;
    /**
     * 显示数量
     */
	private Integer showNumber;
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
