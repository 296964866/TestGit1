package com.qianfeng.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.entity.Sign;
import com.qianfeng.service.ISignService;
import com.qianfeng.vo.JsonBean;

@Controller
public class SignController {

	@Autowired
	private ISignService signService;
	
	@RequestMapping("/signlist")
	@ResponseBody
	public Map<String, Object> signListController(int page,int limit){
		Map<String, Object> map = new HashMap<>();
		
		try {
			List<Map<String, Object>> list = signService.signListService(page, limit);
			int count = signService.countService();
			map.put("code", 0);
			map.put("count", count);
			map.put("data", list);
			return map;
			
		} catch (Exception e) {
			map.put("code", 1);
			return map;
		}
	}
	
	@RequestMapping("/signin")
	@ResponseBody
	public JsonBean signInController() {
		Sign sign = new Sign();
		sign.setName("张三");
		sign.setDid(1);				
		sign.setStarttime(new Date());
		
		DateFormat bf = new SimpleDateFormat("HH:mm:ss"); 
		String date ="9:00:00";
		String s = bf.format(sign.getStarttime());
		
		if(s.equals(date)) {
			sign.setLlid(1);
		}else {
			sign.setLlid(2);
		}
		
		
		try {
			signService.insertSignService(sign);
			return new JsonBean(0,null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new JsonBean(1,null);
		}

		
		
	}
}
