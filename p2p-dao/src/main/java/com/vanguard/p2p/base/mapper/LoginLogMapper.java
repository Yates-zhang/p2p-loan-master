package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.UserLoginLog;
import com.vanguard.p2p.base.example.LoginLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginLogMapper {
    int countByExample(LoginLogExample example);

    int deleteByExample(LoginLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(UserLoginLog record);

    int insertSelective(UserLoginLog record);

    List<UserLoginLog> selectByExample(LoginLogExample example);

    UserLoginLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") UserLoginLog record, @Param("example") LoginLogExample example);

    int updateByExample(@Param("record") UserLoginLog record, @Param("example") LoginLogExample example);

    int updateByPrimaryKeySelective(UserLoginLog record);

    int updateByPrimaryKey(UserLoginLog record);
}