package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.AdvertDetail;
import com.vanguard.p2p.base.example.AdvertDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvertDetailMapper {
    int countByExample(AdvertDetailExample example);

    int deleteByExample(AdvertDetailExample example);

    int deleteByPrimaryKey(Long advertDetailId);

    int insert(AdvertDetail record);

    int insertSelective(AdvertDetail record);

    List<AdvertDetail> selectByExample(AdvertDetailExample example);

    AdvertDetail selectByPrimaryKey(Long advertDetailId);

    int updateByExampleSelective(@Param("record") AdvertDetail record, @Param("example") AdvertDetailExample example);

    int updateByExample(@Param("record") AdvertDetail record, @Param("example") AdvertDetailExample example);

    int updateByPrimaryKeySelective(AdvertDetail record);

    int updateByPrimaryKey(AdvertDetail record);
}