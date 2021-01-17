package com.accp.biz.ljy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ljy.LjyCashiers;
import com.accp.pojo.Cashiers;
import com.accp.pojo.Chongzhi;
import com.accp.pojo.Client;
import com.accp.pojo.Clientcar;
import com.accp.pojo.LjyChongzhi;
import com.accp.pojo.LjyWorkcar;
import com.accp.pojo.Wxxq;

@Service
public class LjyCashiersBiz {
	@Autowired
	private LjyCashiers ljyCashiers;

	// 查询
	public List<Cashiers> selectByPrimaryKey(String phone,String kk) {
		return ljyCashiers.selectByPrimaryKey(phone,kk);
	}

	// 条件查询
	public List<Wxxq> selectByPrimaryKeyByinid(String inid) {
		return ljyCashiers.selectByPrimaryKeyByinid(inid);
	}
	
	// 根据会员手机号或会员名称查询
		public Client selectyAllHyljycztjByphone(String tj) {
			return ljyCashiers.selectyAllHyljycztjByphone(tj);
		}

		// 根据手机号查询会员所有充值记录
				public List<Chongzhi> selectyAllHyljyczByphone(String phone) {
					return ljyCashiers.selectyAllHyljyczByphone(phone);
				}
		
	// 根据车牌号查询
	public Client selectClient(String cno) {
		return ljyCashiers.selectClient(cno);
	}

	// 根据车牌号查询
	public Clientcar selectClientcar(String cno) {
		return ljyCashiers.selectClientcar(cno);
	}

	// 根据维修号修改结算状态
	public int updateByinid(String inid) {
		return ljyCashiers.updateByinid(inid);
	}

	// 根据车牌号修改结算状态
	public int updateBycno(String cno) {
		return ljyCashiers.updateBycno(cno);
	}

	// 根据电话号码修改余额
	public int updateByphone(String jg, String phone) {
		return ljyCashiers.updateByphone(jg, phone);
	}

	// 根据手机号查询指定会员
	public Client selectyAllHyljyByphone(String phone) {
		return ljyCashiers.selectyAllHyljyByphone(phone);
	}

	// 查询所有会员
	public List<Client> selectyAllHyljy(String phone) {
		return ljyCashiers.selectyAllHyljy(phone);
	}

	// 根据维修编号查询外派信息
	public LjyWorkcar selectLjyWorkcar(String inid) {
		return ljyCashiers.selectLjyWorkcar(inid);
	}

	// 根据手机号修改余额
	public int updateczByphone(String phone, String ye) {
		return ljyCashiers.updateczByphone(phone, ye);
	}

	// 根据手机号修改开卡余额
	public int updateczkkByphone(String phone, String ye, String time) {
		return ljyCashiers.updateczkkByphone(phone, ye, time);
	}

	// 新增充值记录
	public int insaddCz(String phone, String zf, String je, String bh, String time) {
		return ljyCashiers.insaddCz(phone, zf, je, bh, time);
	}

	// 删除充值记录
	public int deletezc(String phone) {
		return ljyCashiers.deletezc(phone);
	}

	// 修改为会员状态为非会员
	public int updatehy(String phone) {
		return ljyCashiers.updatehy(phone);
	}
}
