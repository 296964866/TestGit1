package com.qianfeng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.entity.Depart;
import com.qianfeng.service.IDepartService;

@Controller
public class DepartController {
	
	@Autowired
	private IDepartService departService;
	
	@RequestMapping("/optiondepart")
	@ResponseBody
	public List<Map<String,Object>> optionDepartController(){
		
		
		try {
			List<Map<String,Object>> list = departService.optionDepartService();
			return list;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	@RequestMapping("/listdepart")
	@ResponseBody
	public Map<String,Object> optionDepartController(int page,int limit){
		
		Map<String,Object> map = new HashMap<>();
		try {
			List<Depart> list = departService.departListService(page, limit);
			int count = departService.countDepartService();
			map.put("count", count);
			map.put("code", 0);
			map.put("data", list);
			return map;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@RequestMapping("/insertdepart")
	@ResponseBody
	public Map<String,Object> insertDepartController(Depart depart){
		
		Map<String,Object> map = new HashMap<>();
		try {
			departService.insertDepartService(depart);
			
			map.put("code", 0);
			
			return map;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@RequestMapping("/updatedepart")
	@ResponseBody
	public Map<String,Object> updateDepartController(Depart depart){
		
		Map<String,Object> map = new HashMap<>();
		try {
			departService.updateDepartService(depart);
			
			map.put("code", 0);
			
			return map;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@RequestMapping("/deletedepart")
	@ResponseBody
	public Map<String,Object> deleteDepartController(int id){
		
		Map<String,Object> map = new HashMap<>();
		try {
			int code =departService.deleteByIdDepartService(id);
			if(code == 0) {
				departService.deleteDepartService(id);
			}
			map.put("code", code);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("code", 1);
		}						
			
			return map;
		
	}

}
