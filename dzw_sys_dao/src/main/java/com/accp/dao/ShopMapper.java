package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Shop;

public interface ShopMapper {
 
    int insert(Shop record);
    int insertSelective(Shop record);
    Shop selectByPrimaryKey(Integer shopid);
    int updateByPrimaryKeyWithBLOBs(Shop record);
    int updateByPrimaryKey(Shop record);
    
    
    //删除发动机
    int deleteByPrimaryKey(Integer shopid);
    
   
    //修改
    int updateByPrimaryKeySelective(Shop record);
    
   
}