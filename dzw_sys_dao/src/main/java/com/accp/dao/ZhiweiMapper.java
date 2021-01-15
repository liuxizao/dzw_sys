package com.accp.dao;

import com.accp.pojo.Zhiwei;

public interface ZhiweiMapper {
    int deleteByPrimaryKey(Integer zid);

    int insert(Zhiwei record);

    int insertSelective(Zhiwei record);

    Zhiwei selectByPrimaryKey(Integer zid);

    int updateByPrimaryKeySelective(Zhiwei record);

    int updateByPrimaryKey(Zhiwei record);
}