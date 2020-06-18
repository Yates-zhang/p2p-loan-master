package com.vanguard.p2p.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
@Setter@Getter
public class BaseDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Long id;
}
