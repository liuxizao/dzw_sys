package com.accp.dao;

import com.accp.pojo.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(String cliphone);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(String cliphone);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKeyWithBLOBs(Client record);

    int updateByPrimaryKey(Client record);
}