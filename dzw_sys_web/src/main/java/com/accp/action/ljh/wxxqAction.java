package com.accp.action.ljh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljh.wxxqBiz;
import com.accp.pojo.Wxxq;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/api/Wxxqs")
public class wxxqAction {

	@Autowired
	private wxxqBiz Wbiz;
	
	/**
	 * 新增
	 * @param w
	 * @return
	 */
	@PostMapping("/insert")
	public int insertWxxq(@RequestBody String w) {
		int i=0;
		JSONArray array=JSONArray.parseArray(w);
		for (int j = 0; j < array.size(); j++) {
			JSONObject object=array.getJSONObject(j);
			System.out.println(object);
			Wxxq wx=(Wxxq)JSON.toJavaObject(object, Wxxq.class);
			i+=Wbiz.insertWxxq(wx);
		}
		return i;
		
		
	}
}
