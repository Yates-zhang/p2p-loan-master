package com.vanguard.p2p.base.vo;

import com.vanguard.p2p.base.dto.RoleMenuDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class RoleMenuVO extends RoleMenuDTO {

	private static final long serialVersionUID = 1L;
	
	/** 子级权限List */
	private List<RoleMenuDTO> childMenus;
	
	/** 是否选中 */
	private boolean checked;

}
