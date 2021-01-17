package com.accp.dao.ljy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Cashiers;
import com.accp.pojo.Chongzhi;
import com.accp.pojo.Client;
import com.accp.pojo.Clientcar;
import com.accp.pojo.Inststion;
import com.accp.pojo.LjyChongzhi;
import com.accp.pojo.LjyWorkcar;
import com.accp.pojo.Wxxq;

public interface LjyCashiers {
	List<Inststion> selectByPrimaryKey(@Param("phone") String phone,@Param("kk") String kk) ;
	
	List<Wxxq> selectByPrimaryKeyByinid(@Param("inid") String inid);
	
	Client selectClient(@Param("cno") String cno);
	
	Clientcar selectClientcar(@Param("cno") String cno);
	
	int updateByinid(@Param("inid") String inid);
	
	int updateBycno(@Param("cno") String cno);
	
	int updateByphone(@Param("jg") String jg,@Param("phone") String phone);
	
	/**
	 * 根据手机号修改余额
	 * @param phone
	 * @param je
	 * @return
	 */
	int updateczByphone(@Param("phone") String phone,@Param("je") String je);
	
	/**
	 * 根据手机号修改开卡余额
	 * @param phone
	 * @param je
	 * @return
	 */
	int updateczkkByphone(@Param("phone") String phone,@Param("je") String je,@Param("time") String time);
	
	/**
	 * 根据手机号查询所有会员
	 * @param inid
	 * @return
	 */
	List<Client> selectyAllHyljy(@Param("phone") String phone);
	
	/**
	 * 根据手机号查询会员所有充值记录
	 * @param inid
	 * @return
	 */
	List<Chongzhi> selectyAllHyljyczByphone(@Param("phone") String phone);
	
	/**
	 * 根据会员手机号或会员名称查询
	 * @param inid
	 * @return
	 */
	Client selectyAllHyljycztjByphone(@Param("tj") String tj);
	
	/**
	 * 根据手机号查询指定会员
	 * @param inid
	 * @return
	 */
	Client selectyAllHyljyByphone(@Param("phone") String phone);
	
	/**
	 * 根据维修编号查询外派信息
	 * @param inid
	 * @return
	 */
	LjyWorkcar selectLjyWorkcar(@Param("inid") String inid);
	
	/**
	 * 新增充值记录
	 * @param phone
	 * @param je
	 * @return
	 */
	int insaddCz(@Param("phone") String phone,@Param("zf") String zf,@Param("je") String je,@Param("bh") String bh,@Param("time") String time);
	
	/**
	 * 新增收银记录
	 * @param phone
	 * @param je
	 * @return
	 */
	int insaddsyjl(@Param("cid") String cid,@Param("inid") String inid,@Param("price") String price,@Param("zf") String zf,@Param("time") String time);

	/**
	 * 删除充值记录
	 * @param phone
	 * @param je
	 * @return
	 */
	int deletezc(@Param("phone") String phone);

	/**
	 * 修改为会员状态为非会员
	 * @param phone
	 * @param je
	 * @return
	 */
	int updatehy(@Param("phone") String phone);

	
	
}
