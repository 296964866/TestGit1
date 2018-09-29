package com.qianfeng.dao;

import java.util.List;
import java.util.Map;

import com.qianfeng.entity.Authority;
import com.qianfeng.entity.User;



public interface UserMapper {
    
	/**
	 * user登录
	 * @param map
	 * @return
	 */
	public int userLogin(Map<String,Object> map);
	
	
	/**
	 * 注册
	 * @param user
	 */
	public void insertUser(User user);
	
	/**
	 * 修改
	 * @param user
	 */
	public void updateUser(User user);
	
	
  
	
	public List<Authority> roleFindByNo(String no);
	
	
  
		
	
}