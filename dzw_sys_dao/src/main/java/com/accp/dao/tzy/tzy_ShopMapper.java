package com.accp.dao.tzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Shop;

public interface tzy_ShopMapper {
 
    int insert(Shop record);
    int insertSelective(Shop record);
    Shop selectByPrimaryKey(Integer shopid);
    int updateByPrimaryKeyWithBLOBs(Shop record);
    int updateByPrimaryKey(Shop record);
    
   //查询发动机
    List<Shop> queryshopfdj(@Param("shopname")String shopname);
    
    //新增发动机
    int addshopfdj(@Param("sp")Shop sp);
    
    //查询保养项目
    List<Shop> queryshopby(@Param("byname")String byname);
    
    //查询维修项目
    List<Shop> queryshopwx(@Param("wxname")String wxname);
    
    //查询维修项目
    List<Shop> queryAA();
}