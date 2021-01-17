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
	 * �����ֻ����޸����
	 * @param phone
	 * @param je
	 * @return
	 */
	int updateczByphone(@Param("phone") String phone,@Param("je") String je);
	
	/**
	 * �����ֻ����޸Ŀ������
	 * @param phone
	 * @param je
	 * @return
	 */
	int updateczkkByphone(@Param("phone") String phone,@Param("je") String je,@Param("time") String time);
	
	/**
	 * �����ֻ��Ų�ѯ���л�Ա
	 * @param inid
	 * @return
	 */
	List<Client> selectyAllHyljy(@Param("phone") String phone);
	
	/**
	 * �����ֻ��Ų�ѯ��Ա���г�ֵ��¼
	 * @param inid
	 * @return
	 */
	List<Chongzhi> selectyAllHyljyczByphone(@Param("phone") String phone);
	
	/**
	 * ���ݻ�Ա�ֻ��Ż��Ա���Ʋ�ѯ
	 * @param inid
	 * @return
	 */
	Client selectyAllHyljycztjByphone(@Param("tj") String tj);
	
	/**
	 * �����ֻ��Ų�ѯָ����Ա
	 * @param inid
	 * @return
	 */
	Client selectyAllHyljyByphone(@Param("phone") String phone);
	
	/**
	 * ����ά�ޱ�Ų�ѯ������Ϣ
	 * @param inid
	 * @return
	 */
	LjyWorkcar selectLjyWorkcar(@Param("inid") String inid);
	
	/**
	 * ������ֵ��¼
	 * @param phone
	 * @param je
	 * @return
	 */
	int insaddCz(@Param("phone") String phone,@Param("zf") String zf,@Param("je") String je,@Param("bh") String bh,@Param("time") String time);
	
	/**
	 * ����������¼
	 * @param phone
	 * @param je
	 * @return
	 */
	int insaddsyjl(@Param("cid") String cid,@Param("inid") String inid,@Param("price") String price,@Param("zf") String zf,@Param("time") String time);

	/**
	 * ɾ����ֵ��¼
	 * @param phone
	 * @param je
	 * @return
	 */
	int deletezc(@Param("phone") String phone);

	/**
	 * �޸�Ϊ��Ա״̬Ϊ�ǻ�Ա
	 * @param phone
	 * @param je
	 * @return
	 */
	int updatehy(@Param("phone") String phone);

	
	
}
