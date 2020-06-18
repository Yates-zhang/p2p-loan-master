package com.vanguard.p2p.utils;

import java.util.UUID;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public class IDUtils {
    /**
     * 获得32位UUID
     * @return
     */
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
