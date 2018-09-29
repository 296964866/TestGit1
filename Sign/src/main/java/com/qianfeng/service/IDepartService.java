package com.qianfeng.service;

import java.util.List;
import java.util.Map;

import com.qianfeng.entity.Depart;

public interface IDepartService {
	
	public List<Map<String,Object>> optionDepartService();
	
	public int countDepartService();
	
	public List<Depart> departListService(int page,int limit);
	
	public void insertDepartService(Depart depart);
	
	public void updateDepartService(Depart depart);
	
	public void deleteDepartService(int id);
	
	public int deleteByIdDepartService(int id);

}
