package com.accp.dao.tzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Cartypes;

public interface tzy_CartypesMapper {
    int deleteByPrimaryKey(Integer ctid);

    int insert(Cartypes record);

    int insertSelective(Cartypes record);

    Cartypes selectByPrimaryKey(Integer ctid);

    int updateByPrimaryKeySelective(Cartypes record);

    int updateByPrimaryKey(Cartypes record);
    
    List<Cartypes> querycar();
    
    List<Cartypes> querycartypes(@Param("carname")String carname);
}