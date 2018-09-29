package com.qianfeng.dao;

import java.util.List;
import java.util.Map;

import com.qianfeng.entity.Depart;

public interface DepartMapper {
public List<Map<String,Object>> optionDepart();
	
	public int countDepart();
	
	public List<Depart> departList(Map<String,Object> map);
	
	public void insertDepart(Depart depart);
	
	public void updateDepart(Depart depart);
	
	public void deleteDepart(int id);
	
	/**
	 * 判断表中数据是否与其他表表关联，若有联系则无法删除
	 * @param id
	 * @return
	 */
	public Depart deleteByIdDepart(int id);
}