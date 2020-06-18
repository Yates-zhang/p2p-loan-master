package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.SystemDictionaryItem;
import com.vanguard.p2p.base.example.SystemDictionaryItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemDictionaryItemMapper {
    int countByExample(SystemDictionaryItemExample example);

    int deleteByExample(SystemDictionaryItemExample example);

    int deleteByPrimaryKey(Long sysDictItemId);

    int insert(SystemDictionaryItem record);

    int insertSelective(SystemDictionaryItem record);

    List<SystemDictionaryItem> selectByExample(SystemDictionaryItemExample example);

    SystemDictionaryItem selectByPrimaryKey(Long sysDictItemId);

    int updateByExampleSelective(@Param("record") SystemDictionaryItem record, @Param("example") SystemDictionaryItemExample example);

    int updateByExample(@Param("record") SystemDictionaryItem record, @Param("example") SystemDictionaryItemExample example);

    int updateByPrimaryKeySelective(SystemDictionaryItem record);

    int updateByPrimaryKey(SystemDictionaryItem record);
}