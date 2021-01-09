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
    
   //��ѯ������
    List<Shop> queryshopfdj(@Param("shopname")String shopname);
    
    //����������
    int addshopfdj(@Param("sp")Shop sp);
    
    //��ѯ������Ŀ
    List<Shop> queryshopby(@Param("byname")String byname);
    
    //��ѯά����Ŀ
    List<Shop> queryshopwx(@Param("wxname")String wxname);
}