package com.vanguard.p2p.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author vanguard
 * @version 1.0
 * @describe
 * @date 2018/02/08
 */
@Setter
@Getter
public class PageResult<T> implements Serializable {
    /**
     * 每页显示信息的集合
     */
    private List<T> rows;
    /**
     * 当前第几页
     */
    private Integer currentPage;
    /**
     * 每页显示条数
     */
    private Integer pageSize;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 总条数
     */
    private Integer totalCount;

}
