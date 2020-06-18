package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @descripe 角色权限实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class RoleMenu extends BaseDomain {

    /**
     * 角色编号
     */
	private Long roleId;
    /**
     * 权限编号
     */
	private Long menuId;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 创建者
     */
	private String createBy;

}
