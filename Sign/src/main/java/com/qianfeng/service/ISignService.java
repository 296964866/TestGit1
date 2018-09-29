package com.qianfeng.service;

import java.util.List;
import java.util.Map;

import com.qianfeng.entity.Sign;

public interface ISignService {
	
	public List<Map<String,Object>> signListService(int page,int limit);
	
	public int countService();
	
	public void insertSignService(Sign sign);

}
