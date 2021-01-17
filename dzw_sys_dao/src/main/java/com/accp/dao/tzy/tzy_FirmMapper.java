package com.accp.dao.tzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Firm;

public interface tzy_FirmMapper {
    int deleteByPrimaryKey(Integer firmid);

    int insert(Firm record);

    int insertSelective(Firm record);

    Firm selectByPrimaryKey(Integer firmid);

    int updateByPrimaryKeySelective(Firm record);

    int updateByPrimaryKey(Firm record);
    
    //��ѯȫ����Ӧ��
    List<Firm> queryfirm(@Param("firmname")String firmname);
}