package com.accp.dao;

import com.accp.pojo.Cartypes;

public interface CartypesMapper {
    int deleteByPrimaryKey(Integer ctid);

    int insert(Cartypes record);

    int insertSelective(Cartypes record);

    Cartypes selectByPrimaryKey(Integer ctid);

    int updateByPrimaryKeySelective(Cartypes record);

    int updateByPrimaryKey(Cartypes record);
}