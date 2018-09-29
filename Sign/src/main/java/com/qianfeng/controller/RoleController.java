package com.qianfeng.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.entity.Authority;
import com.qianfeng.service.IUserService;
import com.qianfeng.vo.JsonBean;

@Controller
public class RoleController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/role")
	@ResponseBody
	public JsonBean role(String no) {

		try {
			// 总数据
			List<Map<String, Object>> list = userService.roleFindByNo("admin");			

			return new JsonBean(1, list);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new JsonBean(0, null);
		}
	}

}
