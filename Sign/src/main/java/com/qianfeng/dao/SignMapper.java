package com.qianfeng.dao;

import java.util.List;
import java.util.Map;

import com.qianfeng.entity.Sign;

public interface SignMapper {
    
	public List<Map<String,Object>> signList(Map<String,Object> map);
	
	public int count();
	
	public void insertSign(Sign sign);
}