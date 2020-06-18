package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.Email;
import com.vanguard.p2p.base.example.EmailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmailMapper {
    int countByExample(EmailExample example);

    int deleteByExample(EmailExample example);

    int deleteByPrimaryKey(Long emailId);

    int insert(Email record);

    int insertSelective(Email record);

    List<Email> selectByExampleWithBLOBs(EmailExample example);

    List<Email> selectByExample(EmailExample example);

    Email selectByPrimaryKey(Long emailId);

    int updateByExampleSelective(@Param("record") Email record, @Param("example") EmailExample example);

    int updateByExampleWithBLOBs(@Param("record") Email record, @Param("example") EmailExample example);

    int updateByExample(@Param("record") Email record, @Param("example") EmailExample example);

    int updateByPrimaryKeySelective(Email record);

    int updateByPrimaryKeyWithBLOBs(Email record);

    int updateByPrimaryKey(Email record);
}