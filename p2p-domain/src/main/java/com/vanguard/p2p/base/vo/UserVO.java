package com.vanguard.p2p.base.vo;


import com.vanguard.p2p.base.domain.Role;
import com.vanguard.p2p.base.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserVO extends User {

	private static final long serialVersionUID = 1L;
	
	/** 用户角色 */
	private List<Role> roles;
	
}
