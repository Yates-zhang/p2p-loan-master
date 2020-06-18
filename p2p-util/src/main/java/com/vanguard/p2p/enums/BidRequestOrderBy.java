package com.vanguard.p2p.enums;

import lombok.Getter;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
@Getter
public enum BidRequestOrderBy {
	BIDREQUEST_STATE("br.bidRequestState");
	private String orderBy;

	BidRequestOrderBy(String orderBy){
		this.orderBy = orderBy;
	}
}
