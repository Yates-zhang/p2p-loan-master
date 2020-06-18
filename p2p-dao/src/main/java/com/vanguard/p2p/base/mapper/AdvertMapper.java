package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.Advert;
import com.vanguard.p2p.base.example.AdvertExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvertMapper {
    int countByExample(AdvertExample example);

    int deleteByExample(AdvertExample example);

    int deleteByPrimaryKey(Long advertId);

    int insert(Advert record);

    int insertSelective(Advert record);

    List<Advert> selectByExampleWithBLOBs(AdvertExample example);

    List<Advert> selectByExample(AdvertExample example);

    Advert selectByPrimaryKey(Long advertId);

    int updateByExampleSelective(@Param("record") Advert record, @Param("example") AdvertExample example);

    int updateByExampleWithBLOBs(@Param("record") Advert record, @Param("example") AdvertExample example);

    int updateByExample(@Param("record") Advert record, @Param("example") AdvertExample example);

    int updateByPrimaryKeySelective(Advert record);

    int updateByPrimaryKeyWithBLOBs(Advert record);

    int updateByPrimaryKey(Advert record);
}