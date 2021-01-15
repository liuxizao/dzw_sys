package com.accp.dao;

import com.accp.pojo.Tblfunction;

public interface TblfunctionMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Tblfunction record);

    int insertSelective(Tblfunction record);

    Tblfunction selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Tblfunction record);

    int updateByPrimaryKey(Tblfunction record);
}