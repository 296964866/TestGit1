package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.entity.User;
import com.qianfeng.service.IUserService;
import com.qianfeng.vo.JsonBean;

@Controller
public class UsersController {
	
	@Autowired
	private IUserService userService;
	
	
	@RequestMapping("/login")
	@ResponseBody
	public JsonBean loginUser(String no, String password) {
		
		try {
			userService.userLoginService(no, password);
			return new JsonBean(0,null);
		} catch (Exception e) {
			return new JsonBean(1,null);
		}
		
	}
	
	@RequestMapping("/insertuser")
	@ResponseBody
	public JsonBean insertUser(User user) {
		
		try {
			userService.insertUserService(user);
			return new JsonBean(0,null);
		} catch (Exception e) {
			return new JsonBean(1,null);
		}
		
	}
	
	@RequestMapping("/updateuser")
	@ResponseBody
	public JsonBean updateUser(User user) {
		
		try {
			userService.updateUserService(user);
			return new JsonBean(0,null);
		} catch (Exception e) {
			return new JsonBean(1,null);
		}
		
	}

}
