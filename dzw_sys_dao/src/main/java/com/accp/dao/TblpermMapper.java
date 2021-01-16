package com.accp.dao;

import com.accp.pojo.Tblperm;

public interface TblpermMapper {
    int insert(Tblperm record);

    int insertSelective(Tblperm record);
}