package com.qianfeng.service;

import java.util.List;
import java.util.Map;

import com.qianfeng.entity.User;

public interface IUserService {
	
	public void userLoginService(String no,String password);
	
	public void insertUserService(User user);
	
	public void updateUserService(User user);
	
	public List<Map<String, Object>> roleFindByNo(String no);

}
