package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;

import java.util.Date;

/**
 * @descripe 权限实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
public class Menu extends BaseDomain {

    /**
     * 父级编号
     */
	private Long parentId;
    /**
     * 权限类型 1=菜单/2=功能/3=子功能/0=操作
     */
	private Integer menuType;
    /**
     * 权限代码
     */
	private String menuCode;
    /**
     * 权限名称
     */
	private String menuName;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 链接地址
     */
	private String href;
    /**
     * 图标名称
     */
	private String icon;
    /**
     * 状态 0=隐藏/1=显示
     */
	private Integer status;
    /**
     * 权限标识
     */
	private String permission;
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
