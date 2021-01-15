package com.accp.dao;

import com.accp.pojo.Inststion;

public interface InststionMapper {
    int deleteByPrimaryKey(Integer inid);

    int insert(Inststion record);

    int insertSelective(Inststion record);

    Inststion selectByPrimaryKey(Integer inid);

    int updateByPrimaryKeySelective(Inststion record);

    int updateByPrimaryKey(Inststion record);
}