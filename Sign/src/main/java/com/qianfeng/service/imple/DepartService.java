package com.qianfeng.service.imple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.DepartMapper;
import com.qianfeng.entity.Depart;
import com.qianfeng.service.IDepartService;

@Service
public class DepartService implements IDepartService{

	@Autowired
	private DepartMapper departMapper;
	/**
	 * option展示
	 */
	@Override
	public List<Map<String, Object>> optionDepartService() {

		List<Map<String, Object>> list = null;
		List<Map<String, Object>> list1 = new ArrayList<>();

		try {
			list = departMapper.optionDepart();
			Iterator<Map<String, Object>> iterator = list.iterator();
			while (iterator.hasNext()) {
				Map<String, Object> map = iterator.next();
				list1.add(map);
			}
			return list1;
		} catch (Exception e) {
			return null;
		}
		
	}

	/**
	 * 总数居count
	 */
	@Override
	public int countDepartService() {
		
		try {
			int count = departMapper.countDepart();
			return count;
		} catch (Exception e) {
			return 0;
		}
		
	}

	/**
	 * 数据展示
	 */
	@Override
	public List<Depart> departListService(int page, int limit) {
		Map<String,Object> map = new HashMap<>();
		List<Depart> list = new ArrayList<>();
		int countPage = (page - 1) * limit;
		map.put("count", countPage);
		map.put("size", limit);
		
		try {
			list = departMapper.departList(map);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	/**
	 * 添加数据
	 */
	@Override
	public void insertDepartService(Depart depart) {
		if(null == depart) {
			throw new RuntimeException("参数不能全部为空");
		}
		try {
			departMapper.insertDepart(depart);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	/**
	 * 修改数据
	 */
	@Override
	public void updateDepartService(Depart depart) {
		
		if(null == depart) {
			throw new RuntimeException("参数不能全部为空");
		}
		try {
			departMapper.updateDepart(depart);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * 删除
	 */
	@Override
	public void deleteDepartService(int id) {
		if(0 == id) {
			throw new RuntimeException("参数不能为空");
		}
		try {
			departMapper.deleteDepart(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	/**
	 * 判断表中数据是否与其他表表关联，若有联系则无法删除
	 */
	@Override
	public int deleteByIdDepartService(int id) {
		Depart depart = departMapper.deleteByIdDepart(id);
		
		if(depart != null) {
			throw new RuntimeException("此数据被t_grade表依赖无法删除");	
		}
		//无关联返回0
		return 0;
		
	}

}
