package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.NavigationBar;
import com.vanguard.p2p.base.example.NavigationBarExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NavigationBarMapper {
    int countByExample(NavigationBarExample example);

    int deleteByExample(NavigationBarExample example);

    int deleteByPrimaryKey(Long navigationBarId);

    int insert(NavigationBar record);

    int insertSelective(NavigationBar record);

    List<NavigationBar> selectByExample(NavigationBarExample example);

    NavigationBar selectByPrimaryKey(Long navigationBarId);

    int updateByExampleSelective(@Param("record") NavigationBar record, @Param("example") NavigationBarExample example);

    int updateByExample(@Param("record") NavigationBar record, @Param("example") NavigationBarExample example);

    int updateByPrimaryKeySelective(NavigationBar record);

    int updateByPrimaryKey(NavigationBar record);
}